package typings.reactJsonschemaForm.mod

import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddButtonProps extends StObject {
  
  var className: String
  
  var disabled: Boolean
  
  def onClick(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit
}
object AddButtonProps {
  
  @scala.inline
  def apply(
    className: String,
    disabled: Boolean,
    onClick: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit
  ): AddButtonProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[AddButtonProps]
  }
  
  @scala.inline
  implicit class AddButtonPropsMutableBuilder[Self <: AddButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
  }
}
