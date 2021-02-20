package typings.reactMdForm.typesMod

import typings.react.mod.Ref
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSliderOptions
  extends SliderStepOptions
     with SliderEventHandlers {
  
  /**
    * The default value for the slider.
    */
  var defaultValue: js.UndefOr[SliderDefaultValue] = js.native
  
  /**
    * An optional ref to merge with the internal `ref` required for the slider to
    * work.
    */
  var ref: js.UndefOr[Ref[HTMLSpanElement]] = js.native
}
object UseSliderOptions {
  
  @scala.inline
  def apply(): UseSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseSliderOptions]
  }
  
  @scala.inline
  implicit class UseSliderOptionsMutableBuilder[Self <: UseSliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: SliderDefaultValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueFunction0(value: () => Double): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[HTMLSpanElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLSpanElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
