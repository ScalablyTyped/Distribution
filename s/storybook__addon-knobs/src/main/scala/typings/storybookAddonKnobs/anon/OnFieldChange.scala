package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFieldChange extends StObject {
  
  var knobs: js.Array[KnobStoreKnob]
  
  def onFieldChange(): Unit
  
  def onFieldClick(): Unit
}
object OnFieldChange {
  
  inline def apply(knobs: js.Array[KnobStoreKnob], onFieldChange: () => Unit, onFieldClick: () => Unit): OnFieldChange = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction0(onFieldChange), onFieldClick = js.Any.fromFunction0(onFieldClick))
    __obj.asInstanceOf[OnFieldChange]
  }
  
  extension [Self <: OnFieldChange](x: Self) {
    
    inline def setKnobs(value: js.Array[KnobStoreKnob]): Self = StObject.set(x, "knobs", value.asInstanceOf[js.Any])
    
    inline def setKnobsVarargs(value: KnobStoreKnob*): Self = StObject.set(x, "knobs", js.Array(value*))
    
    inline def setOnFieldChange(value: () => Unit): Self = StObject.set(x, "onFieldChange", js.Any.fromFunction0(value))
    
    inline def setOnFieldClick(value: () => Unit): Self = StObject.set(x, "onFieldClick", js.Any.fromFunction0(value))
  }
}
