package typings.readdirDashEnhanced.readdirDashEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", "async")
@js.native
object asyncNs extends js.Object {
  def stat(root: String): js.Promise[js.Array[Entry]] = js.native
  def stat(root: String, callback: CallbackEntry): Unit = js.native
  def stat(root: String, options: Options): js.Promise[js.Array[Entry]] = js.native
  def stat(root: String, options: Options, callback: CallbackEntry): Unit = js.native
}

