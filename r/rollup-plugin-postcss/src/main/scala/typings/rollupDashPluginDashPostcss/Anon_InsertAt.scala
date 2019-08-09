package typings.rollupDashPluginDashPostcss

import typings.rollupDashPluginDashPostcss.rollupDashPluginDashPostcssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertAt extends js.Object {
  var insertAt: js.UndefOr[top | String] = js.undefined
}

object Anon_InsertAt {
  @scala.inline
  def apply(insertAt: top | String = null): Anon_InsertAt = {
    val __obj = js.Dynamic.literal()
    if (insertAt != null) __obj.updateDynamic("insertAt")(insertAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InsertAt]
  }
}

