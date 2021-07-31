package typings.pulumiAws

import typings.pulumiAws.enumsRoute53Mod.RecordType
import typings.pulumiAws.outputMod.route53.RecordAlias
import typings.pulumiAws.outputMod.route53.RecordFailoverRoutingPolicy
import typings.pulumiAws.outputMod.route53.RecordGeolocationRoutingPolicy
import typings.pulumiAws.outputMod.route53.RecordLatencyRoutingPolicy
import typings.pulumiAws.outputMod.route53.RecordWeightedRoutingPolicy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordMod {
  
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
    val aliases: Output_[js.UndefOr[js.Array[RecordAlias]]] = js.native
    
    /**
      * Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
      */
    val allowOverwrite: Output_[Boolean] = js.native
    
    /**
      * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
      */
    val failoverRoutingPolicies: Output_[js.UndefOr[js.Array[RecordFailoverRoutingPolicy]]] = js.native
    
    /**
      * [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
      */
    val fqdn: Output_[String] = js.native
    
    /**
      * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
      */
    val geolocationRoutingPolicies: Output_[js.UndefOr[js.Array[RecordGeolocationRoutingPolicy]]] = js.native
    
    /**
      * The health check the record should be associated with.
      */
    val healthCheckId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
      */
    val latencyRoutingPolicies: Output_[js.UndefOr[js.Array[RecordLatencyRoutingPolicy]]] = js.native
    
    /**
      * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
      */
    val multivalueAnswerRoutingPolicy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
      */
    val name: Output_[String] = js.native
    
    /**
      * A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\"\"` inside the configuration string (e.g. `"first255characters\"\"morecharacters"`).
      */
    val records: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, or `weighted` routing policies documented below.
      */
    val setIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The TTL of the record.
      */
    val ttl: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
      */
    val `type`: Output_[String] = js.native
    
    /**
      * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
      */
    val weightedRoutingPolicies: Output_[js.UndefOr[js.Array[RecordWeightedRoutingPolicy]]] = js.native
    
    /**
      * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
      */
    val zoneId: Output_[String] = js.native
  }
  /* static members */
  object Record {
    
    @JSImport("@pulumi/aws/route53/record", "Record")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Record resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Record]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Record]
    @scala.inline
    def get(name: String, id: Input[ID], state: RecordState): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Record]
    @scala.inline
    def get(name: String, id: Input[ID], state: RecordState, opts: CustomResourceOptions): Record = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Record]
    
    /**
      * Returns true if the given object is an instance of Record.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/record.Record */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/record.Record */ Boolean]
  }
  
  trait RecordArgs extends StObject {
    
    /**
      * An alias block. Conflicts with `ttl` & `records`.
      * Alias record documented below.
      */
    val aliases: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordAlias]]]] = js.undefined
    
    /**
      * Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
      */
    val allowOverwrite: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
      */
    val failoverRoutingPolicies: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordFailoverRoutingPolicy]]]
      ] = js.undefined
    
    /**
      * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
      */
    val geolocationRoutingPolicies: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.route53.RecordGeolocationRoutingPolicy]]
        ]
      ] = js.undefined
    
    /**
      * The health check the record should be associated with.
      */
    val healthCheckId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
      */
    val latencyRoutingPolicies: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordLatencyRoutingPolicy]]]
      ] = js.undefined
    
    /**
      * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
      */
    val multivalueAnswerRoutingPolicy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
      */
    val name: Input[String]
    
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
    val `type`: Input[String | RecordType]
    
    /**
      * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
      */
    val weightedRoutingPolicies: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordWeightedRoutingPolicy]]]
      ] = js.undefined
    
    /**
      * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
      */
    val zoneId: Input[String]
  }
  object RecordArgs {
    
    @scala.inline
    def apply(name: Input[String], `type`: Input[String | RecordType], zoneId: Input[String]): RecordArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordArgs]
    }
    
    @scala.inline
    implicit class RecordArgsMutableBuilder[Self <: RecordArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordAlias]]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: Input[typings.pulumiAws.inputMod.route53.RecordAlias]*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setAllowOverwrite(value: Input[Boolean]): Self = StObject.set(x, "allowOverwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowOverwriteUndefined: Self = StObject.set(x, "allowOverwrite", js.undefined)
      
      @scala.inline
      def setFailoverRoutingPolicies(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordFailoverRoutingPolicy]]]): Self = StObject.set(x, "failoverRoutingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailoverRoutingPoliciesUndefined: Self = StObject.set(x, "failoverRoutingPolicies", js.undefined)
      
      @scala.inline
      def setFailoverRoutingPoliciesVarargs(value: Input[typings.pulumiAws.inputMod.route53.RecordFailoverRoutingPolicy]*): Self = StObject.set(x, "failoverRoutingPolicies", js.Array(value :_*))
      
      @scala.inline
      def setGeolocationRoutingPolicies(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.route53.RecordGeolocationRoutingPolicy]]
            ]
      ): Self = StObject.set(x, "geolocationRoutingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeolocationRoutingPoliciesUndefined: Self = StObject.set(x, "geolocationRoutingPolicies", js.undefined)
      
      @scala.inline
      def setGeolocationRoutingPoliciesVarargs(value: Input[typings.pulumiAws.inputMod.route53.RecordGeolocationRoutingPolicy]*): Self = StObject.set(x, "geolocationRoutingPolicies", js.Array(value :_*))
      
      @scala.inline
      def setHealthCheckId(value: Input[String]): Self = StObject.set(x, "healthCheckId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckIdUndefined: Self = StObject.set(x, "healthCheckId", js.undefined)
      
      @scala.inline
      def setLatencyRoutingPolicies(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordLatencyRoutingPolicy]]]): Self = StObject.set(x, "latencyRoutingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatencyRoutingPoliciesUndefined: Self = StObject.set(x, "latencyRoutingPolicies", js.undefined)
      
      @scala.inline
      def setLatencyRoutingPoliciesVarargs(value: Input[typings.pulumiAws.inputMod.route53.RecordLatencyRoutingPolicy]*): Self = StObject.set(x, "latencyRoutingPolicies", js.Array(value :_*))
      
      @scala.inline
      def setMultivalueAnswerRoutingPolicy(value: Input[Boolean]): Self = StObject.set(x, "multivalueAnswerRoutingPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultivalueAnswerRoutingPolicyUndefined: Self = StObject.set(x, "multivalueAnswerRoutingPolicy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecords(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
      
      @scala.inline
      def setRecordsVarargs(value: Input[String]*): Self = StObject.set(x, "records", js.Array(value :_*))
      
      @scala.inline
      def setSetIdentifier(value: Input[String]): Self = StObject.set(x, "setIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetIdentifierUndefined: Self = StObject.set(x, "setIdentifier", js.undefined)
      
      @scala.inline
      def setTtl(value: Input[Double]): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setType(value: Input[String | RecordType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightedRoutingPolicies(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordWeightedRoutingPolicy]]]): Self = StObject.set(x, "weightedRoutingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightedRoutingPoliciesUndefined: Self = StObject.set(x, "weightedRoutingPolicies", js.undefined)
      
      @scala.inline
      def setWeightedRoutingPoliciesVarargs(value: Input[typings.pulumiAws.inputMod.route53.RecordWeightedRoutingPolicy]*): Self = StObject.set(x, "weightedRoutingPolicies", js.Array(value :_*))
      
      @scala.inline
      def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordState extends StObject {
    
    /**
      * An alias block. Conflicts with `ttl` & `records`.
      * Alias record documented below.
      */
    val aliases: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordAlias]]]] = js.undefined
    
    /**
      * Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
      */
    val allowOverwrite: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
      */
    val failoverRoutingPolicies: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordFailoverRoutingPolicy]]]
      ] = js.undefined
    
    /**
      * [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
      */
    val fqdn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
      */
    val geolocationRoutingPolicies: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.route53.RecordGeolocationRoutingPolicy]]
        ]
      ] = js.undefined
    
    /**
      * The health check the record should be associated with.
      */
    val healthCheckId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
      */
    val latencyRoutingPolicies: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordLatencyRoutingPolicy]]]
      ] = js.undefined
    
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
    val weightedRoutingPolicies: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordWeightedRoutingPolicy]]]
      ] = js.undefined
    
    /**
      * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
      */
    val zoneId: js.UndefOr[Input[String]] = js.undefined
  }
  object RecordState {
    
    @scala.inline
    def apply(): RecordState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordState]
    }
    
    @scala.inline
    implicit class RecordStateMutableBuilder[Self <: RecordState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordAlias]]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: Input[typings.pulumiAws.inputMod.route53.RecordAlias]*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setAllowOverwrite(value: Input[Boolean]): Self = StObject.set(x, "allowOverwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowOverwriteUndefined: Self = StObject.set(x, "allowOverwrite", js.undefined)
      
      @scala.inline
      def setFailoverRoutingPolicies(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordFailoverRoutingPolicy]]]): Self = StObject.set(x, "failoverRoutingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailoverRoutingPoliciesUndefined: Self = StObject.set(x, "failoverRoutingPolicies", js.undefined)
      
      @scala.inline
      def setFailoverRoutingPoliciesVarargs(value: Input[typings.pulumiAws.inputMod.route53.RecordFailoverRoutingPolicy]*): Self = StObject.set(x, "failoverRoutingPolicies", js.Array(value :_*))
      
      @scala.inline
      def setFqdn(value: Input[String]): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
      
      @scala.inline
      def setGeolocationRoutingPolicies(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.route53.RecordGeolocationRoutingPolicy]]
            ]
      ): Self = StObject.set(x, "geolocationRoutingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeolocationRoutingPoliciesUndefined: Self = StObject.set(x, "geolocationRoutingPolicies", js.undefined)
      
      @scala.inline
      def setGeolocationRoutingPoliciesVarargs(value: Input[typings.pulumiAws.inputMod.route53.RecordGeolocationRoutingPolicy]*): Self = StObject.set(x, "geolocationRoutingPolicies", js.Array(value :_*))
      
      @scala.inline
      def setHealthCheckId(value: Input[String]): Self = StObject.set(x, "healthCheckId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckIdUndefined: Self = StObject.set(x, "healthCheckId", js.undefined)
      
      @scala.inline
      def setLatencyRoutingPolicies(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordLatencyRoutingPolicy]]]): Self = StObject.set(x, "latencyRoutingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatencyRoutingPoliciesUndefined: Self = StObject.set(x, "latencyRoutingPolicies", js.undefined)
      
      @scala.inline
      def setLatencyRoutingPoliciesVarargs(value: Input[typings.pulumiAws.inputMod.route53.RecordLatencyRoutingPolicy]*): Self = StObject.set(x, "latencyRoutingPolicies", js.Array(value :_*))
      
      @scala.inline
      def setMultivalueAnswerRoutingPolicy(value: Input[Boolean]): Self = StObject.set(x, "multivalueAnswerRoutingPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultivalueAnswerRoutingPolicyUndefined: Self = StObject.set(x, "multivalueAnswerRoutingPolicy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRecords(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
      
      @scala.inline
      def setRecordsVarargs(value: Input[String]*): Self = StObject.set(x, "records", js.Array(value :_*))
      
      @scala.inline
      def setSetIdentifier(value: Input[String]): Self = StObject.set(x, "setIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetIdentifierUndefined: Self = StObject.set(x, "setIdentifier", js.undefined)
      
      @scala.inline
      def setTtl(value: Input[Double]): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setType(value: Input[String | RecordType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWeightedRoutingPolicies(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.RecordWeightedRoutingPolicy]]]): Self = StObject.set(x, "weightedRoutingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightedRoutingPoliciesUndefined: Self = StObject.set(x, "weightedRoutingPolicies", js.undefined)
      
      @scala.inline
      def setWeightedRoutingPoliciesVarargs(value: Input[typings.pulumiAws.inputMod.route53.RecordWeightedRoutingPolicy]*): Self = StObject.set(x, "weightedRoutingPolicies", js.Array(value :_*))
      
      @scala.inline
      def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
}
