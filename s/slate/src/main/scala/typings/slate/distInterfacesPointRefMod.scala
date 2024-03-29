package typings.slate

import typings.slate.distInterfacesOperationMod.Operation
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distTypesTypesMod.TextDirection
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointRef] (val x: Self) extends AnyVal {
      
      inline def setAffinity(value: TextDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setCurrent(value: Point): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setUnref(value: () => Point | Null): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  trait PointRefInterface extends StObject {
    
    /**
      * Transform the point ref's current value by an operation.
      */
    def transform(ref: PointRef, op: Operation): Unit
  }
  object PointRefInterface {
    
    inline def apply(transform: (PointRef, Operation) => Unit): PointRefInterface = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2(transform))
      __obj.asInstanceOf[PointRefInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointRefInterface] (val x: Self) extends AnyVal {
      
      inline def setTransform(value: (PointRef, Operation) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
}
