package typings.progressbarJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationOptions extends js.Object {
  
  /**
    * Attachment which can be any object
    * you need to modify within the step function.
    * Passed as a parameter to step function.
    */
  var attachement: js.UndefOr[SVGPathElement] = js.native
  
  /**
    * Duration for animation in milliseconds
    * @default 800
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Easing for animation.
    */
  var easing: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[Color] = js.native
  
  var step: js.UndefOr[StepFunction] = js.native
  
  var to: js.UndefOr[Color] = js.native
}
object AnimationOptions {
  
  @scala.inline
  def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  @scala.inline
  implicit class AnimationOptionsOps[Self <: AnimationOptions] (val x: Self) extends AnyVal {
    
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
    def setAttachement(value: SVGPathElement): Self = this.set("attachement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachement: Self = this.set("attachement", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setFrom(value: Color): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setStep(
      value: (/* state */ StringDictionary[js.Any], /* path */ typings.progressbarJs.pathMod.^[SVGPathElement], /* attachement */ SVGPathElement) => Unit
    ): Self = this.set("step", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setTo(value: Color): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
