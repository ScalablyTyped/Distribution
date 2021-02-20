package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashSET_PARAMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationSetParamsAction
  extends NavigationStackAction
     with NavigationSetParamsActionPayload {
  
  var `type`: NavigationSlashSET_PARAMS = js.native
}
object NavigationSetParamsAction {
  
  @scala.inline
  def apply(key: String, params: NavigationParams, `type`: NavigationSlashSET_PARAMS): NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationSetParamsAction]
  }
  
  @scala.inline
  implicit class NavigationSetParamsActionMutableBuilder[Self <: NavigationSetParamsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NavigationSlashSET_PARAMS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
