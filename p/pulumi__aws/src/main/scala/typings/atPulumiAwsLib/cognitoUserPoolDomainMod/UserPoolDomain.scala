package typings
package atPulumiAwsLib.cognitoUserPoolDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain")
@js.native
class UserPoolDomain protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a UserPoolDomain resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: UserPoolDomainArgs) = this()
  def this(name: java.lang.String, args: UserPoolDomainArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The AWS account ID for the user pool owner.
    */
  val awsAccountId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
    */
  val certificateArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ARN of the CloudFront distribution.
    */
  val cloudfrontDistributionArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The domain string.
    */
  val domain: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The S3 bucket where the static files for this domain are stored.
    */
  val s3Bucket: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The user pool ID.
    */
  val userPoolId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The app version.
    */
  val version: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain")
@js.native
object UserPoolDomain extends js.Object {
  /**
    * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomain = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomainState
  ): atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomain = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomainState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomain = js.native
}

