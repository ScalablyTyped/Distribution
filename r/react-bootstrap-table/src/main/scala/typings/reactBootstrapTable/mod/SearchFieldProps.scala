package typings.reactBootstrapTable.mod

import typings.react.mod.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFieldProps extends StObject {
  
  /**
    * Custom css class name
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Default value for the search field
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * callback funciton to call when a key is released
    */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent[Any], Unit]] = js.undefined
  
  /**
    * Placeholder text for the search field
    */
  var placeholder: js.UndefOr[String] = js.undefined
}
object SearchFieldProps {
  
  inline def apply(): SearchFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFieldProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchFieldProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setOnKeyUp(value: /* e */ KeyboardEvent[Any] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
