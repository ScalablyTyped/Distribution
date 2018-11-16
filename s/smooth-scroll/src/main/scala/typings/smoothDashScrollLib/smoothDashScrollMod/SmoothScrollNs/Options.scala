package typings
package smoothDashScrollLib.smoothDashScrollMod.SmoothScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var clip: js.UndefOr[scala.Boolean] = js.undefined
  var customEasing: js.UndefOr[js.Function1[/* time */ scala.Double, scala.Double]] = js.undefined
  var easing: js.UndefOr[Easing] = js.undefined
  // Custom Events
  var emitEvents: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  // Selectors
  var ignore: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[
    scala.Double | (js.Function2[
      /* anchor */ js.UndefOr[stdLib.Element | scala.Double | scala.Null], 
      /* toggle */ js.UndefOr[stdLib.Element | scala.Null], 
      scala.Double
    ])
  ] = js.undefined
  var popstate: js.UndefOr[scala.Boolean] = js.undefined
  // Speed & Easing
  var speed: js.UndefOr[scala.Double] = js.undefined
  var topOnEmptyHash: js.UndefOr[scala.Boolean] = js.undefined
  // History
  var updateURL: js.UndefOr[scala.Boolean] = js.undefined
}

