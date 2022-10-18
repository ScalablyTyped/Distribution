package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsHelpReflowTextMod {
  
  @JSImport("snyk/dist/cli/commands/help/reflow-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reflowText(text: String, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reflowText")(text.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
}
