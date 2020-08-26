package typings.pulumiAws.certificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
import typings.pulumiAws.inputMod.acmpca.CertificateAuthorityRevocationConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityArgs extends js.Object {
  /**
    * Nested argument containing algorithms and certificate subject information. Defined below.
    */
  val certificateAuthorityConfiguration: Input[CertificateAuthorityCertificateAuthorityConfiguration] = js.native
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
    */
  val permanentDeletionTimeInDays: js.UndefOr[Input[Double]] = js.native
  /**
    * Nested argument containing revocation configuration. Defined below.
    */
  val revocationConfiguration: js.UndefOr[Input[CertificateAuthorityRevocationConfiguration]] = js.native
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object CertificateAuthorityArgs {
  @scala.inline
  def apply(certificateAuthorityConfiguration: Input[CertificateAuthorityCertificateAuthorityConfiguration]): CertificateAuthorityArgs = {
    val __obj = js.Dynamic.literal(certificateAuthorityConfiguration = certificateAuthorityConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityArgs]
  }
  @scala.inline
  implicit class CertificateAuthorityArgsOps[Self <: CertificateAuthorityArgs] (val x: Self) extends AnyVal {
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
    def setCertificateAuthorityConfiguration(value: Input[CertificateAuthorityCertificateAuthorityConfiguration]): Self = this.set("certificateAuthorityConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setPermanentDeletionTimeInDays(value: Input[Double]): Self = this.set("permanentDeletionTimeInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermanentDeletionTimeInDays: Self = this.set("permanentDeletionTimeInDays", js.undefined)
    @scala.inline
    def setRevocationConfiguration(value: Input[CertificateAuthorityRevocationConfiguration]): Self = this.set("revocationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevocationConfiguration: Self = this.set("revocationConfiguration", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

