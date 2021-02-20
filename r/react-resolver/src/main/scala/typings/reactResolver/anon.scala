package typings.reactResolver

import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data[P] extends StObject {
    
    var Resolved: StatelessComponent[P] = js.native
    
    var data: js.Any = js.native
  }
  object Data {
    
    @scala.inline
    def apply[P](Resolved: StatelessComponent[P], data: js.Any): Data[P] = {
      val __obj = js.Dynamic.literal(Resolved = Resolved.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[P]]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data[_], P] (val x: Self with Data[P]) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolved(value: StatelessComponent[P]): Self = StObject.set(x, "Resolved", value.asInstanceOf[js.Any])
    }
  }
}
