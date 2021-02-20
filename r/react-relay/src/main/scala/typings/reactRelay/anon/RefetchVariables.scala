package typings.reactRelay.anon

import typings.reactRelay.reactRelayStrings.refetch
import typings.reactRelay.useRefetchableFragmentNodeMod.Action
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefetchVariables extends Action {
  
  var environment: js.UndefOr[typings.relayRuntime.relayStoreTypesMod.Environment | Null] = js.native
  
  var fetchPolicy: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy] = js.native
  
  var onComplete: js.UndefOr[js.Function1[/* args */ typings.std.Error | Null, Unit]] = js.native
  
  var refetchVariables: Variables = js.native
  
  var renderPolicy: js.UndefOr[RenderPolicy] = js.native
  
  var `type`: refetch = js.native
}
object RefetchVariables {
  
  @scala.inline
  def apply(refetchVariables: Variables, `type`: refetch): RefetchVariables = {
    val __obj = js.Dynamic.literal(refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefetchVariables]
  }
  
  @scala.inline
  implicit class RefetchVariablesMutableBuilder[Self <: RefetchVariables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: typings.relayRuntime.relayStoreTypesMod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setFetchPolicy(value: typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* args */ typings.std.Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    @scala.inline
    def setRefetchVariables(value: Variables): Self = StObject.set(x, "refetchVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderPolicyUndefined: Self = StObject.set(x, "renderPolicy", js.undefined)
    
    @scala.inline
    def setType(value: refetch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
