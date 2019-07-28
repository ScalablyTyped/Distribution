package typings.shopifyDashPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachment extends js.Object {
  var attachment: js.UndefOr[String] = js.undefined
  var created_at: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object Anon_Attachment {
  @scala.inline
  def apply(attachment: String = null, created_at: String = null, src: String = null): Anon_Attachment = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[Anon_Attachment]
  }
}

