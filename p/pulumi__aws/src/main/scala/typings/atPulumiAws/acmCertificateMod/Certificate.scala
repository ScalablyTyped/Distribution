package typings.atPulumiAws.acmCertificateMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.acm.CertificateDomainValidationOption
import typings.atPulumiAws.typesOutputMod.acm.CertificateOptions
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/acm/certificate", "Certificate")
@js.native
class Certificate protected () extends CustomResource {
  /**
    * Create a Certificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: CertificateArgs) = this()
  def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the certificate
    */
  val arn: Output[String] = js.native
  /**
    * ARN of an ACMPCA
    */
  val certificateAuthorityArn: Output[js.UndefOr[String]] = js.native
  /**
    * The certificate's PEM-formatted public key
    */
  val certificateBody: Output[js.UndefOr[String]] = js.native
  /**
    * The certificate's PEM-formatted chain
    * * Creating a private CA issued certificate
    */
  val certificateChain: Output[js.UndefOr[String]] = js.native
  /**
    * A domain name for which the certificate should be issued
    */
  val domainName: Output[String] = js.native
  /**
    * A list of attributes to feed into other resources to complete certificate validation. Can have more than one element, e.g. if SANs are defined. Only set if `DNS`-validation was used.
    */
  val domainValidationOptions: Output[js.Array[CertificateDomainValidationOption]] = js.native
  val options: Output[js.UndefOr[CertificateOptions]] = js.native
  /**
    * The certificate's PEM-formatted private key
    */
  val privateKey: Output[js.UndefOr[String]] = js.native
  /**
    * A list of domains that should be SANs in the issued certificate
    */
  val subjectAlternativeNames: Output[js.Array[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
    */
  val validationEmails: Output[js.Array[String]] = js.native
  /**
    * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into state managed by this provider.
    * * Importing an existing certificate
    */
  val validationMethod: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/acm/certificate", "Certificate")
@js.native
object Certificate extends js.Object {
  /**
    * Get an existing Certificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Certificate = js.native
  def get(name: String, id: Input[ID], state: CertificateState): Certificate = js.native
  def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): Certificate = js.native
  /**
    * Returns true if the given object is an instance of Certificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificate.Certificate */ Boolean = js.native
}

