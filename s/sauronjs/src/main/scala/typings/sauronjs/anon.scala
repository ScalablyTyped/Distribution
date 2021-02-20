package typings.sauronjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofComponent extends StObject {
    
    /* static member */
    var _index: Double = js.native
  }
  object TypeofComponent {
    
    @scala.inline
    def apply(_index: Double): TypeofComponent = {
      val __obj = js.Dynamic.literal(_index = _index.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofComponent]
    }
    
    @scala.inline
    implicit class TypeofComponentMutableBuilder[Self <: TypeofComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_index(value: Double): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    }
  }
}
