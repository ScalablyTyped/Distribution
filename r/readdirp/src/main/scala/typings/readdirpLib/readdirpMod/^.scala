package typings
package readdirpLib.readdirpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdirp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var EntryInfo: readdirpLib.readdirpMod.EntryInfo = js.native
  var ReaddirpStream: readdirpLib.readdirpMod.ReaddirpStream = js.native
  def apply(root: java.lang.String): ReaddirpStream = js.native
  def apply(root: java.lang.String, options: ReaddirpOptions): ReaddirpStream = js.native
  def promise(root: java.lang.String): js.Promise[js.Array[EntryInfo]] = js.native
  def promise(root: java.lang.String, options: ReaddirpOptions): js.Promise[js.Array[EntryInfo]] = js.native
}

