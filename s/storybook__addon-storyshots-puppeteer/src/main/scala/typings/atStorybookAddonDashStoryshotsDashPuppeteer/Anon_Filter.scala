package typings.atStorybookAddonDashStoryshotsDashPuppeteer

import typings.atStorybookAddonDashStoryshotsDashPuppeteer.distConfigMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[js.Function1[/* options */ Options, Boolean]] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(filter: /* options */ Options => Boolean = null): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    __obj.asInstanceOf[Anon_Filter]
  }
}

