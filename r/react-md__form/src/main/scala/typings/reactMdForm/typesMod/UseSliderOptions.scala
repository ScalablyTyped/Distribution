package typings.reactMdForm.typesMod

import typings.react.mod.Ref
import typings.std.HTMLSpanElement
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
  implicit class UseSliderOptionsOps[Self <: UseSliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultValueFunction0(value: () => Double): Self = this.set("defaultValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultValue(value: SliderDefaultValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLSpanElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[HTMLSpanElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
