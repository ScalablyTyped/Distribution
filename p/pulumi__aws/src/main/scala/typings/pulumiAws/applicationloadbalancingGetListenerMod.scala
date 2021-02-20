package typings.pulumiAws

import typings.pulumiAws.outputMod.applicationloadbalancing.GetListenerDefaultAction
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationloadbalancingGetListenerMod {
  
  @JSImport("@pulumi/aws/applicationloadbalancing/getListener", "getListener")
  @js.native
  def getListener(): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing/getListener", "getListener")
  @js.native
  def getListener(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing/getListener", "getListener")
  @js.native
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] = js.native
  @JSImport("@pulumi/aws/applicationloadbalancing/getListener", "getListener")
  @js.native
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] = js.native
  
  @js.native
  trait GetListenerArgs extends StObject {
    
    /**
      * The arn of the listener. Required if `loadBalancerArn` and `port` is not set.
      */
    val arn: js.UndefOr[String] = js.native
    
    /**
      * The arn of the load balancer. Required if `arn` is not set.
      */
    val loadBalancerArn: js.UndefOr[String] = js.native
    
    /**
      * The port of the listener. Required if `arn` is not set.
      */
    val port: js.UndefOr[Double] = js.native
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
  
  @js.native
  trait GetListenerResult extends StObject {
    
    val arn: String = js.native
    
    val certificateArn: String = js.native
    
    val defaultActions: js.Array[GetListenerDefaultAction] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val loadBalancerArn: String = js.native
    
    val port: Double = js.native
    
    val protocol: String = js.native
    
    val sslPolicy: String = js.native
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
