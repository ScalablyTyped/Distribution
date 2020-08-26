package typings.reactstrap.carouselCaptionMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselCaptionProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var captionHeader: js.UndefOr[String] = js.native
  var captionText: String = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
}

object CarouselCaptionProps {
  @scala.inline
  def apply(captionText: String): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal(captionText = captionText.asInstanceOf[js.Any])
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
    def setCaptionText(value: String): Self = this.set("captionText", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionHeader(value: String): Self = this.set("captionHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionHeader: Self = this.set("captionHeader", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
  }
  
}

