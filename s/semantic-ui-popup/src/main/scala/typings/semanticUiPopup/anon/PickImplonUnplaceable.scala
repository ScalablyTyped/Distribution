package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'onUnplaceable'> */
trait PickImplonUnplaceable extends StObject {
  
  def onUnplaceable($module: JQuery): Unit
  @JSName("onUnplaceable")
  var onUnplaceable_Original: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
}
object PickImplonUnplaceable {
  
  @scala.inline
  def apply(onUnplaceable: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): PickImplonUnplaceable = {
    val __obj = js.Dynamic.literal(onUnplaceable = onUnplaceable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonUnplaceable]
  }
  
  @scala.inline
  implicit class PickImplonUnplaceableMutableBuilder[Self <: PickImplonUnplaceable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnUnplaceable(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = StObject.set(x, "onUnplaceable", value.asInstanceOf[js.Any])
  }
}
