package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestFnfFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestResponseFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "serializeRequestFrame")
@js.native
object serializeRequestFrame extends js.Object {
  def apply(frame: RequestFnfFrame, encoders: Encoders[_]): Buffer = js.native
  def apply(frame: RequestResponseFrame, encoders: Encoders[_]): Buffer = js.native
}

