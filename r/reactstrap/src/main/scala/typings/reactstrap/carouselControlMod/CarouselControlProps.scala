package typings.reactstrap.carouselControlMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.next
import typings.reactstrap.reactstrapStrings.prev
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselControlProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.native
  var direction: prev | next = js.native
  var directionText: String = js.native
  def onClickHandler(): Unit = js.native
}

object CarouselControlProps {
  @scala.inline
  def apply(direction: prev | next, directionText: String, onClickHandler: () => Unit): CarouselControlProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], directionText = directionText.asInstanceOf[js.Any], onClickHandler = js.Any.fromFunction0(onClickHandler))
    __obj.asInstanceOf[CarouselControlProps]
  }
  @scala.inline
  implicit class CarouselControlPropsOps[Self <: CarouselControlProps] (val x: Self) extends AnyVal {
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
    def setDirection(value: prev | next): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionText(value: String): Self = this.set("directionText", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClickHandler(value: () => Unit): Self = this.set("onClickHandler", js.Any.fromFunction0(value))
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
  }
  
}

