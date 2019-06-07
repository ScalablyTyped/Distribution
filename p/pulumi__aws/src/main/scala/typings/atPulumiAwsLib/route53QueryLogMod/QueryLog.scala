package typings
package atPulumiAwsLib.route53QueryLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/queryLog", "QueryLog")
@js.native
class QueryLog protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a QueryLog resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: QueryLogArgs) = this()
  def this(name: java.lang.String, args: QueryLogArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * CloudWatch log group ARN to send query logs.
    */
  val cloudwatchLogGroupArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Route53 hosted zone ID to enable query logs.
    */
  val zoneId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/route53/queryLog", "QueryLog")
@js.native
object QueryLog extends js.Object {
  /**
    * Get an existing QueryLog resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53QueryLogMod.QueryLog = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53QueryLogMod.QueryLogState
  ): atPulumiAwsLib.route53QueryLogMod.QueryLog = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53QueryLogMod.QueryLogState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.route53QueryLogMod.QueryLog = js.native
  /**
    * Returns true if the given object is an instance of QueryLog.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ scala.Boolean = js.native
}

