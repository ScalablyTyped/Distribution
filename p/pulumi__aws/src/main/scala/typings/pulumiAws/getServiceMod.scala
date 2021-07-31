package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServiceMod {
  
  @JSImport("@pulumi/aws/ecs/getService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getService(args: GetServiceArgs): js.Promise[GetServiceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getService")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServiceResult]]
  @scala.inline
  def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getService")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceResult]]
  
  trait GetServiceArgs extends StObject {
    
    /**
      * The arn of the ECS Cluster
      */
    val clusterArn: String
    
    /**
      * The name of the ECS Service
      */
    val serviceName: String
  }
  object GetServiceArgs {
    
    @scala.inline
    def apply(clusterArn: String, serviceName: String): GetServiceArgs = {
      val __obj = js.Dynamic.literal(clusterArn = clusterArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceArgs]
    }
    
    @scala.inline
    implicit class GetServiceArgsMutableBuilder[Self <: GetServiceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetServiceResult extends StObject {
    
    /**
      * The ARN of the ECS Service
      */
    val arn: String
    
    val clusterArn: String
    
    /**
      * The number of tasks for the ECS Service
      */
    val desiredCount: Double
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The launch type for the ECS Service
      */
    val launchType: String
    
    /**
      * The scheduling strategy for the ECS Service
      */
    val schedulingStrategy: String
    
    val serviceName: String
    
    /**
      * The family for the latest ACTIVE revision
      */
    val taskDefinition: String
  }
  object GetServiceResult {
    
    @scala.inline
    def apply(
      arn: String,
      clusterArn: String,
      desiredCount: Double,
      id: String,
      launchType: String,
      schedulingStrategy: String,
      serviceName: String,
      taskDefinition: String
    ): GetServiceResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], clusterArn = clusterArn.asInstanceOf[js.Any], desiredCount = desiredCount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], launchType = launchType.asInstanceOf[js.Any], schedulingStrategy = schedulingStrategy.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceResult]
    }
    
    @scala.inline
    implicit class GetServiceResultMutableBuilder[Self <: GetServiceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesiredCount(value: Double): Self = StObject.set(x, "desiredCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchType(value: String): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedulingStrategy(value: String): Self = StObject.set(x, "schedulingStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    }
  }
}
