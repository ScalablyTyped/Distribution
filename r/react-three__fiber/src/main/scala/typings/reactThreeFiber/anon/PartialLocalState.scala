package typings.reactThreeFiber.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactThreeFiber.rendererMod.AttachType
import typings.reactThreeFiber.rendererMod.Instance
import typings.reactThreeFiber.storeMod.RootState
import typings.zustand.zustandReactMod.UseBoundStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/renderer.LocalState> */
trait PartialLocalState extends StObject {
  
  var attach: js.UndefOr[AttachType] = js.undefined
  
  var eventCount: js.UndefOr[Double] = js.undefined
  
  var handlers: js.UndefOr[PartialEventHandlers] = js.undefined
  
  var memoizedProps: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var objects: js.UndefOr[js.Array[Instance]] = js.undefined
  
  var parent: js.UndefOr[Instance | Null] = js.undefined
  
  var previousAttach: js.UndefOr[Any] = js.undefined
  
  var primitive: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[UseBoundStore[RootState]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialLocalState {
  
  inline def apply(): PartialLocalState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLocalState]
  }
  
  extension [Self <: PartialLocalState](x: Self) {
    
    inline def setAttach(value: AttachType): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
    
    inline def setAttachFunction2(value: (/* parent */ Instance, /* self */ Instance) => js.Function0[Unit]): Self = StObject.set(x, "attach", js.Any.fromFunction2(value))
    
    inline def setAttachUndefined: Self = StObject.set(x, "attach", js.undefined)
    
    inline def setEventCount(value: Double): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
    
    inline def setEventCountUndefined: Self = StObject.set(x, "eventCount", js.undefined)
    
    inline def setHandlers(value: PartialEventHandlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    inline def setMemoizedProps(value: StringDictionary[Any]): Self = StObject.set(x, "memoizedProps", value.asInstanceOf[js.Any])
    
    inline def setMemoizedPropsUndefined: Self = StObject.set(x, "memoizedProps", js.undefined)
    
    inline def setObjects(value: js.Array[Instance]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setObjectsVarargs(value: Instance*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setParent(value: Instance): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPreviousAttach(value: Any): Self = StObject.set(x, "previousAttach", value.asInstanceOf[js.Any])
    
    inline def setPreviousAttachUndefined: Self = StObject.set(x, "previousAttach", js.undefined)
    
    inline def setPrimitive(value: Boolean): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
    
    inline def setRoot(value: UseBoundStore[RootState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
