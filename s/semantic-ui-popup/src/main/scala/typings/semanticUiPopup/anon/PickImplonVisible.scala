package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'onVisible'> */
trait PickImplonVisible extends StObject {
  
  def onVisible($module: JQuery): Unit
  @JSName("onVisible")
  var onVisible_Original: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
}
object PickImplonVisible {
  
  @scala.inline
  def apply(onVisible: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): PickImplonVisible = {
    val __obj = js.Dynamic.literal(onVisible = onVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonVisible]
  }
  
  @scala.inline
  implicit class PickImplonVisibleMutableBuilder[Self <: PickImplonVisible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnVisible(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = StObject.set(x, "onVisible", value.asInstanceOf[js.Any])
  }
}
