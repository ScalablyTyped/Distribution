package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashSET_PARAMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationSetParamsAction
  extends StObject
     with NavigationSetParamsActionPayload
     with NavigationStackAction {
  
  var `type`: NavigationSlashSET_PARAMS
}
object NavigationSetParamsAction {
  
  inline def apply(key: String, params: NavigationParams): NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/SET_PARAMS")
    __obj.asInstanceOf[NavigationSetParamsAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationSetParamsAction] (val x: Self) extends AnyVal {
    
    inline def setType(value: NavigationSlashSET_PARAMS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
