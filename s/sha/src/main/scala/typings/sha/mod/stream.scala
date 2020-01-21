package typings.sha.mod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha", "stream")
@js.native
object stream extends js.Object {
  def apply(expected: String): Transform = js.native
  def apply(expected: String, options: ShaOptions): Transform = js.native
}

