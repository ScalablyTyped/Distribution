package typings.qtip2.QTip2Ns

import typings.qtip2.Anon_Text
import typings.qtip2.JQuery
import typings.qtip2.qtip2Strings.content
import typings.qtip2.qtip2Strings.contentDOTattr
import typings.qtip2.qtip2Strings.contentDOTbutton
import typings.qtip2.qtip2Strings.contentDOTtext
import typings.qtip2.qtip2Strings.contentDOTtitle
import typings.qtip2.qtip2Strings.events
import typings.qtip2.qtip2Strings.eventsDOTblur
import typings.qtip2.qtip2Strings.eventsDOTfocus
import typings.qtip2.qtip2Strings.eventsDOThidden
import typings.qtip2.qtip2Strings.eventsDOThide
import typings.qtip2.qtip2Strings.eventsDOTmove
import typings.qtip2.qtip2Strings.eventsDOTrender
import typings.qtip2.qtip2Strings.eventsDOTshow
import typings.qtip2.qtip2Strings.eventsDOTtoggle
import typings.qtip2.qtip2Strings.eventsDOTvisible
import typings.qtip2.qtip2Strings.hide
import typings.qtip2.qtip2Strings.hideDOTdelay
import typings.qtip2.qtip2Strings.hideDOTdistance
import typings.qtip2.qtip2Strings.hideDOTeffect
import typings.qtip2.qtip2Strings.hideDOTevent
import typings.qtip2.qtip2Strings.hideDOTfixed
import typings.qtip2.qtip2Strings.hideDOTinactive
import typings.qtip2.qtip2Strings.hideDOTleave
import typings.qtip2.qtip2Strings.hideDOTtarget
import typings.qtip2.qtip2Strings.id
import typings.qtip2.qtip2Strings.metadata
import typings.qtip2.qtip2Strings.overwrite
import typings.qtip2.qtip2Strings.position
import typings.qtip2.qtip2Strings.positionDOTadjust
import typings.qtip2.qtip2Strings.positionDOTat
import typings.qtip2.qtip2Strings.positionDOTcontainer
import typings.qtip2.qtip2Strings.positionDOTeffect
import typings.qtip2.qtip2Strings.positionDOTmy
import typings.qtip2.qtip2Strings.positionDOTtarget
import typings.qtip2.qtip2Strings.positionDOTviewport
import typings.qtip2.qtip2Strings.prerender
import typings.qtip2.qtip2Strings.show
import typings.qtip2.qtip2Strings.showDOTdelay
import typings.qtip2.qtip2Strings.showDOTeffect
import typings.qtip2.qtip2Strings.showDOTevent
import typings.qtip2.qtip2Strings.showDOTmodal
import typings.qtip2.qtip2Strings.showDOTready
import typings.qtip2.qtip2Strings.showDOTsolo
import typings.qtip2.qtip2Strings.showDOTtarget
import typings.qtip2.qtip2Strings.style
import typings.qtip2.qtip2Strings.styleDOTclasses
import typings.qtip2.qtip2Strings.styleDOTdef
import typings.qtip2.qtip2Strings.styleDOTheight
import typings.qtip2.qtip2Strings.styleDOTtip
import typings.qtip2.qtip2Strings.styleDOTwidget
import typings.qtip2.qtip2Strings.styleDOTwidth
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
  def get_contentattr(propertyName: contentDOTattr): String = js.native
  @JSName("get")
  def get_contentbutton(propertyName: contentDOTbutton): String | JQuery | Boolean = js.native
  @JSName("get")
  def get_contenttext(propertyName: contentDOTtext): Text = js.native
  @JSName("get")
  def get_contenttitle(propertyName: contentDOTtitle): Title = js.native
  @JSName("get")
  def get_events(propertyName: events): Events = js.native
  @JSName("get")
  def get_eventsblur(propertyName: eventsDOTblur): EventApiFunc = js.native
  @JSName("get")
  def get_eventsfocus(propertyName: eventsDOTfocus): EventApiFunc = js.native
  @JSName("get")
  def get_eventshidden(propertyName: eventsDOThidden): EventApiFunc = js.native
  @JSName("get")
  def get_eventshide(propertyName: eventsDOThide): EventApiFunc = js.native
  @JSName("get")
  def get_eventsmove(propertyName: eventsDOTmove): EventApiFunc = js.native
  @JSName("get")
  def get_eventsrender(propertyName: eventsDOTrender): EventApiFunc = js.native
  @JSName("get")
  def get_eventsshow(propertyName: eventsDOTshow): EventApiFunc = js.native
  @JSName("get")
  def get_eventstoggle(propertyName: eventsDOTtoggle): EventApiFunc = js.native
  @JSName("get")
  def get_eventsvisible(propertyName: eventsDOTvisible): EventApiFunc = js.native
  @JSName("get")
  def get_hide(propertyName: hide): Hide = js.native
  @JSName("get")
  def get_hidedelay(propertyName: hideDOTdelay): Double = js.native
  @JSName("get")
  def get_hidedistance(propertyName: hideDOTdistance): Double | Boolean = js.native
  @JSName("get")
  def get_hideeffect(propertyName: hideDOTeffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
  @JSName("get")
  def get_hideevent(propertyName: hideDOTevent): String | Boolean = js.native
  @JSName("get")
  def get_hideleave(propertyName: hideDOTleave): String | Boolean = js.native
  @JSName("get")
  def get_hidetarget(propertyName: hideDOTtarget): JQuery | Boolean = js.native
  @JSName("get")
  def get_id(propertyName: id): String | Boolean = js.native
  @JSName("get")
  def get_metadata(propertyName: metadata): js.Any = js.native
  @JSName("get")
  def get_overwrite(propertyName: overwrite): Boolean = js.native
  @JSName("get")
  def get_position(propertyName: position): Position = js.native
  @JSName("get")
  def get_positionadjust(propertyName: positionDOTadjust): PositionAdjust = js.native
  @JSName("get")
  def get_positionat(propertyName: positionDOTat): String | Boolean = js.native
  @JSName("get")
  def get_positioncontainer(propertyName: positionDOTcontainer): JQuery | Boolean = js.native
  @JSName("get")
  def get_positioneffect(propertyName: positionDOTeffect): Boolean | (js.Function3[/* api */ js.Any, /* pos */ js.Any, /* viewport */ js.Any, Unit]) = js.native
  @JSName("get")
  def get_positionmy(propertyName: positionDOTmy): String | Boolean = js.native
  @JSName("get")
  def get_positiontarget(propertyName: positionDOTtarget): Target | Boolean = js.native
  @JSName("get")
  def get_positionviewport(propertyName: positionDOTviewport): JQuery | Boolean = js.native
  @JSName("get")
  def get_prerender(propertyName: prerender): Boolean = js.native
  @JSName("get")
  def get_show(propertyName: show): Show = js.native
  @JSName("get")
  def get_showdelay(propertyName: showDOTdelay): Double = js.native
  @JSName("get")
  def get_showeffect(propertyName: showDOTeffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
  @JSName("get")
  def get_showevent(propertyName: showDOTevent): String | Boolean = js.native
  @JSName("get")
  def get_showmodal(propertyName: showDOTmodal): Boolean | Modal = js.native
  @JSName("get")
  def get_showready(propertyName: showDOTready): Boolean = js.native
  @JSName("get")
  def get_showsolo(propertyName: showDOTsolo): JQuery | String | Boolean = js.native
  @JSName("get")
  def get_showtarget(propertyName: showDOTtarget): JQuery | Boolean = js.native
  @JSName("get")
  def get_style(propertyName: style): Style = js.native
  @JSName("get")
  def get_styleclasses(propertyName: styleDOTclasses): String | Boolean = js.native
  @JSName("get")
  def get_styledef(propertyName: styleDOTdef): Boolean = js.native
  @JSName("get")
  def get_styleheight(propertyName: styleDOTheight): String | Double | Boolean = js.native
  @JSName("get")
  def get_styletip(propertyName: styleDOTtip): String | Boolean | Tip = js.native
  @JSName("get")
  def get_stylewidget(propertyName: styleDOTwidget): Boolean = js.native
  @JSName("get")
  def get_stylewidth(propertyName: styleDOTwidth): String | Double | Boolean = js.native
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
  def set_contentattr(propertyName: contentDOTattr, value: String): Api = js.native
  @JSName("set")
  def set_contentbutton(propertyName: contentDOTbutton, value: String): Api = js.native
  @JSName("set")
  def set_contentbutton(propertyName: contentDOTbutton, value: Boolean): Api = js.native
  @JSName("set")
  def set_contentbutton(propertyName: contentDOTbutton, value: JQuery): Api = js.native
  @JSName("set")
  def set_contenttext(propertyName: contentDOTtext, value: Text): Api = js.native
  @JSName("set")
  def set_contenttitle(propertyName: contentDOTtitle, value: Anon_Text): Api = js.native
  @JSName("set")
  def set_contenttitle(propertyName: contentDOTtitle, value: Title): Api = js.native
  @JSName("set")
  def set_events(propertyName: events, value: Events): Api = js.native
  @JSName("set")
  def set_eventsblur(propertyName: eventsDOTblur, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventsfocus(propertyName: eventsDOTfocus, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventshidden(propertyName: eventsDOThidden, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventshide(propertyName: eventsDOThide, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventsmove(propertyName: eventsDOTmove, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventsrender(propertyName: eventsDOTrender, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventsshow(propertyName: eventsDOTshow, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventstoggle(propertyName: eventsDOTtoggle, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventsvisible(propertyName: eventsDOTvisible, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_hide(propertyName: hide, value: Hide): Api = js.native
  @JSName("set")
  def set_hidedistance(propertyName: hideDOTdistance, value: Boolean): Api = js.native
  @JSName("set")
  def set_hidedistance(propertyName: hideDOTdistance, value: Double): Api = js.native
  @JSName("set")
  def set_hideeffect(propertyName: hideDOTeffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
  @JSName("set")
  def set_hideeffect(propertyName: hideDOTeffect, value: Boolean): Api = js.native
  @JSName("set")
  def set_hideevent(propertyName: hideDOTevent, value: String): Api = js.native
  @JSName("set")
  def set_hideevent(propertyName: hideDOTevent, value: Boolean): Api = js.native
  @JSName("set")
  def set_hidefixed(propertyName: hideDOTfixed, value: Boolean): Api = js.native
  @JSName("set")
  def set_hideinactive(propertyName: hideDOTinactive, value: Boolean): Api = js.native
  @JSName("set")
  def set_hideinactive(propertyName: hideDOTinactive, value: Double): Api = js.native
  @JSName("set")
  def set_hideleave(propertyName: hideDOTleave, value: String): Api = js.native
  @JSName("set")
  def set_hideleave(propertyName: hideDOTleave, value: Boolean): Api = js.native
  @JSName("set")
  def set_hidetarget(propertyName: hideDOTtarget, value: Boolean): Api = js.native
  @JSName("set")
  def set_hidetarget(propertyName: hideDOTtarget, value: JQuery): Api = js.native
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
  def set_positionadjust(propertyName: positionDOTadjust, value: PositionAdjust): Api = js.native
  @JSName("set")
  def set_positionat(propertyName: positionDOTat, value: String): Api = js.native
  @JSName("set")
  def set_positionat(propertyName: positionDOTat, value: Boolean): Api = js.native
  @JSName("set")
  def set_positioncontainer(propertyName: positionDOTcontainer, value: Boolean): Api = js.native
  @JSName("set")
  def set_positioncontainer(propertyName: positionDOTcontainer, value: JQuery): Api = js.native
  @JSName("set")
  def set_positioneffect(
    propertyName: positionDOTeffect,
    value: js.Function3[/* api */ this.type, /* pos */ js.Any, /* viewport */ js.Any, Unit]
  ): Api = js.native
  @JSName("set")
  def set_positioneffect(propertyName: positionDOTeffect, value: Boolean): Api = js.native
  @JSName("set")
  def set_positionmy(propertyName: positionDOTmy, value: String): Api = js.native
  @JSName("set")
  def set_positionmy(propertyName: positionDOTmy, value: Boolean): Api = js.native
  @JSName("set")
  def set_positiontarget(propertyName: positionDOTtarget, value: Boolean): Api = js.native
  @JSName("set")
  def set_positiontarget(propertyName: positionDOTtarget, value: Target): Api = js.native
  @JSName("set")
  def set_positionviewport(propertyName: positionDOTviewport, value: Boolean): Api = js.native
  @JSName("set")
  def set_positionviewport(propertyName: positionDOTviewport, value: JQuery): Api = js.native
  @JSName("set")
  def set_prerender(propertyName: prerender, value: Boolean): Api = js.native
  @JSName("set")
  def set_show(propertyName: show, value: Show): Api = js.native
  @JSName("set")
  def set_showdelay(propertyName: showDOTdelay, value: Double): Api = js.native
  @JSName("set")
  def set_showeffect(propertyName: showDOTeffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
  @JSName("set")
  def set_showeffect(propertyName: showDOTeffect, value: Boolean): Api = js.native
  @JSName("set")
  def set_showevent(propertyName: showDOTevent, value: String): Api = js.native
  @JSName("set")
  def set_showevent(propertyName: showDOTevent, value: Boolean): Api = js.native
  @JSName("set")
  def set_showmodal(propertyName: showDOTmodal, value: Boolean): Api = js.native
  @JSName("set")
  def set_showmodal(propertyName: showDOTmodal, value: Modal): Api = js.native
  @JSName("set")
  def set_showready(propertyName: showDOTready, value: Boolean): Api = js.native
  @JSName("set")
  def set_showsolo(propertyName: showDOTsolo, value: String): Api = js.native
  @JSName("set")
  def set_showsolo(propertyName: showDOTsolo, value: Boolean): Api = js.native
  @JSName("set")
  def set_showsolo(propertyName: showDOTsolo, value: JQuery): Api = js.native
  @JSName("set")
  def set_showtarget(propertyName: showDOTtarget, value: Boolean): Api = js.native
  @JSName("set")
  def set_showtarget(propertyName: showDOTtarget, value: JQuery): Api = js.native
  @JSName("set")
  def set_style(propertyName: style, value: Style): Api = js.native
  @JSName("set")
  def set_styleclasses(propertyName: styleDOTclasses, value: String): Api = js.native
  @JSName("set")
  def set_styleclasses(propertyName: styleDOTclasses, value: Boolean): Api = js.native
  @JSName("set")
  def set_styledef(propertyName: styleDOTdef, value: Boolean): Api = js.native
  @JSName("set")
  def set_styleheight(propertyName: styleDOTheight, value: String): Api = js.native
  @JSName("set")
  def set_styleheight(propertyName: styleDOTheight, value: Boolean): Api = js.native
  @JSName("set")
  def set_styleheight(propertyName: styleDOTheight, value: Double): Api = js.native
  @JSName("set")
  def set_styletip(propertyName: styleDOTtip, value: String): Api = js.native
  @JSName("set")
  def set_styletip(propertyName: styleDOTtip, value: Boolean): Api = js.native
  @JSName("set")
  def set_styletip(propertyName: styleDOTtip, value: Tip): Api = js.native
  @JSName("set")
  def set_stylewidget(propertyName: styleDOTwidget, value: Boolean): Api = js.native
  @JSName("set")
  def set_stylewidth(propertyName: styleDOTwidth, value: String): Api = js.native
  @JSName("set")
  def set_stylewidth(propertyName: styleDOTwidth, value: Boolean): Api = js.native
  @JSName("set")
  def set_stylewidth(propertyName: styleDOTwidth, value: Double): Api = js.native
  @JSName("set")
  def set_suppress(propertyName: suppress, value: Boolean): Api = js.native
  def show(): Api = js.native
  def show(event: Event): Api = js.native
  def toggle(): Api = js.native
  def toggle(state: Boolean): Api = js.native
  def toggle(state: Boolean, event: Event): Api = js.native
}

