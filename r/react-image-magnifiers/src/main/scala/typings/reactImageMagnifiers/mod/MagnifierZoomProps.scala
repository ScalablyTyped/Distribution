package typings.reactImageMagnifiers.mod

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MagnifierZoomProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var imageAlt: js.UndefOr[String] = js.native
  
  var imageSrc: String = js.native
  
  var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var transitionSpeed: js.UndefOr[Double] = js.native
}
object MagnifierZoomProps {
  
  @scala.inline
  def apply(imageSrc: String): MagnifierZoomProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnifierZoomProps]
  }
  
  @scala.inline
  implicit class MagnifierZoomPropsOps[Self <: MagnifierZoomProps] (val x: Self) extends AnyVal {
    
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
    def setImageSrc(value: String): Self = this.set("imageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setImageAlt(value: String): Self = this.set("imageAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageAlt: Self = this.set("imageAlt", js.undefined)
    
    @scala.inline
    def setOnImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onImageLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnImageLoad: Self = this.set("onImageLoad", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTransitionSpeed(value: Double): Self = this.set("transitionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionSpeed: Self = this.set("transitionSpeed", js.undefined)
  }
}
