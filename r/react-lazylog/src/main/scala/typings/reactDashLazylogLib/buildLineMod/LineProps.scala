package typings
package reactDashLazylogLib.buildLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LineProps extends js.Object {
  var data: js.Array[reactDashLazylogLib.Anon_Text]
  var formatPart: js.UndefOr[js.Function1[/* text */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  var number: scala.Double
  var onLineNumberClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLAnchorElement]] = js.undefined
  /**
       * This is never called
       * https://github.com/mozilla-frontend-infra/react-lazylog/issues/18
       */
  var onRowClick: js.UndefOr[js.Function0[_]] = js.undefined
  var rowHeight: scala.Double
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

