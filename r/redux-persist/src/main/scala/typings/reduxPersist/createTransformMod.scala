package typings.reduxPersist

import typings.reduxPersist.typesMod.Transform
import typings.reduxPersist.typesMod.TransformInbound
import typings.reduxPersist.typesMod.TransformOutbound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTransformMod {
  
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: js.UndefOr[scala.Nothing], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](
    inbound: js.UndefOr[scala.Nothing],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](inbound: Null, outbound: js.UndefOr[scala.Nothing], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: js.UndefOr[scala.Nothing],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist/es/createTransform", JSImport.Default)
  @js.native
  def default[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  
  @js.native
  trait TransformConfig extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.native
    
    var whitelist: js.UndefOr[js.Array[String]] = js.native
  }
  object TransformConfig {
    
    @scala.inline
    def apply(): TransformConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformConfig]
    }
    
    @scala.inline
    implicit class TransformConfigMutableBuilder[Self <: TransformConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      @scala.inline
      def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
}
