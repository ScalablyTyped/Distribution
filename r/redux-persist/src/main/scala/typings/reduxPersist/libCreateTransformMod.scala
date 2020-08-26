package typings.reduxPersist

import typings.reduxPersist.createTransformMod.TransformConfig
import typings.reduxPersist.typesMod.Transform
import typings.reduxPersist.typesMod.TransformInbound
import typings.reduxPersist.typesMod.TransformOutbound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/createTransform", JSImport.Namespace)
@js.native
object libCreateTransformMod extends js.Object {
  def default[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: js.UndefOr[scala.Nothing], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](
    inbound: js.UndefOr[scala.Nothing],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](inbound: Null, outbound: js.UndefOr[scala.Nothing], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: js.UndefOr[scala.Nothing],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def default[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
}

