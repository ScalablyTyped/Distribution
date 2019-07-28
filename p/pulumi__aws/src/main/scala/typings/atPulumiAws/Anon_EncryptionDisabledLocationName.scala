package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionDisabledLocationName extends js.Object {
  var encryptionDisabled: js.UndefOr[Input[Boolean]] = js.undefined
  var location: js.UndefOr[Input[String]] = js.undefined
  var name: js.UndefOr[Input[String]] = js.undefined
  var namespaceType: js.UndefOr[Input[String]] = js.undefined
  var packaging: js.UndefOr[Input[String]] = js.undefined
  var path: js.UndefOr[Input[String]] = js.undefined
  var `type`: Input[String]
}

object Anon_EncryptionDisabledLocationName {
  @scala.inline
  def apply(
    `type`: Input[String],
    encryptionDisabled: Input[Boolean] = null,
    location: Input[String] = null,
    name: Input[String] = null,
    namespaceType: Input[String] = null,
    packaging: Input[String] = null,
    path: Input[String] = null
  ): Anon_EncryptionDisabledLocationName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (encryptionDisabled != null) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespaceType != null) __obj.updateDynamic("namespaceType")(namespaceType.asInstanceOf[js.Any])
    if (packaging != null) __obj.updateDynamic("packaging")(packaging.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionDisabledLocationName]
  }
}

