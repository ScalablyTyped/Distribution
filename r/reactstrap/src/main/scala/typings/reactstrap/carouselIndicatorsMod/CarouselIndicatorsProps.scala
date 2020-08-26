package typings.reactstrap.carouselIndicatorsMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselIndicatorsProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var activeIndex: Double = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var items: js.Array[js.Object] = js.native
  def onClickHandler(idx: Double): Unit = js.native
}

object CarouselIndicatorsProps {
  @scala.inline
  def apply(activeIndex: Double, items: js.Array[js.Object], onClickHandler: Double => Unit): CarouselIndicatorsProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onClickHandler = js.Any.fromFunction1(onClickHandler))
    __obj.asInstanceOf[CarouselIndicatorsProps]
  }
  @scala.inline
  implicit class CarouselIndicatorsPropsOps[Self <: CarouselIndicatorsProps] (val x: Self) extends AnyVal {
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: js.Object*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[js.Object]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClickHandler(value: Double => Unit): Self = this.set("onClickHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
  }
  
}

