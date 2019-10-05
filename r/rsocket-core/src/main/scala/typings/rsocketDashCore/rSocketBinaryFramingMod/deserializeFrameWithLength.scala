package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "deserializeFrameWithLength")
@js.native
object deserializeFrameWithLength extends js.Object {
  def apply(buffer: Buffer): Frame = js.native
  def apply(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
}

