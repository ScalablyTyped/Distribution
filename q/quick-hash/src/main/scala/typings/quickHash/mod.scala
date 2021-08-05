package typings.quickHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(key: String): String = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(key: String, seed: Double): String = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("quick-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
