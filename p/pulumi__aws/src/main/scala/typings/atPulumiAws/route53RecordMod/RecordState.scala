package typings.atPulumiAws.route53RecordMod

import typings.atPulumiAws.route53RecordTypeMod.RecordType
import typings.atPulumiAws.typesInputMod.route53.RecordAlias
import typings.atPulumiAws.typesInputMod.route53.RecordFailoverRoutingPolicy
import typings.atPulumiAws.typesInputMod.route53.RecordGeolocationRoutingPolicy
import typings.atPulumiAws.typesInputMod.route53.RecordLatencyRoutingPolicy
import typings.atPulumiAws.typesInputMod.route53.RecordWeightedRoutingPolicy
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordState extends js.Object {
  /**
    * An alias block. Conflicts with `ttl` & `records`.
    * Alias record documented below.
    */
  val aliases: js.UndefOr[Input[js.Array[Input[RecordAlias]]]] = js.undefined
  /**
    * Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
    */
  val allowOverwrite: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
    */
  val failoverRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordFailoverRoutingPolicy]]]] = js.undefined
  /**
    * [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
    */
  val fqdn: js.UndefOr[Input[String]] = js.undefined
  /**
    * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
    */
  val geolocationRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordGeolocationRoutingPolicy]]]] = js.undefined
  /**
    * The health check the record should be associated with.
    */
  val healthCheckId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
    */
  val latencyRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordLatencyRoutingPolicy]]]] = js.undefined
  /**
    * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
    */
  val multivalueAnswerRoutingPolicy: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\"\"` inside the configuration string (e.g. `"first255characters\"\"morecharacters"`).
    */
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
  val `type`: js.UndefOr[Input[String | RecordType]] = js.undefined
  /**
    * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
    */
  val weightedRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordWeightedRoutingPolicy]]]] = js.undefined
  /**
    * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See [`resource_elb.zone_id`](https://www.terraform.io/docs/providers/aws/r/elb.html#zone_id) for example.
    */
  val zoneId: js.UndefOr[Input[String]] = js.undefined
}

object RecordState {
  @scala.inline
  def apply(
    aliases: Input[js.Array[Input[RecordAlias]]] = null,
    allowOverwrite: Input[Boolean] = null,
    failoverRoutingPolicies: Input[js.Array[Input[RecordFailoverRoutingPolicy]]] = null,
    fqdn: Input[String] = null,
    geolocationRoutingPolicies: Input[js.Array[Input[RecordGeolocationRoutingPolicy]]] = null,
    healthCheckId: Input[String] = null,
    latencyRoutingPolicies: Input[js.Array[Input[RecordLatencyRoutingPolicy]]] = null,
    multivalueAnswerRoutingPolicy: Input[Boolean] = null,
    name: Input[String] = null,
    records: Input[js.Array[Input[String]]] = null,
    setIdentifier: Input[String] = null,
    ttl: Input[Double] = null,
    `type`: Input[String | RecordType] = null,
    weightedRoutingPolicies: Input[js.Array[Input[RecordWeightedRoutingPolicy]]] = null,
    zoneId: Input[String] = null
  ): RecordState = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (allowOverwrite != null) __obj.updateDynamic("allowOverwrite")(allowOverwrite.asInstanceOf[js.Any])
    if (failoverRoutingPolicies != null) __obj.updateDynamic("failoverRoutingPolicies")(failoverRoutingPolicies.asInstanceOf[js.Any])
    if (fqdn != null) __obj.updateDynamic("fqdn")(fqdn.asInstanceOf[js.Any])
    if (geolocationRoutingPolicies != null) __obj.updateDynamic("geolocationRoutingPolicies")(geolocationRoutingPolicies.asInstanceOf[js.Any])
    if (healthCheckId != null) __obj.updateDynamic("healthCheckId")(healthCheckId.asInstanceOf[js.Any])
    if (latencyRoutingPolicies != null) __obj.updateDynamic("latencyRoutingPolicies")(latencyRoutingPolicies.asInstanceOf[js.Any])
    if (multivalueAnswerRoutingPolicy != null) __obj.updateDynamic("multivalueAnswerRoutingPolicy")(multivalueAnswerRoutingPolicy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    if (setIdentifier != null) __obj.updateDynamic("setIdentifier")(setIdentifier.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (weightedRoutingPolicies != null) __obj.updateDynamic("weightedRoutingPolicies")(weightedRoutingPolicies.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordState]
  }
}

