package typings
package atPulumiAwsLib.xraySamplingRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingRuleArgs extends js.Object {
  /**
    * Matches attributes derived from the request.
    */
  val attributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  val fixedRate: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * Matches the hostname from a request URL.
    */
  val host: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Matches the HTTP method of a request.
    */
  val httpMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The priority of the sampling rule.
    */
  val priority: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  val reservoirSize: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  val resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the sampling rule.
    */
  val ruleName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Matches the `name` that the service uses to identify itself in segments.
    */
  val serviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Matches the `origin` that the service uses to identify its type in segments.
    */
  val serviceType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Matches the path from a request URL.
    */
  val urlPath: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The version of the sampling rule format (`1` )
    */
  val version: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object SamplingRuleArgs {
  @scala.inline
  def apply(
    fixedRate: atPulumiPulumiLib.outputMod.Input[scala.Double],
    host: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    httpMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    priority: atPulumiPulumiLib.outputMod.Input[scala.Double],
    reservoirSize: atPulumiPulumiLib.outputMod.Input[scala.Double],
    resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    serviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    serviceType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    urlPath: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    version: atPulumiPulumiLib.outputMod.Input[scala.Double],
    attributes: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    ruleName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): SamplingRuleArgs = {
    val __obj = js.Dynamic.literal(fixedRate = fixedRate.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], reservoirSize = reservoirSize.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRuleArgs]
  }
}

