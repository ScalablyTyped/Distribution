package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommonName extends js.Object {
  var commonName: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var distinguishedNameQualifier: js.UndefOr[java.lang.String] = js.undefined
  var generationQualifier: js.UndefOr[java.lang.String] = js.undefined
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  var initials: js.UndefOr[java.lang.String] = js.undefined
  var locality: js.UndefOr[java.lang.String] = js.undefined
  var organization: js.UndefOr[java.lang.String] = js.undefined
  var organizationalUnit: js.UndefOr[java.lang.String] = js.undefined
  var pseudonym: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var surname: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CommonName {
  @scala.inline
  def apply(
    commonName: java.lang.String = null,
    country: java.lang.String = null,
    distinguishedNameQualifier: java.lang.String = null,
    generationQualifier: java.lang.String = null,
    givenName: java.lang.String = null,
    initials: java.lang.String = null,
    locality: java.lang.String = null,
    organization: java.lang.String = null,
    organizationalUnit: java.lang.String = null,
    pseudonym: java.lang.String = null,
    state: java.lang.String = null,
    surname: java.lang.String = null,
    title: java.lang.String = null
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

