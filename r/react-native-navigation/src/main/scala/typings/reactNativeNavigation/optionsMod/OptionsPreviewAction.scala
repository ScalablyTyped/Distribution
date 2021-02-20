package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.default
import typings.reactNativeNavigation.reactNativeNavigationStrings.destructive
import typings.reactNativeNavigation.reactNativeNavigationStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsPreviewAction extends StObject {
  
  /**
    * Subactions that will be shown when this action is pressed.
    */
  var actions: js.UndefOr[js.Array[OptionsPreviewAction]] = js.native
  
  /**
    * Reference ID to get callbacks from
    */
  var id: String = js.native
  
  /**
    * Action style
    */
  var style: js.UndefOr[default | selected | destructive] = js.native
  
  /**
    * Action text
    */
  var title: String = js.native
}
object OptionsPreviewAction {
  
  @scala.inline
  def apply(id: String, title: String): OptionsPreviewAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPreviewAction]
  }
  
  @scala.inline
  implicit class OptionsPreviewActionMutableBuilder[Self <: OptionsPreviewAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[OptionsPreviewAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: OptionsPreviewAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: default | selected | destructive): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
