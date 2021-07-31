package typings.reactJson

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-json", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[JsonProperties, js.Object, js.Any]
  
  type Json = Component[JsonProperties, js.Object, js.Any]
  
  trait JsonProperties extends StObject {
    
    var onChange: js.UndefOr[OnChangeHandler] = js.undefined
    
    var value: js.Any
  }
  object JsonProperties {
    
    @scala.inline
    def apply(value: js.Any): JsonProperties = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonProperties]
    }
    
    @scala.inline
    implicit class JsonPropertiesMutableBuilder[Self <: JsonProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type OnChangeHandler = js.Function1[/* value */ js.Any, Unit]
}
