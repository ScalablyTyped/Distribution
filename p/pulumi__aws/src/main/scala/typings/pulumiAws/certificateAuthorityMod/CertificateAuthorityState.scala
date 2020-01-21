package typings.pulumiAws.certificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
import typings.pulumiAws.inputMod.acmpca.CertificateAuthorityRevocationConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the certificate authority.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificate: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument containing algorithms and certificate subject information. Defined below.
    */
  val certificateAuthorityConfiguration: js.UndefOr[Input[CertificateAuthorityCertificateAuthorityConfiguration]] = js.native
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificateChain: js.UndefOr[Input[String]] = js.native
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  val certificateSigningRequest: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notAfter: js.UndefOr[Input[String]] = js.native
  /**
    * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notBefore: js.UndefOr[Input[String]] = js.native
  /**
    * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
    */
  val permanentDeletionTimeInDays: js.UndefOr[Input[Double]] = js.native
  /**
    * Nested argument containing revocation configuration. Defined below.
    */
  val revocationConfiguration: js.UndefOr[Input[CertificateAuthorityRevocationConfiguration]] = js.native
  /**
    * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
    */
  val serial: js.UndefOr[Input[String]] = js.native
  /**
    * Status of the certificate authority.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object CertificateAuthorityState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    certificate: Input[String] = null,
    certificateAuthorityConfiguration: Input[CertificateAuthorityCertificateAuthorityConfiguration] = null,
    certificateChain: Input[String] = null,
    certificateSigningRequest: Input[String] = null,
    enabled: Input[Boolean] = null,
    notAfter: Input[String] = null,
    notBefore: Input[String] = null,
    permanentDeletionTimeInDays: Input[Double] = null,
    revocationConfiguration: Input[CertificateAuthorityRevocationConfiguration] = null,
    serial: Input[String] = null,
    status: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    `type`: Input[String] = null
  ): CertificateAuthorityState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (certificateAuthorityConfiguration != null) __obj.updateDynamic("certificateAuthorityConfiguration")(certificateAuthorityConfiguration.asInstanceOf[js.Any])
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (certificateSigningRequest != null) __obj.updateDynamic("certificateSigningRequest")(certificateSigningRequest.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    if (permanentDeletionTimeInDays != null) __obj.updateDynamic("permanentDeletionTimeInDays")(permanentDeletionTimeInDays.asInstanceOf[js.Any])
    if (revocationConfiguration != null) __obj.updateDynamic("revocationConfiguration")(revocationConfiguration.asInstanceOf[js.Any])
    if (serial != null) __obj.updateDynamic("serial")(serial.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityState]
  }
}

