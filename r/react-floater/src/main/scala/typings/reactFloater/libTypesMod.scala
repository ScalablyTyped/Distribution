package typings.reactFloater

import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactFloater.anon.CSSPropertieslengthnumber
import typings.reactFloater.anon.Offset
import typings.reactFloater.anon.ZIndex
import typings.reactFloater.libTypesPopperMod.PopperInstance
import typings.reactFloater.libTypesPopperMod.PopperModifiers
import typings.reactFloater.libTypesPopperMod.PopperPlacement
import typings.reactFloater.reactFloaterStrings.center
import typings.reactFloater.reactFloaterStrings.click
import typings.reactFloater.reactFloaterStrings.component
import typings.reactFloater.reactFloaterStrings.content
import typings.reactFloater.reactFloaterStrings.floater
import typings.reactFloater.reactFloaterStrings.hover
import typings.reactFloater.reactFloaterStrings.wrapper
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Record
import typings.typeFest.sourcePartialDeepMod.PartialDeep
import typings.typeFest.sourceRequireExactlyOneMod.RequireExactlyOne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFloater.reactFloaterStrings.open
    - typings.reactFloater.reactFloaterStrings.close
  */
  trait Action extends StObject
  object Action {
    
    inline def close: typings.reactFloater.reactFloaterStrings.close = "close".asInstanceOf[typings.reactFloater.reactFloaterStrings.close]
    
    inline def open: typings.reactFloater.reactFloaterStrings.open = "open".asInstanceOf[typings.reactFloater.reactFloaterStrings.open]
  }
  
  trait BaseProps extends StObject {
    
    /**
      * Open the Floater automatically.
      * @default false
      */
    var autoOpen: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[js.Function2[/* action */ Action, /* props */ Props, Unit]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * A React element or function to be used as the custom UI for the Floater.
      * The prop closeFloater will be available in your component.
      */
    var component: FunctionComponent[RenderProps] | ReactElement
    
    var content: ReactNode
    
    /**
      * Log some actions.
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable placement adjustments on scroll/resize.
      * @default false
      */
    var disableFlip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable the conversion of hover to click on mobile.
      * @default false
      */
    var disableHoverToClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The event type that will trigger the Floater.
      * Unused in controlled mode.
      * @default click
      */
    var event: js.UndefOr[click | hover] = js.undefined
    
    /**
      *  The amount of time (in seconds) that the floater should wait after a mouseLeave event before hiding.
      *  Only valid for event type hover.
      *  @default 0.4
      *  */
    var eventDelay: js.UndefOr[Double] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var getPopper: js.UndefOr[js.Function2[/* popper */ PopperInstance, /* origin */ floater | wrapper, Unit]] = js.undefined
    
    /**
      * Hide the arrow.
      * @default false
      */
    var hideArrow: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var modifiers: js.UndefOr[PopperModifiers] = js.undefined
    
    /**
      * The distance between the target and the Floater in pixels.
      * @default 15
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The placement of the Floater
      * This will be updated automatically if there's no space available unless the "disableFlip" is set to true
      * @default bottom
      */
    var placement: js.UndefOr[PlacementOptions] = js.undefined
    
    var portalElement: js.UndefOr[SelectorOrElement] = js.undefined
    
    /**
      * Show a button to close the Floater.
      * @default false
      */
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var styles: js.UndefOr[PartialDeep[Styles, js.Object]] = js.undefined
    
    var target: js.UndefOr[SelectorOrElement] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var wrapperOptions: js.UndefOr[Offset] = js.undefined
  }
  object BaseProps {
    
    inline def apply(component: FunctionComponent[RenderProps] | ReactElement): BaseProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
      
      inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      inline def setCallback(value: (/* action */ Action, /* props */ Props) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponent(value: FunctionComponent[RenderProps] | ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
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
      
      inline def setGetPopper(value: (/* popper */ PopperInstance, /* origin */ floater | wrapper) => Unit): Self = StObject.set(x, "getPopper", js.Any.fromFunction2(value))
      
      inline def setGetPopperUndefined: Self = StObject.set(x, "getPopper", js.undefined)
      
      inline def setHideArrow(value: Boolean): Self = StObject.set(x, "hideArrow", value.asInstanceOf[js.Any])
      
      inline def setHideArrowUndefined: Self = StObject.set(x, "hideArrow", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModifiers(value: PopperModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlacement(value: PlacementOptions): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPortalElement(value: SelectorOrElement): Self = StObject.set(x, "portalElement", value.asInstanceOf[js.Any])
      
      inline def setPortalElementNull: Self = StObject.set(x, "portalElement", null)
      
      inline def setPortalElementUndefined: Self = StObject.set(x, "portalElement", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: PartialDeep[Styles, js.Object]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTarget(value: SelectorOrElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWrapperOptions(value: Offset): Self = StObject.set(x, "wrapperOptions", value.asInstanceOf[js.Any])
      
      inline def setWrapperOptionsUndefined: Self = StObject.set(x, "wrapperOptions", js.undefined)
    }
  }
  
  trait CustomComponent extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var closeFn: HandlerFunction[HTMLElement]
  }
  object CustomComponent {
    
    inline def apply(closeFn: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): CustomComponent = {
      val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction1(closeFn))
      __obj.asInstanceOf[CustomComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomComponent] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCloseFn(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "closeFn", js.Any.fromFunction1(value))
    }
  }
  
  type HandlerFunction[T] = js.Function1[/* event */ SyntheticEvent[T, Event], Unit]
  
  trait LogOptions extends StObject {
    
    var data: Any
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var title: String
  }
  object LogOptions {
    
    inline def apply(data: Any, title: String): LogOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type PlacementOptions = PopperPlacement | center
  
  type PlainObject[T] = Record[String, T]
  
  type Props = RequireExactlyOne[BaseProps, content | component]
  
  trait RenderProps extends StObject {
    
    var closeFn: HandlerFunction[HTMLElement]
  }
  object RenderProps {
    
    inline def apply(closeFn: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): RenderProps = {
      val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction1(closeFn))
      __obj.asInstanceOf[RenderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
      
      inline def setCloseFn(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "closeFn", js.Any.fromFunction1(value))
    }
  }
  
  type SelectorOrElement = String | Null | HTMLElement
  
  trait State extends StObject {
    
    var currentPlacement: PlacementOptions
    
    var positionWrapper: Boolean
    
    var status: Statuses
    
    var statusWrapper: Statuses
  }
  object State {
    
    inline def apply(
      currentPlacement: PlacementOptions,
      positionWrapper: Boolean,
      status: Statuses,
      statusWrapper: Statuses
    ): State = {
      val __obj = js.Dynamic.literal(currentPlacement = currentPlacement.asInstanceOf[js.Any], positionWrapper = positionWrapper.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusWrapper = statusWrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setCurrentPlacement(value: PlacementOptions): Self = StObject.set(x, "currentPlacement", value.asInstanceOf[js.Any])
      
      inline def setPositionWrapper(value: Boolean): Self = StObject.set(x, "positionWrapper", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Statuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusWrapper(value: Statuses): Self = StObject.set(x, "statusWrapper", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined type-fest.type-fest.ValueOf<{ readonly INIT :'init',  readonly IDLE :'idle',  readonly RENDER :'render',  readonly OPENING :'opening',  readonly OPEN :'open',  readonly CLOSING :'closing',  readonly ERROR :'error'}, keyof { readonly INIT :'init',  readonly IDLE :'idle',  readonly RENDER :'render',  readonly OPENING :'opening',  readonly OPEN :'open',  readonly CLOSING :'closing',  readonly ERROR :'error'}> */
  /* Rewritten from type alias, can be one of: 
    - typings.reactFloater.reactFloaterStrings.idle
    - typings.reactFloater.reactFloaterStrings.opening
    - typings.reactFloater.reactFloaterStrings.render
    - typings.reactFloater.reactFloaterStrings.closing
    - typings.reactFloater.reactFloaterStrings.open
    - typings.reactFloater.reactFloaterStrings.init
    - typings.reactFloater.reactFloaterStrings.error
  */
  trait Statuses extends StObject
  object Statuses {
    
    inline def closing: typings.reactFloater.reactFloaterStrings.closing = "closing".asInstanceOf[typings.reactFloater.reactFloaterStrings.closing]
    
    inline def error: typings.reactFloater.reactFloaterStrings.error = "error".asInstanceOf[typings.reactFloater.reactFloaterStrings.error]
    
    inline def idle: typings.reactFloater.reactFloaterStrings.idle = "idle".asInstanceOf[typings.reactFloater.reactFloaterStrings.idle]
    
    inline def init: typings.reactFloater.reactFloaterStrings.init = "init".asInstanceOf[typings.reactFloater.reactFloaterStrings.init]
    
    inline def open: typings.reactFloater.reactFloaterStrings.open = "open".asInstanceOf[typings.reactFloater.reactFloaterStrings.open]
    
    inline def opening: typings.reactFloater.reactFloaterStrings.opening = "opening".asInstanceOf[typings.reactFloater.reactFloaterStrings.opening]
    
    inline def render: typings.reactFloater.reactFloaterStrings.render = "render".asInstanceOf[typings.reactFloater.reactFloaterStrings.render]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
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
  
  object global {
    
    trait Window extends StObject {
      
      var ReactFloaterDebug: js.UndefOr[Boolean] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setReactFloaterDebug(value: Boolean): Self = StObject.set(x, "ReactFloaterDebug", value.asInstanceOf[js.Any])
        
        inline def setReactFloaterDebugUndefined: Self = StObject.set(x, "ReactFloaterDebug", js.undefined)
      }
    }
  }
}
