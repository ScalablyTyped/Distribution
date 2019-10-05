package typings.atPulumiAws.route53RecordMod

import typings.atPulumiAws.typesOutputMod.route53.RecordAlias
import typings.atPulumiAws.typesOutputMod.route53.RecordFailoverRoutingPolicy
import typings.atPulumiAws.typesOutputMod.route53.RecordGeolocationRoutingPolicy
import typings.atPulumiAws.typesOutputMod.route53.RecordLatencyRoutingPolicy
import typings.atPulumiAws.typesOutputMod.route53.RecordWeightedRoutingPolicy
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/record", "Record")
@js.native
class Record protected () extends CustomResource {
  /**
    * Create a Record resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RecordArgs) = this()
  def this(name: String, args: RecordArgs, opts: CustomResourceOptions) = this()
  /**
    * An alias block. Conflicts with `ttl` & `records`.
    * Alias record documented below.
    */
  val aliases: Output[js.UndefOr[js.Array[RecordAlias]]] = js.native
  /**
    * Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
    */
  val allowOverwrite: Output[Boolean] = js.native
  /**
    * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
    */
  val failoverRoutingPolicies: Output[js.UndefOr[js.Array[RecordFailoverRoutingPolicy]]] = js.native
  /**
    * [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
    */
  val fqdn: Output[String] = js.native
  /**
    * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
    */
  val geolocationRoutingPolicies: Output[js.UndefOr[js.Array[RecordGeolocationRoutingPolicy]]] = js.native
  /**
    * The health check the record should be associated with.
    */
  val healthCheckId: Output[js.UndefOr[String]] = js.native
  /**
    * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
    */
  val latencyRoutingPolicies: Output[js.UndefOr[js.Array[RecordLatencyRoutingPolicy]]] = js.native
  /**
    * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
    */
  val multivalueAnswerRoutingPolicy: Output[js.UndefOr[Boolean]] = js.native
  /**
    * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
    */
  val name: Output[String] = js.native
  /**
    * A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\"\"` inside the configuration string (e.g. `"first255characters\"\"morecharacters"`).
    */
  val records: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, or `weighted` routing policies documented below.
    */
  val setIdentifier: Output[js.UndefOr[String]] = js.native
  /**
    * The TTL of the record.
    */
  val ttl: Output[js.UndefOr[Double]] = js.native
  /**
    * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
    */
  val `type`: Output[String] = js.native
  /**
    * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
    */
  val weightedRoutingPolicies: Output[js.UndefOr[js.Array[RecordWeightedRoutingPolicy]]] = js.native
  /**
    * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See [`resource_elb.zone_id`](https://www.terraform.io/docs/providers/aws/r/elb.html#zone_id) for example.
    */
  val zoneId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/route53/record", "Record")
@js.native
object Record extends js.Object {
  /**
    * Get an existing Record resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Record = js.native
  def get(name: String, id: Input[ID], state: RecordState): Record = js.native
  def get(name: String, id: Input[ID], state: RecordState, opts: CustomResourceOptions): Record = js.native
  /**
    * Returns true if the given object is an instance of Record.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/record.Record */ Boolean = js.native
}

