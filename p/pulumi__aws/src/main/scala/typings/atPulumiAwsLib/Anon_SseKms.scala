package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SseKms extends js.Object {
  var sseKms: js.UndefOr[Anon_KeyId] = js.undefined
  var sseS3: js.UndefOr[js.Object] = js.undefined
}

object Anon_SseKms {
  @scala.inline
  def apply(sseKms: Anon_KeyId = null, sseS3: js.Object = null): Anon_SseKms = {
    val __obj = js.Dynamic.literal()
    if (sseKms != null) __obj.updateDynamic("sseKms")(sseKms)
    if (sseS3 != null) __obj.updateDynamic("sseS3")(sseS3)
    __obj.asInstanceOf[Anon_SseKms]
  }
}

