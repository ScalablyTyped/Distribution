package typings
package shaDotJsLib.shaDotJsMod

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
  def apply(algorithm: java.lang.String): nodeLib.cryptoMod.Hash = js.native
}

