package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommonName extends js.Object {
  var commonName: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var distinguishedNameQualifier: js.UndefOr[String] = js.undefined
  var generationQualifier: js.UndefOr[String] = js.undefined
  var givenName: js.UndefOr[String] = js.undefined
  var initials: js.UndefOr[String] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var organization: js.UndefOr[String] = js.undefined
  var organizationalUnit: js.UndefOr[String] = js.undefined
  var pseudonym: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var surname: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_CommonName {
  @scala.inline
  def apply(
    commonName: String = null,
    country: String = null,
    distinguishedNameQualifier: String = null,
    generationQualifier: String = null,
    givenName: String = null,
    initials: String = null,
    locality: String = null,
    organization: String = null,
    organizationalUnit: String = null,
    pseudonym: String = null,
    state: String = null,
    surname: String = null,
    title: String = null
  ): Anon_CommonName = {
    val __obj = js.Dynamic.literal()
    if (commonName != null) __obj.updateDynamic("commonName")(commonName)
    if (country != null) __obj.updateDynamic("country")(country)
    if (distinguishedNameQualifier != null) __obj.updateDynamic("distinguishedNameQualifier")(distinguishedNameQualifier)
    if (generationQualifier != null) __obj.updateDynamic("generationQualifier")(generationQualifier)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (initials != null) __obj.updateDynamic("initials")(initials)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (organizationalUnit != null) __obj.updateDynamic("organizationalUnit")(organizationalUnit)
    if (pseudonym != null) __obj.updateDynamic("pseudonym")(pseudonym)
    if (state != null) __obj.updateDynamic("state")(state)
    if (surname != null) __obj.updateDynamic("surname")(surname)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_CommonName]
  }
}

