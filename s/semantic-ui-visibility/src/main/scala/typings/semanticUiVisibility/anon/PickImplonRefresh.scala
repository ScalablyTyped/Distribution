package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onRefresh'> */
trait PickImplonRefresh extends StObject {
  
  def onRefresh(): Unit
  @JSName("onRefresh")
  var onRefresh_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonRefresh {
  
  @scala.inline
  def apply(onRefresh: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonRefresh = {
    val __obj = js.Dynamic.literal(onRefresh = onRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonRefresh]
  }
  
  @scala.inline
  implicit class PickImplonRefreshMutableBuilder[Self <: PickImplonRefresh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnRefresh(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onRefresh", value.asInstanceOf[js.Any])
  }
}
