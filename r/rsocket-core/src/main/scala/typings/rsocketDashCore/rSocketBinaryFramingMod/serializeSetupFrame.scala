package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.SetupFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "serializeSetupFrame")
@js.native
object serializeSetupFrame extends js.Object {
  def apply(frame: SetupFrame, encoders: Encoders[_]): Buffer = js.native
}

