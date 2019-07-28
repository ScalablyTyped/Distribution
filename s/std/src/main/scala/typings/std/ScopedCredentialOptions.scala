package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredentialOptions extends js.Object {
  var excludeList: js.UndefOr[js.Array[ScopedCredentialDescriptor]] = js.undefined
  var extensions: js.UndefOr[WebAuthnExtensions] = js.undefined
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
}

object ScopedCredentialOptions {
  @scala.inline
  def apply(
    excludeList: js.Array[ScopedCredentialDescriptor] = null,
    extensions: WebAuthnExtensions = null,
    rpId: java.lang.String = null,
    timeoutSeconds: Int | Double = null
  ): ScopedCredentialOptions = {
    val __obj = js.Dynamic.literal()
    if (excludeList != null) __obj.updateDynamic("excludeList")(excludeList)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (rpId != null) __obj.updateDynamic("rpId")(rpId)
    if (timeoutSeconds != null) __obj.updateDynamic("timeoutSeconds")(timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialOptions]
  }
}

