package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typings.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HideLabel extends StObject {
  
  var callback: ButtonTypeOnClickProp = js.native
  
  var hideLabel: `true` = js.native
  
  var value: js.UndefOr[scala.Nothing] = js.native
}
object HideLabel {
  
  @scala.inline
  def apply(callback: /* knob */ ButtonTypeKnob => js.Any, hideLabel: `true`): HideLabel = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), hideLabel = hideLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideLabel]
  }
  
  @scala.inline
  implicit class HideLabelMutableBuilder[Self <: HideLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: /* knob */ ButtonTypeKnob => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideLabel(value: `true`): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
  }
}
