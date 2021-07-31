package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'onLabelCreate'> */
trait PickImplonLabelCreate extends StObject {
  
  def onLabelCreate(value: js.Any, text: String): JQuery
  @JSName("onLabelCreate")
  var onLabelCreate_Original: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]
}
object PickImplonLabelCreate {
  
  @scala.inline
  def apply(onLabelCreate: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]): PickImplonLabelCreate = {
    val __obj = js.Dynamic.literal(onLabelCreate = onLabelCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonLabelCreate]
  }
  
  @scala.inline
  implicit class PickImplonLabelCreateMutableBuilder[Self <: PickImplonLabelCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnLabelCreate(value: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]): Self = StObject.set(x, "onLabelCreate", value.asInstanceOf[js.Any])
  }
}
