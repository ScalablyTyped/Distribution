package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var adjust: js.UndefOr[PositionAdjust] = js.undefined
  var at: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var container: js.UndefOr[qtip2Lib.JQuery | scala.Boolean] = js.undefined
  var effect: js.UndefOr[
    scala.Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, scala.Unit])
  ] = js.undefined
  var my: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var target: js.UndefOr[Target | scala.Boolean] = js.undefined
  var viewport: js.UndefOr[qtip2Lib.JQuery | scala.Boolean] = js.undefined
}

