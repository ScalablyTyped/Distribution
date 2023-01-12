package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import typings.reactNativeNavigation.reactNativeNavigationStrings.destructive
import typings.reactNativeNavigation.reactNativeNavigationStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPreviewAction extends StObject {
  
  /**
    * Subactions that will be shown when this action is pressed.
    */
  var actions: js.UndefOr[js.Array[OptionsPreviewAction]] = js.undefined
  
  /**
    * Reference ID to get callbacks from
    */
  var id: String
  
  /**
    * Action style
    */
  var style: js.UndefOr[default | selected | destructive] = js.undefined
  
  /**
    * Action text
    */
  var title: String
}
object OptionsPreviewAction {
  
  inline def apply(id: String, title: String): OptionsPreviewAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPreviewAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsPreviewAction] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[OptionsPreviewAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: OptionsPreviewAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: default | selected | destructive): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
