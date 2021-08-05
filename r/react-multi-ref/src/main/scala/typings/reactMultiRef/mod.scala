package typings.reactMultiRef

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-multi-ref", JSImport.Default)
  @js.native
  class default[K, V] ()
    extends StObject
       with MultiRef[K, V] {
    
    /* CompleteClass */
    override val map: Map[K, V] = js.native
    
    /* CompleteClass */
    override def ref(key: K): js.Function1[/* value */ V | Null, js.Any] = js.native
  }
  
  trait MultiRef[K, V] extends StObject {
    
    val map: Map[K, V]
    
    def ref(key: K): js.Function1[/* value */ V | Null, js.Any]
  }
  object MultiRef {
    
    inline def apply[K, V](map: Map[K, V], ref: K => js.Function1[/* value */ V | Null, js.Any]): MultiRef[K, V] = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[MultiRef[K, V]]
    }
    
    extension [Self <: MultiRef[?, ?], K, V](x: Self & (MultiRef[K, V])) {
      
      inline def setMap(value: Map[K, V]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setRef(value: K => js.Function1[/* value */ V | Null, js.Any]): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
}
