package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorFormatMod {
  
  @JSImport("snyk/dist/lib/error-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abridgeErrorMessage(msg: String, maxLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("abridgeErrorMessage")(msg.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def abridgeErrorMessage(msg: String, maxLen: Double, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("abridgeErrorMessage")(msg.asInstanceOf[js.Any], maxLen.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
}
