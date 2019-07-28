package typings.atPulumiAws.acmpcaCertificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_CrlConfigurationAnonCustomCnameEnabled
import typings.atPulumiAws.Anon_KeyAlgorithmSigningAlgorithm
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthorityArgs extends js.Object {
  /**
    * Nested argument containing algorithms and certificate subject information. Defined below.
    */
  val certificateAuthorityConfiguration: Input[Anon_KeyAlgorithmSigningAlgorithm]
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
    */
  val permanentDeletionTimeInDays: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Nested argument containing revocation configuration. Defined below.
    */
  val revocationConfiguration: js.UndefOr[Input[Anon_CrlConfigurationAnonCustomCnameEnabled]] = js.undefined
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
    */
  val `type`: js.UndefOr[Input[String]] = js.undefined
}

object CertificateAuthorityArgs {
  @scala.inline
  def apply(
    certificateAuthorityConfiguration: Input[Anon_KeyAlgorithmSigningAlgorithm],
    enabled: Input[Boolean] = null,
    permanentDeletionTimeInDays: Input[Double] = null,
    revocationConfiguration: Input[Anon_CrlConfigurationAnonCustomCnameEnabled] = null,
    tags: Input[StringDictionary[_]] = null,
    `type`: Input[String] = null
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

