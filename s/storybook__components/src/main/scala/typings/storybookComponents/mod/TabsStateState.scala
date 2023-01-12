package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsStateState extends StObject {
  
  var selected: String
}
object TabsStateState {
  
  inline def apply(selected: String): TabsStateState = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsStateState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabsStateState] (val x: Self) extends AnyVal {
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
