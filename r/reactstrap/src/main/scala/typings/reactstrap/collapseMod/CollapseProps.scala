package typings.reactstrap.collapseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.reactstrap.anon.Hide
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var delay: js.UndefOr[Hide] = js.native
  
  var innerRef: js.UndefOr[Ref[HTMLElement]] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var navbar: js.UndefOr[Boolean] = js.native
  
  var onClosed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onEntered: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onEntering: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onExit: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onExited: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onExiting: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.native
  
  var tag: js.UndefOr[ElementType[_]] = js.native
}
object CollapseProps {
  
  @scala.inline
  def apply(): CollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseProps]
  }
  
  @scala.inline
  implicit class CollapsePropsOps[Self <: CollapseProps] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[HTMLElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setNavbar(value: Boolean): Self = this.set("navbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavbar: Self = this.set("navbar", js.undefined)
    
    @scala.inline
    def setOnClosed(value: () => Unit): Self = this.set("onClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClosed: Self = this.set("onClosed", js.undefined)
    
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
    def setOnOpened(value: () => Unit): Self = this.set("onOpened", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpened: Self = this.set("onOpened", js.undefined)
    
    @scala.inline
    def setTag(value: ElementType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
