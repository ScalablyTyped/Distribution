package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object route53 {
  
  trait GetResolverEndpointFilter extends StObject {
    
    var name: String
    
    var values: js.Array[String]
  }
  object GetResolverEndpointFilter {
    
    inline def apply(name: String, values: js.Array[String]): GetResolverEndpointFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResolverEndpointFilter]
    }
    
    extension [Self <: GetResolverEndpointFilter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait RecordAlias extends StObject {
    
    /**
      * Set to `true` if you want Route 53 to determine whether to respond to DNS queries using this resource record set by checking the health of the resource record set. Some resources have special requirements, see [related part of documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html#rrsets-values-alias-evaluate-target-health).
      */
    var evaluateTargetHealth: Boolean
    
    /**
      * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
      */
    var name: String
    
    /**
      * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
      */
    var zoneId: String
  }
  object RecordAlias {
    
    inline def apply(evaluateTargetHealth: Boolean, name: String, zoneId: String): RecordAlias = {
      val __obj = js.Dynamic.literal(evaluateTargetHealth = evaluateTargetHealth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordAlias]
    }
    
    extension [Self <: RecordAlias](x: Self) {
      
      inline def setEvaluateTargetHealth(value: Boolean): Self = StObject.set(x, "evaluateTargetHealth", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordFailoverRoutingPolicy extends StObject {
    
    /**
      * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
      */
    var `type`: String
  }
  object RecordFailoverRoutingPolicy {
    
    inline def apply(`type`: String): RecordFailoverRoutingPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordFailoverRoutingPolicy]
    }
    
    extension [Self <: RecordFailoverRoutingPolicy](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordGeolocationRoutingPolicy extends StObject {
    
    /**
      * A two-letter continent code. See http://docs.aws.amazon.com/Route53/latest/APIReference/API_GetGeoLocation.html for code details. Either `continent` or `country` must be specified.
      */
    var continent: js.UndefOr[String] = js.undefined
    
    /**
      * A two-character country code or `*` to indicate a default resource record set.
      */
    var country: js.UndefOr[String] = js.undefined
    
    /**
      * A subdivision code for a country.
      */
    var subdivision: js.UndefOr[String] = js.undefined
  }
  object RecordGeolocationRoutingPolicy {
    
    inline def apply(): RecordGeolocationRoutingPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordGeolocationRoutingPolicy]
    }
    
    extension [Self <: RecordGeolocationRoutingPolicy](x: Self) {
      
      inline def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
      
      inline def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setSubdivision(value: String): Self = StObject.set(x, "subdivision", value.asInstanceOf[js.Any])
      
      inline def setSubdivisionUndefined: Self = StObject.set(x, "subdivision", js.undefined)
    }
  }
  
  trait RecordLatencyRoutingPolicy extends StObject {
    
    /**
      * An AWS region from which to measure latency. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-latency
      */
    var region: String
  }
  object RecordLatencyRoutingPolicy {
    
    inline def apply(region: String): RecordLatencyRoutingPolicy = {
      val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordLatencyRoutingPolicy]
    }
    
    extension [Self <: RecordLatencyRoutingPolicy](x: Self) {
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordWeightedRoutingPolicy extends StObject {
    
    /**
      * A numeric value indicating the relative weight of the record. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted.
      */
    var weight: Double
  }
  object RecordWeightedRoutingPolicy {
    
    inline def apply(weight: Double): RecordWeightedRoutingPolicy = {
      val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordWeightedRoutingPolicy]
    }
    
    extension [Self <: RecordWeightedRoutingPolicy](x: Self) {
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolverEndpointIpAddress extends StObject {
    
    /**
      * The IP address in the subnet that you want to use for DNS queries.
      */
    var ip: String
    
    var ipId: String
    
    /**
      * The ID of the subnet that contains the IP address.
      */
    var subnetId: String
  }
  object ResolverEndpointIpAddress {
    
    inline def apply(ip: String, ipId: String, subnetId: String): ResolverEndpointIpAddress = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], ipId = ipId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverEndpointIpAddress]
    }
    
    extension [Self <: ResolverEndpointIpAddress](x: Self) {
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpId(value: String): Self = StObject.set(x, "ipId", value.asInstanceOf[js.Any])
      
      inline def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolverRuleTargetIp extends StObject {
    
    /**
      * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
      */
    var ip: String
    
    /**
      * The port at `ip` that you want to forward DNS queries to. Default value is `53`
      */
    var port: js.UndefOr[Double] = js.undefined
  }
  object ResolverRuleTargetIp {
    
    inline def apply(ip: String): ResolverRuleTargetIp = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverRuleTargetIp]
    }
    
    extension [Self <: ResolverRuleTargetIp](x: Self) {
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait ZoneVpc extends StObject {
    
    /**
      * ID of the VPC to associate.
      */
    var vpcId: String
    
    /**
      * Region of the VPC to associate. Defaults to AWS provider region.
      */
    var vpcRegion: String
  }
  object ZoneVpc {
    
    inline def apply(vpcId: String, vpcRegion: String): ZoneVpc = {
      val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], vpcRegion = vpcRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoneVpc]
    }
    
    extension [Self <: ZoneVpc](x: Self) {
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcRegion(value: String): Self = StObject.set(x, "vpcRegion", value.asInstanceOf[js.Any])
    }
  }
}
