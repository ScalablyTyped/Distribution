package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachment extends js.Object {
  var attachment: js.UndefOr[String] = js.undefined
  var created_at: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object AnonAttachment {
  @scala.inline
  def apply(attachment: String = null, created_at: String = null, src: String = null): AnonAttachment = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachment]
  }
}

