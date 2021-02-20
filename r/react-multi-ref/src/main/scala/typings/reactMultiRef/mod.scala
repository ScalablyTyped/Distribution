package typings.reactMultiRef

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-multi-ref", JSImport.Default)
  @js.native
  class default[K, V] () extends MultiRef[K, V]
  
  @js.native
  trait MultiRef[K, V] extends StObject {
    
    val map: Map[K, V] = js.native
    
    def ref(key: K): js.Function1[/* value */ V | Null, _] = js.native
  }
  object MultiRef {
    
    @scala.inline
    def apply[K, V](map: Map[K, V], ref: K => js.Function1[/* value */ V | Null, _]): MultiRef[K, V] = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[MultiRef[K, V]]
    }
    
    @scala.inline
    implicit class MultiRefMutableBuilder[Self <: MultiRef[_, _], K, V] (val x: Self with (MultiRef[K, V])) extends AnyVal {
      
      @scala.inline
      def setMap(value: Map[K, V]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: K => js.Function1[/* value */ V | Null, _]): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
}
