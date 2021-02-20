package typings.pulumiAws

import typings.pulumiAws.outputMod.ecs.GetClusterSetting
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecsGetClusterMod {
  
  @JSImport("@pulumi/aws/ecs/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws/ecs/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @js.native
  trait GetClusterArgs extends StObject {
    
    /**
      * The name of the ECS Cluster
      */
    val clusterName: String = js.native
  }
  object GetClusterArgs {
    
    @scala.inline
    def apply(clusterName: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    @scala.inline
    implicit class GetClusterArgsMutableBuilder[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetClusterResult extends StObject {
    
    /**
      * The ARN of the ECS Cluster
      */
    val arn: String = js.native
    
    val clusterName: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The number of pending tasks for the ECS Cluster
      */
    val pendingTasksCount: Double = js.native
    
    /**
      * The number of registered container instances for the ECS Cluster
      */
    val registeredContainerInstancesCount: Double = js.native
    
    /**
      * The number of running tasks for the ECS Cluster
      */
    val runningTasksCount: Double = js.native
    
    /**
      * The settings associated with the ECS Cluster.
      */
    val settings: js.Array[GetClusterSetting] = js.native
    
    /**
      * The status of the ECS Cluster
      */
    val status: String = js.native
  }
  object GetClusterResult {
    
    @scala.inline
    def apply(
      arn: String,
      clusterName: String,
      id: String,
      pendingTasksCount: Double,
      registeredContainerInstancesCount: Double,
      runningTasksCount: Double,
      settings: js.Array[GetClusterSetting],
      status: String
    ): GetClusterResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pendingTasksCount = pendingTasksCount.asInstanceOf[js.Any], registeredContainerInstancesCount = registeredContainerInstancesCount.asInstanceOf[js.Any], runningTasksCount = runningTasksCount.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterResult]
    }
    
    @scala.inline
    implicit class GetClusterResultMutableBuilder[Self <: GetClusterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingTasksCount(value: Double): Self = StObject.set(x, "pendingTasksCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisteredContainerInstancesCount(value: Double): Self = StObject.set(x, "registeredContainerInstancesCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningTasksCount(value: Double): Self = StObject.set(x, "runningTasksCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: js.Array[GetClusterSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsVarargs(value: GetClusterSetting*): Self = StObject.set(x, "settings", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
