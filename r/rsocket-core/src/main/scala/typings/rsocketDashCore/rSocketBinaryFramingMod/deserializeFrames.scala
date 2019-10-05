package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "deserializeFrames")
@js.native
object deserializeFrames extends js.Object {
  def apply(buffer: Buffer): js.Tuple2[js.Array[Frame], Buffer] = js.native
  def apply(buffer: Buffer, encoders: Encoders[_]): js.Tuple2[js.Array[Frame], Buffer] = js.native
}

