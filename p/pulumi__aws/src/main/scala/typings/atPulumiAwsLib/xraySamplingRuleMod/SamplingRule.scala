package typings
package atPulumiAwsLib.xraySamplingRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/xray/samplingRule", "SamplingRule")
@js.native
class SamplingRule protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a SamplingRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SamplingRuleArgs) = this()
  def this(name: java.lang.String, args: SamplingRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the sampling rule.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Matches attributes derived from the request.
    */
  val attributes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  val fixedRate: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Matches the hostname from a request URL.
    */
  val host: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Matches the HTTP method of a request.
    */
  val httpMethod: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The priority of the sampling rule.
    */
  val priority: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  val reservoirSize: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  val resourceArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the sampling rule.
    */
  val ruleName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Matches the `name` that the service uses to identify itself in segments.
    */
  val serviceName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Matches the `origin` that the service uses to identify its type in segments.
    */
  val serviceType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Matches the path from a request URL.
    */
  val urlPath: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The version of the sampling rule format (`1` )
    */
  val version: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.xraySamplingRuleMod.SamplingRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.xraySamplingRuleMod.SamplingRuleState
  ): atPulumiAwsLib.xraySamplingRuleMod.SamplingRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.xraySamplingRuleMod.SamplingRuleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.xraySamplingRuleMod.SamplingRule = js.native
}

