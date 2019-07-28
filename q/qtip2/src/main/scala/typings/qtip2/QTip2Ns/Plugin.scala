package typings.qtip2.QTip2Ns

import typings.qtip2.Anon_Text
import typings.qtip2.JQuery
import typings.qtip2.qtip2Strings.api
import typings.qtip2.qtip2Strings.blur
import typings.qtip2.qtip2Strings.content
import typings.qtip2.qtip2Strings.contentDOTattr
import typings.qtip2.qtip2Strings.contentDOTbutton
import typings.qtip2.qtip2Strings.contentDOTtext
import typings.qtip2.qtip2Strings.contentDOTtitle
import typings.qtip2.qtip2Strings.destroy
import typings.qtip2.qtip2Strings.disable
import typings.qtip2.qtip2Strings.enable
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
import typings.qtip2.qtip2Strings.focus
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
import typings.qtip2.qtip2Strings.option
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
import typings.qtip2.qtip2Strings.reposition
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
import typings.qtip2.qtip2Strings.toggle
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var defaults: QTipOptions = js.native
  def apply(): JQuery = js.native
  def apply(methodName: String): js.Any = js.native
  def apply(methodName: String, p1: js.Any): js.Any = js.native
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
  def apply(methodName: option, propertyName: contentDOTattr): String = js.native
  def apply(methodName: option, propertyName: contentDOTattr, value: String): Api = js.native
  def apply(methodName: option, propertyName: contentDOTbutton): String | JQuery | Boolean = js.native
  def apply(methodName: option, propertyName: contentDOTbutton, value: String): Api = js.native
  def apply(methodName: option, propertyName: contentDOTbutton, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: contentDOTbutton, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: contentDOTtext): Text = js.native
  def apply(methodName: option, propertyName: contentDOTtext, value: Text): Api = js.native
  def apply(methodName: option, propertyName: contentDOTtitle): Title = js.native
  def apply(methodName: option, propertyName: contentDOTtitle, value: Anon_Text): Api = js.native
  def apply(methodName: option, propertyName: contentDOTtitle, value: Title): Api = js.native
  def apply(methodName: option, propertyName: content, value: Content): Api = js.native
  def apply(methodName: option, propertyName: content, value: Text): Api = js.native
  def apply(methodName: option, propertyName: events): Events = js.native
  def apply(methodName: option, propertyName: eventsDOTblur): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDOTblur, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDOTfocus): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDOTfocus, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDOThidden): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDOThidden, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDOThide): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDOThide, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDOTmove): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDOTmove, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDOTrender): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDOTrender, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDOTshow): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDOTshow, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDOTtoggle): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDOTtoggle, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDOTvisible): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDOTvisible, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: events, value: Events): Api = js.native
  def apply(methodName: option, propertyName: hide): Hide = js.native
  def apply(methodName: option, propertyName: hideDOTdelay): Double = js.native
  def apply(methodName: option, propertyName: hideDOTdistance): Double | Boolean = js.native
  def apply(methodName: option, propertyName: hideDOTdistance, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDOTdistance, value: Double): Api = js.native
  def apply(methodName: option, propertyName: hideDOTeffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
  def apply(methodName: option, propertyName: hideDOTeffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
  def apply(methodName: option, propertyName: hideDOTeffect, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDOTevent): String | Boolean = js.native
  def apply(methodName: option, propertyName: hideDOTevent, value: String): Api = js.native
  def apply(methodName: option, propertyName: hideDOTevent, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDOTfixed, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDOTinactive, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDOTinactive, value: Double): Api = js.native
  def apply(methodName: option, propertyName: hideDOTleave): String | Boolean = js.native
  def apply(methodName: option, propertyName: hideDOTleave, value: String): Api = js.native
  def apply(methodName: option, propertyName: hideDOTleave, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDOTtarget): JQuery | Boolean = js.native
  def apply(methodName: option, propertyName: hideDOTtarget, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDOTtarget, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: hide, value: Hide): Api = js.native
  def apply(methodName: option, propertyName: id): String | Boolean = js.native
  def apply(methodName: option, propertyName: id, value: String): Api = js.native
  def apply(methodName: option, propertyName: id, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: metadata): js.Any = js.native
  def apply(methodName: option, propertyName: metadata, value: js.Any): Api = js.native
  def apply(methodName: option, propertyName: overwrite): Boolean = js.native
  def apply(methodName: option, propertyName: overwrite, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: position): Position = js.native
  def apply(methodName: option, propertyName: positionDOTadjust): PositionAdjust = js.native
  def apply(methodName: option, propertyName: positionDOTadjust, value: PositionAdjust): Api = js.native
  def apply(methodName: option, propertyName: positionDOTat): String | Boolean = js.native
  def apply(methodName: option, propertyName: positionDOTat, value: String): Api = js.native
  def apply(methodName: option, propertyName: positionDOTat, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDOTcontainer): JQuery | Boolean = js.native
  def apply(methodName: option, propertyName: positionDOTcontainer, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDOTcontainer, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: positionDOTeffect): Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit]) = js.native
  def apply(
    methodName: option,
    propertyName: positionDOTeffect,
    value: js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit]
  ): Api = js.native
  def apply(methodName: option, propertyName: positionDOTeffect, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDOTmy): String | Boolean = js.native
  def apply(methodName: option, propertyName: positionDOTmy, value: String): Api = js.native
  def apply(methodName: option, propertyName: positionDOTmy, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDOTtarget): Target | Boolean = js.native
  def apply(methodName: option, propertyName: positionDOTtarget, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDOTtarget, value: Target): Api = js.native
  def apply(methodName: option, propertyName: positionDOTviewport): JQuery | Boolean = js.native
  def apply(methodName: option, propertyName: positionDOTviewport, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDOTviewport, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: position, value: Position): Api = js.native
  def apply(methodName: option, propertyName: prerender): Boolean = js.native
  def apply(methodName: option, propertyName: prerender, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: show): Show = js.native
  def apply(methodName: option, propertyName: showDOTdelay): Double = js.native
  def apply(methodName: option, propertyName: showDOTdelay, value: Double): Api = js.native
  def apply(methodName: option, propertyName: showDOTeffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
  def apply(methodName: option, propertyName: showDOTeffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
  def apply(methodName: option, propertyName: showDOTeffect, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDOTevent): String | Boolean = js.native
  def apply(methodName: option, propertyName: showDOTevent, value: String): Api = js.native
  def apply(methodName: option, propertyName: showDOTevent, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDOTmodal): Boolean | Modal = js.native
  def apply(methodName: option, propertyName: showDOTmodal, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDOTmodal, value: Modal): Api = js.native
  def apply(methodName: option, propertyName: showDOTready): Boolean = js.native
  def apply(methodName: option, propertyName: showDOTready, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDOTsolo): JQuery | String | Boolean = js.native
  def apply(methodName: option, propertyName: showDOTsolo, value: String): Api = js.native
  def apply(methodName: option, propertyName: showDOTsolo, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDOTsolo, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: showDOTtarget): JQuery | Boolean = js.native
  def apply(methodName: option, propertyName: showDOTtarget, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDOTtarget, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: show, value: Show): Api = js.native
  def apply(methodName: option, propertyName: style): Style = js.native
  def apply(methodName: option, propertyName: styleDOTclasses): String | Boolean = js.native
  def apply(methodName: option, propertyName: styleDOTclasses, value: String): Api = js.native
  def apply(methodName: option, propertyName: styleDOTclasses, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDOTdef): Boolean = js.native
  def apply(methodName: option, propertyName: styleDOTdef, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDOTheight): String | Double | Boolean = js.native
  def apply(methodName: option, propertyName: styleDOTheight, value: String): Api = js.native
  def apply(methodName: option, propertyName: styleDOTheight, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDOTheight, value: Double): Api = js.native
  def apply(methodName: option, propertyName: styleDOTtip): String | Boolean | Tip = js.native
  def apply(methodName: option, propertyName: styleDOTtip, value: String): Api = js.native
  def apply(methodName: option, propertyName: styleDOTtip, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDOTtip, value: Tip): Api = js.native
  def apply(methodName: option, propertyName: styleDOTwidget): Boolean = js.native
  def apply(methodName: option, propertyName: styleDOTwidget, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDOTwidth): String | Double | Boolean = js.native
  def apply(methodName: option, propertyName: styleDOTwidth, value: String): Api = js.native
  def apply(methodName: option, propertyName: styleDOTwidth, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDOTwidth, value: Double): Api = js.native
  def apply(methodName: option, propertyName: style, value: Style): Api = js.native
  def apply(methodName: option, propertyName: suppress): Boolean = js.native
  def apply(methodName: option, propertyName: suppress, value: Boolean): Api = js.native
  def apply(methodName: reposition): JQuery = js.native
  def apply(methodName: reposition, event: Event): JQuery = js.native
  def apply(methodName: reposition, event: Event, effect: Boolean): JQuery = js.native
  def apply(methodName: show): JQuery = js.native
  def apply(methodName: show, event: Event): JQuery = js.native
  def apply(methodName: toggle): JQuery = js.native
  def apply(methodName: toggle, state: Boolean): JQuery = js.native
  def apply(methodName: toggle, state: Boolean, event: Event): JQuery = js.native
  def apply(options: QTipOptions): JQuery = js.native
}

