package typings.atPulumiAws.route53RecordMod

import typings.atPulumiAws.Anon_ContinentCountry
import typings.atPulumiAws.Anon_EvaluateTargetHealthName
import typings.atPulumiAws.Anon_RegionInput
import typings.atPulumiAws.Anon_TypeInputString
import typings.atPulumiAws.Anon_WeightInput
import typings.atPulumiAws.route53RecordTypeMod.RecordType
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordArgs extends js.Object {
  /**
    * An alias block. Conflicts with `ttl` & `records`.
    * Alias record documented below.
    */
  val aliases: js.UndefOr[Input[js.Array[Input[Anon_EvaluateTargetHealthName]]]] = js.undefined
  val allowOverwrite: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
    */
  val failoverRoutingPolicies: js.UndefOr[Input[js.Array[Input[Anon_TypeInputString]]]] = js.undefined
  /**
    * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
    */
  val geolocationRoutingPolicies: js.UndefOr[Input[js.Array[Input[Anon_ContinentCountry]]]] = js.undefined
  /**
    * The health check the record should be associated with.
    */
  val healthCheckId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
    */
  val latencyRoutingPolicies: js.UndefOr[Input[js.Array[Input[Anon_RegionInput]]]] = js.undefined
  /**
    * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
    */
  val multivalueAnswerRoutingPolicy: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  val records: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, or `weighted` routing policies documented below.
    */
  val setIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The TTL of the record.
    */
  val ttl: js.UndefOr[Input[Double]] = js.undefined
  /**
    * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
    */
  val `type`: Input[String | RecordType]
  /**
    * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
    */
  val weightedRoutingPolicies: js.UndefOr[Input[js.Array[Input[Anon_WeightInput]]]] = js.undefined
  /**
    * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See [`resource_elb.zone_id`](https://www.terraform.io/docs/providers/aws/r/elb.html#zone_id) for example.
    */
  val zoneId: Input[String]
}

object RecordArgs {
  @scala.inline
  def apply(
    `type`: Input[String | RecordType],
    zoneId: Input[String],
    aliases: Input[js.Array[Input[Anon_EvaluateTargetHealthName]]] = null,
    allowOverwrite: Input[Boolean] = null,
    failoverRoutingPolicies: Input[js.Array[Input[Anon_TypeInputString]]] = null,
    geolocationRoutingPolicies: Input[js.Array[Input[Anon_ContinentCountry]]] = null,
    healthCheckId: Input[String] = null,
    latencyRoutingPolicies: Input[js.Array[Input[Anon_RegionInput]]] = null,
    multivalueAnswerRoutingPolicy: Input[Boolean] = null,
    name: Input[String] = null,
    records: Input[js.Array[Input[String]]] = null,
    setIdentifier: Input[String] = null,
    ttl: Input[Double] = null,
    weightedRoutingPolicies: Input[js.Array[Input[Anon_WeightInput]]] = null
  ): RecordArgs = {
    val __obj = js.Dynamic.literal(zoneId = zoneId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (allowOverwrite != null) __obj.updateDynamic("allowOverwrite")(allowOverwrite.asInstanceOf[js.Any])
    if (failoverRoutingPolicies != null) __obj.updateDynamic("failoverRoutingPolicies")(failoverRoutingPolicies.asInstanceOf[js.Any])
    if (geolocationRoutingPolicies != null) __obj.updateDynamic("geolocationRoutingPolicies")(geolocationRoutingPolicies.asInstanceOf[js.Any])
    if (healthCheckId != null) __obj.updateDynamic("healthCheckId")(healthCheckId.asInstanceOf[js.Any])
    if (latencyRoutingPolicies != null) __obj.updateDynamic("latencyRoutingPolicies")(latencyRoutingPolicies.asInstanceOf[js.Any])
    if (multivalueAnswerRoutingPolicy != null) __obj.updateDynamic("multivalueAnswerRoutingPolicy")(multivalueAnswerRoutingPolicy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    if (setIdentifier != null) __obj.updateDynamic("setIdentifier")(setIdentifier.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (weightedRoutingPolicies != null) __obj.updateDynamic("weightedRoutingPolicies")(weightedRoutingPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordArgs]
  }
}

