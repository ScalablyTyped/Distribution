package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.applicationloadbalancing.GetTargetGroupHealthCheck
import typings.pulumiAws.outputMod.applicationloadbalancing.GetTargetGroupStickiness
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationloadbalancingGetTargetGroupMod {
  
  @JSImport("@pulumi/aws/applicationloadbalancing/getTargetGroup", "getTargetGroup")
  @js.native
  def getTargetGroup(): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing/getTargetGroup", "getTargetGroup")
  @js.native
  def getTargetGroup(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing/getTargetGroup", "getTargetGroup")
  @js.native
  def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing/getTargetGroup", "getTargetGroup")
  @js.native
  def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] = js.native
  
  @js.native
  trait GetTargetGroupArgs extends StObject {
    
    /**
      * The full ARN of the target group.
      */
    val arn: js.UndefOr[String] = js.native
    
    /**
      * The unique name of the target group.
      */
    val name: js.UndefOr[String] = js.native
    
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetTargetGroupArgs {
    
    @scala.inline
    def apply(): GetTargetGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTargetGroupArgs]
    }
    
    @scala.inline
    implicit class GetTargetGroupArgsMutableBuilder[Self <: GetTargetGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetTargetGroupResult extends StObject {
    
    val arn: String = js.native
    
    val arnSuffix: String = js.native
    
    val deregistrationDelay: Double = js.native
    
    val healthCheck: GetTargetGroupHealthCheck = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val lambdaMultiValueHeadersEnabled: Boolean = js.native
    
    val loadBalancingAlgorithmType: String = js.native
    
    val name: String = js.native
    
    val port: Double = js.native
    
    val protocol: String = js.native
    
    val proxyProtocolV2: Boolean = js.native
    
    val slowStart: Double = js.native
    
    val stickiness: GetTargetGroupStickiness = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val targetType: String = js.native
    
    val vpcId: String = js.native
  }
  object GetTargetGroupResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetTargetGroupResultMutableBuilder[Self <: GetTargetGroupResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnSuffix(value: String): Self = StObject.set(x, "arnSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeregistrationDelay(value: Double): Self = StObject.set(x, "deregistrationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheck(value: GetTargetGroupHealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaMultiValueHeadersEnabled(value: Boolean): Self = StObject.set(x, "lambdaMultiValueHeadersEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancingAlgorithmType(value: String): Self = StObject.set(x, "loadBalancingAlgorithmType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyProtocolV2(value: Boolean): Self = StObject.set(x, "proxyProtocolV2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowStart(value: Double): Self = StObject.set(x, "slowStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickiness(value: GetTargetGroupStickiness): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
