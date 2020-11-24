package typings.reactNativeWindowsCli.generatorCommonMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs/generator-common", "copyAndReplaceWithChangedCallback")
@js.native
object copyAndReplaceWithChangedCallback extends js.Object {
  
  def apply(srcPath: String, destRoot: String, relativeDestPath: String): js.Promise[Unit] = js.native
  def apply(
    srcPath: String,
    destRoot: String,
    relativeDestPath: String,
    replacements: js.UndefOr[scala.Nothing],
    alwaysOverwrite: Boolean
  ): js.Promise[Unit] = js.native
  def apply(srcPath: String, destRoot: String, relativeDestPath: String, replacements: Record[String, String]): js.Promise[Unit] = js.native
  def apply(
    srcPath: String,
    destRoot: String,
    relativeDestPath: String,
    replacements: Record[String, String],
    alwaysOverwrite: Boolean
  ): js.Promise[Unit] = js.native
}
