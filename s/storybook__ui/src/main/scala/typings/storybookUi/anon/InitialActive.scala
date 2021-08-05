package typings.storybookUi.anon

import typings.storybookUi.mobileMod.ActiveTabsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialActive extends StObject {
  
  var initialActive: ActiveTabsType
  
  var isToolshown: Boolean
}
object InitialActive {
  
  inline def apply(initialActive: ActiveTabsType, isToolshown: Boolean): InitialActive = {
    val __obj = js.Dynamic.literal(initialActive = initialActive.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialActive]
  }
  
  extension [Self <: InitialActive](x: Self) {
    
    inline def setInitialActive(value: ActiveTabsType): Self = StObject.set(x, "initialActive", value.asInstanceOf[js.Any])
    
    inline def setIsToolshown(value: Boolean): Self = StObject.set(x, "isToolshown", value.asInstanceOf[js.Any])
  }
}
