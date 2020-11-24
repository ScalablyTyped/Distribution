package typings.reactLottie.mod

import typings.reactLottie.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The JSON data exported from Adobe After Effects using the Bodymovin plugin
    */
  var animationData: js.Any = js.native
  
  /**
    * Defines if the animation should immediately play when the component enters the DOM
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if the animation should play only once or repeatedly in an endless loop
    * or the number of loops that should be completed before the animation ends
    */
  var loop: js.UndefOr[Boolean | Double] = js.native
  
  var rendererSettings: js.UndefOr[ClassName] = js.native
}
object Options {
  
  @scala.inline
  def apply(animationData: js.Any): Options = {
    val __obj = js.Dynamic.literal(animationData = animationData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAnimationData(value: js.Any): Self = this.set("animationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean | Double): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setRendererSettings(value: ClassName): Self = this.set("rendererSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendererSettings: Self = this.set("rendererSettings", js.undefined)
  }
}
