package typings.pulumiAws.recordMod

import typings.pulumiAws.enumsRoute53Mod.RecordType
import typings.pulumiAws.inputMod.route53.RecordAlias
import typings.pulumiAws.inputMod.route53.RecordFailoverRoutingPolicy
import typings.pulumiAws.inputMod.route53.RecordGeolocationRoutingPolicy
import typings.pulumiAws.inputMod.route53.RecordLatencyRoutingPolicy
import typings.pulumiAws.inputMod.route53.RecordWeightedRoutingPolicy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordState extends js.Object {
  
  /**
    * An alias block. Conflicts with `ttl` & `records`.
    * Alias record documented below.
    */
  val aliases: js.UndefOr[Input[js.Array[Input[RecordAlias]]]] = js.native
  
  /**
    * Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
    */
  val allowOverwrite: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
    */
  val failoverRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordFailoverRoutingPolicy]]]] = js.native
  
  /**
    * [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
    */
  val fqdn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
    */
  val geolocationRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordGeolocationRoutingPolicy]]]] = js.native
  
  /**
    * The health check the record should be associated with.
    */
  val healthCheckId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
    */
  val latencyRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordLatencyRoutingPolicy]]]] = js.native
  
  /**
    * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
    */
  val multivalueAnswerRoutingPolicy: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\"\"` inside the configuration string (e.g. `"first255characters\"\"morecharacters"`).
    */
  val records: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, or `weighted` routing policies documented below.
    */
  val setIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The TTL of the record.
    */
  val ttl: js.UndefOr[Input[Double]] = js.native
  
  /**
    * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
    */
  val `type`: js.UndefOr[Input[String | RecordType]] = js.native
  
  /**
    * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
    */
  val weightedRoutingPolicies: js.UndefOr[Input[js.Array[Input[RecordWeightedRoutingPolicy]]]] = js.native
  
  /**
    * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}
object RecordState {
  
  @scala.inline
  def apply(): RecordState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordState]
  }
  
  @scala.inline
  implicit class RecordStateOps[Self <: RecordState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAliasesVarargs(value: Input[RecordAlias]*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: Input[js.Array[Input[RecordAlias]]]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setAllowOverwrite(value: Input[Boolean]): Self = this.set("allowOverwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOverwrite: Self = this.set("allowOverwrite", js.undefined)
    
    @scala.inline
    def setFailoverRoutingPoliciesVarargs(value: Input[RecordFailoverRoutingPolicy]*): Self = this.set("failoverRoutingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setFailoverRoutingPolicies(value: Input[js.Array[Input[RecordFailoverRoutingPolicy]]]): Self = this.set("failoverRoutingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailoverRoutingPolicies: Self = this.set("failoverRoutingPolicies", js.undefined)
    
    @scala.inline
    def setFqdn(value: Input[String]): Self = this.set("fqdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFqdn: Self = this.set("fqdn", js.undefined)
    
    @scala.inline
    def setGeolocationRoutingPoliciesVarargs(value: Input[RecordGeolocationRoutingPolicy]*): Self = this.set("geolocationRoutingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setGeolocationRoutingPolicies(value: Input[js.Array[Input[RecordGeolocationRoutingPolicy]]]): Self = this.set("geolocationRoutingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeolocationRoutingPolicies: Self = this.set("geolocationRoutingPolicies", js.undefined)
    
    @scala.inline
    def setHealthCheckId(value: Input[String]): Self = this.set("healthCheckId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckId: Self = this.set("healthCheckId", js.undefined)
    
    @scala.inline
    def setLatencyRoutingPoliciesVarargs(value: Input[RecordLatencyRoutingPolicy]*): Self = this.set("latencyRoutingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setLatencyRoutingPolicies(value: Input[js.Array[Input[RecordLatencyRoutingPolicy]]]): Self = this.set("latencyRoutingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatencyRoutingPolicies: Self = this.set("latencyRoutingPolicies", js.undefined)
    
    @scala.inline
    def setMultivalueAnswerRoutingPolicy(value: Input[Boolean]): Self = this.set("multivalueAnswerRoutingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultivalueAnswerRoutingPolicy: Self = this.set("multivalueAnswerRoutingPolicy", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRecordsVarargs(value: Input[String]*): Self = this.set("records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: Input[js.Array[Input[String]]]): Self = this.set("records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecords: Self = this.set("records", js.undefined)
    
    @scala.inline
    def setSetIdentifier(value: Input[String]): Self = this.set("setIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetIdentifier: Self = this.set("setIdentifier", js.undefined)
    
    @scala.inline
    def setTtl(value: Input[Double]): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setType(value: Input[String | RecordType]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWeightedRoutingPoliciesVarargs(value: Input[RecordWeightedRoutingPolicy]*): Self = this.set("weightedRoutingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setWeightedRoutingPolicies(value: Input[js.Array[Input[RecordWeightedRoutingPolicy]]]): Self = this.set("weightedRoutingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightedRoutingPolicies: Self = this.set("weightedRoutingPolicies", js.undefined)
    
    @scala.inline
    def setZoneId(value: Input[String]): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
}
