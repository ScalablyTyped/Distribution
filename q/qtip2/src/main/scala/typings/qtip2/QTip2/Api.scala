package typings.qtip2.QTip2

import typings.qtip2.JQuery
import typings.qtip2.qtip2Strings.content
import typings.qtip2.qtip2Strings.contentDotattr
import typings.qtip2.qtip2Strings.contentDotbutton
import typings.qtip2.qtip2Strings.contentDottext
import typings.qtip2.qtip2Strings.contentDottitle
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
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * API
  */
@js.native
trait Api extends js.Object {
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
  def toggle(state: Boolean): Api = js.native
  def toggle(state: Boolean, event: Event): Api = js.native
}

