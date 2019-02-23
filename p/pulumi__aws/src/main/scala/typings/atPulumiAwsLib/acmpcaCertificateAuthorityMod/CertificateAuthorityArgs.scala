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

