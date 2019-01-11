package typings
package shaDotJsLib.shaDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val sha: shaDotJsLib.shaDotJsMod.SHANs.HashStatic = js.native
  val sha1: shaDotJsLib.shaDotJsMod.SHANs.HashStatic = js.native
  val sha224: shaDotJsLib.shaDotJsMod.SHANs.HashStatic = js.native
  val sha256: shaDotJsLib.shaDotJsMod.SHANs.HashStatic = js.native
  val sha384: shaDotJsLib.shaDotJsMod.SHANs.HashStatic = js.native
  val sha512: shaDotJsLib.shaDotJsMod.SHANs.HashStatic = js.native
  def apply(algorithm: java.lang.String): nodeLib.cryptoMod.Hash = js.native
}

