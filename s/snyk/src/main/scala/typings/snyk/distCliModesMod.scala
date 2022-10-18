package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliModesMod {
  
  @JSImport("snyk/dist/cli/modes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def displayModeHelp(mode: String, args: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("displayModeHelp")(mode.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def modeValidation(args: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("modeValidation")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseMode(mode: String, args: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMode")(mode.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
}
