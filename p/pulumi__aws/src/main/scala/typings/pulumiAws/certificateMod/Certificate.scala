package typings.pulumiAws.certificateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.acm.CertificateDomainValidationOption
import typings.pulumiAws.outputMod.acm.CertificateOptions
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the certificate
    */
  val arn: Output_[String] = js.native
  
  /**
    * ARN of an ACMPCA
    */
  val certificateAuthorityArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The certificate's PEM-formatted public key
    */
  val certificateBody: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The certificate's PEM-formatted chain
    * * Creating a private CA issued certificate
    */
  val certificateChain: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A domain name for which the certificate should be issued
    */
  val domainName: Output_[String] = js.native
  
  /**
    * Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g. if SANs are defined. Only set if `DNS`-validation was used.
    */
  val domainValidationOptions: Output_[js.Array[CertificateDomainValidationOption]] = js.native
  
  /**
    * Configuration block used to set certificate options. Detailed below.
    * * Importing an existing certificate
    */
  val options: Output_[js.UndefOr[CertificateOptions]] = js.native
  
  /**
    * The certificate's PEM-formatted private key
    */
  val privateKey: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Status of the certificate.
    */
  val status: Output_[String] = js.native
  
  /**
    * Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`) to trigger recreation.
    */
  val subjectAlternativeNames: Output_[js.Array[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
    */
  val validationEmails: Output_[js.Array[String]] = js.native
  
  /**
    * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
    */
  val validationMethod: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Certificate = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Certificate = js.native
  def get(name: String, id: Input[ID], state: CertificateState): Certificate = js.native
  def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): Certificate = js.native
  
  /**
    * Returns true if the given object is an instance of Certificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificate.Certificate */ Boolean = js.native
}
