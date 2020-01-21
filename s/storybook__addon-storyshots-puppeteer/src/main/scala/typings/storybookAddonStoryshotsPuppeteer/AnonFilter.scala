package typings.storybookAddonStoryshotsPuppeteer

import typings.storybookAddonStoryshotsPuppeteer.configMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: js.UndefOr[js.Function1[/* options */ Options, Boolean]] = js.undefined
}

object AnonFilter {
  @scala.inline
  def apply(filter: /* options */ Options => Boolean = null): AnonFilter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    __obj.asInstanceOf[AnonFilter]
  }
}

