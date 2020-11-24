package typings.reactNativeFs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-fs", "touch")
@js.native
object touch extends js.Object {
  
  def apply(filepath: String): js.Promise[Unit] = js.native
  def apply(filepath: String, mtime: js.UndefOr[scala.Nothing], ctime: Date): js.Promise[Unit] = js.native
  def apply(filepath: String, mtime: Date): js.Promise[Unit] = js.native
  def apply(filepath: String, mtime: Date, ctime: Date): js.Promise[Unit] = js.native
}
