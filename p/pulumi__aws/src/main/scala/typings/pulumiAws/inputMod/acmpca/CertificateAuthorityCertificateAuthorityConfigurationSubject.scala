package typings.pulumiAws.inputMod.acmpca

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityCertificateAuthorityConfigurationSubject extends js.Object {
  /**
    * Fully qualified domain name (FQDN) associated with the certificate subject.
    */
  var commonName: js.UndefOr[Input[String]] = js.native
  /**
    * Two digit code that specifies the country in which the certificate subject located.
    */
  var country: js.UndefOr[Input[String]] = js.native
  /**
    * Disambiguating information for the certificate subject.
    */
  var distinguishedNameQualifier: js.UndefOr[Input[String]] = js.native
  /**
    * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third.
    */
  var generationQualifier: js.UndefOr[Input[String]] = js.native
  /**
    * First name.
    */
  var givenName: js.UndefOr[Input[String]] = js.native
  /**
    * Concatenation that typically contains the first letter of the `givenName`, the first letter of the middle name if one exists, and the first letter of the `surname`.
    */
  var initials: js.UndefOr[Input[String]] = js.native
  /**
    * The locality (such as a city or town) in which the certificate subject is located.
    */
  var locality: js.UndefOr[Input[String]] = js.native
  /**
    * Legal name of the organization with which the certificate subject is affiliated.
    */
  var organization: js.UndefOr[Input[String]] = js.native
  /**
    * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated.
    */
  var organizationalUnit: js.UndefOr[Input[String]] = js.native
  /**
    * Typically a shortened version of a longer `givenName`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza.
    */
  var pseudonym: js.UndefOr[Input[String]] = js.native
  /**
    * State in which the subject of the certificate is located.
    */
  var state: js.UndefOr[Input[String]] = js.native
  /**
    * Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first.
    */
  var surname: js.UndefOr[Input[String]] = js.native
  /**
    * A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject.
    */
  var title: js.UndefOr[Input[String]] = js.native
}

object CertificateAuthorityCertificateAuthorityConfigurationSubject {
  @scala.inline
  def apply(): CertificateAuthorityCertificateAuthorityConfigurationSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthorityCertificateAuthorityConfigurationSubject]
  }
  @scala.inline
  implicit class CertificateAuthorityCertificateAuthorityConfigurationSubjectOps[Self <: CertificateAuthorityCertificateAuthorityConfigurationSubject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommonName(value: Input[String]): Self = this.set("commonName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonName: Self = this.set("commonName", js.undefined)
    @scala.inline
    def setCountry(value: Input[String]): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDistinguishedNameQualifier(value: Input[String]): Self = this.set("distinguishedNameQualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistinguishedNameQualifier: Self = this.set("distinguishedNameQualifier", js.undefined)
    @scala.inline
    def setGenerationQualifier(value: Input[String]): Self = this.set("generationQualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerationQualifier: Self = this.set("generationQualifier", js.undefined)
    @scala.inline
    def setGivenName(value: Input[String]): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    @scala.inline
    def setInitials(value: Input[String]): Self = this.set("initials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitials: Self = this.set("initials", js.undefined)
    @scala.inline
    def setLocality(value: Input[String]): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    @scala.inline
    def setOrganization(value: Input[String]): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setOrganizationalUnit(value: Input[String]): Self = this.set("organizationalUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationalUnit: Self = this.set("organizationalUnit", js.undefined)
    @scala.inline
    def setPseudonym(value: Input[String]): Self = this.set("pseudonym", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudonym: Self = this.set("pseudonym", js.undefined)
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSurname(value: Input[String]): Self = this.set("surname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
    @scala.inline
    def setTitle(value: Input[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

