package typings.ssbKeys.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssb-keys", "generate")
@js.native
object generate extends js.Object {
  def apply(): Keys = js.native
  def apply(curve: js.UndefOr[scala.Nothing], seed: Buffer): Keys = js.native
  def apply(curve: String): Keys = js.native
  def apply(curve: String, seed: Buffer): Keys = js.native
}

