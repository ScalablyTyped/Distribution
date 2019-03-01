package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommonNameCountry extends js.Object {
  var commonName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var country: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var distinguishedNameQualifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var generationQualifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var givenName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var initials: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var locality: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var organization: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var organizationalUnit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var pseudonym: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var state: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var surname: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var title: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_CommonNameCountry {
  @scala.inline
  def apply(
    commonName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    country: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    distinguishedNameQualifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    generationQualifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    givenName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    initials: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    locality: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    organization: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    organizationalUnit: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    pseudonym: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    state: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    surname: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    title: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_CommonNameCountry = {
    val __obj = js.Dynamic.literal()
    if (commonName != null) __obj.updateDynamic("commonName")(commonName.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (distinguishedNameQualifier != null) __obj.updateDynamic("distinguishedNameQualifier")(distinguishedNameQualifier.asInstanceOf[js.Any])
    if (generationQualifier != null) __obj.updateDynamic("generationQualifier")(generationQualifier.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (initials != null) __obj.updateDynamic("initials")(initials.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (organizationalUnit != null) __obj.updateDynamic("organizationalUnit")(organizationalUnit.asInstanceOf[js.Any])
    if (pseudonym != null) __obj.updateDynamic("pseudonym")(pseudonym.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (surname != null) __obj.updateDynamic("surname")(surname.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommonNameCountry]
  }
}

