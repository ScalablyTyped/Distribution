package typings.storybookComponents.toolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EjectProps extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var storyId: js.UndefOr[String] = js.undefined
}

object EjectProps {
  @scala.inline
  def apply(baseUrl: String = null, storyId: String = null): EjectProps = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EjectProps]
  }
}

