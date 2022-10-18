package typings.reduxPersist

import typings.reduxPersist.esCreateTransformMod.TransformConfig
import typings.reduxPersist.esTypesMod.Transform
import typings.reduxPersist.esTypesMod.TransformInbound
import typings.reduxPersist.esTypesMod.TransformOutbound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateTransformMod {
  
  @JSImport("redux-persist/lib/createTransform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: Null, outbound: Unit, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: Unit, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: Unit, outbound: Unit, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: Unit, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: Unit, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any]).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Unit, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def default[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
}
