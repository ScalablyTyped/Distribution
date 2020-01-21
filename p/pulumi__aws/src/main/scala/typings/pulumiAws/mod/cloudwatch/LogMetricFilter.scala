package typings.pulumiAws.mod.cloudwatch

import typings.pulumiAws.logMetricFilterMod.LogMetricFilterArgs
import typings.pulumiAws.logMetricFilterMod.LogMetricFilterState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.LogMetricFilter")
@js.native
class LogMetricFilter protected ()
  extends typings.pulumiAws.cloudwatchMod.LogMetricFilter {
  /**
    * Create a LogMetricFilter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogMetricFilterArgs) = this()
  def this(name: String, args: LogMetricFilterArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "cloudwatch.LogMetricFilter")
@js.native
object LogMetricFilter extends js.Object {
  /**
    * Get an existing LogMetricFilter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
  def get(name: String, id: Input[ID], state: LogMetricFilterState): typings.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
  def get(name: String, id: Input[ID], state: LogMetricFilterState, opts: CustomResourceOptions): typings.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
  /**
    * Returns true if the given object is an instance of LogMetricFilter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logMetricFilter.LogMetricFilter */ Boolean = js.native
}

