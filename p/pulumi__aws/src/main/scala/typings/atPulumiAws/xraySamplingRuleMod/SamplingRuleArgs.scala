package typings.atPulumiAws.xraySamplingRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingRuleArgs extends js.Object {
  /**
    * Matches attributes derived from the request.
    */
  val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  val fixedRate: Input[Double] = js.native
  /**
    * Matches the hostname from a request URL.
    */
  val host: Input[String] = js.native
  /**
    * Matches the HTTP method of a request.
    */
  val httpMethod: Input[String] = js.native
  /**
    * The priority of the sampling rule.
    */
  val priority: Input[Double] = js.native
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  val reservoirSize: Input[Double] = js.native
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  val resourceArn: Input[String] = js.native
  /**
    * The name of the sampling rule.
    */
  val ruleName: js.UndefOr[Input[String]] = js.native
  /**
    * Matches the `name` that the service uses to identify itself in segments.
    */
  val serviceName: Input[String] = js.native
  /**
    * Matches the `origin` that the service uses to identify its type in segments.
    */
  val serviceType: Input[String] = js.native
  /**
    * Matches the path from a request URL.
    */
  val urlPath: Input[String] = js.native
  /**
    * The version of the sampling rule format (`1` )
    */
  val version: Input[Double] = js.native
}

object SamplingRuleArgs {
  @scala.inline
  def apply(
    fixedRate: Input[Double],
    host: Input[String],
    httpMethod: Input[String],
    priority: Input[Double],
    reservoirSize: Input[Double],
    resourceArn: Input[String],
    serviceName: Input[String],
    serviceType: Input[String],
    urlPath: Input[String],
    version: Input[Double],
    attributes: Input[StringDictionary[Input[String]]] = null,
    ruleName: Input[String] = null
  ): SamplingRuleArgs = {
    val __obj = js.Dynamic.literal(fixedRate = fixedRate.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], reservoirSize = reservoirSize.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRuleArgs]
  }
}

