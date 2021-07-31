package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'onCreate'> */
trait PickImplonCreate extends StObject {
  
  def onCreate($module: JQuery): Unit
  @JSName("onCreate")
  var onCreate_Original: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
}
object PickImplonCreate {
  
  @scala.inline
  def apply(onCreate: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): PickImplonCreate = {
    val __obj = js.Dynamic.literal(onCreate = onCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonCreate]
  }
  
  @scala.inline
  implicit class PickImplonCreateMutableBuilder[Self <: PickImplonCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnCreate(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = StObject.set(x, "onCreate", value.asInstanceOf[js.Any])
  }
}
