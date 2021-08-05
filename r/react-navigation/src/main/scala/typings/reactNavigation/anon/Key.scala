package typings.reactNavigation.anon

import typings.reactNavigation.mod._NavigationAction
import typings.reactNavigation.reactNavigationStrings.CHILD_ACTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key
  extends StObject
     with _NavigationAction {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: CHILD_ACTION
}
object Key {
  
  inline def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CHILD_ACTION")
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: CHILD_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
