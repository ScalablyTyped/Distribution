package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.lb.GetLoadBalancerAccessLogs
import typings.pulumiAws.outputMod.lb.GetLoadBalancerSubnetMapping
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lbGetLoadBalancerMod {
  
  @JSImport("@pulumi/aws/lb/getLoadBalancer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLoadBalancer(): js.Promise[GetLoadBalancerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadBalancer")().asInstanceOf[js.Promise[GetLoadBalancerResult]]
  inline def getLoadBalancer(args: Unit, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadBalancer")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLoadBalancerResult]]
  inline def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadBalancer")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLoadBalancerResult]]
  inline def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadBalancer")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLoadBalancerResult]]
  
  trait GetLoadBalancerArgs extends StObject {
    
    /**
      * The full ARN of the load balancer.
      */
    val arn: js.UndefOr[String] = js.undefined
    
    /**
      * The unique name of the load balancer.
      */
    val name: js.UndefOr[String] = js.undefined
    
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetLoadBalancerArgs {
    
    inline def apply(): GetLoadBalancerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLoadBalancerArgs]
    }
    
    extension [Self <: GetLoadBalancerArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetLoadBalancerResult extends StObject {
    
    val accessLogs: GetLoadBalancerAccessLogs
    
    val arn: String
    
    val arnSuffix: String
    
    val customerOwnedIpv4Pool: String
    
    val dnsName: String
    
    val dropInvalidHeaderFields: Boolean
    
    val enableDeletionProtection: Boolean
    
    val enableHttp2: Boolean
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val idleTimeout: Double
    
    val internal: Boolean
    
    val ipAddressType: String
    
    val loadBalancerType: String
    
    val name: String
    
    val securityGroups: js.Array[String]
    
    val subnetMappings: js.Array[GetLoadBalancerSubnetMapping]
    
    val subnets: js.Array[String]
    
    val tags: StringDictionary[String]
    
    val vpcId: String
    
    val zoneId: String
  }
  object GetLoadBalancerResult {
    
    inline def apply(
      accessLogs: GetLoadBalancerAccessLogs,
      arn: String,
      arnSuffix: String,
      customerOwnedIpv4Pool: String,
      dnsName: String,
      dropInvalidHeaderFields: Boolean,
      enableDeletionProtection: Boolean,
      enableHttp2: Boolean,
      id: String,
      idleTimeout: Double,
      internal: Boolean,
      ipAddressType: String,
      loadBalancerType: String,
      name: String,
      securityGroups: js.Array[String],
      subnetMappings: js.Array[GetLoadBalancerSubnetMapping],
      subnets: js.Array[String],
      tags: StringDictionary[String],
      vpcId: String,
      zoneId: String
    ): GetLoadBalancerResult = {
      val __obj = js.Dynamic.literal(accessLogs = accessLogs.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], arnSuffix = arnSuffix.asInstanceOf[js.Any], customerOwnedIpv4Pool = customerOwnedIpv4Pool.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], dropInvalidHeaderFields = dropInvalidHeaderFields.asInstanceOf[js.Any], enableDeletionProtection = enableDeletionProtection.asInstanceOf[js.Any], enableHttp2 = enableHttp2.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], ipAddressType = ipAddressType.asInstanceOf[js.Any], loadBalancerType = loadBalancerType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetMappings = subnetMappings.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLoadBalancerResult]
    }
    
    extension [Self <: GetLoadBalancerResult](x: Self) {
      
      inline def setAccessLogs(value: GetLoadBalancerAccessLogs): Self = StObject.set(x, "accessLogs", value.asInstanceOf[js.Any])
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnSuffix(value: String): Self = StObject.set(x, "arnSuffix", value.asInstanceOf[js.Any])
      
      inline def setCustomerOwnedIpv4Pool(value: String): Self = StObject.set(x, "customerOwnedIpv4Pool", value.asInstanceOf[js.Any])
      
      inline def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      inline def setDropInvalidHeaderFields(value: Boolean): Self = StObject.set(x, "dropInvalidHeaderFields", value.asInstanceOf[js.Any])
      
      inline def setEnableDeletionProtection(value: Boolean): Self = StObject.set(x, "enableDeletionProtection", value.asInstanceOf[js.Any])
      
      inline def setEnableHttp2(value: Boolean): Self = StObject.set(x, "enableHttp2", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setIpAddressType(value: String): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerType(value: String): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      inline def setSubnetMappings(value: js.Array[GetLoadBalancerSubnetMapping]): Self = StObject.set(x, "subnetMappings", value.asInstanceOf[js.Any])
      
      inline def setSubnetMappingsVarargs(value: GetLoadBalancerSubnetMapping*): Self = StObject.set(x, "subnetMappings", js.Array(value :_*))
      
      inline def setSubnets(value: js.Array[String]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
      
      inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
}
