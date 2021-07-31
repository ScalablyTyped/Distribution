package typings.semanticUiForm.anon

import typings.jquery.JQuery.TriggeredEvent
import typings.semanticUiForm.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'onSuccess'> */
trait PickImplonSuccess extends StObject {
  
  def onSuccess(event: TriggeredEvent[HTMLElement, js.Any, js.Any, js.Any], fields: js.Any): Unit
  @JSName("onSuccess")
  var onSuccess_Original: js.ThisFunction2[
    /* this */ JQuery, 
    /* event */ TriggeredEvent[HTMLElement, js.Any, js.Any, js.Any], 
    /* fields */ js.Any, 
    Unit
  ]
}
object PickImplonSuccess {
  
  @scala.inline
  def apply(
    onSuccess: js.ThisFunction2[
      /* this */ JQuery, 
      /* event */ TriggeredEvent[HTMLElement, js.Any, js.Any, js.Any], 
      /* fields */ js.Any, 
      Unit
    ]
  ): PickImplonSuccess = {
    val __obj = js.Dynamic.literal(onSuccess = onSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonSuccess]
  }
  
  @scala.inline
  implicit class PickImplonSuccessMutableBuilder[Self <: PickImplonSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSuccess(
      value: js.ThisFunction2[
          /* this */ JQuery, 
          /* event */ TriggeredEvent[HTMLElement, js.Any, js.Any, js.Any], 
          /* fields */ js.Any, 
          Unit
        ]
    ): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
  }
}
