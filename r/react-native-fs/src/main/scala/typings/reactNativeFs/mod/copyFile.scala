package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-fs", "copyFile")
@js.native
object copyFile extends js.Object {
  
  def apply(filepath: String, destPath: String): js.Promise[Unit] = js.native
  def apply(filepath: String, destPath: String, options: FileOptions): js.Promise[Unit] = js.native
}
