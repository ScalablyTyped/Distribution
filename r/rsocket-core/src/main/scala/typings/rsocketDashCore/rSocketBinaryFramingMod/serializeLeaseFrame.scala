package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.LeaseFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "serializeLeaseFrame")
@js.native
object serializeLeaseFrame extends js.Object {
  def apply(frame: LeaseFrame, encoders: Encoders[_]): Buffer = js.native
}

