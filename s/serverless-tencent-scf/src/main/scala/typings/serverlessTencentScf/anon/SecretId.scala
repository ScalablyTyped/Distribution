package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretId extends js.Object {
  var secretId: js.UndefOr[String] = js.undefined
}

object SecretId {
  @scala.inline
  def apply(secretId: String = null): SecretId = {
    val __obj = js.Dynamic.literal()
    if (secretId != null) __obj.updateDynamic("secretId")(secretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretId]
  }
}

