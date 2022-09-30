package typings.reactThreeFiber.anon

import typings.reactThreeFiber.eventsMod.ComputeFunction
import typings.reactThreeFiber.eventsMod.DomEvent
import typings.reactThreeFiber.storeMod.RootState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compute extends StObject {
  
  var compute: js.UndefOr[ComputeFunction] = js.undefined
  
  var connected: js.UndefOr[Any] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
}
object Compute {
  
  inline def apply(): Compute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compute]
  }
  
  extension [Self <: Compute](x: Self) {
    
    inline def setCompute(value: (/* event */ DomEvent, /* root */ RootState, /* previous */ js.UndefOr[RootState]) => Unit): Self = StObject.set(x, "compute", js.Any.fromFunction3(value))
    
    inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
    
    inline def setConnected(value: Any): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
