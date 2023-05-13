package typings.primereact

import typings.primereact.primereactStrings.both
import typings.primereact.primereactStrings.bottom
import typings.primereact.primereactStrings.focus
import typings.primereact.primereactStrings.hover
import typings.primereact.primereactStrings.left
import typings.primereact.primereactStrings.mouse
import typings.primereact.primereactStrings.right
import typings.primereact.primereactStrings.self
import typings.primereact.primereactStrings.top
import typings.primereact.tooltipTooltipMod.TooltipPassThroughOptions
import typings.react.mod.AriaAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipoptionsMod {
  
  /**
    * Custom tooltip event
    * @event
    */
  trait TooltipEvent extends StObject {
    
    /**
      * Browser event
      */
    var originalEvent: SyntheticEvent[Element, Event]
    
    /**
      * Target element.
      * @defaultValue current target
      */
    var target: HTMLElement
  }
  object TooltipEvent {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event], target: HTMLElement): TooltipEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * In addition to React.HTMLAttributes, the following attributes can be used on any HTMLElement if the page has a PrimeReact {@link tooltip} component.
    * @group Model
    */
  trait TooltipHTMLAttributes extends StObject {
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Defines which position on the target element to align the positioned tooltip.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.at}
      */
    var `data-pr-at`: js.UndefOr[String] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Whether to hide tooltip when hovering over tooltip content.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.autoHide}
      * @defaultValue true
      */
    var `data-pr-autohide`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Style class of the tooltip.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.className}
      */
    var `data-pr-classname`: js.UndefOr[String] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * When present, it specifies that the tooltip should be hidden.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.disabled}
      * @defaultValue false
      */
    var `data-pr-disabled`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Event to show the tooltip.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.event}
      * @defaultValue hover
      */
    var `data-pr-event`: js.UndefOr[hover | focus | both] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Delay to hide the tooltip in milliseconds.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.hideDelay}
      * @defaultValue 0
      */
    var `data-pr-hidedelay`: js.UndefOr[Double] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Event to hide the tooltip if the event property is empty.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.hideEvent}
      * @defaultValue mouseleave
      */
    var `data-pr-hideevent`: js.UndefOr[String] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Whether the tooltip will follow the mouse.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.mouseTrack}
      * @defaultValue false
      */
    var `data-pr-mousetrack`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Defines left position of the tooltip in relation to the mouse when the mouseTrack is enabled.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.mouseTrackLeft}
      * @defaultValue 5
      */
    var `data-pr-mousetrackleft`: js.UndefOr[Double] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Defines top position of the tooltip in relation to the mouse when the mouseTrack is enabled.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.mouseTrackTop}
      * @defaultValue 5
      */
    var `data-pr-mousetracktop`: js.UndefOr[Double] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Defines which position on the tooltip being positioned to align with the target element.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.my}
      */
    var `data-pr-my`: js.UndefOr[String] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Position of the tooltip.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.position}
      * @defaultValue right
      */
    var `data-pr-position`: js.UndefOr[top | bottom | left | right | mouse] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Delay to show the tooltip in milliseconds.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.showDelay}
      * @defaultValue 0
      */
    var `data-pr-showdelay`: js.UndefOr[Double] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Event to show the tooltip if the event property is empty.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.showEvent}
      * @defaultValue mouseenter
      */
    var `data-pr-showevent`: js.UndefOr[String] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Whether to show tooltip for disabled elements.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.showOnDisabled}
      * @defaultValue false
      */
    var `data-pr-showondisabled`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Content of the tooltip.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltip.TooltipProps.content}
      */
    var `data-pr-tooltip`: js.UndefOr[String] = js.undefined
    
    /**
      * **PrimeReact - TooltipHTMLAttributes**
      *
      * Delay to update the tooltip in milliseconds.*
      *
      * ![PrimeReact](https://primefaces.org/cdn/primereact/images/logo-100.png)
      * ___
      *
      * _*This feature will be active when there is a PrimeReact {@link tooltip} component on the page._
      *
      * {@inheritDoc tooltipoptions.TooltipOptions.updateDelay}
      * @defaultValue 0
      */
    var `data-pr-updatedelay`: js.UndefOr[Double] = js.undefined
  }
  object TooltipHTMLAttributes {
    
    inline def apply(): TooltipHTMLAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipHTMLAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipHTMLAttributes] (val x: Self) extends AnyVal {
      
      inline def `setData-pr-at`(value: String): Self = StObject.set(x, "data-pr-at", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-atUndefined`: Self = StObject.set(x, "data-pr-at", js.undefined)
      
      inline def `setData-pr-autohide`(value: Boolean): Self = StObject.set(x, "data-pr-autohide", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-autohideUndefined`: Self = StObject.set(x, "data-pr-autohide", js.undefined)
      
      inline def `setData-pr-classname`(value: String): Self = StObject.set(x, "data-pr-classname", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-classnameUndefined`: Self = StObject.set(x, "data-pr-classname", js.undefined)
      
      inline def `setData-pr-disabled`(value: Boolean): Self = StObject.set(x, "data-pr-disabled", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-disabledUndefined`: Self = StObject.set(x, "data-pr-disabled", js.undefined)
      
      inline def `setData-pr-event`(value: hover | focus | both): Self = StObject.set(x, "data-pr-event", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-eventUndefined`: Self = StObject.set(x, "data-pr-event", js.undefined)
      
      inline def `setData-pr-hidedelay`(value: Double): Self = StObject.set(x, "data-pr-hidedelay", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-hidedelayUndefined`: Self = StObject.set(x, "data-pr-hidedelay", js.undefined)
      
      inline def `setData-pr-hideevent`(value: String): Self = StObject.set(x, "data-pr-hideevent", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-hideeventUndefined`: Self = StObject.set(x, "data-pr-hideevent", js.undefined)
      
      inline def `setData-pr-mousetrack`(value: Boolean): Self = StObject.set(x, "data-pr-mousetrack", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-mousetrackUndefined`: Self = StObject.set(x, "data-pr-mousetrack", js.undefined)
      
      inline def `setData-pr-mousetrackleft`(value: Double): Self = StObject.set(x, "data-pr-mousetrackleft", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-mousetrackleftUndefined`: Self = StObject.set(x, "data-pr-mousetrackleft", js.undefined)
      
      inline def `setData-pr-mousetracktop`(value: Double): Self = StObject.set(x, "data-pr-mousetracktop", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-mousetracktopUndefined`: Self = StObject.set(x, "data-pr-mousetracktop", js.undefined)
      
      inline def `setData-pr-my`(value: String): Self = StObject.set(x, "data-pr-my", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-myUndefined`: Self = StObject.set(x, "data-pr-my", js.undefined)
      
      inline def `setData-pr-position`(value: top | bottom | left | right | mouse): Self = StObject.set(x, "data-pr-position", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-positionUndefined`: Self = StObject.set(x, "data-pr-position", js.undefined)
      
      inline def `setData-pr-showdelay`(value: Double): Self = StObject.set(x, "data-pr-showdelay", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-showdelayUndefined`: Self = StObject.set(x, "data-pr-showdelay", js.undefined)
      
      inline def `setData-pr-showevent`(value: String): Self = StObject.set(x, "data-pr-showevent", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-showeventUndefined`: Self = StObject.set(x, "data-pr-showevent", js.undefined)
      
      inline def `setData-pr-showondisabled`(value: Boolean): Self = StObject.set(x, "data-pr-showondisabled", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-showondisabledUndefined`: Self = StObject.set(x, "data-pr-showondisabled", js.undefined)
      
      inline def `setData-pr-tooltip`(value: String): Self = StObject.set(x, "data-pr-tooltip", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-tooltipUndefined`: Self = StObject.set(x, "data-pr-tooltip", js.undefined)
      
      inline def `setData-pr-updatedelay`(value: Double): Self = StObject.set(x, "data-pr-updatedelay", value.asInstanceOf[js.Any])
      
      inline def `setData-pr-updatedelayUndefined`: Self = StObject.set(x, "data-pr-updatedelay", js.undefined)
    }
  }
  
  trait TooltipOptions extends StObject {
    
    /**
      * DOM element instance where the overlay panel should be mounted. Valid values are any DOM Element and 'self'. The self value is used to render a component where it is located.
      * @defaultValue document.body
      */
    var appendTo: js.UndefOr[self | HTMLElement | Null] = js.undefined
    
    /**
      * Defines which position on the target element to align the positioned tooltip.
      */
    var at: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to hide tooltip when hovering over tooltip content.
      * @defaultValue true
      */
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to automatically manage layering.
      * @defaultValue true
      */
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Base zIndex value to use in layering.
      * @defaultValue 0
      */
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Style class of the tooltip.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * When present, it specifies that the tooltip should be hidden.
      * @defaultValue false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Event to show the tooltip.
      * @defaultValue hover
      */
    var event: js.UndefOr[hover | focus | both] = js.undefined
    
    /**
      * Delay to hide the tooltip in milliseconds.
      * @defaultValue 0
      */
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Event to hide the tooltip if the event property is empty.
      * @defaultValue mouseleave
      */
    var hideEvent: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the tooltip will follow the mouse.
      * @defaultValue false
      */
    var mouseTrack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines left position of the tooltip in relation to the mouse when the mouseTrack is enabled.
      * @defaultValue 5
      */
    var mouseTrackLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines top position of the tooltip in relation to the mouse when the mouseTrack is enabled.
      * @defaultValue 5
      */
    var mouseTrackTop: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines which position on the tooltip being positioned to align with the target element.
      */
    var my: js.UndefOr[String] = js.undefined
    
    /**
      * Callback to invoke before the tooltip is hidden.
      * @param {TooltipEvent} event - Browser event
      */
    var onBeforeHide: js.UndefOr[js.Function1[/* event */ TooltipEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke before the tooltip is shown.
      * @param {TooltipEvent} event - Browser event
      */
    var onBeforeShow: js.UndefOr[js.Function1[/* event */ TooltipEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when the tooltip is hidden.
      * @param {TooltipEvent} event - Browser event
      */
    var onHide: js.UndefOr[js.Function1[/* event */ TooltipEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when the tooltip is shown.
      * @param {TooltipEvent} event - Browser event
      */
    var onShow: js.UndefOr[js.Function1[/* event */ TooltipEvent, Unit]] = js.undefined
    
    /**
      * Position of the tooltip.
      * @defaultValue right
      */
    var position: js.UndefOr[top | bottom | left | right | mouse] = js.undefined
    
    /**
      * Uses to pass attributes to DOM elements inside the component.
      */
    var pt: js.UndefOr[TooltipPassThroughOptions] = js.undefined
    
    /**
      * Delay to show the tooltip in milliseconds.
      * @defaultValue 0
      */
    var showDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Event to show the tooltip if the event property is empty.
      * @defaultValue mouseenter
      */
    var showEvent: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to show tooltip for disabled elements.
      * @defaultValue false
      */
    var showOnDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style of the tooltip.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Delay to update the tooltip in milliseconds.
      * @defaultValue 0
      */
    var updateDelay: js.UndefOr[Double] = js.undefined
  }
  object TooltipOptions {
    
    inline def apply(): TooltipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
      
      inline def setAppendTo(value: self | HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEvent(value: hover | focus | both): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      inline def setHideEvent(value: String): Self = StObject.set(x, "hideEvent", value.asInstanceOf[js.Any])
      
      inline def setHideEventUndefined: Self = StObject.set(x, "hideEvent", js.undefined)
      
      inline def setMouseTrack(value: Boolean): Self = StObject.set(x, "mouseTrack", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackLeft(value: Double): Self = StObject.set(x, "mouseTrackLeft", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackLeftUndefined: Self = StObject.set(x, "mouseTrackLeft", js.undefined)
      
      inline def setMouseTrackTop(value: Double): Self = StObject.set(x, "mouseTrackTop", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackTopUndefined: Self = StObject.set(x, "mouseTrackTop", js.undefined)
      
      inline def setMouseTrackUndefined: Self = StObject.set(x, "mouseTrack", js.undefined)
      
      inline def setMy(value: String): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setOnBeforeHide(value: /* event */ TooltipEvent => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* event */ TooltipEvent => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* event */ TooltipEvent => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* event */ TooltipEvent => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(value: top | bottom | left | right | mouse): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPt(value: TooltipPassThroughOptions): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
      
      inline def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
      
      inline def setShowEvent(value: String): Self = StObject.set(x, "showEvent", value.asInstanceOf[js.Any])
      
      inline def setShowEventUndefined: Self = StObject.set(x, "showEvent", js.undefined)
      
      inline def setShowOnDisabled(value: Boolean): Self = StObject.set(x, "showOnDisabled", value.asInstanceOf[js.Any])
      
      inline def setShowOnDisabledUndefined: Self = StObject.set(x, "showOnDisabled", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
      
      inline def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
    }
  }
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait HTMLAttributes[T]
      extends StObject
         with AriaAttributes
         with DOMAttributes[T]
         with TooltipHTMLAttributes
    object HTMLAttributes {
      
      inline def apply[T](): HTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLAttributes[T]]
      }
    }
  }
}
