package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNotificationOptions extends js.Object {
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object GetNotificationOptions {
  @scala.inline
  def apply(tag: java.lang.String = null): GetNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationOptions]
  }
}

