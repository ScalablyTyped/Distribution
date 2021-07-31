package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.cancel
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.destructive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertButton extends StObject {
  
  var onPress: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.undefined
  
  var style: js.UndefOr[default | cancel | destructive] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object AlertButton {
  
  @scala.inline
  def apply(): AlertButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertButton]
  }
  
  @scala.inline
  implicit class AlertButtonMutableBuilder[Self <: AlertButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPress(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setStyle(value: default | cancel | destructive): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
