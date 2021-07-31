package typings.semanticUiTab.anon

import typings.semanticUiTab.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'onVisible'> */
trait PickImplonVisible extends StObject {
  
  def onVisible(tabPath: String): Unit
  @JSName("onVisible")
  var onVisible_Original: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
}
object PickImplonVisible {
  
  @scala.inline
  def apply(onVisible: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]): PickImplonVisible = {
    val __obj = js.Dynamic.literal(onVisible = onVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonVisible]
  }
  
  @scala.inline
  implicit class PickImplonVisibleMutableBuilder[Self <: PickImplonVisible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnVisible(value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]): Self = StObject.set(x, "onVisible", value.asInstanceOf[js.Any])
  }
}
