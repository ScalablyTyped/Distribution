package typings.storybookReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddonSelected extends StObject {
  
  var addonSelected: String
}
object AddonSelected {
  
  @scala.inline
  def apply(addonSelected: String): AddonSelected = {
    val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonSelected]
  }
  
  @scala.inline
  implicit class AddonSelectedMutableBuilder[Self <: AddonSelected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddonSelected(value: String): Self = StObject.set(x, "addonSelected", value.asInstanceOf[js.Any])
  }
}
