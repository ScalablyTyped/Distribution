package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typings.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideLabel extends StObject {
  
  var callback: ButtonTypeOnClickProp
  
  var hideLabel: `true`
  
  var value: js.UndefOr[scala.Nothing] = js.undefined
}
object HideLabel {
  
  inline def apply(callback: /* knob */ ButtonTypeKnob => js.Any): HideLabel = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), hideLabel = true)
    __obj.asInstanceOf[HideLabel]
  }
  
  extension [Self <: HideLabel](x: Self) {
    
    inline def setCallback(value: /* knob */ ButtonTypeKnob => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setHideLabel(value: `true`): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
  }
}
