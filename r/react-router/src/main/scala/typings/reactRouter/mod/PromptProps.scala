package typings.reactRouter.mod

import typings.history.mod.Action
import typings.history.mod.Location
import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptProps extends StObject {
  
  var message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
  
  var when: js.UndefOr[Boolean] = js.undefined
}
object PromptProps {
  
  @scala.inline
  def apply(
    message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
  ): PromptProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptProps]
  }
  
  @scala.inline
  implicit class PromptPropsMutableBuilder[Self <: PromptProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(
      value: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
    ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFunction2(value: (/* location */ Location[LocationState], /* action */ Action) => String | Boolean): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
