package typings.atPulumiAws.cloudwatchLogMetricFilterMod

import typings.atPulumiAws.typesOutputMod.cloudwatchNs.LogMetricFilterMetricTransformation
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter")
@js.native
class LogMetricFilter protected () extends CustomResource {
  /**
    * Create a LogMetricFilter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogMetricFilterArgs) = this()
  def this(name: String, args: LogMetricFilterArgs, opts: CustomResourceOptions) = this()
  /**
    * The name of the log group to associate the metric filter with.
    */
  val logGroupName: Output[String] = js.native
  /**
    * A block defining collection of information
    * needed to define how metric data gets emitted. See below.
    */
  val metricTransformation: Output[LogMetricFilterMetricTransformation] = js.native
  /**
    * A name for the metric filter.
    */
  val name: Output[String] = js.native
  /**
    * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
    * for extracting metric data out of ingested log events.
    */
  val pattern: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter")
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
  def get(name: String, id: Input[ID]): LogMetricFilter = js.native
  def get(name: String, id: Input[ID], state: LogMetricFilterState): LogMetricFilter = js.native
  def get(name: String, id: Input[ID], state: LogMetricFilterState, opts: CustomResourceOptions): LogMetricFilter = js.native
  /**
    * Returns true if the given object is an instance of LogMetricFilter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logMetricFilter.LogMetricFilter */ Boolean = js.native
}

