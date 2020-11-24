package typings.reactstrap.carouselItemMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselItemProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var in: js.UndefOr[Boolean] = js.native
  
  var onEnter: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onEntered: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onEntering: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onExit: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onExited: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onExiting: js.UndefOr[js.Function0[Unit]] = js.native
  
  var slide: js.UndefOr[Boolean] = js.native
  
  var tag: js.UndefOr[ElementType[_]] = js.native
}
object CarouselItemProps {
  
  @scala.inline
  def apply(): CarouselItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselItemProps]
  }
  
  @scala.inline
  implicit class CarouselItemPropsOps[Self <: CarouselItemProps] (val x: Self) extends AnyVal {
    
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
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setOnEnter(value: () => Unit): Self = this.set("onEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnEntered(value: () => Unit): Self = this.set("onEntered", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    
    @scala.inline
    def setOnEntering(value: () => Unit): Self = this.set("onEntering", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    
    @scala.inline
    def setOnExit(value: () => Unit): Self = this.set("onExit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setOnExited(value: () => Unit): Self = this.set("onExited", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    
    @scala.inline
    def setOnExiting(value: () => Unit): Self = this.set("onExiting", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
    
    @scala.inline
    def setSlide(value: Boolean): Self = this.set("slide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    
    @scala.inline
    def setTag(value: ElementType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
