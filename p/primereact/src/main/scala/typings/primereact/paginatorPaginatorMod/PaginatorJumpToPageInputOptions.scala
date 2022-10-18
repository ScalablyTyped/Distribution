package typings.primereact.paginatorPaginatorMod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorJumpToPageInputOptions extends StObject {
  
  var className: String
  
  var disabled: Boolean
  
  var element: Element
  
  def onChange(first: Double, rows: Double): Unit
  
  var props: PaginatorProps
  
  var value: Double
}
object PaginatorJumpToPageInputOptions {
  
  inline def apply(
    className: String,
    disabled: Boolean,
    element: Element,
    onChange: (Double, Double) => Unit,
    props: PaginatorProps,
    value: Double
  ): PaginatorJumpToPageInputOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onChange = js.Any.fromFunction2(onChange), props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorJumpToPageInputOptions]
  }
  
  extension [Self <: PaginatorJumpToPageInputOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: (Double, Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setProps(value: PaginatorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
