package typings
package scrollrevealLib.scrollRevealNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollRevealObjectOptions extends js.Object {
  var afterReset: js.UndefOr[
    (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit])
  ] = js.undefined
  var afterReveal: js.UndefOr[
    (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit])
  ] = js.undefined
  var beforeReset: js.UndefOr[
    (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit])
  ] = js.undefined
  var beforeReveal: js.UndefOr[
    (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit])
  ] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var mobile: js.UndefOr[scala.Boolean] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var reset: js.UndefOr[scala.Boolean] = js.undefined
  var rotate: js.UndefOr[ScrollRevealRotateObject] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var useDelay: js.UndefOr[java.lang.String] = js.undefined
  var viewFactor: js.UndefOr[scala.Double] = js.undefined
  var viewOffset: js.UndefOr[ScrollRevealPositionObject] = js.undefined
}

