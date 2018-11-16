package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * API
	 */
@js.native
trait Api extends js.Object {
  def blur(): Api = js.native
  def blur(event: stdLib.Event): Api = js.native
  def destroy(): Api = js.native
  def destroy(immediate: scala.Boolean): Api = js.native
  def disable(): Api = js.native
  def disable(state: scala.Boolean): Api = js.native
  def enable(): Api = js.native
  def focus(): Api = js.native
  def focus(event: stdLib.Event): Api = js.native
  def get(propertyName: java.lang.String): js.Any = js.native
  @JSName("get")
  def get_content(propertyName: qtip2Lib.qtip2LibStrings.content): Content = js.native
  @JSName("get")
  def get_contentattr(propertyName: qtip2Lib.qtip2LibStrings.contentDOTattr): java.lang.String = js.native
  @JSName("get")
  def get_contentbutton(propertyName: qtip2Lib.qtip2LibStrings.contentDOTbutton): java.lang.String | qtip2Lib.JQuery | scala.Boolean = js.native
  @JSName("get")
  def get_contenttext(propertyName: qtip2Lib.qtip2LibStrings.contentDOTtext): Text = js.native
  @JSName("get")
  def get_contenttitle(propertyName: qtip2Lib.qtip2LibStrings.contentDOTtitle): Title = js.native
  @JSName("get")
  def get_events(propertyName: qtip2Lib.qtip2LibStrings.events): Events = js.native
  @JSName("get")
  def get_eventsblur(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTblur): EventApiFunc = js.native
  @JSName("get")
  def get_eventsfocus(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTfocus): EventApiFunc = js.native
  @JSName("get")
  def get_eventshidden(propertyName: qtip2Lib.qtip2LibStrings.eventsDOThidden): EventApiFunc = js.native
  @JSName("get")
  def get_eventshide(propertyName: qtip2Lib.qtip2LibStrings.eventsDOThide): EventApiFunc = js.native
  @JSName("get")
  def get_eventsmove(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTmove): EventApiFunc = js.native
  @JSName("get")
  def get_eventsrender(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTrender): EventApiFunc = js.native
  @JSName("get")
  def get_eventsshow(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTshow): EventApiFunc = js.native
  @JSName("get")
  def get_eventstoggle(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTtoggle): EventApiFunc = js.native
  @JSName("get")
  def get_eventsvisible(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTvisible): EventApiFunc = js.native
  @JSName("get")
  def get_hide(propertyName: qtip2Lib.qtip2LibStrings.hide): Hide = js.native
  @JSName("get")
  def get_hidedelay(propertyName: qtip2Lib.qtip2LibStrings.hideDOTdelay): scala.Double = js.native
  @JSName("get")
  def get_hidedistance(propertyName: qtip2Lib.qtip2LibStrings.hideDOTdistance): scala.Double | scala.Boolean = js.native
  @JSName("get")
  def get_hideeffect(propertyName: qtip2Lib.qtip2LibStrings.hideDOTeffect): scala.Boolean | (js.Function1[/* offset */ js.Any, scala.Unit]) = js.native
  @JSName("get")
  def get_hideevent(propertyName: qtip2Lib.qtip2LibStrings.hideDOTevent): java.lang.String | scala.Boolean = js.native
  @JSName("get")
  def get_hideleave(propertyName: qtip2Lib.qtip2LibStrings.hideDOTleave): java.lang.String | scala.Boolean = js.native
  @JSName("get")
  def get_hidetarget(propertyName: qtip2Lib.qtip2LibStrings.hideDOTtarget): qtip2Lib.JQuery | scala.Boolean = js.native
  @JSName("get")
  def get_id(propertyName: qtip2Lib.qtip2LibStrings.id): java.lang.String | scala.Boolean = js.native
  @JSName("get")
  def get_metadata(propertyName: qtip2Lib.qtip2LibStrings.metadata): js.Any = js.native
  @JSName("get")
  def get_overwrite(propertyName: qtip2Lib.qtip2LibStrings.overwrite): scala.Boolean = js.native
  @JSName("get")
  def get_position(propertyName: qtip2Lib.qtip2LibStrings.position): Position = js.native
  @JSName("get")
  def get_positionadjust(propertyName: qtip2Lib.qtip2LibStrings.positionDOTadjust): PositionAdjust = js.native
  @JSName("get")
  def get_positionat(propertyName: qtip2Lib.qtip2LibStrings.positionDOTat): java.lang.String | scala.Boolean = js.native
  @JSName("get")
  def get_positioncontainer(propertyName: qtip2Lib.qtip2LibStrings.positionDOTcontainer): qtip2Lib.JQuery | scala.Boolean = js.native
  @JSName("get")
  def get_positioneffect(propertyName: qtip2Lib.qtip2LibStrings.positionDOTeffect): scala.Boolean | (js.Function3[/* api */ js.Any, /* pos */ js.Any, /* viewport */ js.Any, scala.Unit]) = js.native
  @JSName("get")
  def get_positionmy(propertyName: qtip2Lib.qtip2LibStrings.positionDOTmy): java.lang.String | scala.Boolean = js.native
  @JSName("get")
  def get_positiontarget(propertyName: qtip2Lib.qtip2LibStrings.positionDOTtarget): Target | scala.Boolean = js.native
  @JSName("get")
  def get_positionviewport(propertyName: qtip2Lib.qtip2LibStrings.positionDOTviewport): qtip2Lib.JQuery | scala.Boolean = js.native
  @JSName("get")
  def get_prerender(propertyName: qtip2Lib.qtip2LibStrings.prerender): scala.Boolean = js.native
  @JSName("get")
  def get_show(propertyName: qtip2Lib.qtip2LibStrings.show): Show = js.native
  @JSName("get")
  def get_showdelay(propertyName: qtip2Lib.qtip2LibStrings.showDOTdelay): scala.Double = js.native
  @JSName("get")
  def get_showeffect(propertyName: qtip2Lib.qtip2LibStrings.showDOTeffect): scala.Boolean | (js.Function1[/* offset */ js.Any, scala.Unit]) = js.native
  @JSName("get")
  def get_showevent(propertyName: qtip2Lib.qtip2LibStrings.showDOTevent): java.lang.String | scala.Boolean = js.native
  @JSName("get")
  def get_showmodal(propertyName: qtip2Lib.qtip2LibStrings.showDOTmodal): scala.Boolean | Modal = js.native
  @JSName("get")
  def get_showready(propertyName: qtip2Lib.qtip2LibStrings.showDOTready): scala.Boolean = js.native
  @JSName("get")
  def get_showsolo(propertyName: qtip2Lib.qtip2LibStrings.showDOTsolo): qtip2Lib.JQuery | java.lang.String | scala.Boolean = js.native
  @JSName("get")
  def get_showtarget(propertyName: qtip2Lib.qtip2LibStrings.showDOTtarget): qtip2Lib.JQuery | scala.Boolean = js.native
  @JSName("get")
  def get_style(propertyName: qtip2Lib.qtip2LibStrings.style): Style = js.native
  @JSName("get")
  def get_styleclasses(propertyName: qtip2Lib.qtip2LibStrings.styleDOTclasses): java.lang.String | scala.Boolean = js.native
  @JSName("get")
  def get_styledef(propertyName: qtip2Lib.qtip2LibStrings.styleDOTdef): scala.Boolean = js.native
  @JSName("get")
  def get_styleheight(propertyName: qtip2Lib.qtip2LibStrings.styleDOTheight): java.lang.String | scala.Double | scala.Boolean = js.native
  @JSName("get")
  def get_styletip(propertyName: qtip2Lib.qtip2LibStrings.styleDOTtip): java.lang.String | scala.Boolean | Tip = js.native
  @JSName("get")
  def get_stylewidget(propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidget): scala.Boolean = js.native
  @JSName("get")
  def get_stylewidth(propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidth): java.lang.String | scala.Double | scala.Boolean = js.native
  @JSName("get")
  def get_suppress(propertyName: qtip2Lib.qtip2LibStrings.suppress): scala.Boolean = js.native
  def hide(): Api = js.native
  def hide(event: stdLib.Event): Api = js.native
  def reposition(): Api = js.native
  def reposition(event: stdLib.Event): Api = js.native
  def reposition(event: stdLib.Event, effect: scala.Boolean): Api = js.native
  def set(properties: QTipOptions): Api = js.native
  def set(propertyName: java.lang.String, value: js.Any): Api = js.native
  @JSName("set")
  def set_content(propertyName: qtip2Lib.qtip2LibStrings.content, value: Content): Api = js.native
  @JSName("set")
  def set_content(propertyName: qtip2Lib.qtip2LibStrings.content, value: Text): Api = js.native
  @JSName("set")
  def set_contentattr(propertyName: qtip2Lib.qtip2LibStrings.contentDOTattr, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_contentbutton(propertyName: qtip2Lib.qtip2LibStrings.contentDOTbutton, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_contentbutton(propertyName: qtip2Lib.qtip2LibStrings.contentDOTbutton, value: qtip2Lib.JQuery): Api = js.native
  @JSName("set")
  def set_contentbutton(propertyName: qtip2Lib.qtip2LibStrings.contentDOTbutton, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_contenttext(propertyName: qtip2Lib.qtip2LibStrings.contentDOTtext, value: Text): Api = js.native
  @JSName("set")
  def set_contenttitle(propertyName: qtip2Lib.qtip2LibStrings.contentDOTtitle, value: qtip2Lib.Anon_Text): Api = js.native
  @JSName("set")
  def set_contenttitle(propertyName: qtip2Lib.qtip2LibStrings.contentDOTtitle, value: Title): Api = js.native
  @JSName("set")
  def set_events(propertyName: qtip2Lib.qtip2LibStrings.events, value: Events): Api = js.native
  @JSName("set")
  def set_eventsblur(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTblur, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventsfocus(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTfocus, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventshidden(propertyName: qtip2Lib.qtip2LibStrings.eventsDOThidden, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventshide(propertyName: qtip2Lib.qtip2LibStrings.eventsDOThide, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventsmove(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTmove, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventsrender(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTrender, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventsshow(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTshow, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventstoggle(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTtoggle, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_eventsvisible(propertyName: qtip2Lib.qtip2LibStrings.eventsDOTvisible, value: EventApiFunc): Api = js.native
  @JSName("set")
  def set_hide(propertyName: qtip2Lib.qtip2LibStrings.hide, value: Hide): Api = js.native
  @JSName("set")
  def set_hidedistance(propertyName: qtip2Lib.qtip2LibStrings.hideDOTdistance, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_hidedistance(propertyName: qtip2Lib.qtip2LibStrings.hideDOTdistance, value: scala.Double): Api = js.native
  @JSName("set")
  def set_hideeffect(
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTeffect,
    value: js.Function1[/* offset */ js.Any, scala.Unit]
  ): Api = js.native
  @JSName("set")
  def set_hideeffect(propertyName: qtip2Lib.qtip2LibStrings.hideDOTeffect, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_hideevent(propertyName: qtip2Lib.qtip2LibStrings.hideDOTevent, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_hideevent(propertyName: qtip2Lib.qtip2LibStrings.hideDOTevent, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_hidefixed(propertyName: qtip2Lib.qtip2LibStrings.hideDOTfixed, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_hideinactive(propertyName: qtip2Lib.qtip2LibStrings.hideDOTinactive, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_hideinactive(propertyName: qtip2Lib.qtip2LibStrings.hideDOTinactive, value: scala.Double): Api = js.native
  @JSName("set")
  def set_hideleave(propertyName: qtip2Lib.qtip2LibStrings.hideDOTleave, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_hideleave(propertyName: qtip2Lib.qtip2LibStrings.hideDOTleave, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_hidetarget(propertyName: qtip2Lib.qtip2LibStrings.hideDOTtarget, value: qtip2Lib.JQuery): Api = js.native
  @JSName("set")
  def set_hidetarget(propertyName: qtip2Lib.qtip2LibStrings.hideDOTtarget, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_id(propertyName: qtip2Lib.qtip2LibStrings.id, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_id(propertyName: qtip2Lib.qtip2LibStrings.id, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_metadata(propertyName: qtip2Lib.qtip2LibStrings.metadata, value: js.Any): Api = js.native
  @JSName("set")
  def set_overwrite(propertyName: qtip2Lib.qtip2LibStrings.overwrite, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_position(propertyName: qtip2Lib.qtip2LibStrings.position, value: Position): Api = js.native
  @JSName("set")
  def set_positionadjust(propertyName: qtip2Lib.qtip2LibStrings.positionDOTadjust, value: PositionAdjust): Api = js.native
  @JSName("set")
  def set_positionat(propertyName: qtip2Lib.qtip2LibStrings.positionDOTat, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_positionat(propertyName: qtip2Lib.qtip2LibStrings.positionDOTat, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_positioncontainer(propertyName: qtip2Lib.qtip2LibStrings.positionDOTcontainer, value: qtip2Lib.JQuery): Api = js.native
  @JSName("set")
  def set_positioncontainer(propertyName: qtip2Lib.qtip2LibStrings.positionDOTcontainer, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_positioneffect(
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTeffect,
    value: js.Function3[/* api */ this.type, /* pos */ js.Any, /* viewport */ js.Any, scala.Unit]
  ): Api = js.native
  @JSName("set")
  def set_positioneffect(propertyName: qtip2Lib.qtip2LibStrings.positionDOTeffect, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_positionmy(propertyName: qtip2Lib.qtip2LibStrings.positionDOTmy, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_positionmy(propertyName: qtip2Lib.qtip2LibStrings.positionDOTmy, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_positiontarget(propertyName: qtip2Lib.qtip2LibStrings.positionDOTtarget, value: Target): Api = js.native
  @JSName("set")
  def set_positiontarget(propertyName: qtip2Lib.qtip2LibStrings.positionDOTtarget, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_positionviewport(propertyName: qtip2Lib.qtip2LibStrings.positionDOTviewport, value: qtip2Lib.JQuery): Api = js.native
  @JSName("set")
  def set_positionviewport(propertyName: qtip2Lib.qtip2LibStrings.positionDOTviewport, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_prerender(propertyName: qtip2Lib.qtip2LibStrings.prerender, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_show(propertyName: qtip2Lib.qtip2LibStrings.show, value: Show): Api = js.native
  @JSName("set")
  def set_showdelay(propertyName: qtip2Lib.qtip2LibStrings.showDOTdelay, value: scala.Double): Api = js.native
  @JSName("set")
  def set_showeffect(
    propertyName: qtip2Lib.qtip2LibStrings.showDOTeffect,
    value: js.Function1[/* offset */ js.Any, scala.Unit]
  ): Api = js.native
  @JSName("set")
  def set_showeffect(propertyName: qtip2Lib.qtip2LibStrings.showDOTeffect, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_showevent(propertyName: qtip2Lib.qtip2LibStrings.showDOTevent, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_showevent(propertyName: qtip2Lib.qtip2LibStrings.showDOTevent, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_showmodal(propertyName: qtip2Lib.qtip2LibStrings.showDOTmodal, value: Modal): Api = js.native
  @JSName("set")
  def set_showmodal(propertyName: qtip2Lib.qtip2LibStrings.showDOTmodal, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_showready(propertyName: qtip2Lib.qtip2LibStrings.showDOTready, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_showsolo(propertyName: qtip2Lib.qtip2LibStrings.showDOTsolo, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_showsolo(propertyName: qtip2Lib.qtip2LibStrings.showDOTsolo, value: qtip2Lib.JQuery): Api = js.native
  @JSName("set")
  def set_showsolo(propertyName: qtip2Lib.qtip2LibStrings.showDOTsolo, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_showtarget(propertyName: qtip2Lib.qtip2LibStrings.showDOTtarget, value: qtip2Lib.JQuery): Api = js.native
  @JSName("set")
  def set_showtarget(propertyName: qtip2Lib.qtip2LibStrings.showDOTtarget, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_style(propertyName: qtip2Lib.qtip2LibStrings.style, value: Style): Api = js.native
  @JSName("set")
  def set_styleclasses(propertyName: qtip2Lib.qtip2LibStrings.styleDOTclasses, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_styleclasses(propertyName: qtip2Lib.qtip2LibStrings.styleDOTclasses, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_styledef(propertyName: qtip2Lib.qtip2LibStrings.styleDOTdef, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_styleheight(propertyName: qtip2Lib.qtip2LibStrings.styleDOTheight, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_styleheight(propertyName: qtip2Lib.qtip2LibStrings.styleDOTheight, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_styleheight(propertyName: qtip2Lib.qtip2LibStrings.styleDOTheight, value: scala.Double): Api = js.native
  @JSName("set")
  def set_styletip(propertyName: qtip2Lib.qtip2LibStrings.styleDOTtip, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_styletip(propertyName: qtip2Lib.qtip2LibStrings.styleDOTtip, value: Tip): Api = js.native
  @JSName("set")
  def set_styletip(propertyName: qtip2Lib.qtip2LibStrings.styleDOTtip, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_stylewidget(propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidget, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_stylewidth(propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidth, value: java.lang.String): Api = js.native
  @JSName("set")
  def set_stylewidth(propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidth, value: scala.Boolean): Api = js.native
  @JSName("set")
  def set_stylewidth(propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidth, value: scala.Double): Api = js.native
  @JSName("set")
  def set_suppress(propertyName: qtip2Lib.qtip2LibStrings.suppress, value: scala.Boolean): Api = js.native
  def show(): Api = js.native
  def show(event: stdLib.Event): Api = js.native
  def toggle(): Api = js.native
  def toggle(state: scala.Boolean): Api = js.native
  def toggle(state: scala.Boolean, event: stdLib.Event): Api = js.native
}

