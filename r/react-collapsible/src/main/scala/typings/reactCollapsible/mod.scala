package typings.reactCollapsible

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactElement
import typings.reactCollapsible.reactCollapsibleStrings.auto
import typings.reactCollapsible.reactCollapsibleStrings.hidden
import typings.reactCollapsible.reactCollapsibleStrings.inherit
import typings.reactCollapsible.reactCollapsibleStrings.initial
import typings.reactCollapsible.reactCollapsibleStrings.scroll
import typings.reactCollapsible.reactCollapsibleStrings.unset
import typings.reactCollapsible.reactCollapsibleStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-collapsible", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CollapsibleProps, js.Object, Any]
  
  type Collapsible = Component[CollapsibleProps, js.Object, Any]
  
  trait CollapsibleProps
    extends StObject
       with HTMLProps[Collapsible] {
    
    var accordionPosition: js.UndefOr[String | Double] = js.undefined
    
    var classParentString: js.UndefOr[String] = js.undefined
    
    var containerElementProps: js.UndefOr[js.Object] = js.undefined
    
    var contentContainerTagName: js.UndefOr[String] = js.undefined
    
    var contentElementId: js.UndefOr[String] = js.undefined
    
    var contentHiddenWhenClosed: js.UndefOr[Boolean] = js.undefined
    
    var contentInnerClassName: js.UndefOr[String] = js.undefined
    
    var contentOuterClassName: js.UndefOr[String] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var handleTriggerClick: js.UndefOr[js.Function1[/* accordionPosition */ js.UndefOr[String | Double], Unit]] = js.undefined
    
    var lazyRender: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClosing: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpening: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onTriggerClosing: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onTriggerOpening: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var openedClassName: js.UndefOr[String] = js.undefined
    
    var overflowWhenOpen: js.UndefOr[hidden | visible | auto | scroll | inherit | initial | unset] = js.undefined
    
    var transitionCloseTime: js.UndefOr[Double | Null] = js.undefined
    
    var transitionTime: js.UndefOr[Double] = js.undefined
    
    var trigger: String | ReactElement
    
    var triggerClassName: js.UndefOr[String] = js.undefined
    
    var triggerDisabled: js.UndefOr[Boolean] = js.undefined
    
    var triggerElementProps: js.UndefOr[js.Object] = js.undefined
    
    var triggerOpenedClassName: js.UndefOr[String] = js.undefined
    
    var triggerSibling: js.UndefOr[String | ReactElement] = js.undefined
    
    var triggerStyle: js.UndefOr[Null | CSSProperties] = js.undefined
    
    var triggerTagName: js.UndefOr[String] = js.undefined
    
    var triggerWhenOpen: js.UndefOr[String | ReactElement] = js.undefined
  }
  object CollapsibleProps {
    
    inline def apply(trigger: String | ReactElement): CollapsibleProps = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapsibleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollapsibleProps] (val x: Self) extends AnyVal {
      
      inline def setAccordionPosition(value: String | Double): Self = StObject.set(x, "accordionPosition", value.asInstanceOf[js.Any])
      
      inline def setAccordionPositionUndefined: Self = StObject.set(x, "accordionPosition", js.undefined)
      
      inline def setClassParentString(value: String): Self = StObject.set(x, "classParentString", value.asInstanceOf[js.Any])
      
      inline def setClassParentStringUndefined: Self = StObject.set(x, "classParentString", js.undefined)
      
      inline def setContainerElementProps(value: js.Object): Self = StObject.set(x, "containerElementProps", value.asInstanceOf[js.Any])
      
      inline def setContainerElementPropsUndefined: Self = StObject.set(x, "containerElementProps", js.undefined)
      
      inline def setContentContainerTagName(value: String): Self = StObject.set(x, "contentContainerTagName", value.asInstanceOf[js.Any])
      
      inline def setContentContainerTagNameUndefined: Self = StObject.set(x, "contentContainerTagName", js.undefined)
      
      inline def setContentElementId(value: String): Self = StObject.set(x, "contentElementId", value.asInstanceOf[js.Any])
      
      inline def setContentElementIdUndefined: Self = StObject.set(x, "contentElementId", js.undefined)
      
      inline def setContentHiddenWhenClosed(value: Boolean): Self = StObject.set(x, "contentHiddenWhenClosed", value.asInstanceOf[js.Any])
      
      inline def setContentHiddenWhenClosedUndefined: Self = StObject.set(x, "contentHiddenWhenClosed", js.undefined)
      
      inline def setContentInnerClassName(value: String): Self = StObject.set(x, "contentInnerClassName", value.asInstanceOf[js.Any])
      
      inline def setContentInnerClassNameUndefined: Self = StObject.set(x, "contentInnerClassName", js.undefined)
      
      inline def setContentOuterClassName(value: String): Self = StObject.set(x, "contentOuterClassName", value.asInstanceOf[js.Any])
      
      inline def setContentOuterClassNameUndefined: Self = StObject.set(x, "contentOuterClassName", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setHandleTriggerClick(value: /* accordionPosition */ js.UndefOr[String | Double] => Unit): Self = StObject.set(x, "handleTriggerClick", js.Any.fromFunction1(value))
      
      inline def setHandleTriggerClickUndefined: Self = StObject.set(x, "handleTriggerClick", js.undefined)
      
      inline def setLazyRender(value: Boolean): Self = StObject.set(x, "lazyRender", value.asInstanceOf[js.Any])
      
      inline def setLazyRenderUndefined: Self = StObject.set(x, "lazyRender", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnClosing(value: () => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction0(value))
      
      inline def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnOpening(value: () => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction0(value))
      
      inline def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
      
      inline def setOnTriggerClosing(value: () => Unit): Self = StObject.set(x, "onTriggerClosing", js.Any.fromFunction0(value))
      
      inline def setOnTriggerClosingUndefined: Self = StObject.set(x, "onTriggerClosing", js.undefined)
      
      inline def setOnTriggerOpening(value: () => Unit): Self = StObject.set(x, "onTriggerOpening", js.Any.fromFunction0(value))
      
      inline def setOnTriggerOpeningUndefined: Self = StObject.set(x, "onTriggerOpening", js.undefined)
      
      inline def setOpenedClassName(value: String): Self = StObject.set(x, "openedClassName", value.asInstanceOf[js.Any])
      
      inline def setOpenedClassNameUndefined: Self = StObject.set(x, "openedClassName", js.undefined)
      
      inline def setOverflowWhenOpen(value: hidden | visible | auto | scroll | inherit | initial | unset): Self = StObject.set(x, "overflowWhenOpen", value.asInstanceOf[js.Any])
      
      inline def setOverflowWhenOpenUndefined: Self = StObject.set(x, "overflowWhenOpen", js.undefined)
      
      inline def setTransitionCloseTime(value: Double): Self = StObject.set(x, "transitionCloseTime", value.asInstanceOf[js.Any])
      
      inline def setTransitionCloseTimeNull: Self = StObject.set(x, "transitionCloseTime", null)
      
      inline def setTransitionCloseTimeUndefined: Self = StObject.set(x, "transitionCloseTime", js.undefined)
      
      inline def setTransitionTime(value: Double): Self = StObject.set(x, "transitionTime", value.asInstanceOf[js.Any])
      
      inline def setTransitionTimeUndefined: Self = StObject.set(x, "transitionTime", js.undefined)
      
      inline def setTrigger(value: String | ReactElement): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerClassName(value: String): Self = StObject.set(x, "triggerClassName", value.asInstanceOf[js.Any])
      
      inline def setTriggerClassNameUndefined: Self = StObject.set(x, "triggerClassName", js.undefined)
      
      inline def setTriggerDisabled(value: Boolean): Self = StObject.set(x, "triggerDisabled", value.asInstanceOf[js.Any])
      
      inline def setTriggerDisabledUndefined: Self = StObject.set(x, "triggerDisabled", js.undefined)
      
      inline def setTriggerElementProps(value: js.Object): Self = StObject.set(x, "triggerElementProps", value.asInstanceOf[js.Any])
      
      inline def setTriggerElementPropsUndefined: Self = StObject.set(x, "triggerElementProps", js.undefined)
      
      inline def setTriggerOpenedClassName(value: String): Self = StObject.set(x, "triggerOpenedClassName", value.asInstanceOf[js.Any])
      
      inline def setTriggerOpenedClassNameUndefined: Self = StObject.set(x, "triggerOpenedClassName", js.undefined)
      
      inline def setTriggerSibling(value: String | ReactElement): Self = StObject.set(x, "triggerSibling", value.asInstanceOf[js.Any])
      
      inline def setTriggerSiblingUndefined: Self = StObject.set(x, "triggerSibling", js.undefined)
      
      inline def setTriggerStyle(value: CSSProperties): Self = StObject.set(x, "triggerStyle", value.asInstanceOf[js.Any])
      
      inline def setTriggerStyleNull: Self = StObject.set(x, "triggerStyle", null)
      
      inline def setTriggerStyleUndefined: Self = StObject.set(x, "triggerStyle", js.undefined)
      
      inline def setTriggerTagName(value: String): Self = StObject.set(x, "triggerTagName", value.asInstanceOf[js.Any])
      
      inline def setTriggerTagNameUndefined: Self = StObject.set(x, "triggerTagName", js.undefined)
      
      inline def setTriggerWhenOpen(value: String | ReactElement): Self = StObject.set(x, "triggerWhenOpen", value.asInstanceOf[js.Any])
      
      inline def setTriggerWhenOpenUndefined: Self = StObject.set(x, "triggerWhenOpen", js.undefined)
    }
  }
}
