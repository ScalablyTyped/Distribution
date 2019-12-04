package typings.atStorybookAddonDashJest.distComponentsResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProps extends js.Object {
  var failureMessages: js.Any
  var fullName: js.UndefOr[String] = js.undefined
  var status: String
  var title: js.UndefOr[String] = js.undefined
}

object ResultProps {
  @scala.inline
  def apply(failureMessages: js.Any, status: String, fullName: String = null, title: String = null): ResultProps = {
    val __obj = js.Dynamic.literal(failureMessages = failureMessages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultProps]
  }
}

