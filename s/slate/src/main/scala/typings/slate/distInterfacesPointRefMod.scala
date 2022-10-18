package typings.slate

import typings.slate.distInterfacesOperationMod.Operation
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesTypesMod.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesPointRefMod {
  
  trait PointRef extends StObject {
    
    var affinity: TextDirection | Null
    
    var current: Point | Null
    
    def unref(): Point | Null
  }
  object PointRef {
    
    @JSImport("slate/dist/interfaces/point-ref", "PointRef")
    @js.native
    val ^ : PointRefInterface = js.native
    
    extension [Self <: PointRef](x: Self) {
      
      inline def setAffinity(value: TextDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setCurrent(value: Point): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setUnref(value: () => Point | Null): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  trait PointRefInterface extends StObject {
    
    def transform(ref: PointRef, op: Operation): Unit
  }
  object PointRefInterface {
    
    inline def apply(transform: (PointRef, Operation) => Unit): PointRefInterface = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2(transform))
      __obj.asInstanceOf[PointRefInterface]
    }
    
    extension [Self <: PointRefInterface](x: Self) {
      
      inline def setTransform(value: (PointRef, Operation) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
}
