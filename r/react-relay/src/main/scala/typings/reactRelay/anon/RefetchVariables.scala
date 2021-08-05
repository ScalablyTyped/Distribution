package typings.reactRelay.anon

import typings.reactRelay.reactRelayStrings.refetch
import typings.reactRelay.useRefetchableFragmentNodeMod.Action
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefetchVariables
  extends StObject
     with Action {
  
  var environment: js.UndefOr[typings.relayRuntime.relayStoreTypesMod.Environment | Null] = js.undefined
  
  var fetchPolicy: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy] = js.undefined
  
  var onComplete: js.UndefOr[js.Function1[/* args */ typings.std.Error | Null, Unit]] = js.undefined
  
  var refetchVariables: Variables
  
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  
  var `type`: refetch
}
object RefetchVariables {
  
  inline def apply(refetchVariables: Variables): RefetchVariables = {
    val __obj = js.Dynamic.literal(refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("refetch")
    __obj.asInstanceOf[RefetchVariables]
  }
  
  extension [Self <: RefetchVariables](x: Self) {
    
    inline def setEnvironment(value: typings.relayRuntime.relayStoreTypesMod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setFetchPolicy(value: typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
    
    inline def setOnComplete(value: /* args */ typings.std.Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setRefetchVariables(value: Variables): Self = StObject.set(x, "refetchVariables", value.asInstanceOf[js.Any])
    
    inline def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
    
    inline def setRenderPolicyUndefined: Self = StObject.set(x, "renderPolicy", js.undefined)
    
    inline def setType(value: refetch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
