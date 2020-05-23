package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPrefixes extends js.Object {
  var keyPrefixes: js.UndefOr[js.Array[String]] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
}

object KeyPrefixes {
  @scala.inline
  def apply(keyPrefixes: js.Array[String] = null, keys: js.Array[String] = null): KeyPrefixes = {
    val __obj = js.Dynamic.literal()
    if (keyPrefixes != null) __obj.updateDynamic("keyPrefixes")(keyPrefixes.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPrefixes]
  }
}

