package typings.qtip2

import typings.jquery.JQueryGenericPromise
import typings.qtip2.qtip2Strings.api
import typings.qtip2.qtip2Strings.blur
import typings.qtip2.qtip2Strings.content
import typings.qtip2.qtip2Strings.contentDotattr
import typings.qtip2.qtip2Strings.contentDotbutton
import typings.qtip2.qtip2Strings.contentDottext
import typings.qtip2.qtip2Strings.contentDottitle
import typings.qtip2.qtip2Strings.destroy
import typings.qtip2.qtip2Strings.disable
import typings.qtip2.qtip2Strings.enable
import typings.qtip2.qtip2Strings.events
import typings.qtip2.qtip2Strings.eventsDotblur
import typings.qtip2.qtip2Strings.eventsDotfocus
import typings.qtip2.qtip2Strings.eventsDothidden
import typings.qtip2.qtip2Strings.eventsDothide
import typings.qtip2.qtip2Strings.eventsDotmove
import typings.qtip2.qtip2Strings.eventsDotrender
import typings.qtip2.qtip2Strings.eventsDotshow
import typings.qtip2.qtip2Strings.eventsDottoggle
import typings.qtip2.qtip2Strings.eventsDotvisible
import typings.qtip2.qtip2Strings.focus
import typings.qtip2.qtip2Strings.hide
import typings.qtip2.qtip2Strings.hideDotdelay
import typings.qtip2.qtip2Strings.hideDotdistance
import typings.qtip2.qtip2Strings.hideDoteffect
import typings.qtip2.qtip2Strings.hideDotevent
import typings.qtip2.qtip2Strings.hideDotfixed
import typings.qtip2.qtip2Strings.hideDotinactive
import typings.qtip2.qtip2Strings.hideDotleave
import typings.qtip2.qtip2Strings.hideDottarget
import typings.qtip2.qtip2Strings.id
import typings.qtip2.qtip2Strings.metadata
import typings.qtip2.qtip2Strings.option
import typings.qtip2.qtip2Strings.overwrite
import typings.qtip2.qtip2Strings.position
import typings.qtip2.qtip2Strings.positionDotadjust
import typings.qtip2.qtip2Strings.positionDotat
import typings.qtip2.qtip2Strings.positionDotcontainer
import typings.qtip2.qtip2Strings.positionDoteffect
import typings.qtip2.qtip2Strings.positionDotmy
import typings.qtip2.qtip2Strings.positionDottarget
import typings.qtip2.qtip2Strings.positionDotviewport
import typings.qtip2.qtip2Strings.prerender
import typings.qtip2.qtip2Strings.reposition
import typings.qtip2.qtip2Strings.show
import typings.qtip2.qtip2Strings.showDotdelay
import typings.qtip2.qtip2Strings.showDoteffect
import typings.qtip2.qtip2Strings.showDotevent
import typings.qtip2.qtip2Strings.showDotmodal
import typings.qtip2.qtip2Strings.showDotready
import typings.qtip2.qtip2Strings.showDotsolo
import typings.qtip2.qtip2Strings.showDottarget
import typings.qtip2.qtip2Strings.style
import typings.qtip2.qtip2Strings.styleDotclasses
import typings.qtip2.qtip2Strings.styleDotdef
import typings.qtip2.qtip2Strings.styleDotheight
import typings.qtip2.qtip2Strings.styleDottip
import typings.qtip2.qtip2Strings.styleDotwidget
import typings.qtip2.qtip2Strings.styleDotwidth
import typings.qtip2.qtip2Strings.suppress
import typings.qtip2.qtip2Strings.toggle
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QTip2 {
  
  /**
    * API
    */
  @js.native
  trait Api extends StObject {
    
    def blur(): Api = js.native
    def blur(event: Event): Api = js.native
    
    def destroy(): Api = js.native
    def destroy(immediate: Boolean): Api = js.native
    
    def disable(): Api = js.native
    def disable(state: Boolean): Api = js.native
    
    def enable(): Api = js.native
    
    def focus(): Api = js.native
    def focus(event: Event): Api = js.native
    
    def get(propertyName: String): Any = js.native
    @JSName("get")
    def get_content(propertyName: content): Content = js.native
    @JSName("get")
    def get_contentattr(propertyName: contentDotattr): String = js.native
    @JSName("get")
    def get_contentbutton(propertyName: contentDotbutton): String | JQuery | Boolean = js.native
    @JSName("get")
    def get_contenttext(propertyName: contentDottext): Text = js.native
    @JSName("get")
    def get_contenttitle(propertyName: contentDottitle): Title = js.native
    @JSName("get")
    def get_events(propertyName: events): Events = js.native
    @JSName("get")
    def get_eventsblur(propertyName: eventsDotblur): EventApiFunc = js.native
    @JSName("get")
    def get_eventsfocus(propertyName: eventsDotfocus): EventApiFunc = js.native
    @JSName("get")
    def get_eventshidden(propertyName: eventsDothidden): EventApiFunc = js.native
    @JSName("get")
    def get_eventshide(propertyName: eventsDothide): EventApiFunc = js.native
    @JSName("get")
    def get_eventsmove(propertyName: eventsDotmove): EventApiFunc = js.native
    @JSName("get")
    def get_eventsrender(propertyName: eventsDotrender): EventApiFunc = js.native
    @JSName("get")
    def get_eventsshow(propertyName: eventsDotshow): EventApiFunc = js.native
    @JSName("get")
    def get_eventstoggle(propertyName: eventsDottoggle): EventApiFunc = js.native
    @JSName("get")
    def get_eventsvisible(propertyName: eventsDotvisible): EventApiFunc = js.native
    @JSName("get")
    def get_hide(propertyName: hide): Hide = js.native
    @JSName("get")
    def get_hidedelay(propertyName: hideDotdelay): Double = js.native
    @JSName("get")
    def get_hidedistance(propertyName: hideDotdistance): Double | Boolean = js.native
    @JSName("get")
    def get_hideeffect(propertyName: hideDoteffect): Boolean | (js.Function1[/* offset */ Any, Unit]) = js.native
    @JSName("get")
    def get_hideevent(propertyName: hideDotevent): String | Boolean = js.native
    @JSName("get")
    def get_hideleave(propertyName: hideDotleave): String | Boolean = js.native
    @JSName("get")
    def get_hidetarget(propertyName: hideDottarget): JQuery | Boolean = js.native
    @JSName("get")
    def get_id(propertyName: id): String | Boolean = js.native
    @JSName("get")
    def get_metadata(propertyName: metadata): Any = js.native
    @JSName("get")
    def get_overwrite(propertyName: overwrite): Boolean = js.native
    @JSName("get")
    def get_position(propertyName: position): Position = js.native
    @JSName("get")
    def get_positionadjust(propertyName: positionDotadjust): PositionAdjust = js.native
    @JSName("get")
    def get_positionat(propertyName: positionDotat): String | Boolean = js.native
    @JSName("get")
    def get_positioncontainer(propertyName: positionDotcontainer): JQuery | Boolean = js.native
    @JSName("get")
    def get_positioneffect(propertyName: positionDoteffect): Boolean | (js.Function3[/* api */ Any, /* pos */ Any, /* viewport */ Any, Unit]) = js.native
    @JSName("get")
    def get_positionmy(propertyName: positionDotmy): String | Boolean = js.native
    @JSName("get")
    def get_positiontarget(propertyName: positionDottarget): Target | Boolean = js.native
    @JSName("get")
    def get_positionviewport(propertyName: positionDotviewport): JQuery | Boolean = js.native
    @JSName("get")
    def get_prerender(propertyName: prerender): Boolean = js.native
    @JSName("get")
    def get_show(propertyName: show): Show = js.native
    @JSName("get")
    def get_showdelay(propertyName: showDotdelay): Double = js.native
    @JSName("get")
    def get_showeffect(propertyName: showDoteffect): Boolean | (js.Function1[/* offset */ Any, Unit]) = js.native
    @JSName("get")
    def get_showevent(propertyName: showDotevent): String | Boolean = js.native
    @JSName("get")
    def get_showmodal(propertyName: showDotmodal): Boolean | Modal = js.native
    @JSName("get")
    def get_showready(propertyName: showDotready): Boolean = js.native
    @JSName("get")
    def get_showsolo(propertyName: showDotsolo): JQuery | String | Boolean = js.native
    @JSName("get")
    def get_showtarget(propertyName: showDottarget): JQuery | Boolean = js.native
    @JSName("get")
    def get_style(propertyName: style): Style = js.native
    @JSName("get")
    def get_styleclasses(propertyName: styleDotclasses): String | Boolean = js.native
    @JSName("get")
    def get_styledef(propertyName: styleDotdef): Boolean = js.native
    @JSName("get")
    def get_styleheight(propertyName: styleDotheight): String | Double | Boolean = js.native
    @JSName("get")
    def get_styletip(propertyName: styleDottip): String | Boolean | Tip = js.native
    @JSName("get")
    def get_stylewidget(propertyName: styleDotwidget): Boolean = js.native
    @JSName("get")
    def get_stylewidth(propertyName: styleDotwidth): String | Double | Boolean = js.native
    @JSName("get")
    def get_suppress(propertyName: suppress): Boolean = js.native
    
    def hide(): Api = js.native
    def hide(event: Event): Api = js.native
    
    def reposition(): Api = js.native
    def reposition(event: Unit, effect: Boolean): Api = js.native
    def reposition(event: Event): Api = js.native
    def reposition(event: Event, effect: Boolean): Api = js.native
    
    def set(properties: QTipOptions): Api = js.native
    def set(propertyName: String, value: Any): Api = js.native
    @JSName("set")
    def set_content(propertyName: content, value: Content): Api = js.native
    @JSName("set")
    def set_content(propertyName: content, value: Text): Api = js.native
    @JSName("set")
    def set_contentattr(propertyName: contentDotattr, value: String): Api = js.native
    @JSName("set")
    def set_contentbutton(propertyName: contentDotbutton, value: String): Api = js.native
    @JSName("set")
    def set_contentbutton(propertyName: contentDotbutton, value: Boolean): Api = js.native
    @JSName("set")
    def set_contentbutton(propertyName: contentDotbutton, value: JQuery): Api = js.native
    @JSName("set")
    def set_contenttext(propertyName: contentDottext, value: Text): Api = js.native
    @JSName("set")
    def set_contenttitle(propertyName: contentDottitle, value: Title): Api = js.native
    @JSName("set")
    def set_contenttitle(propertyName: contentDottitle, value: typings.qtip2.anon.Text): Api = js.native
    @JSName("set")
    def set_events(propertyName: events, value: Events): Api = js.native
    @JSName("set")
    def set_eventsblur(propertyName: eventsDotblur, value: EventApiFunc): Api = js.native
    @JSName("set")
    def set_eventsfocus(propertyName: eventsDotfocus, value: EventApiFunc): Api = js.native
    @JSName("set")
    def set_eventshidden(propertyName: eventsDothidden, value: EventApiFunc): Api = js.native
    @JSName("set")
    def set_eventshide(propertyName: eventsDothide, value: EventApiFunc): Api = js.native
    @JSName("set")
    def set_eventsmove(propertyName: eventsDotmove, value: EventApiFunc): Api = js.native
    @JSName("set")
    def set_eventsrender(propertyName: eventsDotrender, value: EventApiFunc): Api = js.native
    @JSName("set")
    def set_eventsshow(propertyName: eventsDotshow, value: EventApiFunc): Api = js.native
    @JSName("set")
    def set_eventstoggle(propertyName: eventsDottoggle, value: EventApiFunc): Api = js.native
    @JSName("set")
    def set_eventsvisible(propertyName: eventsDotvisible, value: EventApiFunc): Api = js.native
    @JSName("set")
    def set_hide(propertyName: hide, value: Hide): Api = js.native
    @JSName("set")
    def set_hidedistance(propertyName: hideDotdistance, value: Boolean): Api = js.native
    @JSName("set")
    def set_hidedistance(propertyName: hideDotdistance, value: Double): Api = js.native
    @JSName("set")
    def set_hideeffect(propertyName: hideDoteffect, value: js.Function1[/* offset */ Any, Unit]): Api = js.native
    @JSName("set")
    def set_hideeffect(propertyName: hideDoteffect, value: Boolean): Api = js.native
    @JSName("set")
    def set_hideevent(propertyName: hideDotevent, value: String): Api = js.native
    @JSName("set")
    def set_hideevent(propertyName: hideDotevent, value: Boolean): Api = js.native
    @JSName("set")
    def set_hidefixed(propertyName: hideDotfixed, value: Boolean): Api = js.native
    @JSName("set")
    def set_hideinactive(propertyName: hideDotinactive, value: Boolean): Api = js.native
    @JSName("set")
    def set_hideinactive(propertyName: hideDotinactive, value: Double): Api = js.native
    @JSName("set")
    def set_hideleave(propertyName: hideDotleave, value: String): Api = js.native
    @JSName("set")
    def set_hideleave(propertyName: hideDotleave, value: Boolean): Api = js.native
    @JSName("set")
    def set_hidetarget(propertyName: hideDottarget, value: Boolean): Api = js.native
    @JSName("set")
    def set_hidetarget(propertyName: hideDottarget, value: JQuery): Api = js.native
    @JSName("set")
    def set_id(propertyName: id, value: String): Api = js.native
    @JSName("set")
    def set_id(propertyName: id, value: Boolean): Api = js.native
    @JSName("set")
    def set_metadata(propertyName: metadata, value: Any): Api = js.native
    @JSName("set")
    def set_overwrite(propertyName: overwrite, value: Boolean): Api = js.native
    @JSName("set")
    def set_position(propertyName: position, value: Position): Api = js.native
    @JSName("set")
    def set_positionadjust(propertyName: positionDotadjust, value: PositionAdjust): Api = js.native
    @JSName("set")
    def set_positionat(propertyName: positionDotat, value: String): Api = js.native
    @JSName("set")
    def set_positionat(propertyName: positionDotat, value: Boolean): Api = js.native
    @JSName("set")
    def set_positioncontainer(propertyName: positionDotcontainer, value: Boolean): Api = js.native
    @JSName("set")
    def set_positioncontainer(propertyName: positionDotcontainer, value: JQuery): Api = js.native
    @JSName("set")
    def set_positioneffect(
      propertyName: positionDoteffect,
      value: js.Function3[/* api */ this.type, /* pos */ Any, /* viewport */ Any, Unit]
    ): Api = js.native
    @JSName("set")
    def set_positioneffect(propertyName: positionDoteffect, value: Boolean): Api = js.native
    @JSName("set")
    def set_positionmy(propertyName: positionDotmy, value: String): Api = js.native
    @JSName("set")
    def set_positionmy(propertyName: positionDotmy, value: Boolean): Api = js.native
    @JSName("set")
    def set_positiontarget(propertyName: positionDottarget, value: Boolean): Api = js.native
    @JSName("set")
    def set_positiontarget(propertyName: positionDottarget, value: Target): Api = js.native
    @JSName("set")
    def set_positionviewport(propertyName: positionDotviewport, value: Boolean): Api = js.native
    @JSName("set")
    def set_positionviewport(propertyName: positionDotviewport, value: JQuery): Api = js.native
    @JSName("set")
    def set_prerender(propertyName: prerender, value: Boolean): Api = js.native
    @JSName("set")
    def set_show(propertyName: show, value: Show): Api = js.native
    @JSName("set")
    def set_showdelay(propertyName: showDotdelay, value: Double): Api = js.native
    @JSName("set")
    def set_showeffect(propertyName: showDoteffect, value: js.Function1[/* offset */ Any, Unit]): Api = js.native
    @JSName("set")
    def set_showeffect(propertyName: showDoteffect, value: Boolean): Api = js.native
    @JSName("set")
    def set_showevent(propertyName: showDotevent, value: String): Api = js.native
    @JSName("set")
    def set_showevent(propertyName: showDotevent, value: Boolean): Api = js.native
    @JSName("set")
    def set_showmodal(propertyName: showDotmodal, value: Boolean): Api = js.native
    @JSName("set")
    def set_showmodal(propertyName: showDotmodal, value: Modal): Api = js.native
    @JSName("set")
    def set_showready(propertyName: showDotready, value: Boolean): Api = js.native
    @JSName("set")
    def set_showsolo(propertyName: showDotsolo, value: String): Api = js.native
    @JSName("set")
    def set_showsolo(propertyName: showDotsolo, value: Boolean): Api = js.native
    @JSName("set")
    def set_showsolo(propertyName: showDotsolo, value: JQuery): Api = js.native
    @JSName("set")
    def set_showtarget(propertyName: showDottarget, value: Boolean): Api = js.native
    @JSName("set")
    def set_showtarget(propertyName: showDottarget, value: JQuery): Api = js.native
    @JSName("set")
    def set_style(propertyName: style, value: Style): Api = js.native
    @JSName("set")
    def set_styleclasses(propertyName: styleDotclasses, value: String): Api = js.native
    @JSName("set")
    def set_styleclasses(propertyName: styleDotclasses, value: Boolean): Api = js.native
    @JSName("set")
    def set_styledef(propertyName: styleDotdef, value: Boolean): Api = js.native
    @JSName("set")
    def set_styleheight(propertyName: styleDotheight, value: String): Api = js.native
    @JSName("set")
    def set_styleheight(propertyName: styleDotheight, value: Boolean): Api = js.native
    @JSName("set")
    def set_styleheight(propertyName: styleDotheight, value: Double): Api = js.native
    @JSName("set")
    def set_styletip(propertyName: styleDottip, value: String): Api = js.native
    @JSName("set")
    def set_styletip(propertyName: styleDottip, value: Boolean): Api = js.native
    @JSName("set")
    def set_styletip(propertyName: styleDottip, value: Tip): Api = js.native
    @JSName("set")
    def set_stylewidget(propertyName: styleDotwidget, value: Boolean): Api = js.native
    @JSName("set")
    def set_stylewidth(propertyName: styleDotwidth, value: String): Api = js.native
    @JSName("set")
    def set_stylewidth(propertyName: styleDotwidth, value: Boolean): Api = js.native
    @JSName("set")
    def set_stylewidth(propertyName: styleDotwidth, value: Double): Api = js.native
    @JSName("set")
    def set_suppress(propertyName: suppress, value: Boolean): Api = js.native
    
    def show(): Api = js.native
    def show(event: Event): Api = js.native
    
    def toggle(): Api = js.native
    def toggle(state: Boolean): Api = js.native
    def toggle(state: Boolean, event: Event): Api = js.native
    def toggle(state: Unit, event: Event): Api = js.native
  }
  
  trait Content extends StObject {
    
    var attr: js.UndefOr[String] = js.undefined
    
    var button: js.UndefOr[String | JQuery | Boolean] = js.undefined
    
    var text: js.UndefOr[Text] = js.undefined
    
    var title: js.UndefOr[Title | typings.qtip2.anon.Text] = js.undefined
  }
  object Content {
    
    inline def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      inline def setButton(value: String | JQuery | Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: Title | typings.qtip2.anon.Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type EventApiFunc = js.Function2[/* event */ Event, /* api */ Api, Unit]
  
  /**
    * Events property
    */
  trait Events extends StObject {
    
    var blur: js.UndefOr[EventApiFunc] = js.undefined
    
    var focus: js.UndefOr[EventApiFunc] = js.undefined
    
    var hidden: js.UndefOr[EventApiFunc] = js.undefined
    
    var hide: js.UndefOr[EventApiFunc] = js.undefined
    
    var move: js.UndefOr[EventApiFunc] = js.undefined
    
    var render: js.UndefOr[EventApiFunc] = js.undefined
    
    var show: js.UndefOr[EventApiFunc] = js.undefined
    
    var toggle: js.UndefOr[EventApiFunc] = js.undefined
    
    var visible: js.UndefOr[EventApiFunc] = js.undefined
  }
  object Events {
    
    inline def apply(): Events = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setBlur(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setFocus(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setHidden(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "hidden", js.Any.fromFunction2(value))
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHide(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction2(value))
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setMove(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setRender(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setShow(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "show", js.Any.fromFunction2(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setToggle(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction2(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setVisible(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "visible", js.Any.fromFunction2(value))
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /**
    * Hide property
    */
  trait Hide extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var distance: js.UndefOr[Double | Boolean] = js.undefined
    
    var effect: js.UndefOr[Boolean | (js.Function1[/* offset */ Any, Unit])] = js.undefined
    
    var event: js.UndefOr[String | Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var inactive: js.UndefOr[Double | Boolean] = js.undefined
    
    var leave: js.UndefOr[String | Boolean] = js.undefined
    
    var target: js.UndefOr[JQuery | Boolean] = js.undefined
  }
  object Hide {
    
    inline def apply(): Hide = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hide]
    }
    
    extension [Self <: Hide](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDistance(value: Double | Boolean): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setEffect(value: Boolean | (js.Function1[/* offset */ Any, Unit])): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectFunction1(value: /* offset */ Any => Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setEvent(value: String | Boolean): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setInactive(value: Double | Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
      
      inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      inline def setLeave(value: String | Boolean): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
      
      inline def setTarget(value: JQuery | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Modal extends StObject {
    
    var blur: js.UndefOr[Boolean] = js.undefined
    
    var effect: js.UndefOr[Boolean | (js.Function1[/* state */ Any, Unit])] = js.undefined
    
    var escape: js.UndefOr[Boolean] = js.undefined
    
    var on: js.UndefOr[Boolean] = js.undefined
    
    var stealfocus: js.UndefOr[Boolean] = js.undefined
  }
  object Modal {
    
    inline def apply(): Modal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modal]
    }
    
    extension [Self <: Modal](x: Self) {
      
      inline def setBlur(value: Boolean): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setEffect(value: Boolean | (js.Function1[/* state */ Any, Unit])): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectFunction1(value: /* state */ Any => Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setStealfocus(value: Boolean): Self = StObject.set(x, "stealfocus", value.asInstanceOf[js.Any])
      
      inline def setStealfocusUndefined: Self = StObject.set(x, "stealfocus", js.undefined)
    }
  }
  
  @js.native
  trait Plugin extends StObject {
    
    def apply(): JQuery = js.native
    def apply(methodName: String): Any = js.native
    def apply(methodName: String, p1: Any): Any = js.native
    def apply(methodName: String, p1: Any, p2: Any): Any = js.native
    def apply(methodName: String, p1: Any, p2: Any, p3: Any): Any = js.native
    def apply(methodName: String, p1: Any, p2: Unit, p3: Any): Any = js.native
    def apply(methodName: String, p1: Unit, p2: Any): Any = js.native
    def apply(methodName: String, p1: Unit, p2: Any, p3: Any): Any = js.native
    def apply(methodName: String, p1: Unit, p2: Unit, p3: Any): Any = js.native
    def apply(methodName: api): Api = js.native
    def apply(methodName: blur): JQuery = js.native
    def apply(methodName: blur, event: Event): JQuery = js.native
    def apply(methodName: destroy): JQuery = js.native
    def apply(methodName: destroy, immediate: Boolean): JQuery = js.native
    def apply(methodName: disable): JQuery = js.native
    def apply(methodName: disable, state: Boolean): JQuery = js.native
    def apply(methodName: enable): JQuery = js.native
    def apply(methodName: focus): JQuery = js.native
    def apply(methodName: focus, event: Event): JQuery = js.native
    def apply(methodName: hide): JQuery = js.native
    def apply(methodName: hide, event: Event): JQuery = js.native
    def apply(methodName: option, properties: QTipOptions): Api = js.native
    def apply(methodName: option, propertyName: content): Content = js.native
    def apply(methodName: option, propertyName: contentDotattr): String = js.native
    def apply(methodName: option, propertyName: contentDotattr, value: String): Api = js.native
    def apply(methodName: option, propertyName: contentDotbutton): String | JQuery | Boolean = js.native
    def apply(methodName: option, propertyName: contentDotbutton, value: String): Api = js.native
    def apply(methodName: option, propertyName: contentDotbutton, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: contentDotbutton, value: JQuery): Api = js.native
    def apply(methodName: option, propertyName: contentDottext): Text = js.native
    def apply(methodName: option, propertyName: contentDottext, value: Text): Api = js.native
    def apply(methodName: option, propertyName: contentDottitle): Title = js.native
    def apply(methodName: option, propertyName: contentDottitle, value: Title): Api = js.native
    def apply(methodName: option, propertyName: contentDottitle, value: typings.qtip2.anon.Text): Api = js.native
    def apply(methodName: option, propertyName: content, value: Content): Api = js.native
    def apply(methodName: option, propertyName: content, value: Text): Api = js.native
    def apply(methodName: option, propertyName: events): Events = js.native
    def apply(methodName: option, propertyName: eventsDotblur): EventApiFunc = js.native
    def apply(methodName: option, propertyName: eventsDotblur, value: EventApiFunc): Api = js.native
    def apply(methodName: option, propertyName: eventsDotfocus): EventApiFunc = js.native
    def apply(methodName: option, propertyName: eventsDotfocus, value: EventApiFunc): Api = js.native
    def apply(methodName: option, propertyName: eventsDothidden): EventApiFunc = js.native
    def apply(methodName: option, propertyName: eventsDothidden, value: EventApiFunc): Api = js.native
    def apply(methodName: option, propertyName: eventsDothide): EventApiFunc = js.native
    def apply(methodName: option, propertyName: eventsDothide, value: EventApiFunc): Api = js.native
    def apply(methodName: option, propertyName: eventsDotmove): EventApiFunc = js.native
    def apply(methodName: option, propertyName: eventsDotmove, value: EventApiFunc): Api = js.native
    def apply(methodName: option, propertyName: eventsDotrender): EventApiFunc = js.native
    def apply(methodName: option, propertyName: eventsDotrender, value: EventApiFunc): Api = js.native
    def apply(methodName: option, propertyName: eventsDotshow): EventApiFunc = js.native
    def apply(methodName: option, propertyName: eventsDotshow, value: EventApiFunc): Api = js.native
    def apply(methodName: option, propertyName: eventsDottoggle): EventApiFunc = js.native
    def apply(methodName: option, propertyName: eventsDottoggle, value: EventApiFunc): Api = js.native
    def apply(methodName: option, propertyName: eventsDotvisible): EventApiFunc = js.native
    def apply(methodName: option, propertyName: eventsDotvisible, value: EventApiFunc): Api = js.native
    def apply(methodName: option, propertyName: events, value: Events): Api = js.native
    def apply(methodName: option, propertyName: hide): Hide = js.native
    def apply(methodName: option, propertyName: hideDotdelay): Double = js.native
    def apply(methodName: option, propertyName: hideDotdistance): Double | Boolean = js.native
    def apply(methodName: option, propertyName: hideDotdistance, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: hideDotdistance, value: Double): Api = js.native
    def apply(methodName: option, propertyName: hideDoteffect): Boolean | (js.Function1[/* offset */ Any, Unit]) = js.native
    def apply(methodName: option, propertyName: hideDoteffect, value: js.Function1[/* offset */ Any, Unit]): Api = js.native
    def apply(methodName: option, propertyName: hideDoteffect, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: hideDotevent): String | Boolean = js.native
    def apply(methodName: option, propertyName: hideDotevent, value: String): Api = js.native
    def apply(methodName: option, propertyName: hideDotevent, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: hideDotfixed, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: hideDotinactive, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: hideDotinactive, value: Double): Api = js.native
    def apply(methodName: option, propertyName: hideDotleave): String | Boolean = js.native
    def apply(methodName: option, propertyName: hideDotleave, value: String): Api = js.native
    def apply(methodName: option, propertyName: hideDotleave, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: hideDottarget): JQuery | Boolean = js.native
    def apply(methodName: option, propertyName: hideDottarget, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: hideDottarget, value: JQuery): Api = js.native
    def apply(methodName: option, propertyName: hide, value: Hide): Api = js.native
    def apply(methodName: option, propertyName: id): String | Boolean = js.native
    def apply(methodName: option, propertyName: id, value: String): Api = js.native
    def apply(methodName: option, propertyName: id, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: metadata): Any = js.native
    def apply(methodName: option, propertyName: metadata, value: Any): Api = js.native
    def apply(methodName: option, propertyName: overwrite): Boolean = js.native
    def apply(methodName: option, propertyName: overwrite, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: position): Position = js.native
    def apply(methodName: option, propertyName: positionDotadjust): PositionAdjust = js.native
    def apply(methodName: option, propertyName: positionDotadjust, value: PositionAdjust): Api = js.native
    def apply(methodName: option, propertyName: positionDotat): String | Boolean = js.native
    def apply(methodName: option, propertyName: positionDotat, value: String): Api = js.native
    def apply(methodName: option, propertyName: positionDotat, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: positionDotcontainer): JQuery | Boolean = js.native
    def apply(methodName: option, propertyName: positionDotcontainer, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: positionDotcontainer, value: JQuery): Api = js.native
    def apply(methodName: option, propertyName: positionDoteffect): Boolean | (js.Function3[/* api */ Api, /* pos */ Any, /* viewport */ Any, Unit]) = js.native
    def apply(
      methodName: option,
      propertyName: positionDoteffect,
      value: js.Function3[/* api */ Api, /* pos */ Any, /* viewport */ Any, Unit]
    ): Api = js.native
    def apply(methodName: option, propertyName: positionDoteffect, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: positionDotmy): String | Boolean = js.native
    def apply(methodName: option, propertyName: positionDotmy, value: String): Api = js.native
    def apply(methodName: option, propertyName: positionDotmy, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: positionDottarget): Target | Boolean = js.native
    def apply(methodName: option, propertyName: positionDottarget, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: positionDottarget, value: Target): Api = js.native
    def apply(methodName: option, propertyName: positionDotviewport): JQuery | Boolean = js.native
    def apply(methodName: option, propertyName: positionDotviewport, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: positionDotviewport, value: JQuery): Api = js.native
    def apply(methodName: option, propertyName: position, value: Position): Api = js.native
    def apply(methodName: option, propertyName: prerender): Boolean = js.native
    def apply(methodName: option, propertyName: prerender, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: show): Show = js.native
    def apply(methodName: option, propertyName: showDotdelay): Double = js.native
    def apply(methodName: option, propertyName: showDotdelay, value: Double): Api = js.native
    def apply(methodName: option, propertyName: showDoteffect): Boolean | (js.Function1[/* offset */ Any, Unit]) = js.native
    def apply(methodName: option, propertyName: showDoteffect, value: js.Function1[/* offset */ Any, Unit]): Api = js.native
    def apply(methodName: option, propertyName: showDoteffect, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: showDotevent): String | Boolean = js.native
    def apply(methodName: option, propertyName: showDotevent, value: String): Api = js.native
    def apply(methodName: option, propertyName: showDotevent, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: showDotmodal): Boolean | Modal = js.native
    def apply(methodName: option, propertyName: showDotmodal, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: showDotmodal, value: Modal): Api = js.native
    def apply(methodName: option, propertyName: showDotready): Boolean = js.native
    def apply(methodName: option, propertyName: showDotready, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: showDotsolo): JQuery | String | Boolean = js.native
    def apply(methodName: option, propertyName: showDotsolo, value: String): Api = js.native
    def apply(methodName: option, propertyName: showDotsolo, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: showDotsolo, value: JQuery): Api = js.native
    def apply(methodName: option, propertyName: showDottarget): JQuery | Boolean = js.native
    def apply(methodName: option, propertyName: showDottarget, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: showDottarget, value: JQuery): Api = js.native
    def apply(methodName: option, propertyName: show, value: Show): Api = js.native
    def apply(methodName: option, propertyName: style): Style = js.native
    def apply(methodName: option, propertyName: styleDotclasses): String | Boolean = js.native
    def apply(methodName: option, propertyName: styleDotclasses, value: String): Api = js.native
    def apply(methodName: option, propertyName: styleDotclasses, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: styleDotdef): Boolean = js.native
    def apply(methodName: option, propertyName: styleDotdef, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: styleDotheight): String | Double | Boolean = js.native
    def apply(methodName: option, propertyName: styleDotheight, value: String): Api = js.native
    def apply(methodName: option, propertyName: styleDotheight, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: styleDotheight, value: Double): Api = js.native
    def apply(methodName: option, propertyName: styleDottip): String | Boolean | Tip = js.native
    def apply(methodName: option, propertyName: styleDottip, value: String): Api = js.native
    def apply(methodName: option, propertyName: styleDottip, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: styleDottip, value: Tip): Api = js.native
    def apply(methodName: option, propertyName: styleDotwidget): Boolean = js.native
    def apply(methodName: option, propertyName: styleDotwidget, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: styleDotwidth): String | Double | Boolean = js.native
    def apply(methodName: option, propertyName: styleDotwidth, value: String): Api = js.native
    def apply(methodName: option, propertyName: styleDotwidth, value: Boolean): Api = js.native
    def apply(methodName: option, propertyName: styleDotwidth, value: Double): Api = js.native
    def apply(methodName: option, propertyName: style, value: Style): Api = js.native
    def apply(methodName: option, propertyName: suppress): Boolean = js.native
    def apply(methodName: option, propertyName: suppress, value: Boolean): Api = js.native
    def apply(methodName: reposition): JQuery = js.native
    def apply(methodName: reposition, event: Unit, effect: Boolean): JQuery = js.native
    def apply(methodName: reposition, event: Event): JQuery = js.native
    def apply(methodName: reposition, event: Event, effect: Boolean): JQuery = js.native
    def apply(methodName: show): JQuery = js.native
    def apply(methodName: show, event: Event): JQuery = js.native
    def apply(methodName: toggle): JQuery = js.native
    def apply(methodName: toggle, state: Boolean): JQuery = js.native
    def apply(methodName: toggle, state: Boolean, event: Event): JQuery = js.native
    def apply(methodName: toggle, state: Unit, event: Event): JQuery = js.native
    def apply(options: QTipOptions): JQuery = js.native
    
    var defaults: QTipOptions = js.native
  }
  
  trait Position extends StObject {
    
    var adjust: js.UndefOr[PositionAdjust] = js.undefined
    
    var at: js.UndefOr[String | Boolean] = js.undefined
    
    var container: js.UndefOr[JQuery | Boolean] = js.undefined
    
    var effect: js.UndefOr[Boolean | (js.Function3[/* api */ Api, /* pos */ Any, /* viewport */ Any, Unit])] = js.undefined
    
    var my: js.UndefOr[String | Boolean] = js.undefined
    
    var target: js.UndefOr[Target | Boolean] = js.undefined
    
    var viewport: js.UndefOr[JQuery | Boolean] = js.undefined
  }
  object Position {
    
    inline def apply(): Position = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setAdjust(value: PositionAdjust): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
      
      inline def setAt(value: String | Boolean): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setContainer(value: JQuery | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setEffect(value: Boolean | (js.Function3[/* api */ Api, /* pos */ Any, /* viewport */ Any, Unit])): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectFunction3(value: (/* api */ Api, /* pos */ Any, /* viewport */ Any) => Unit): Self = StObject.set(x, "effect", js.Any.fromFunction3(value))
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setMy(value: String | Boolean): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setTarget(value: Target | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: Double*): Self = StObject.set(x, "target", js.Array(value*))
      
      inline def setViewport(value: JQuery | Boolean): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  /**
    * Position property
    */
  trait PositionAdjust extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var mouse: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Boolean] = js.undefined
    
    var scroll: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PositionAdjust {
    
    inline def apply(): PositionAdjust = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionAdjust]
    }
    
    extension [Self <: PositionAdjust](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMouse(value: Boolean): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
      
      inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /**
    * Options
    */
  trait QTipOptions extends StObject {
    
    var content: js.UndefOr[Text | Content] = js.undefined
    
    var events: js.UndefOr[Events] = js.undefined
    
    var hide: js.UndefOr[String | JQuery | Hide] = js.undefined
    
    var id: js.UndefOr[String | Boolean] = js.undefined
    
    var metadata: js.UndefOr[Any] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[String | Position] = js.undefined
    
    var prerender: js.UndefOr[Boolean] = js.undefined
    
    var show: js.UndefOr[String | Boolean | JQuery | Show] = js.undefined
    
    var style: js.UndefOr[String | Style] = js.undefined
    
    var suppress: js.UndefOr[Boolean] = js.undefined
  }
  object QTipOptions {
    
    inline def apply(): QTipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QTipOptions]
    }
    
    extension [Self <: QTipOptions](x: Self) {
      
      inline def setContent(value: Text | Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "content", js.Any.fromFunction2(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setHide(value: String | JQuery | Hide): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setId(value: String | Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPosition(value: String | Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPrerender(value: Boolean): Self = StObject.set(x, "prerender", value.asInstanceOf[js.Any])
      
      inline def setPrerenderUndefined: Self = StObject.set(x, "prerender", js.undefined)
      
      inline def setShow(value: String | Boolean | JQuery | Show): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStyle(value: String | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppress(value: Boolean): Self = StObject.set(x, "suppress", value.asInstanceOf[js.Any])
      
      inline def setSuppressUndefined: Self = StObject.set(x, "suppress", js.undefined)
    }
  }
  
  /**
    * Show property
    */
  trait Show extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var effect: js.UndefOr[Boolean | (js.Function1[/* offset */ Any, Unit])] = js.undefined
    
    var event: js.UndefOr[String | Boolean] = js.undefined
    
    var modal: js.UndefOr[Boolean | Modal] = js.undefined
    
    var ready: js.UndefOr[Boolean] = js.undefined
    
    var solo: js.UndefOr[JQuery | String | Boolean] = js.undefined
    
    var target: js.UndefOr[JQuery | Boolean] = js.undefined
  }
  object Show {
    
    inline def apply(): Show = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Show]
    }
    
    extension [Self <: Show](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEffect(value: Boolean | (js.Function1[/* offset */ Any, Unit])): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectFunction1(value: /* offset */ Any => Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setEvent(value: String | Boolean): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModal(value: Boolean | Modal): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setSolo(value: JQuery | String | Boolean): Self = StObject.set(x, "solo", value.asInstanceOf[js.Any])
      
      inline def setSoloUndefined: Self = StObject.set(x, "solo", js.undefined)
      
      inline def setTarget(value: JQuery | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  /**
    * Style property
    */
  trait Style extends StObject {
    
    var classes: js.UndefOr[String | Boolean] = js.undefined
    
    var `def`: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[String | Double | Boolean] = js.undefined
    
    var tip: js.UndefOr[String | Boolean | Tip] = js.undefined
    
    var widget: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double | Boolean] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setClasses(value: String | Boolean): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDef(value: Boolean): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
      
      inline def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
      
      inline def setHeight(value: String | Double | Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setTip(value: String | Boolean | Tip): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setWidget(value: Boolean): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
      
      inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
      
      inline def setWidth(value: String | Double | Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type Target = JQuery | js.Array[Double] | String
  
  type Text = String | JQuery | EventApiFunc | Boolean | JQueryGenericPromise[Any]
  
  trait Tip extends StObject {
    
    var border: js.UndefOr[Double | Boolean] = js.undefined
    
    var corner: js.UndefOr[String | Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var mimic: js.UndefOr[String | Boolean] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Tip {
    
    inline def apply(): Tip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tip]
    }
    
    extension [Self <: Tip](x: Self) {
      
      inline def setBorder(value: Double | Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setCorner(value: String | Boolean): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
      
      inline def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMimic(value: String | Boolean): Self = StObject.set(x, "mimic", value.asInstanceOf[js.Any])
      
      inline def setMimicUndefined: Self = StObject.set(x, "mimic", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Content property
    */
  type Title = String | JQuery | EventApiFunc | Boolean | JQueryGenericPromise[Any]
}
