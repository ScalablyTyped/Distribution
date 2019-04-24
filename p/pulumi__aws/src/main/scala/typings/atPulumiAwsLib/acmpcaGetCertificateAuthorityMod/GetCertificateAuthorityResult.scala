package typings
package atPulumiAwsLib.acmpcaGetCertificateAuthorityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateAuthorityResult extends js.Object {
  val arn: java.lang.String
  /**
    * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificate: java.lang.String
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificateChain: java.lang.String
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  val certificateSigningRequest: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notAfter: java.lang.String
  /**
    * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notBefore: java.lang.String
  /**
    * Nested attribute containing revocation configuration.
    * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
    * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
    * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
    * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
    * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
    */
  val revocationConfigurations: js.Array[
    atPulumiAwsLib.Anon_CrlConfigurationsAnonCustomCnameEnabledExpirationInDaysS3BucketName
  ]
  /**
    * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
    */
  val serial: java.lang.String
  /**
    * Status of the certificate authority.
    */
  val status: java.lang.String
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The type of the certificate authority.
    */
  val `type`: java.lang.String
}

object GetCertificateAuthorityResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    certificate: java.lang.String,
    certificateChain: java.lang.String,
    certificateSigningRequest: java.lang.String,
    id: java.lang.String,
    notAfter: java.lang.String,
    notBefore: java.lang.String,
    revocationConfigurations: js.Array[
      atPulumiAwsLib.Anon_CrlConfigurationsAnonCustomCnameEnabledExpirationInDaysS3BucketName
    ],
    serial: java.lang.String,
    status: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    `type`: java.lang.String
  ): GetCertificateAuthorityResult = {
    val __obj = js.Dynamic.literal(arn = arn, certificate = certificate, certificateChain = certificateChain, certificateSigningRequest = certificateSigningRequest, id = id, notAfter = notAfter, notBefore = notBefore, revocationConfigurations = revocationConfigurations, serial = serial, status = status, tags = tags)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetCertificateAuthorityResult]
  }
}

