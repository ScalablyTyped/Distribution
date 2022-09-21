package typings.ssdeepJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssdeep.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def digest(data: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  inline def similarity(d1: Hash, d2: Hash): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("similarity")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type Hash = String
}
