package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSLConfiguration extends js.Object {
  var certificatePath: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
  var validateCallback: js.UndefOr[SSLVerifyCallback] = js.undefined
}

object SSLConfiguration {
  @scala.inline
  def apply(
    certificatePath: String = null,
    validate: js.UndefOr[Boolean] = js.undefined,
    validateCallback: /* sslVerifyObject */ SSLVerifyObject => Boolean = null
  ): SSLConfiguration = {
    val __obj = js.Dynamic.literal()
    if (certificatePath != null) __obj.updateDynamic("certificatePath")(certificatePath.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    if (validateCallback != null) __obj.updateDynamic("validateCallback")(js.Any.fromFunction1(validateCallback))
    __obj.asInstanceOf[SSLConfiguration]
  }
}

