package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.ResumeFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "serializeResumeFrame")
@js.native
object serializeResumeFrame extends js.Object {
  def apply(frame: ResumeFrame, encoders: Encoders[_]): Buffer = js.native
}

