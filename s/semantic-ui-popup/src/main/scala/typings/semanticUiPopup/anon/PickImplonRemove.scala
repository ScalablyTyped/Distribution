package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'onRemove'> */
trait PickImplonRemove extends StObject {
  
  def onRemove($module: JQuery): Unit
  @JSName("onRemove")
  var onRemove_Original: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
}
object PickImplonRemove {
  
  @scala.inline
  def apply(onRemove: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): PickImplonRemove = {
    val __obj = js.Dynamic.literal(onRemove = onRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonRemove]
  }
  
  @scala.inline
  implicit class PickImplonRemoveMutableBuilder[Self <: PickImplonRemove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnRemove(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = StObject.set(x, "onRemove", value.asInstanceOf[js.Any])
  }
}
