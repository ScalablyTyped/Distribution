package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnFieldClick extends StObject {
  
  var knobs: Validator[js.Array[KnobStoreKnob]] = js.native
  
  var onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]] = js.native
  
  var onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]] = js.native
}
object OnFieldClick {
  
  @scala.inline
  def apply(
    knobs: Validator[js.Array[KnobStoreKnob]],
    onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]],
    onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
  ): OnFieldClick = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = onFieldChange.asInstanceOf[js.Any], onFieldClick = onFieldClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFieldClick]
  }
  
  @scala.inline
  implicit class OnFieldClickMutableBuilder[Self <: OnFieldClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnobs(value: Validator[js.Array[KnobStoreKnob]]): Self = StObject.set(x, "knobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFieldChange(value: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]]): Self = StObject.set(x, "onFieldChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFieldClick(value: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]): Self = StObject.set(x, "onFieldClick", value.asInstanceOf[js.Any])
  }
}
