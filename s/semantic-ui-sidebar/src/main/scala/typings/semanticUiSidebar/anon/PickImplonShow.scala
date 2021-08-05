package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'onShow'> */
trait PickImplonShow extends StObject {
  
  def onShow(): Unit
  @JSName("onShow")
  var onShow_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonShow {
  
  inline def apply(onShow: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonShow = {
    val __obj = js.Dynamic.literal(onShow = onShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonShow]
  }
  
  extension [Self <: PickImplonShow](x: Self) {
    
    inline def setOnShow(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
  }
}
