package typings.primereact.columnColumnMod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnBodyExpanderOptions extends StObject {
  
  /**
    * Class name of the options.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Custom JSX element for the options.
    */
  var element: js.UndefOr[Element] = js.undefined
  
  /**
    * Class name of the options icon.
    */
  var iconClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Event on click of the expander.
    * @param {*} event -  Browser event.
    */
  var onClick: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
}
object ColumnBodyExpanderOptions {
  
  inline def apply(): ColumnBodyExpanderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnBodyExpanderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnBodyExpanderOptions] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
    
    inline def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
    
    inline def setOnClick(value: /* event */ Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
