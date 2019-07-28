package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionOptions extends js.Object {
  var allowList: js.UndefOr[js.Array[ScopedCredentialDescriptor]] = js.undefined
  var extensions: js.UndefOr[WebAuthnExtensions] = js.undefined
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
}

object AssertionOptions {
  @scala.inline
  def apply(
    allowList: js.Array[ScopedCredentialDescriptor] = null,
    extensions: WebAuthnExtensions = null,
    rpId: java.lang.String = null,
    timeoutSeconds: Int | Double = null
  ): AssertionOptions = {
    val __obj = js.Dynamic.literal()
    if (allowList != null) __obj.updateDynamic("allowList")(allowList)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (rpId != null) __obj.updateDynamic("rpId")(rpId)
    if (timeoutSeconds != null) __obj.updateDynamic("timeoutSeconds")(timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionOptions]
  }
}

