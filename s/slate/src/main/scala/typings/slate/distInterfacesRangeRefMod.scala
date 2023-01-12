package typings.slate

import typings.slate.distInterfacesOperationMod.Operation
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.slateStrings.backward
import typings.slate.slateStrings.forward
import typings.slate.slateStrings.inward
import typings.slate.slateStrings.outward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesRangeRefMod {
  
  trait RangeRef extends StObject {
    
    var affinity: forward | backward | outward | inward | Null
    
    var current: Range | Null
    
    def unref(): Range | Null
  }
  object RangeRef {
    
    @JSImport("slate/dist/interfaces/range-ref", "RangeRef")
    @js.native
    val ^ : RangeRefInterface = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeRef] (val x: Self) extends AnyVal {
      
      inline def setAffinity(value: forward | backward | outward | inward): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setCurrent(value: Range): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setUnref(value: () => Range | Null): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  trait RangeRefInterface extends StObject {
    
    def transform(ref: RangeRef, op: Operation): Unit
  }
  object RangeRefInterface {
    
    inline def apply(transform: (RangeRef, Operation) => Unit): RangeRefInterface = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2(transform))
      __obj.asInstanceOf[RangeRefInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeRefInterface] (val x: Self) extends AnyVal {
      
      inline def setTransform(value: (RangeRef, Operation) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
}
