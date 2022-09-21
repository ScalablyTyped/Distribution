package typings.stencilCore.stencilPrivateMod

import typings.std.Map
import typings.stencilCore.stencilPublicRuntimeMod.ComponentInterface
import typings.stencilCore.stencilPublicRuntimeMod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostRef extends StObject {
  
  @JSName("$ancestorComponent$")
  var DollarancestorComponentDollar: js.UndefOr[HostElement] = js.undefined
  
  @JSName("$cmpMeta$")
  var DollarcmpMetaDollar: ComponentRuntimeMeta
  
  @JSName("$flags$")
  var DollarflagsDollar: Double
  
  @JSName("$hostElement$")
  var DollarhostElementDollar: js.UndefOr[HostElement] = js.undefined
  
  @JSName("$instanceValues$")
  var DollarinstanceValuesDollar: js.UndefOr[Map[String, Any]] = js.undefined
  
  @JSName("$lazyInstance$")
  var DollarlazyInstanceDollar: js.UndefOr[ComponentInterface] = js.undefined
  
  @JSName("$modeName$")
  var DollarmodeNameDollar: js.UndefOr[String] = js.undefined
  
  @JSName("$onInstancePromise$")
  var DollaronInstancePromiseDollar: js.UndefOr[js.Promise[Any]] = js.undefined
  
  @JSName("$onInstanceResolve$")
  var DollaronInstanceResolveDollar: js.UndefOr[js.Function1[/* elm */ Any, Unit]] = js.undefined
  
  @JSName("$onReadyPromise$")
  var DollaronReadyPromiseDollar: js.UndefOr[js.Promise[Any]] = js.undefined
  
  @JSName("$onReadyResolve$")
  var DollaronReadyResolveDollar: js.UndefOr[js.Function1[/* elm */ Any, Unit]] = js.undefined
  
  @JSName("$onRenderResolve$")
  var DollaronRenderResolveDollar: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  @JSName("$queuedListeners$")
  var DollarqueuedListenersDollar: js.UndefOr[js.Array[js.Tuple2[String, Any]]] = js.undefined
  
  @JSName("$renderCount$")
  var DollarrenderCountDollar: js.UndefOr[Double] = js.undefined
  
  @JSName("$rmListeners$")
  var DollarrmListenersDollar: js.UndefOr[js.Array[js.Function0[Unit]]] = js.undefined
  
  @JSName("$vnode$")
  var DollarvnodeDollar: js.UndefOr[VNode] = js.undefined
}
object HostRef {
  
  inline def apply(DollarcmpMetaDollar: ComponentRuntimeMeta, DollarflagsDollar: Double): HostRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$cmpMeta$")(DollarcmpMetaDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$flags$")(DollarflagsDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostRef]
  }
  
  extension [Self <: HostRef](x: Self) {
    
    inline def setDollarancestorComponentDollar(value: HostElement): Self = StObject.set(x, "$ancestorComponent$", value.asInstanceOf[js.Any])
    
    inline def setDollarancestorComponentDollarUndefined: Self = StObject.set(x, "$ancestorComponent$", js.undefined)
    
    inline def setDollarcmpMetaDollar(value: ComponentRuntimeMeta): Self = StObject.set(x, "$cmpMeta$", value.asInstanceOf[js.Any])
    
    inline def setDollarflagsDollar(value: Double): Self = StObject.set(x, "$flags$", value.asInstanceOf[js.Any])
    
    inline def setDollarhostElementDollar(value: HostElement): Self = StObject.set(x, "$hostElement$", value.asInstanceOf[js.Any])
    
    inline def setDollarhostElementDollarUndefined: Self = StObject.set(x, "$hostElement$", js.undefined)
    
    inline def setDollarinstanceValuesDollar(value: Map[String, Any]): Self = StObject.set(x, "$instanceValues$", value.asInstanceOf[js.Any])
    
    inline def setDollarinstanceValuesDollarUndefined: Self = StObject.set(x, "$instanceValues$", js.undefined)
    
    inline def setDollarlazyInstanceDollar(value: ComponentInterface): Self = StObject.set(x, "$lazyInstance$", value.asInstanceOf[js.Any])
    
    inline def setDollarlazyInstanceDollarUndefined: Self = StObject.set(x, "$lazyInstance$", js.undefined)
    
    inline def setDollarmodeNameDollar(value: String): Self = StObject.set(x, "$modeName$", value.asInstanceOf[js.Any])
    
    inline def setDollarmodeNameDollarUndefined: Self = StObject.set(x, "$modeName$", js.undefined)
    
    inline def setDollaronInstancePromiseDollar(value: js.Promise[Any]): Self = StObject.set(x, "$onInstancePromise$", value.asInstanceOf[js.Any])
    
    inline def setDollaronInstancePromiseDollarUndefined: Self = StObject.set(x, "$onInstancePromise$", js.undefined)
    
    inline def setDollaronInstanceResolveDollar(value: /* elm */ Any => Unit): Self = StObject.set(x, "$onInstanceResolve$", js.Any.fromFunction1(value))
    
    inline def setDollaronInstanceResolveDollarUndefined: Self = StObject.set(x, "$onInstanceResolve$", js.undefined)
    
    inline def setDollaronReadyPromiseDollar(value: js.Promise[Any]): Self = StObject.set(x, "$onReadyPromise$", value.asInstanceOf[js.Any])
    
    inline def setDollaronReadyPromiseDollarUndefined: Self = StObject.set(x, "$onReadyPromise$", js.undefined)
    
    inline def setDollaronReadyResolveDollar(value: /* elm */ Any => Unit): Self = StObject.set(x, "$onReadyResolve$", js.Any.fromFunction1(value))
    
    inline def setDollaronReadyResolveDollarUndefined: Self = StObject.set(x, "$onReadyResolve$", js.undefined)
    
    inline def setDollaronRenderResolveDollar(value: () => Unit): Self = StObject.set(x, "$onRenderResolve$", js.Any.fromFunction0(value))
    
    inline def setDollaronRenderResolveDollarUndefined: Self = StObject.set(x, "$onRenderResolve$", js.undefined)
    
    inline def setDollarqueuedListenersDollar(value: js.Array[js.Tuple2[String, Any]]): Self = StObject.set(x, "$queuedListeners$", value.asInstanceOf[js.Any])
    
    inline def setDollarqueuedListenersDollarUndefined: Self = StObject.set(x, "$queuedListeners$", js.undefined)
    
    inline def setDollarqueuedListenersDollarVarargs(value: (js.Tuple2[String, Any])*): Self = StObject.set(x, "$queuedListeners$", js.Array(value*))
    
    inline def setDollarrenderCountDollar(value: Double): Self = StObject.set(x, "$renderCount$", value.asInstanceOf[js.Any])
    
    inline def setDollarrenderCountDollarUndefined: Self = StObject.set(x, "$renderCount$", js.undefined)
    
    inline def setDollarrmListenersDollar(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "$rmListeners$", value.asInstanceOf[js.Any])
    
    inline def setDollarrmListenersDollarUndefined: Self = StObject.set(x, "$rmListeners$", js.undefined)
    
    inline def setDollarrmListenersDollarVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "$rmListeners$", js.Array(value*))
    
    inline def setDollarvnodeDollar(value: VNode): Self = StObject.set(x, "$vnode$", value.asInstanceOf[js.Any])
    
    inline def setDollarvnodeDollarUndefined: Self = StObject.set(x, "$vnode$", js.undefined)
  }
}
