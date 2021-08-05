package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.anon.Verbose
import typings.reactNativeWindowsCli.mod.GenerateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorWindowsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-windows", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyProjectTemplateAndReplace(
    srcRootPath: String,
    destPath: String,
    newProjectName: String,
    namespace: String,
    options: GenerateOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyProjectTemplateAndReplace")(srcRootPath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], newProjectName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def installDependencies(options: Verbose): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installDependencies")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
