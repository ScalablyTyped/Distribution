package typings.reactstrap.popoverMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactstrap.anon.Hide
import typings.reactstrap.mod.CSSModule
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  
  var boundariesElement: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Boundary */ js.Any) | Element
  ] = js.native
  
  @JSName("children")
  var children_PopoverProps: js.UndefOr[PopoverChildren] = js.native
  
  var container: js.UndefOr[String | HTMLElement | RefObject[HTMLElement]] = js.native
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var delay: js.UndefOr[Double | Hide] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var fade: js.UndefOr[Boolean] = js.native
  
  var flip: js.UndefOr[Boolean] = js.native
  
  var hideArrow: js.UndefOr[Boolean] = js.native
  
  var innerClassName: js.UndefOr[String] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
  ] = js.native
  
  var placement: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
  ] = js.native
  
  var placementPrefix: js.UndefOr[String] = js.native
  
  var popperClassName: js.UndefOr[String] = js.native
  
  var target: String | HTMLElement | RefObject[HTMLElement] = js.native
  
  var toggle: js.UndefOr[MouseEventHandler[_] | js.Function0[Unit]] = js.native
}
object PopoverProps {
  
  @scala.inline
  def apply(target: String | HTMLElement | RefObject[HTMLElement]): PopoverProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
  
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: String | HTMLElement | RefObject[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundariesElement(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Boundary */ js.Any) | Element
    ): Self = this.set("boundariesElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundariesElement: Self = this.set("boundariesElement", js.undefined)
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ PopoverChildrenRenderProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: PopoverChildren): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement | RefObject[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    
    @scala.inline
    def setDelay(value: Double | Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setHideArrow(value: Boolean): Self = this.set("hideArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideArrow: Self = this.set("hideArrow", js.undefined)
    
    @scala.inline
    def setInnerClassName(value: String): Self = this.set("innerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerClassName: Self = this.set("innerClassName", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setModifiers(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
    ): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setPlacement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPlacementPrefix(value: String): Self = this.set("placementPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementPrefix: Self = this.set("placementPrefix", js.undefined)
    
    @scala.inline
    def setPopperClassName(value: String): Self = this.set("popperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperClassName: Self = this.set("popperClassName", js.undefined)
    
    @scala.inline
    def setToggleFunction1(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleFunction0(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: MouseEventHandler[_] | js.Function0[Unit]): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
}
