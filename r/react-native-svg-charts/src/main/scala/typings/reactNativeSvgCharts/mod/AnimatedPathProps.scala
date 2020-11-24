package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvg.mod.ClipProps
import typings.reactNativeSvg.mod.CommonMarkerProps
import typings.reactNativeSvg.mod.CommonMaskProps
import typings.reactNativeSvg.mod.DefinitionProps
import typings.reactNativeSvg.mod.FillProps
import typings.reactNativeSvg.mod.ResponderProps
import typings.reactNativeSvg.mod.StrokeProps
import typings.reactNativeSvg.mod.TouchableProps
import typings.reactNativeSvg.mod.TransformProps
import typings.reactNativeSvg.mod.VectorEffectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatedPathProps
  extends TransformProps
     with FillProps
     with StrokeProps
     with ClipProps
     with VectorEffectProps
     with ResponderProps
     with TouchableProps
     with DefinitionProps
     with CommonMarkerProps
     with CommonMaskProps {
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var renderPlaceholder: js.UndefOr[js.Function0[_]] = js.native
}
object AnimatedPathProps {
  
  @scala.inline
  def apply(): AnimatedPathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedPathProps]
  }
  
  @scala.inline
  implicit class AnimatedPathPropsOps[Self <: AnimatedPathProps] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setRenderPlaceholder(value: () => _): Self = this.set("renderPlaceholder", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderPlaceholder: Self = this.set("renderPlaceholder", js.undefined)
  }
}
