package typings.readdirp.readdirpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdirp", "promise")
@js.native
object promise extends js.Object {
  def apply(root: String): js.Promise[js.Array[EntryInfo]] = js.native
  def apply(root: String, options: ReaddirpOptions): js.Promise[js.Array[EntryInfo]] = js.native
}

