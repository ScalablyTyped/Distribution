package typings.primereact.paginatorPaginatorMod

import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom paginator prev page link options
  */
trait PaginatorPrevPageLinkOptions extends StObject {
  
  /**
    * Style class of the prev page link.
    */
  var className: String
  
  /**
    * Whether the link is disabled.
    */
  var disabled: Boolean
  
  /**
    * JSX element to be used as the prev page link.
    */
  var element: Element
  
  /**
    * Icon classname of the prev page link.
    */
  var iconClassName: String
  
  /**
    * Callback to invoke on click.
    * @param {React.SyntheticEvent} event - Browser event.
    */
  def onClick(event: SyntheticEvent[typings.std.Element, Event]): Unit
  
  /**
    * The props of Paginator component
    */
  var props: PaginatorProps
}
object PaginatorPrevPageLinkOptions {
  
  inline def apply(
    className: String,
    disabled: Boolean,
    element: Element,
    iconClassName: String,
    onClick: SyntheticEvent[typings.std.Element, Event] => Unit,
    props: PaginatorProps
  ): PaginatorPrevPageLinkOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], iconClassName = iconClassName.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorPrevPageLinkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginatorPrevPageLinkOptions] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: SyntheticEvent[typings.std.Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setProps(value: PaginatorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
