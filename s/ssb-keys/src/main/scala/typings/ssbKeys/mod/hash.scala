package typings.ssbKeys.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssb-keys", "hash")
@js.native
object hash extends js.Object {
  def apply(data: Buffer): String = js.native
  def apply(data: Buffer, encoding: String): String = js.native
}

