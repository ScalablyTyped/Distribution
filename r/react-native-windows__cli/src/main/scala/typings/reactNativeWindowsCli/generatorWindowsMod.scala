package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.anon.Verbose
import typings.reactNativeWindowsCli.mod.GenerateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs/generator-windows", JSImport.Namespace)
@js.native
object generatorWindowsMod extends js.Object {
  
  def copyProjectTemplateAndReplace(
    srcRootPath: String,
    destPath: String,
    newProjectName: String,
    namespace: String,
    options: GenerateOptions
  ): js.Promise[Unit] = js.native
  
  def installDependencies(options: Verbose): Unit = js.native
}
