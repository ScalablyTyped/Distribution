package typings.readdirDashEnhanced.readdirDashEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", "async")
@js.native
object async extends js.Object {
  def apply(root: String): js.Promise[js.Array[String]] = js.native
  def apply(root: String, callback: CallbackString): Unit = js.native
  def apply(root: String, options: Options): js.Promise[js.Array[String]] = js.native
  def apply(root: String, options: Options, callback: CallbackString): Unit = js.native
  def stat(root: String): js.Promise[js.Array[Entry]] = js.native
  def stat(root: String, callback: CallbackEntry): Unit = js.native
  def stat(root: String, options: Options): js.Promise[js.Array[Entry]] = js.native
  def stat(root: String, options: Options, callback: CallbackEntry): Unit = js.native
}

