package typings.reactstrap.carouselCaptionMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselCaptionProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  
  var captionHeader: js.UndefOr[ReactNode] = js.native
  
  var captionText: ReactNode = js.native
  
  var cssModule: js.UndefOr[CSSModule] = js.native
}
object CarouselCaptionProps {
  
  @scala.inline
  def apply(): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselCaptionProps]
  }
  
  @scala.inline
  implicit class CarouselCaptionPropsOps[Self <: CarouselCaptionProps] (val x: Self) extends AnyVal {
    
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
    def setCaptionHeader(value: ReactNode): Self = this.set("captionHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionHeader: Self = this.set("captionHeader", js.undefined)
    
    @scala.inline
    def setCaptionText(value: ReactNode): Self = this.set("captionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionText: Self = this.set("captionText", js.undefined)
    
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
  }
}
