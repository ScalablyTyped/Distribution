package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.applicationloadbalancing.GetTargetGroupHealthCheck
import typings.pulumiAws.outputMod.applicationloadbalancing.GetTargetGroupStickiness
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationloadbalancingGetTargetGroupMod {
  
  @JSImport("@pulumi/aws/applicationloadbalancing/getTargetGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTargetGroup(): js.Promise[GetTargetGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetGroup")().asInstanceOf[js.Promise[GetTargetGroupResult]]
  inline def getTargetGroup(args: Unit, opts: InvokeOptions): js.Promise[GetTargetGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTargetGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTargetGroupResult]]
  inline def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetTargetGroupResult]]
  inline def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTargetGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTargetGroupResult]]
  
  trait GetTargetGroupArgs extends StObject {
    
    /**
      * The full ARN of the target group.
      */
    val arn: js.UndefOr[String] = js.undefined
    
    /**
      * The unique name of the target group.
      */
    val name: js.UndefOr[String] = js.undefined
    
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetTargetGroupArgs {
    
    inline def apply(): GetTargetGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTargetGroupArgs]
    }
    
    extension [Self <: GetTargetGroupArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetTargetGroupResult extends StObject {
    
    val arn: String
    
    val arnSuffix: String
    
    val deregistrationDelay: Double
    
    val healthCheck: GetTargetGroupHealthCheck
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val lambdaMultiValueHeadersEnabled: Boolean
    
    val loadBalancingAlgorithmType: String
    
    val name: String
    
    val port: Double
    
    val protocol: String
    
    val proxyProtocolV2: Boolean
    
    val slowStart: Double
    
    val stickiness: GetTargetGroupStickiness
    
    val tags: StringDictionary[String]
    
    val targetType: String
    
    val vpcId: String
  }
  object GetTargetGroupResult {
    
    inline def apply(
      arn: String,
      arnSuffix: String,
      deregistrationDelay: Double,
      healthCheck: GetTargetGroupHealthCheck,
      id: String,
      lambdaMultiValueHeadersEnabled: Boolean,
      loadBalancingAlgorithmType: String,
      name: String,
      port: Double,
      protocol: String,
      proxyProtocolV2: Boolean,
      slowStart: Double,
      stickiness: GetTargetGroupStickiness,
      tags: StringDictionary[String],
      targetType: String,
      vpcId: String
    ): GetTargetGroupResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], arnSuffix = arnSuffix.asInstanceOf[js.Any], deregistrationDelay = deregistrationDelay.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled.asInstanceOf[js.Any], loadBalancingAlgorithmType = loadBalancingAlgorithmType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], proxyProtocolV2 = proxyProtocolV2.asInstanceOf[js.Any], slowStart = slowStart.asInstanceOf[js.Any], stickiness = stickiness.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTargetGroupResult]
    }
    
    extension [Self <: GetTargetGroupResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnSuffix(value: String): Self = StObject.set(x, "arnSuffix", value.asInstanceOf[js.Any])
      
      inline def setDeregistrationDelay(value: Double): Self = StObject.set(x, "deregistrationDelay", value.asInstanceOf[js.Any])
      
      inline def setHealthCheck(value: GetTargetGroupHealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLambdaMultiValueHeadersEnabled(value: Boolean): Self = StObject.set(x, "lambdaMultiValueHeadersEnabled", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancingAlgorithmType(value: String): Self = StObject.set(x, "loadBalancingAlgorithmType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProxyProtocolV2(value: Boolean): Self = StObject.set(x, "proxyProtocolV2", value.asInstanceOf[js.Any])
      
      inline def setSlowStart(value: Double): Self = StObject.set(x, "slowStart", value.asInstanceOf[js.Any])
      
      inline def setStickiness(value: GetTargetGroupStickiness): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
