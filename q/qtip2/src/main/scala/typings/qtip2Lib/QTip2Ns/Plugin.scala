package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var defaults: QTipOptions = js.native
  def apply(): qtip2Lib.JQuery = js.native
  def apply(methodName: java.lang.String): js.Any = js.native
  def apply(methodName: java.lang.String, p1: js.Any): js.Any = js.native
  def apply(methodName: java.lang.String, p1: js.Any, p2: js.Any): js.Any = js.native
  def apply(methodName: java.lang.String, p1: js.Any, p2: js.Any, p3: js.Any): js.Any = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.api): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.blur): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.blur, event: stdLib.Event): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.destroy): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.destroy, immediate: scala.Boolean): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.disable): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.disable, state: scala.Boolean): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.enable): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.focus): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.focus, event: stdLib.Event): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.hide): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.hide, event: stdLib.Event): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, properties: QTipOptions): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.content): Content = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.contentDOTattr): java.lang.String = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.contentDOTattr,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.contentDOTbutton
  ): java.lang.String | qtip2Lib.JQuery | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.contentDOTbutton,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.contentDOTbutton,
    value: qtip2Lib.JQuery
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.contentDOTbutton,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.contentDOTtext): Text = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.contentDOTtext,
    value: Text
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.contentDOTtitle
  ): Title = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.contentDOTtitle,
    value: qtip2Lib.Anon_Text
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.contentDOTtitle,
    value: Title
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.content,
    value: Content
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.content,
    value: Text
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.events): Events = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.eventsDOTblur): EventApiFunc = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOTblur,
    value: EventApiFunc
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.eventsDOTfocus): EventApiFunc = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOTfocus,
    value: EventApiFunc
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOThidden
  ): EventApiFunc = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOThidden,
    value: EventApiFunc
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.eventsDOThide): EventApiFunc = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOThide,
    value: EventApiFunc
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.eventsDOTmove): EventApiFunc = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOTmove,
    value: EventApiFunc
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOTrender
  ): EventApiFunc = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOTrender,
    value: EventApiFunc
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.eventsDOTshow): EventApiFunc = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOTshow,
    value: EventApiFunc
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOTtoggle
  ): EventApiFunc = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOTtoggle,
    value: EventApiFunc
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOTvisible
  ): EventApiFunc = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.eventsDOTvisible,
    value: EventApiFunc
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.events,
    value: Events
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.hide): Hide = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.hideDOTdelay): scala.Double = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTdistance
  ): scala.Double | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTdistance,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTdistance,
    value: scala.Double
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.hideDOTeffect): scala.Boolean | (js.Function1[/* offset */ js.Any, scala.Unit]) = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTeffect,
    value: js.Function1[/* offset */ js.Any, scala.Unit]
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTeffect,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.hideDOTevent): java.lang.String | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTevent,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTevent,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTfixed,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTinactive,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTinactive,
    value: scala.Double
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.hideDOTleave): java.lang.String | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTleave,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTleave,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.hideDOTtarget): qtip2Lib.JQuery | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTtarget,
    value: qtip2Lib.JQuery
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hideDOTtarget,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.hide,
    value: Hide
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.id): java.lang.String | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.id,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.id,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.metadata): js.Any = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.metadata,
    value: js.Any
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.overwrite): scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.overwrite,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.position): Position = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTadjust
  ): PositionAdjust = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTadjust,
    value: PositionAdjust
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.positionDOTat): java.lang.String | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTat,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTat,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTcontainer
  ): qtip2Lib.JQuery | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTcontainer,
    value: qtip2Lib.JQuery
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTcontainer,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTeffect
  ): scala.Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, scala.Unit]) = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTeffect,
    value: js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, scala.Unit]
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTeffect,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.positionDOTmy): java.lang.String | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTmy,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTmy,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTtarget
  ): Target | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTtarget,
    value: Target
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTtarget,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTviewport
  ): qtip2Lib.JQuery | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTviewport,
    value: qtip2Lib.JQuery
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.positionDOTviewport,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.position,
    value: Position
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.prerender): scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.prerender,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.show): Show = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.showDOTdelay): scala.Double = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTdelay,
    value: scala.Double
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.showDOTeffect): scala.Boolean | (js.Function1[/* offset */ js.Any, scala.Unit]) = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTeffect,
    value: js.Function1[/* offset */ js.Any, scala.Unit]
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTeffect,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.showDOTevent): java.lang.String | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTevent,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTevent,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.showDOTmodal): scala.Boolean | Modal = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTmodal,
    value: Modal
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTmodal,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.showDOTready): scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTready,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.showDOTsolo): qtip2Lib.JQuery | java.lang.String | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTsolo,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTsolo,
    value: qtip2Lib.JQuery
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTsolo,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.showDOTtarget): qtip2Lib.JQuery | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTtarget,
    value: qtip2Lib.JQuery
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.showDOTtarget,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.show,
    value: Show
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.style): Style = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTclasses
  ): java.lang.String | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTclasses,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTclasses,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.styleDOTdef): scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTdef,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.styleDOTheight): java.lang.String | scala.Double | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTheight,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTheight,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTheight,
    value: scala.Double
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.styleDOTtip): java.lang.String | scala.Boolean | Tip = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTtip,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTtip,
    value: Tip
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTtip,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidget): scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidget,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidth): java.lang.String | scala.Double | scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidth,
    value: java.lang.String
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidth,
    value: scala.Boolean
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.styleDOTwidth,
    value: scala.Double
  ): Api = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.style,
    value: Style
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.option, propertyName: qtip2Lib.qtip2LibStrings.suppress): scala.Boolean = js.native
  def apply(
    methodName: qtip2Lib.qtip2LibStrings.option,
    propertyName: qtip2Lib.qtip2LibStrings.suppress,
    value: scala.Boolean
  ): Api = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.reposition): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.reposition, event: stdLib.Event): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.reposition, event: stdLib.Event, effect: scala.Boolean): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.show): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.show, event: stdLib.Event): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.toggle): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.toggle, state: scala.Boolean): qtip2Lib.JQuery = js.native
  def apply(methodName: qtip2Lib.qtip2LibStrings.toggle, state: scala.Boolean, event: stdLib.Event): qtip2Lib.JQuery = js.native
  def apply(options: QTipOptions): qtip2Lib.JQuery = js.native
}

