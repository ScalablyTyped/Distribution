package typings.reactShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  /**
    * Title of the shared page. Note that if Pocket detects a title tag
    * on the page being saved, this parameter will be ignored
    * and the title tag of the saved page will be used instead.
    */
  var title: js.UndefOr[String] = js.undefined
}

object AnonTitle {
  @scala.inline
  def apply(title: String = null): AnonTitle = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitle]
  }
}

