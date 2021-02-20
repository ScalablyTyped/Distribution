package typings.reactNavigation.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationEventsProps extends ViewProps {
  
  var onDidBlur: js.UndefOr[NavigationEventCallback] = js.native
  
  var onDidFocus: js.UndefOr[NavigationEventCallback] = js.native
  
  var onWillBlur: js.UndefOr[NavigationEventCallback] = js.native
  
  var onWillFocus: js.UndefOr[NavigationEventCallback] = js.native
}
object NavigationEventsProps {
  
  @scala.inline
  def apply(): NavigationEventsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationEventsProps]
  }
  
  @scala.inline
  implicit class NavigationEventsPropsMutableBuilder[Self <: NavigationEventsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDidBlur(value: /* payload */ NavigationEventPayload => Unit): Self = StObject.set(x, "onDidBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidBlurUndefined: Self = StObject.set(x, "onDidBlur", js.undefined)
    
    @scala.inline
    def setOnDidFocus(value: /* payload */ NavigationEventPayload => Unit): Self = StObject.set(x, "onDidFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidFocusUndefined: Self = StObject.set(x, "onDidFocus", js.undefined)
    
    @scala.inline
    def setOnWillBlur(value: /* payload */ NavigationEventPayload => Unit): Self = StObject.set(x, "onWillBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWillBlurUndefined: Self = StObject.set(x, "onWillBlur", js.undefined)
    
    @scala.inline
    def setOnWillFocus(value: /* payload */ NavigationEventPayload => Unit): Self = StObject.set(x, "onWillFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWillFocusUndefined: Self = StObject.set(x, "onWillFocus", js.undefined)
  }
}
