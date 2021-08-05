package typings.reactMdForm.typesMod

import typings.react.mod.Ref
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseSliderOptions
  extends StObject
     with SliderStepOptions
     with SliderEventHandlers {
  
  /**
    * The default value for the slider.
    */
  var defaultValue: js.UndefOr[SliderDefaultValue] = js.undefined
  
  /**
    * An optional ref to merge with the internal `ref` required for the slider to
    * work.
    */
  var ref: js.UndefOr[Ref[HTMLSpanElement]] = js.undefined
}
object UseSliderOptions {
  
  inline def apply(): UseSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseSliderOptions]
  }
  
  extension [Self <: UseSliderOptions](x: Self) {
    
    inline def setDefaultValue(value: SliderDefaultValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueFunction0(value: () => Double): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setRef(value: Ref[HTMLSpanElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ HTMLSpanElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
