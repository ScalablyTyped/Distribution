package typings
package scrollDashIntoDashViewLib.underscoreUnderscoreScrollIntoViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var align: js.UndefOr[Alignment] = js.undefined
  var ease: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Double]] = js.undefined
  var time: js.UndefOr[scala.Double] = js.undefined
  var validTarget: js.UndefOr[
    js.Function2[/* target */ stdLib.HTMLElement, /* parentsScrolled */ scala.Double, scala.Boolean]
  ] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    align: Alignment = null,
    ease: /* value */ scala.Double => scala.Double = null,
    time: scala.Int | scala.Double = null,
    validTarget: (/* target */ stdLib.HTMLElement, /* parentsScrolled */ scala.Double) => scala.Boolean = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (ease != null) __obj.updateDynamic("ease")(js.Any.fromFunction1(ease))
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (validTarget != null) __obj.updateDynamic("validTarget")(js.Any.fromFunction2(validTarget))
    __obj.asInstanceOf[Settings]
  }
}

