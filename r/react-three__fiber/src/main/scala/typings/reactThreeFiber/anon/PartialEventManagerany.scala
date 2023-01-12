package typings.reactThreeFiber.anon

import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.ComputeFunction
import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.DomEvent
import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.FilterFunction
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcCoreRaycasterMod.Intersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/events.EventManager<any>> */
trait PartialEventManagerany extends StObject {
  
  var compute: js.UndefOr[ComputeFunction] = js.undefined
  
  var connect: js.UndefOr[js.Function1[/* target */ Any, Unit]] = js.undefined
  
  var connected: js.UndefOr[Any] = js.undefined
  
  var disconnect: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[FilterFunction] = js.undefined
  
  var handlers: js.UndefOr[typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.Events] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
}
object PartialEventManagerany {
  
  inline def apply(): PartialEventManagerany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEventManagerany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialEventManagerany] (val x: Self) extends AnyVal {
    
    inline def setCompute(value: (/* event */ DomEvent, /* root */ RootState, /* previous */ js.UndefOr[RootState]) => Unit): Self = StObject.set(x, "compute", js.Any.fromFunction3(value))
    
    inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
    
    inline def setConnect(value: /* target */ Any => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setConnected(value: Any): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
    
    inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFilter(
      value: (/* items */ js.Array[Intersection[Object3D[Event]]], /* state */ RootState) => js.Array[Intersection[Object3D[Event]]]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setHandlers(value: typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.Events): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
