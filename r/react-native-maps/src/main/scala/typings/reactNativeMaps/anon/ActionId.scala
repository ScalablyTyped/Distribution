package typings.reactNativeMaps.anon

import typings.reactNativeMaps.reactNativeMapsStrings.`marker-deselect`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionId extends StObject {
  
  var action: `marker-deselect` = js.native
  
  var id: String = js.native
}
object ActionId {
  
  @scala.inline
  def apply(action: `marker-deselect`, id: String): ActionId = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionId]
  }
  
  @scala.inline
  implicit class ActionIdMutableBuilder[Self <: ActionId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: `marker-deselect`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
