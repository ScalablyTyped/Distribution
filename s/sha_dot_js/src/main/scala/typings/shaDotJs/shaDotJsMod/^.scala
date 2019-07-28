package typings.shaDotJs.shaDotJsMod

import typings.node.cryptoMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val sha: HashStatic = js.native
  val sha1: HashStatic = js.native
  val sha224: HashStatic = js.native
  val sha256: HashStatic = js.native
  val sha384: HashStatic = js.native
  val sha512: HashStatic = js.native
  def apply(algorithm: String): Hash = js.native
}

