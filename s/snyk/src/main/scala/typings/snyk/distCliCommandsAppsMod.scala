package typings.snyk

import typings.snyk.distCliArgsMod.MethodArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsAppsMod {
  
  @JSImport("snyk/dist/cli/commands/apps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args0 because its type MethodArgs is not an array type */ args0: MethodArgs
  ): js.Promise[js.UndefOr[String | Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String | Any]]]
}
