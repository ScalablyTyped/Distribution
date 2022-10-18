package typings.slate

import typings.slate.distInterfacesOperationMod.Operation
import typings.slate.distInterfacesPathMod.Path
import typings.slate.slateStrings.backward
import typings.slate.slateStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesPathRefMod {
  
  trait PathRef extends StObject {
    
    var affinity: forward | backward | Null
    
    var current: Path | Null
    
    def unref(): Path | Null
  }
  object PathRef {
    
    @JSImport("slate/dist/interfaces/path-ref", "PathRef")
    @js.native
    val ^ : PathRefInterface = js.native
    
    extension [Self <: PathRef](x: Self) {
      
      inline def setAffinity(value: forward | backward): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setCurrent(value: Path): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setCurrentVarargs(value: Double*): Self = StObject.set(x, "current", js.Array(value*))
      
      inline def setUnref(value: () => Path | Null): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  trait PathRefInterface extends StObject {
    
    def transform(ref: PathRef, op: Operation): Unit
  }
  object PathRefInterface {
    
    inline def apply(transform: (PathRef, Operation) => Unit): PathRefInterface = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2(transform))
      __obj.asInstanceOf[PathRefInterface]
    }
    
    extension [Self <: PathRefInterface](x: Self) {
      
      inline def setTransform(value: (PathRef, Operation) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
}
