package typings.rfc6902

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalMod {
  
  @JSImport("rfc6902/equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(left: js.Any, right: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
