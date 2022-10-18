package typings.snyk

import typings.snyk.distCliArgsMod.MethodArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsLog4shellMod {
  
  @JSImport("snyk/dist/cli/commands/log4shell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MethodArgs is not an array type */ args: MethodArgs
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
