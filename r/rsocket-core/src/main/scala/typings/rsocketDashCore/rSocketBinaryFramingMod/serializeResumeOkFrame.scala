package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.ResumeOkFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "serializeResumeOkFrame")
@js.native
object serializeResumeOkFrame extends js.Object {
  def apply(frame: ResumeOkFrame, encoders: Encoders[_]): Buffer = js.native
}

