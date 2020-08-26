package typings.pulumiAws.certificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
import typings.pulumiAws.outputMod.acmpca.CertificateAuthorityRevocationConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/acmpca/certificateAuthority", "CertificateAuthority")
@js.native
class CertificateAuthority protected () extends CustomResource {
  /**
    * Create a CertificateAuthority resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CertificateAuthorityArgs) = this()
  def this(name: String, args: CertificateAuthorityArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the certificate authority.
    */
  val arn: Output_[String] = js.native
  /**
    * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificate: Output_[String] = js.native
  /**
    * Nested argument containing algorithms and certificate subject information. Defined below.
    */
  val certificateAuthorityConfiguration: Output_[CertificateAuthorityCertificateAuthorityConfiguration] = js.native
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificateChain: Output_[String] = js.native
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  val certificateSigningRequest: Output_[String] = js.native
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notAfter: Output_[String] = js.native
  /**
    * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notBefore: Output_[String] = js.native
  /**
    * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
    */
  val permanentDeletionTimeInDays: Output_[js.UndefOr[Double]] = js.native
  /**
    * Nested argument containing revocation configuration. Defined below.
    */
  val revocationConfiguration: Output_[js.UndefOr[CertificateAuthorityRevocationConfiguration]] = js.native
  /**
    * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
    */
  val serial: Output_[String] = js.native
  /**
    * Status of the certificate authority.
    */
  val status: Output_[String] = js.native
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
    */
  val `type`: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/acmpca/certificateAuthority", "CertificateAuthority")
@js.native
object CertificateAuthority extends js.Object {
  /**
    * Get an existing CertificateAuthority resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CertificateAuthority = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CertificateAuthority = js.native
  def get(name: String, id: Input[ID], state: CertificateAuthorityState): CertificateAuthority = js.native
  def get(name: String, id: Input[ID], state: CertificateAuthorityState, opts: CustomResourceOptions): CertificateAuthority = js.native
  /**
    * Returns true if the given object is an instance of CertificateAuthority.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acmpca/certificateAuthority.CertificateAuthority */ Boolean = js.native
}

