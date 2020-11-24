package typings.pulumiAws.resolverQueryLogConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53/resolverQueryLogConfig", "ResolverQueryLogConfig")
@js.native
class ResolverQueryLogConfig protected () extends CustomResource {
  /**
    * Create a ResolverQueryLogConfig resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResolverQueryLogConfigArgs) = this()
  def this(name: String, args: ResolverQueryLogConfigArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN (Amazon Resource Name) of the Route 53 Resolver query logging configuration.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The ARN of the resource that you want Route 53 Resolver to send query logs.
    * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
    */
  val destinationArn: Output_[String] = js.native
  
  /**
    * The name of the Route 53 Resolver query logging configuration.
    */
  val name: Output_[String] = js.native
  
  /**
    * The AWS account ID of the account that created the query logging configuration.
    */
  val ownerId: Output_[String] = js.native
  
  /**
    * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account.
    * Sharing is configured through AWS Resource Access Manager (AWS RAM).
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/route53/resolverQueryLogConfig", "ResolverQueryLogConfig")
@js.native
object ResolverQueryLogConfig extends js.Object {
  
  /**
    * Get an existing ResolverQueryLogConfig resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ResolverQueryLogConfig = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResolverQueryLogConfig = js.native
  def get(name: String, id: Input[ID], state: ResolverQueryLogConfigState): ResolverQueryLogConfig = js.native
  def get(name: String, id: Input[ID], state: ResolverQueryLogConfigState, opts: CustomResourceOptions): ResolverQueryLogConfig = js.native
  
  /**
    * Returns true if the given object is an instance of ResolverQueryLogConfig.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfig.ResolverQueryLogConfig */ Boolean = js.native
}
