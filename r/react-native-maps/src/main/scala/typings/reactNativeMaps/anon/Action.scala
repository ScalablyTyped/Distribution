package typings.reactNativeMaps.anon

import typings.reactNativeMaps.reactNativeMapsStrings.`marker-press`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: `marker-press`
  
  var id: String
}
object Action {
  
  @scala.inline
  def apply(id: String): Action = {
    val __obj = js.Dynamic.literal(action = "marker-press", id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: `marker-press`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
