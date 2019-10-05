package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "serializeFrame")
@js.native
object serializeFrame extends js.Object {
  def apply(frame: Frame): Buffer = js.native
  def apply(frame: Frame, encoders: Encoders[_]): Buffer = js.native
}

