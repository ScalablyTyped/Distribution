package typings.readdirp.readdirpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdirp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(root: String): ReaddirpStream = js.native
  def apply(root: String, options: ReaddirpOptions): ReaddirpStream = js.native
  def promise(root: String): js.Promise[js.Array[EntryInfo]] = js.native
  def promise(root: String, options: ReaddirpOptions): js.Promise[js.Array[EntryInfo]] = js.native
}

