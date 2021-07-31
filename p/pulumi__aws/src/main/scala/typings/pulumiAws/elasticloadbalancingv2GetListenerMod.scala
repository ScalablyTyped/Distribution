package typings.pulumiAws

import typings.pulumiAws.outputMod.elasticloadbalancingv2.GetListenerDefaultAction
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticloadbalancingv2GetListenerMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancingv2/getListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getListener(): js.Promise[GetListenerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getListener")().asInstanceOf[js.Promise[GetListenerResult]]
  @scala.inline
  def getListener(args: Unit, opts: InvokeOptions): js.Promise[GetListenerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getListener")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetListenerResult]]
  @scala.inline
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getListener")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetListenerResult]]
  @scala.inline
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getListener")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetListenerResult]]
  
  trait GetListenerArgs extends StObject {
    
    /**
      * The arn of the listener. Required if `loadBalancerArn` and `port` is not set.
      */
    val arn: js.UndefOr[String] = js.undefined
    
    /**
      * The arn of the load balancer. Required if `arn` is not set.
      */
    val loadBalancerArn: js.UndefOr[String] = js.undefined
    
    /**
      * The port of the listener. Required if `arn` is not set.
      */
    val port: js.UndefOr[Double] = js.undefined
  }
  object GetListenerArgs {
    
    @scala.inline
    def apply(): GetListenerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetListenerArgs]
    }
    
    @scala.inline
    implicit class GetListenerArgsMutableBuilder[Self <: GetListenerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setLoadBalancerArn(value: String): Self = StObject.set(x, "loadBalancerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerArnUndefined: Self = StObject.set(x, "loadBalancerArn", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait GetListenerResult extends StObject {
    
    val arn: String
    
    val certificateArn: String
    
    val defaultActions: js.Array[GetListenerDefaultAction]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val loadBalancerArn: String
    
    val port: Double
    
    val protocol: String
    
    val sslPolicy: String
  }
  object GetListenerResult {
    
    @scala.inline
    def apply(
      arn: String,
      certificateArn: String,
      defaultActions: js.Array[GetListenerDefaultAction],
      id: String,
      loadBalancerArn: String,
      port: Double,
      protocol: String,
      sslPolicy: String
    ): GetListenerResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateArn = certificateArn.asInstanceOf[js.Any], defaultActions = defaultActions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadBalancerArn = loadBalancerArn.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], sslPolicy = sslPolicy.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetListenerResult]
    }
    
    @scala.inline
    implicit class GetListenerResultMutableBuilder[Self <: GetListenerResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateArn(value: String): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActions(value: js.Array[GetListenerDefaultAction]): Self = StObject.set(x, "defaultActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActionsVarargs(value: GetListenerDefaultAction*): Self = StObject.set(x, "defaultActions", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerArn(value: String): Self = StObject.set(x, "loadBalancerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslPolicy(value: String): Self = StObject.set(x, "sslPolicy", value.asInstanceOf[js.Any])
    }
  }
}
