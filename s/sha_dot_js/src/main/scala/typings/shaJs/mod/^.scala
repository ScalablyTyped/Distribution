package typings.shaJs.mod

import typings.node.cryptoMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(algorithm: String): Hash = js.native
}

