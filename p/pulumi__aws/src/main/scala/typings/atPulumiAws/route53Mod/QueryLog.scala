package typings.atPulumiAws.route53Mod

import typings.atPulumiAws.route53QueryLogMod.QueryLogArgs
import typings.atPulumiAws.route53QueryLogMod.QueryLogState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53", "QueryLog")
@js.native
class QueryLog protected ()
  extends typings.atPulumiAws.route53QueryLogMod.QueryLog {
  /**
    * Create a QueryLog resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: QueryLogArgs) = this()
  def this(name: String, args: QueryLogArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/route53", "QueryLog")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.route53QueryLogMod.QueryLog = js.native
  def get(name: String, id: Input[ID], state: QueryLogState): typings.atPulumiAws.route53QueryLogMod.QueryLog = js.native
  def get(name: String, id: Input[ID], state: QueryLogState, opts: CustomResourceOptions): typings.atPulumiAws.route53QueryLogMod.QueryLog = js.native
  /**
    * Returns true if the given object is an instance of QueryLog.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean = js.native
}

