package typings.rollupPluginPostcss.anon

import typings.rollupPluginPostcss.rollupPluginPostcssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertAt extends js.Object {
  var insertAt: js.UndefOr[top | String] = js.undefined
}

object InsertAt {
  @scala.inline
  def apply(insertAt: top | String = null): InsertAt = {
    val __obj = js.Dynamic.literal()
    if (insertAt != null) __obj.updateDynamic("insertAt")(insertAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertAt]
  }
}

