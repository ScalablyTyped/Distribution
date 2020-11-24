package typings.reactCollapsible.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactElement
import typings.reactCollapsible.reactCollapsibleStrings.auto
import typings.reactCollapsible.reactCollapsibleStrings.hidden
import typings.reactCollapsible.reactCollapsibleStrings.inherit
import typings.reactCollapsible.reactCollapsibleStrings.initial
import typings.reactCollapsible.reactCollapsibleStrings.scroll
import typings.reactCollapsible.reactCollapsibleStrings.unset
import typings.reactCollapsible.reactCollapsibleStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsibleProps
  extends AllHTMLAttributes[Collapsible]
     with ClassAttributes[Collapsible] {
  
  var accordionPosition: js.UndefOr[String | Double] = js.native
  
  var classParentString: js.UndefOr[String] = js.native
  
  var containerElementProps: js.UndefOr[js.Object] = js.native
  
  var contentContainerTagName: js.UndefOr[String] = js.native
  
  var contentHiddenWhenClosed: js.UndefOr[Boolean] = js.native
  
  var contentInnerClassName: js.UndefOr[String] = js.native
  
  var contentOuterClassName: js.UndefOr[String] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var handleTriggerClick: js.UndefOr[js.Function1[/* accordionPosition */ js.UndefOr[String | Double], Unit]] = js.native
  
  var lazyRender: js.UndefOr[Boolean] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onClosing: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onOpening: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTriggerClosing: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTriggerOpening: js.UndefOr[js.Function0[Unit]] = js.native
  
  var openedClassName: js.UndefOr[String] = js.native
  
  var overflowWhenOpen: js.UndefOr[hidden | visible | auto | scroll | inherit | initial | unset] = js.native
  
  var transitionCloseTime: js.UndefOr[Double | Null] = js.native
  
  var transitionTime: js.UndefOr[Double] = js.native
  
  var trigger: String | ReactElement = js.native
  
  var triggerClassName: js.UndefOr[String] = js.native
  
  var triggerDisabled: js.UndefOr[Boolean] = js.native
  
  var triggerElementProps: js.UndefOr[js.Object] = js.native
  
  var triggerOpenedClassName: js.UndefOr[String] = js.native
  
  var triggerSibling: js.UndefOr[ReactElement] = js.native
  
  var triggerStyle: js.UndefOr[Null | CSSProperties] = js.native
  
  var triggerTagName: js.UndefOr[String] = js.native
  
  var triggerWhenOpen: js.UndefOr[String | ReactElement] = js.native
}
object CollapsibleProps {
  
  @scala.inline
  def apply(trigger: String | ReactElement): CollapsibleProps = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleProps]
  }
  
  @scala.inline
  implicit class CollapsiblePropsOps[Self <: CollapsibleProps] (val x: Self) extends AnyVal {
    
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
    def setTrigger(value: String | ReactElement): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccordionPosition(value: String | Double): Self = this.set("accordionPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccordionPosition: Self = this.set("accordionPosition", js.undefined)
    
    @scala.inline
    def setClassParentString(value: String): Self = this.set("classParentString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassParentString: Self = this.set("classParentString", js.undefined)
    
    @scala.inline
    def setContainerElementProps(value: js.Object): Self = this.set("containerElementProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerElementProps: Self = this.set("containerElementProps", js.undefined)
    
    @scala.inline
    def setContentContainerTagName(value: String): Self = this.set("contentContainerTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerTagName: Self = this.set("contentContainerTagName", js.undefined)
    
    @scala.inline
    def setContentHiddenWhenClosed(value: Boolean): Self = this.set("contentHiddenWhenClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHiddenWhenClosed: Self = this.set("contentHiddenWhenClosed", js.undefined)
    
    @scala.inline
    def setContentInnerClassName(value: String): Self = this.set("contentInnerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentInnerClassName: Self = this.set("contentInnerClassName", js.undefined)
    
    @scala.inline
    def setContentOuterClassName(value: String): Self = this.set("contentOuterClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentOuterClassName: Self = this.set("contentOuterClassName", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setHandleTriggerClick(value: /* accordionPosition */ js.UndefOr[String | Double] => Unit): Self = this.set("handleTriggerClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleTriggerClick: Self = this.set("handleTriggerClick", js.undefined)
    
    @scala.inline
    def setLazyRender(value: Boolean): Self = this.set("lazyRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyRender: Self = this.set("lazyRender", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnClosing(value: () => Unit): Self = this.set("onClosing", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClosing: Self = this.set("onClosing", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnOpening(value: () => Unit): Self = this.set("onOpening", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpening: Self = this.set("onOpening", js.undefined)
    
    @scala.inline
    def setOnTriggerClosing(value: () => Unit): Self = this.set("onTriggerClosing", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTriggerClosing: Self = this.set("onTriggerClosing", js.undefined)
    
    @scala.inline
    def setOnTriggerOpening(value: () => Unit): Self = this.set("onTriggerOpening", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTriggerOpening: Self = this.set("onTriggerOpening", js.undefined)
    
    @scala.inline
    def setOpenedClassName(value: String): Self = this.set("openedClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenedClassName: Self = this.set("openedClassName", js.undefined)
    
    @scala.inline
    def setOverflowWhenOpen(value: hidden | visible | auto | scroll | inherit | initial | unset): Self = this.set("overflowWhenOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowWhenOpen: Self = this.set("overflowWhenOpen", js.undefined)
    
    @scala.inline
    def setTransitionCloseTime(value: Double): Self = this.set("transitionCloseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionCloseTime: Self = this.set("transitionCloseTime", js.undefined)
    
    @scala.inline
    def setTransitionCloseTimeNull: Self = this.set("transitionCloseTime", null)
    
    @scala.inline
    def setTransitionTime(value: Double): Self = this.set("transitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionTime: Self = this.set("transitionTime", js.undefined)
    
    @scala.inline
    def setTriggerClassName(value: String): Self = this.set("triggerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerClassName: Self = this.set("triggerClassName", js.undefined)
    
    @scala.inline
    def setTriggerDisabled(value: Boolean): Self = this.set("triggerDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerDisabled: Self = this.set("triggerDisabled", js.undefined)
    
    @scala.inline
    def setTriggerElementProps(value: js.Object): Self = this.set("triggerElementProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerElementProps: Self = this.set("triggerElementProps", js.undefined)
    
    @scala.inline
    def setTriggerOpenedClassName(value: String): Self = this.set("triggerOpenedClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerOpenedClassName: Self = this.set("triggerOpenedClassName", js.undefined)
    
    @scala.inline
    def setTriggerSibling(value: ReactElement): Self = this.set("triggerSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerSibling: Self = this.set("triggerSibling", js.undefined)
    
    @scala.inline
    def setTriggerStyle(value: CSSProperties): Self = this.set("triggerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerStyle: Self = this.set("triggerStyle", js.undefined)
    
    @scala.inline
    def setTriggerStyleNull: Self = this.set("triggerStyle", null)
    
    @scala.inline
    def setTriggerTagName(value: String): Self = this.set("triggerTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerTagName: Self = this.set("triggerTagName", js.undefined)
    
    @scala.inline
    def setTriggerWhenOpen(value: String | ReactElement): Self = this.set("triggerWhenOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerWhenOpen: Self = this.set("triggerWhenOpen", js.undefined)
  }
}
