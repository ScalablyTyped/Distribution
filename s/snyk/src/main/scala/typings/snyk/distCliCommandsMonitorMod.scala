package typings.snyk

import typings.snyk.distCliArgsMod.MethodArgs
import typings.snyk.distLibTypesMod.ProjectAttributes
import typings.snyk.distLibTypesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsMonitorMod {
  
  @JSImport("snyk/dist/cli/commands/monitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args0 because its type MethodArgs is not an array type */ args0: MethodArgs
  ): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def generateProjectAttributes(options: Any): ProjectAttributes = ^.asInstanceOf[js.Dynamic].applyDynamic("generateProjectAttributes")(options.asInstanceOf[js.Any]).asInstanceOf[ProjectAttributes]
  
  inline def generateTags(options: Any): js.UndefOr[js.Array[Tag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTags")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Tag]]]
  
  inline def validateProjectAttributes(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateProjectAttributes")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateTags(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTags")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
