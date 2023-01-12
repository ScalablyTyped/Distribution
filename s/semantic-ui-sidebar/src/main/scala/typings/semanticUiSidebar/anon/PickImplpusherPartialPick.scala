package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, 'pusher'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl>> */
trait PickImplpusherPartialPick
  extends StObject
     with Param {
  
  var fixed: js.UndefOr[String] = js.undefined
  
  var omitted: js.UndefOr[String] = js.undefined
  
  var pusher: String
  
  var sidebar: js.UndefOr[String] = js.undefined
}
object PickImplpusherPartialPick {
  
  inline def apply(pusher: String): PickImplpusherPartialPick = {
    val __obj = js.Dynamic.literal(pusher = pusher.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpusherPartialPick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplpusherPartialPick] (val x: Self) extends AnyVal {
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setOmitted(value: String): Self = StObject.set(x, "omitted", value.asInstanceOf[js.Any])
    
    inline def setOmittedUndefined: Self = StObject.set(x, "omitted", js.undefined)
    
    inline def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    inline def setSidebar(value: String): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
    
    inline def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
  }
}
