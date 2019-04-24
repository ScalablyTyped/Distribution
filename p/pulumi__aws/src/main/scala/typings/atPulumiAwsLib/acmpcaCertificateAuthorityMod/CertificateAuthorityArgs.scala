package typings
package atPulumiAwsLib.acmpcaCertificateAuthorityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthorityArgs extends js.Object {
  /**
    * Nested argument containing algorithms and certificate subject information. Defined below.
    */
  val certificateAuthorityConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyAlgorithmSigningAlgorithm]
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
    */
  val permanentDeletionTimeInDays: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Nested argument containing revocation configuration. Defined below.
    */
  val revocationConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CrlConfigurationAnonCustomCnameEnabled]
  ] = js.undefined
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The type of the certificate authority. Currently, this must be `SUBORDINATE`.
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object CertificateAuthorityArgs {
  @scala.inline
  def apply(
    certificateAuthorityConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyAlgorithmSigningAlgorithm],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    permanentDeletionTimeInDays: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    revocationConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CrlConfigurationAnonCustomCnameEnabled] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): CertificateAuthorityArgs = {
    val __obj = js.Dynamic.literal(certificateAuthorityConfiguration = certificateAuthorityConfiguration.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (permanentDeletionTimeInDays != null) __obj.updateDynamic("permanentDeletionTimeInDays")(permanentDeletionTimeInDays.asInstanceOf[js.Any])
    if (revocationConfiguration != null) __obj.updateDynamic("revocationConfiguration")(revocationConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityArgs]
  }
}

