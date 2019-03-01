package typings
package shopifyDashPrimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachment extends js.Object {
  var attachment: js.UndefOr[java.lang.String] = js.undefined
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Attachment {
  @scala.inline
  def apply(
    attachment: java.lang.String = null,
    created_at: java.lang.String = null,
    src: java.lang.String = null
  ): Anon_Attachment = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[Anon_Attachment]
  }
}

