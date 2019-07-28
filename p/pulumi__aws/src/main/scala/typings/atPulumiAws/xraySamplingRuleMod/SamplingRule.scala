package typings.atPulumiAws.xraySamplingRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/xray/samplingRule", "SamplingRule")
@js.native
class SamplingRule protected () extends CustomResource {
  /**
    * Create a SamplingRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SamplingRuleArgs) = this()
  def this(name: String, args: SamplingRuleArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the sampling rule.
    */
  val arn: Output[String] = js.native
  /**
    * Matches attributes derived from the request.
    */
  val attributes: Output[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  val fixedRate: Output[Double] = js.native
  /**
    * Matches the hostname from a request URL.
    */
  val host: Output[String] = js.native
  /**
    * Matches the HTTP method of a request.
    */
  val httpMethod: Output[String] = js.native
  /**
    * The priority of the sampling rule.
    */
  val priority: Output[Double] = js.native
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  val reservoirSize: Output[Double] = js.native
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  val resourceArn: Output[String] = js.native
  /**
    * The name of the sampling rule.
    */
  val ruleName: Output[js.UndefOr[String]] = js.native
  /**
    * Matches the `name` that the service uses to identify itself in segments.
    */
  val serviceName: Output[String] = js.native
  /**
    * Matches the `origin` that the service uses to identify its type in segments.
    */
  val serviceType: Output[String] = js.native
  /**
    * Matches the path from a request URL.
    */
  val urlPath: Output[String] = js.native
  /**
    * The version of the sampling rule format (`1` )
    */
  val version: Output[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/xray/samplingRule", "SamplingRule")
@js.native
object SamplingRule extends js.Object {
  /**
    * Get an existing SamplingRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SamplingRule = js.native
  def get(name: String, id: Input[ID], state: SamplingRuleState): SamplingRule = js.native
  def get(name: String, id: Input[ID], state: SamplingRuleState, opts: CustomResourceOptions): SamplingRule = js.native
  /**
    * Returns true if the given object is an instance of SamplingRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/samplingRule.SamplingRule */ Boolean = js.native
}

