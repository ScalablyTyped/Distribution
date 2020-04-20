package typings.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyPrefixes extends js.Object {
  var keyPrefixes: js.UndefOr[js.Array[String]] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
}

object AnonKeyPrefixes {
  @scala.inline
  def apply(keyPrefixes: js.Array[String] = null, keys: js.Array[String] = null): AnonKeyPrefixes = {
    val __obj = js.Dynamic.literal()
    if (keyPrefixes != null) __obj.updateDynamic("keyPrefixes")(keyPrefixes.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyPrefixes]
  }
}

