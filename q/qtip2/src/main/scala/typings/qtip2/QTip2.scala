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
import scala.scalajs.js.`|`
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
    
    def get(propertyName: String): js.Any = js.native
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
    def get_hideeffect(propertyName: hideDoteffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
    @JSName("get")
    def get_hideevent(propertyName: hideDotevent): String | Boolean = js.native
    @JSName("get")
    def get_hideleave(propertyName: hideDotleave): String | Boolean = js.native
    @JSName("get")
    def get_hidetarget(propertyName: hideDottarget): JQuery | Boolean = js.native
    @JSName("get")
    def get_id(propertyName: id): String | Boolean = js.native
    @JSName("get")
    def get_metadata(propertyName: metadata): js.Any = js.native
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
    def get_positioneffect(propertyName: positionDoteffect): Boolean | (js.Function3[/* api */ js.Any, /* pos */ js.Any, /* viewport */ js.Any, Unit]) = js.native
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
    def get_showeffect(propertyName: showDoteffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
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
    def reposition(event: js.UndefOr[scala.Nothing], effect: Boolean): Api = js.native
    def reposition(event: Event): Api = js.native
    def reposition(event: Event, effect: Boolean): Api = js.native
    
    def set(properties: QTipOptions): Api = js.native
    def set(propertyName: String, value: js.Any): Api = js.native
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
    def set_hideeffect(propertyName: hideDoteffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
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
    def set_metadata(propertyName: metadata, value: js.Any): Api = js.native
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
      value: js.Function3[/* api */ this.type, /* pos */ js.Any, /* viewport */ js.Any, Unit]
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
    def set_showeffect(propertyName: showDoteffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
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
    def toggle(state: js.UndefOr[scala.Nothing], event: Event): Api = js.native
    def toggle(state: Boolean): Api = js.native
    def toggle(state: Boolean, event: Event): Api = js.native
  }
  
  @js.native
  trait Content extends StObject {
    
    var attr: js.UndefOr[String] = js.native
    
    var button: js.UndefOr[String | JQuery | Boolean] = js.native
    
    var text: js.UndefOr[Text] = js.native
    
    var title: js.UndefOr[Title | typings.qtip2.anon.Text] = js.native
  }
  object Content {
    
    @scala.inline
    def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      @scala.inline
      def setButton(value: String | JQuery | Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: Title | typings.qtip2.anon.Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type EventApiFunc = js.Function2[/* event */ Event, /* api */ Api, Unit]
  
  /**
    * Events property
    */
  @js.native
  trait Events extends StObject {
    
    var blur: js.UndefOr[EventApiFunc] = js.native
    
    var focus: js.UndefOr[EventApiFunc] = js.native
    
    var hidden: js.UndefOr[EventApiFunc] = js.native
    
    var hide: js.UndefOr[EventApiFunc] = js.native
    
    var move: js.UndefOr[EventApiFunc] = js.native
    
    var render: js.UndefOr[EventApiFunc] = js.native
    
    var show: js.UndefOr[EventApiFunc] = js.native
    
    var toggle: js.UndefOr[EventApiFunc] = js.native
    
    var visible: js.UndefOr[EventApiFunc] = js.native
  }
  object Events {
    
    @scala.inline
    def apply(): Events = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setFocus(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setHidden(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "hidden", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHide(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setMove(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      @scala.inline
      def setRender(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setShow(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "show", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setToggle(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setVisible(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "visible", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /**
    * Hide property
    */
  @js.native
  trait Hide extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
    
    var distance: js.UndefOr[Double | Boolean] = js.native
    
    var effect: js.UndefOr[Boolean | (js.Function1[/* offset */ js.Any, Unit])] = js.native
    
    var event: js.UndefOr[String | Boolean] = js.native
    
    var fixed: js.UndefOr[Boolean] = js.native
    
    var inactive: js.UndefOr[Double | Boolean] = js.native
    
    var leave: js.UndefOr[String | Boolean] = js.native
    
    var target: js.UndefOr[JQuery | Boolean] = js.native
  }
  object Hide {
    
    @scala.inline
    def apply(): Hide = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hide]
    }
    
    @scala.inline
    implicit class HideMutableBuilder[Self <: Hide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDistance(value: Double | Boolean): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setEffect(value: Boolean | (js.Function1[/* offset */ js.Any, Unit])): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectFunction1(value: /* offset */ js.Any => Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setEvent(value: String | Boolean): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setInactive(value: Double | Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      @scala.inline
      def setLeave(value: String | Boolean): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
      
      @scala.inline
      def setTarget(value: JQuery | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait Modal extends StObject {
    
    var blur: js.UndefOr[Boolean] = js.native
    
    var effect: js.UndefOr[Boolean | (js.Function1[/* state */ js.Any, Unit])] = js.native
    
    var escape: js.UndefOr[Boolean] = js.native
    
    var on: js.UndefOr[Boolean] = js.native
    
    var stealfocus: js.UndefOr[Boolean] = js.native
  }
  object Modal {
    
    @scala.inline
    def apply(): Modal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modal]
    }
    
    @scala.inline
    implicit class ModalMutableBuilder[Self <: Modal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: Boolean): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setEffect(value: Boolean | (js.Function1[/* state */ js.Any, Unit])): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectFunction1(value: /* state */ js.Any => Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setStealfocus(value: Boolean): Self = StObject.set(x, "stealfocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStealfocusUndefined: Self = StObject.set(x, "stealfocus", js.undefined)
    }
  }
  
  @js.native
  trait Plugin extends StObject {
    
    def apply(): JQuery = js.native
    def apply(methodName: String): js.Any = js.native
    def apply(methodName: String, p1: js.UndefOr[scala.Nothing], p2: js.UndefOr[scala.Nothing], p3: js.Any): js.Any = js.native
    def apply(methodName: String, p1: js.UndefOr[scala.Nothing], p2: js.Any): js.Any = js.native
    def apply(methodName: String, p1: js.UndefOr[scala.Nothing], p2: js.Any, p3: js.Any): js.Any = js.native
    def apply(methodName: String, p1: js.Any): js.Any = js.native
    def apply(methodName: String, p1: js.Any, p2: js.UndefOr[scala.Nothing], p3: js.Any): js.Any = js.native
    def apply(methodName: String, p1: js.Any, p2: js.Any): js.Any = js.native
    def apply(methodName: String, p1: js.Any, p2: js.Any, p3: js.Any): js.Any = js.native
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
    def apply(methodName: option, propertyName: hideDoteffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
    def apply(methodName: option, propertyName: hideDoteffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
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
    def apply(methodName: option, propertyName: metadata): js.Any = js.native
    def apply(methodName: option, propertyName: metadata, value: js.Any): Api = js.native
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
    def apply(methodName: option, propertyName: positionDoteffect): Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit]) = js.native
    def apply(
      methodName: option,
      propertyName: positionDoteffect,
      value: js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit]
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
    def apply(methodName: option, propertyName: showDoteffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
    def apply(methodName: option, propertyName: showDoteffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
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
    def apply(methodName: reposition, event: js.UndefOr[scala.Nothing], effect: Boolean): JQuery = js.native
    def apply(methodName: reposition, event: Event): JQuery = js.native
    def apply(methodName: reposition, event: Event, effect: Boolean): JQuery = js.native
    def apply(methodName: show): JQuery = js.native
    def apply(methodName: show, event: Event): JQuery = js.native
    def apply(methodName: toggle): JQuery = js.native
    def apply(methodName: toggle, state: js.UndefOr[scala.Nothing], event: Event): JQuery = js.native
    def apply(methodName: toggle, state: Boolean): JQuery = js.native
    def apply(methodName: toggle, state: Boolean, event: Event): JQuery = js.native
    def apply(options: QTipOptions): JQuery = js.native
    
    var defaults: QTipOptions = js.native
  }
  
  @js.native
  trait Position extends StObject {
    
    var adjust: js.UndefOr[PositionAdjust] = js.native
    
    var at: js.UndefOr[String | Boolean] = js.native
    
    var container: js.UndefOr[JQuery | Boolean] = js.native
    
    var effect: js.UndefOr[
        Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit])
      ] = js.native
    
    var my: js.UndefOr[String | Boolean] = js.native
    
    var target: js.UndefOr[Target | Boolean] = js.native
    
    var viewport: js.UndefOr[JQuery | Boolean] = js.native
  }
  object Position {
    
    @scala.inline
    def apply(): Position = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjust(value: PositionAdjust): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
      
      @scala.inline
      def setAt(value: String | Boolean): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      @scala.inline
      def setContainer(value: JQuery | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setEffect(value: Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit])): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectFunction3(value: (/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any) => Unit): Self = StObject.set(x, "effect", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setMy(value: String | Boolean): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      @scala.inline
      def setTarget(value: Target | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetVarargs(value: Double*): Self = StObject.set(x, "target", js.Array(value :_*))
      
      @scala.inline
      def setViewport(value: JQuery | Boolean): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  /**
    * Position property
    */
  @js.native
  trait PositionAdjust extends StObject {
    
    var method: js.UndefOr[String] = js.native
    
    var mouse: js.UndefOr[Boolean] = js.native
    
    var resize: js.UndefOr[Boolean] = js.native
    
    var scroll: js.UndefOr[Boolean] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object PositionAdjust {
    
    @scala.inline
    def apply(): PositionAdjust = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionAdjust]
    }
    
    @scala.inline
    implicit class PositionAdjustMutableBuilder[Self <: PositionAdjust] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMouse(value: Boolean): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /**
    * Options
    */
  @js.native
  trait QTipOptions extends StObject {
    
    var content: js.UndefOr[Text | Content] = js.native
    
    var events: js.UndefOr[Events] = js.native
    
    var hide: js.UndefOr[String | JQuery | Hide] = js.native
    
    var id: js.UndefOr[String | Boolean] = js.native
    
    var metadata: js.UndefOr[js.Any] = js.native
    
    var overwrite: js.UndefOr[Boolean] = js.native
    
    var position: js.UndefOr[String | Position] = js.native
    
    var prerender: js.UndefOr[Boolean] = js.native
    
    var show: js.UndefOr[String | Boolean | JQuery | Show] = js.native
    
    var style: js.UndefOr[String | Style] = js.native
    
    var suppress: js.UndefOr[Boolean] = js.native
  }
  object QTipOptions {
    
    @scala.inline
    def apply(): QTipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QTipOptions]
    }
    
    @scala.inline
    implicit class QTipOptionsMutableBuilder[Self <: QTipOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: Text | Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction2(value: (/* event */ Event, /* api */ Api) => Unit): Self = StObject.set(x, "content", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setHide(value: String | JQuery | Hide): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setId(value: String | Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPosition(value: String | Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPrerender(value: Boolean): Self = StObject.set(x, "prerender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerenderUndefined: Self = StObject.set(x, "prerender", js.undefined)
      
      @scala.inline
      def setShow(value: String | Boolean | JQuery | Show): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setStyle(value: String | Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuppress(value: Boolean): Self = StObject.set(x, "suppress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressUndefined: Self = StObject.set(x, "suppress", js.undefined)
    }
  }
  
  /**
    * Show property
    */
  @js.native
  trait Show extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
    
    var effect: js.UndefOr[Boolean | (js.Function1[/* offset */ js.Any, Unit])] = js.native
    
    var event: js.UndefOr[String | Boolean] = js.native
    
    var modal: js.UndefOr[Boolean | Modal] = js.native
    
    var ready: js.UndefOr[Boolean] = js.native
    
    var solo: js.UndefOr[JQuery | String | Boolean] = js.native
    
    var target: js.UndefOr[JQuery | Boolean] = js.native
  }
  object Show {
    
    @scala.inline
    def apply(): Show = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Show]
    }
    
    @scala.inline
    implicit class ShowMutableBuilder[Self <: Show] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setEffect(value: Boolean | (js.Function1[/* offset */ js.Any, Unit])): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectFunction1(value: /* offset */ js.Any => Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setEvent(value: String | Boolean): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean | Modal): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      @scala.inline
      def setSolo(value: JQuery | String | Boolean): Self = StObject.set(x, "solo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoloUndefined: Self = StObject.set(x, "solo", js.undefined)
      
      @scala.inline
      def setTarget(value: JQuery | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  /**
    * Style property
    */
  @js.native
  trait Style extends StObject {
    
    var classes: js.UndefOr[String | Boolean] = js.native
    
    var `def`: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[String | Double | Boolean] = js.native
    
    var tip: js.UndefOr[String | Boolean | Tip] = js.native
    
    var widget: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[String | Double | Boolean] = js.native
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: String | Boolean): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setDef(value: Boolean): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double | Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setTip(value: String | Boolean | Tip): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      @scala.inline
      def setWidget(value: Boolean): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double | Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type Target = JQuery | js.Array[Double] | String
  
  type Text = String | JQuery | EventApiFunc | Boolean | JQueryGenericPromise[js.Any]
  
  @js.native
  trait Tip extends StObject {
    
    var border: js.UndefOr[Double | Boolean] = js.native
    
    var corner: js.UndefOr[String | Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var mimic: js.UndefOr[String | Boolean] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Tip {
    
    @scala.inline
    def apply(): Tip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tip]
    }
    
    @scala.inline
    implicit class TipMutableBuilder[Self <: Tip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: Double | Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setCorner(value: String | Boolean): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMimic(value: String | Boolean): Self = StObject.set(x, "mimic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimicUndefined: Self = StObject.set(x, "mimic", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Content property
    */
  type Title = String | JQuery | EventApiFunc | Boolean | JQueryGenericPromise[js.Any]
}
