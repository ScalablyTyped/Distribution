package typings.pulumiAws.kinesisMod

import typings.pulumiAws.analyticsApplicationMod.AnalyticsApplicationArgs
import typings.pulumiAws.analyticsApplicationMod.AnalyticsApplicationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis", "AnalyticsApplication")
@js.native
class AnalyticsApplication protected ()
  extends typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication {
  /**
    * Create a AnalyticsApplication resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AnalyticsApplicationArgs) = this()
  def this(name: String, args: AnalyticsApplicationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/kinesis", "AnalyticsApplication")
@js.native
object AnalyticsApplication extends js.Object {
  /**
    * Get an existing AnalyticsApplication resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = js.native
  def get(name: String, id: Input[ID], state: AnalyticsApplicationState): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = js.native
  def get(name: String, id: Input[ID], state: AnalyticsApplicationState, opts: CustomResourceOptions): typings.pulumiAws.analyticsApplicationMod.AnalyticsApplication = js.native
  /**
    * Returns true if the given object is an instance of AnalyticsApplication.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/analyticsApplication.AnalyticsApplication */ Boolean = js.native
}

