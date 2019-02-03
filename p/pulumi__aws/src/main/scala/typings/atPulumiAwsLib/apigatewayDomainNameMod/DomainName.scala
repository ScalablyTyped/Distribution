package typings
package atPulumiAwsLib.apigatewayDomainNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/domainName", "DomainName")
@js.native
class DomainName protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a DomainName resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DomainNameArgs) = this()
  def this(name: java.lang.String, args: DomainNameArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificate_name`, `certificate_body`, `certificate_chain`, `certificate_private_key`, `regional_certificate_arn`, and `regional_certificate_name`.
    */
  val certificateArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The certificate issued for the domain name
    * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and
    * `regional_certificate_name`.
    */
  val certificateBody: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The certificate for the CA that issued the
    * certificate, along with any intermediate CA certificates required to
    * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`,
    * `regional_certificate_arn`, and `regional_certificate_name`.
    */
  val certificateChain: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The unique name to use when registering this
    * certificate as an IAM server certificate. Conflicts with `certificate_arn`, `regional_certificate_arn`, and
    * `regional_certificate_name`. Required if `certificate_arn` is not set.
    */
  val certificateName: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The private key associated with the
    * domain certificate given in `certificate_body`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
    */
  val certificatePrivateKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The upload date associated with the domain certificate.
    */
  val certificateUploadDate: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The hostname created by Cloudfront to represent
    * the distribution that implements this domain name mapping.
    */
  val cloudfrontDomainName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`)
    * that can be used to create a Route53 alias record for the distribution.
    */
  val cloudfrontZoneId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The fully-qualified domain name to register
    */
  val domainName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Configuration block defining API endpoint information including type. Defined below.
    */
  val endpointConfiguration: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_Types] = js.native
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and `certificate_private_key`.
    */
  val regionalCertificateArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and
    * `certificate_private_key`.
    */
  val regionalCertificateName: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The hostname for the custom domain's regional endpoint.
    */
  val regionalDomainName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
    */
  val regionalZoneId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/domainName", "DomainName")
@js.native
object DomainName extends js.Object {
  /**
    * Get an existing DomainName resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayDomainNameMod.DomainName = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayDomainNameMod.DomainNameState
  ): atPulumiAwsLib.apigatewayDomainNameMod.DomainName = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayDomainNameMod.DomainNameState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayDomainNameMod.DomainName = js.native
}

