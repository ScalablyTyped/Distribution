package typings.reactAdaptiveHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkMod {
  
  @JSImport("react-adaptive-hooks/network", "useNetworkStatus")
  @js.native
  def useNetworkStatus(): typings.reactAdaptiveHooks.anon.EffectiveConnectionType = js.native
  @JSImport("react-adaptive-hooks/network", "useNetworkStatus")
  @js.native
  def useNetworkStatus(initialEffectiveConnectionType: EffectiveConnectionType): typings.reactAdaptiveHooks.anon.EffectiveConnectionType = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`slow-2g`
    - typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`2g`
    - typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`3g`
    - typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`4g`
  */
  trait EffectiveConnectionType extends StObject
  object EffectiveConnectionType {
    
    @scala.inline
    def `2g`: typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`2g` = "2g".asInstanceOf[typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`2g`]
    
    @scala.inline
    def `3g`: typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`3g` = "3g".asInstanceOf[typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`3g`]
    
    @scala.inline
    def `4g`: typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`4g` = "4g".asInstanceOf[typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`4g`]
    
    @scala.inline
    def `slow-2g`: typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`slow-2g` = "slow-2g".asInstanceOf[typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`slow-2g`]
  }
}
