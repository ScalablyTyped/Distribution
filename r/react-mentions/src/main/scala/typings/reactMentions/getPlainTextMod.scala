package typings.reactMentions

import typings.reactMentions.anon.PartialConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPlainTextMod {
  
  @JSImport("react-mentions/lib/utils/getPlainText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPlainText(value: String, config: PartialConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlainText")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
}
