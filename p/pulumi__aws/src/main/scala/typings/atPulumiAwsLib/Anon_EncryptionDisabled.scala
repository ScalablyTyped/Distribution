package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionDisabled extends js.Object {
  var encryptionDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namespaceType: js.UndefOr[java.lang.String] = js.undefined
  var packaging: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_EncryptionDisabled {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    encryptionDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    name: java.lang.String = null,
    namespaceType: java.lang.String = null,
    packaging: java.lang.String = null,
    path: java.lang.String = null
  ): Anon_EncryptionDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespaceType != null) __obj.updateDynamic("namespaceType")(namespaceType)
    if (packaging != null) __obj.updateDynamic("packaging")(packaging)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_EncryptionDisabled]
  }
}

