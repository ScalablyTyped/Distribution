package typings.reactFloater

import typings.popperJs.mod.Data
import typings.popperJs.mod.Modifiers
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactFloater.anon.CSSPropertieslengthnumber
import typings.reactFloater.anon.Offset
import typings.reactFloater.anon.PartialStyles
import typings.reactFloater.anon.ZIndex
import typings.reactFloater.reactFloaterStrings.click
import typings.reactFloater.reactFloaterStrings.floater
import typings.reactFloater.reactFloaterStrings.hover
import typings.reactFloater.reactFloaterStrings.wrapper
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-floater", JSImport.Default)
  @js.native
  class default ()
    extends Component[PropsWithComponent | PropsWithContent, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFloater.reactFloaterStrings.open
    - typings.reactFloater.reactFloaterStrings.close
  */
  trait Action extends StObject
  object Action {
    
    inline def close: typings.reactFloater.reactFloaterStrings.close = "close".asInstanceOf[typings.reactFloater.reactFloaterStrings.close]
    
    inline def open: typings.reactFloater.reactFloaterStrings.open = "open".asInstanceOf[typings.reactFloater.reactFloaterStrings.open]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFloater.reactFloaterStrings.top
    - typings.reactFloater.reactFloaterStrings.`top-start`
    - typings.reactFloater.reactFloaterStrings.`top-end`
    - typings.reactFloater.reactFloaterStrings.bottom
    - typings.reactFloater.reactFloaterStrings.`bottom-start`
    - typings.reactFloater.reactFloaterStrings.`bottom-end`
    - typings.reactFloater.reactFloaterStrings.left
    - typings.reactFloater.reactFloaterStrings.`left-start`
    - typings.reactFloater.reactFloaterStrings.`left-end`
    - typings.reactFloater.reactFloaterStrings.right
    - typings.reactFloater.reactFloaterStrings.`right-start`
    - typings.reactFloater.reactFloaterStrings.`right-end`
    - typings.reactFloater.reactFloaterStrings.auto
    - typings.reactFloater.reactFloaterStrings.center
  */
  trait Placement extends StObject
  object Placement {
    
    inline def auto: typings.reactFloater.reactFloaterStrings.auto = "auto".asInstanceOf[typings.reactFloater.reactFloaterStrings.auto]
    
    inline def bottom: typings.reactFloater.reactFloaterStrings.bottom = "bottom".asInstanceOf[typings.reactFloater.reactFloaterStrings.bottom]
    
    inline def `bottom-end`: typings.reactFloater.reactFloaterStrings.`bottom-end` = "bottom-end".asInstanceOf[typings.reactFloater.reactFloaterStrings.`bottom-end`]
    
    inline def `bottom-start`: typings.reactFloater.reactFloaterStrings.`bottom-start` = "bottom-start".asInstanceOf[typings.reactFloater.reactFloaterStrings.`bottom-start`]
    
    inline def center: typings.reactFloater.reactFloaterStrings.center = "center".asInstanceOf[typings.reactFloater.reactFloaterStrings.center]
    
    inline def left: typings.reactFloater.reactFloaterStrings.left = "left".asInstanceOf[typings.reactFloater.reactFloaterStrings.left]
    
    inline def `left-end`: typings.reactFloater.reactFloaterStrings.`left-end` = "left-end".asInstanceOf[typings.reactFloater.reactFloaterStrings.`left-end`]
    
    inline def `left-start`: typings.reactFloater.reactFloaterStrings.`left-start` = "left-start".asInstanceOf[typings.reactFloater.reactFloaterStrings.`left-start`]
    
    inline def right: typings.reactFloater.reactFloaterStrings.right = "right".asInstanceOf[typings.reactFloater.reactFloaterStrings.right]
    
    inline def `right-end`: typings.reactFloater.reactFloaterStrings.`right-end` = "right-end".asInstanceOf[typings.reactFloater.reactFloaterStrings.`right-end`]
    
    inline def `right-start`: typings.reactFloater.reactFloaterStrings.`right-start` = "right-start".asInstanceOf[typings.reactFloater.reactFloaterStrings.`right-start`]
    
    inline def top: typings.reactFloater.reactFloaterStrings.top = "top".asInstanceOf[typings.reactFloater.reactFloaterStrings.top]
    
    inline def `top-end`: typings.reactFloater.reactFloaterStrings.`top-end` = "top-end".asInstanceOf[typings.reactFloater.reactFloaterStrings.`top-end`]
    
    inline def `top-start`: typings.reactFloater.reactFloaterStrings.`top-start` = "top-start".asInstanceOf[typings.reactFloater.reactFloaterStrings.`top-start`]
  }
  
  trait Props extends StObject {
    
    /**
      * Open the Floater automatically.
      */
    var autoOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * It will be called when the Floater change state
      */
    var callback: js.UndefOr[
        js.Function2[/* action */ Action, /* props */ PropsWithComponent | PropsWithContent, Unit]
      ] = js.undefined
    
    /**
      * An element to trigger the Floater.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Log some basic actions.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Animate the Floater on scroll/resize.
      */
    var disableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable changes in the Floater position on scroll/resize.
      */
    var disableFlip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Don't convert hover event to click on mobile.
      */
    var disableHoverToClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The event that will trigger the Floater. It can be hover | click.
      * These won't work in controlled mode.
      */
    var event: js.UndefOr[click | hover] = js.undefined
    
    /**
      * The amount of time (in seconds) that the floater should wait after a mouseLeave event before hiding. Only valid for event type hover.
      */
    var eventDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * It can be anything that can be rendered.
      */
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Get the popper.js instance
      */
    var getPopper: js.UndefOr[js.Function2[/* popper */ Data, /* origin */ floater | wrapper, Unit]] = js.undefined
    
    /**
      * Don't show the arrow. Useful for centered or modal layout.
      */
    var hideArrow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * In case that you need to identify the portal.
      */
    var id: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The distance between the Floater and its target in pixels.
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * Controlled mode.
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Customize popper.js modifiers.
      */
    var options: js.UndefOr[Modifiers] = js.undefined
    
    /**
      * The placement of the Floater. It will update the position if there's no space available.
      */
    var placement: js.UndefOr[Placement] = js.undefined
    
    /**
      * It will show a ⨉ button to close the Floater.
      */
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Customize the default UI.
      */
    var styles: js.UndefOr[PartialStyles] = js.undefined
    
    /**
      * The target used to calculate the Floater position. If it's not set, it will use the `children` as the target.
      */
    var target: js.UndefOr[String | HTMLElement | Null] = js.undefined
    
    /**
      * It can be anything that can be rendered.
      */
    var title: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Position the wrapper relative to the target.
      */
    var wrapperOptions: js.UndefOr[Offset] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      inline def setCallback(value: (/* action */ Action, /* props */ PropsWithComponent | PropsWithContent) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      inline def setDisableFlip(value: Boolean): Self = StObject.set(x, "disableFlip", value.asInstanceOf[js.Any])
      
      inline def setDisableFlipUndefined: Self = StObject.set(x, "disableFlip", js.undefined)
      
      inline def setDisableHoverToClick(value: Boolean): Self = StObject.set(x, "disableHoverToClick", value.asInstanceOf[js.Any])
      
      inline def setDisableHoverToClickUndefined: Self = StObject.set(x, "disableHoverToClick", js.undefined)
      
      inline def setEvent(value: click | hover): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventDelay(value: Double): Self = StObject.set(x, "eventDelay", value.asInstanceOf[js.Any])
      
      inline def setEventDelayUndefined: Self = StObject.set(x, "eventDelay", js.undefined)
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setGetPopper(value: (/* popper */ Data, /* origin */ floater | wrapper) => Unit): Self = StObject.set(x, "getPopper", js.Any.fromFunction2(value))
      
      inline def setGetPopperUndefined: Self = StObject.set(x, "getPopper", js.undefined)
      
      inline def setHideArrow(value: Boolean): Self = StObject.set(x, "hideArrow", value.asInstanceOf[js.Any])
      
      inline def setHideArrowUndefined: Self = StObject.set(x, "hideArrow", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptions(value: Modifiers): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: PartialStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWrapperOptions(value: Offset): Self = StObject.set(x, "wrapperOptions", value.asInstanceOf[js.Any])
      
      inline def setWrapperOptionsUndefined: Self = StObject.set(x, "wrapperOptions", js.undefined)
    }
  }
  
  trait PropsWithComponent
    extends StObject
       with Props {
    
    /**
      * A React component or function to as a custom UI for the Floater.
      * The prop closeFloater will be available in your component.
      */
    def component(renderProps: RenderProps): ReactNode
  }
  object PropsWithComponent {
    
    inline def apply(component: RenderProps => ReactNode): PropsWithComponent = {
      val __obj = js.Dynamic.literal(component = js.Any.fromFunction1(component))
      __obj.asInstanceOf[PropsWithComponent]
    }
    
    extension [Self <: PropsWithComponent](x: Self) {
      
      inline def setComponent(value: RenderProps => ReactNode): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
    }
  }
  
  trait PropsWithContent
    extends StObject
       with Props {
    
    /**
      * The Floater content. It can be anything that can be rendered.
      * This is the only required props, unless you pass a component.
      */
    var content: ReactNode
  }
  object PropsWithContent {
    
    inline def apply(): PropsWithContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsWithContent]
    }
    
    extension [Self <: PropsWithContent](x: Self) {
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type ReactFloater = Component[PropsWithComponent | PropsWithContent, js.Object, js.Any]
  
  trait RenderProps extends StObject {
    
    def closeFn(): Unit
  }
  object RenderProps {
    
    inline def apply(closeFn: () => Unit): RenderProps = {
      val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction0(closeFn))
      __obj.asInstanceOf[RenderProps]
    }
    
    extension [Self <: RenderProps](x: Self) {
      
      inline def setCloseFn(value: () => Unit): Self = StObject.set(x, "closeFn", js.Any.fromFunction0(value))
    }
  }
  
  trait Styles extends StObject {
    
    var arrow: CSSPropertieslengthnumber
    
    var close: CSSProperties
    
    var container: CSSProperties
    
    var content: CSSProperties
    
    var floater: CSSProperties
    
    var floaterCentered: CSSProperties
    
    var floaterClosing: CSSProperties
    
    var floaterOpening: CSSProperties
    
    var floaterWithAnimation: CSSProperties
    
    var floaterWithComponent: CSSProperties
    
    var footer: CSSProperties
    
    var options: ZIndex
    
    var title: CSSProperties
    
    var wrapper: CSSProperties
    
    var wrapperPosition: CSSProperties
  }
  object Styles {
    
    inline def apply(
      arrow: CSSPropertieslengthnumber,
      close: CSSProperties,
      container: CSSProperties,
      content: CSSProperties,
      floater: CSSProperties,
      floaterCentered: CSSProperties,
      floaterClosing: CSSProperties,
      floaterOpening: CSSProperties,
      floaterWithAnimation: CSSProperties,
      floaterWithComponent: CSSProperties,
      footer: CSSProperties,
      options: ZIndex,
      title: CSSProperties,
      wrapper: CSSProperties,
      wrapperPosition: CSSProperties
    ): Styles = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], floater = floater.asInstanceOf[js.Any], floaterCentered = floaterCentered.asInstanceOf[js.Any], floaterClosing = floaterClosing.asInstanceOf[js.Any], floaterOpening = floaterOpening.asInstanceOf[js.Any], floaterWithAnimation = floaterWithAnimation.asInstanceOf[js.Any], floaterWithComponent = floaterWithComponent.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any], wrapperPosition = wrapperPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Styles]
    }
    
    extension [Self <: Styles](x: Self) {
      
      inline def setArrow(value: CSSPropertieslengthnumber): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setClose(value: CSSProperties): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: CSSProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContent(value: CSSProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFloater(value: CSSProperties): Self = StObject.set(x, "floater", value.asInstanceOf[js.Any])
      
      inline def setFloaterCentered(value: CSSProperties): Self = StObject.set(x, "floaterCentered", value.asInstanceOf[js.Any])
      
      inline def setFloaterClosing(value: CSSProperties): Self = StObject.set(x, "floaterClosing", value.asInstanceOf[js.Any])
      
      inline def setFloaterOpening(value: CSSProperties): Self = StObject.set(x, "floaterOpening", value.asInstanceOf[js.Any])
      
      inline def setFloaterWithAnimation(value: CSSProperties): Self = StObject.set(x, "floaterWithAnimation", value.asInstanceOf[js.Any])
      
      inline def setFloaterWithComponent(value: CSSProperties): Self = StObject.set(x, "floaterWithComponent", value.asInstanceOf[js.Any])
      
      inline def setFooter(value: CSSProperties): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ZIndex): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: CSSProperties): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: CSSProperties): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperPosition(value: CSSProperties): Self = StObject.set(x, "wrapperPosition", value.asInstanceOf[js.Any])
    }
  }
}
