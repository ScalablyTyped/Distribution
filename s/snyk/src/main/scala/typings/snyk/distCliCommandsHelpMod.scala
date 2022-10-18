package typings.snyk

import typings.snyk.distCliArgsMod.MethodArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsHelpMod {
  
  @JSImport("snyk/dist/cli/commands/help", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MethodArgs is not an array type */ args: MethodArgs
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def findHelpFile(helpArgs: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findHelpFile")(helpArgs.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def findHelpFile(helpArgs: js.Array[String], helpFolderPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findHelpFile")(helpArgs.asInstanceOf[js.Any], helpFolderPath.asInstanceOf[js.Any])).asInstanceOf[String]
}
