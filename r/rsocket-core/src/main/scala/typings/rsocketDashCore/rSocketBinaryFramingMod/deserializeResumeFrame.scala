package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.ResumeFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "deserializeResumeFrame")
@js.native
object deserializeResumeFrame extends js.Object {
  def apply(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): ResumeFrame = js.native
}

