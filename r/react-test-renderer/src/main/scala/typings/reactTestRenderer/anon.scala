package typings.reactTestRenderer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Deep extends StObject {
    
    var deep: Boolean = js.native
  }
  object Deep {
    
    @scala.inline
    def apply(deep: Boolean): Deep = {
      val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deep]
    }
    
    @scala.inline
    implicit class DeepMutableBuilder[Self <: Deep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    }
  }
}
