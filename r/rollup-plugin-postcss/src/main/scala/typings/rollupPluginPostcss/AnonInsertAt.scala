package typings.rollupPluginPostcss

import typings.rollupPluginPostcss.rollupPluginPostcssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInsertAt extends js.Object {
  var insertAt: js.UndefOr[top | String] = js.undefined
}

object AnonInsertAt {
  @scala.inline
  def apply(insertAt: top | String = null): AnonInsertAt = {
    val __obj = js.Dynamic.literal()
    if (insertAt != null) __obj.updateDynamic("insertAt")(insertAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInsertAt]
  }
}

