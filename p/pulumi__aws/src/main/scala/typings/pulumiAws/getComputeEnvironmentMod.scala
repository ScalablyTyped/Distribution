package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getComputeEnvironmentMod {
  
  @JSImport("@pulumi/aws/batch/getComputeEnvironment", "getComputeEnvironment")
  @js.native
  def getComputeEnvironment(args: GetComputeEnvironmentArgs): js.Promise[GetComputeEnvironmentResult] = js.native
  @JSImport("@pulumi/aws/batch/getComputeEnvironment", "getComputeEnvironment")
  @js.native
  def getComputeEnvironment(args: GetComputeEnvironmentArgs, opts: InvokeOptions): js.Promise[GetComputeEnvironmentResult] = js.native
  
  @js.native
  trait GetComputeEnvironmentArgs extends StObject {
    
    /**
      * The name of the Batch Compute Environment
      */
    val computeEnvironmentName: String = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetComputeEnvironmentArgs {
    
    @scala.inline
    def apply(computeEnvironmentName: String): GetComputeEnvironmentArgs = {
      val __obj = js.Dynamic.literal(computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetComputeEnvironmentArgs]
    }
    
    @scala.inline
    implicit class GetComputeEnvironmentArgsMutableBuilder[Self <: GetComputeEnvironmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeEnvironmentName(value: String): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetComputeEnvironmentResult extends StObject {
    
    /**
      * The ARN of the compute environment.
      */
    val arn: String = js.native
    
    val computeEnvironmentName: String = js.native
    
    /**
      * The ARN of the underlying Amazon ECS cluster used by the compute environment.
      */
    val ecsClusterArn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The ARN of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
      */
    val serviceRole: String = js.native
    
    /**
      * The state of the compute environment (for example, `ENABLED` or `DISABLED`). If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues.
      */
    val state: String = js.native
    
    /**
      * The current status of the compute environment (for example, `CREATING` or `VALID`).
      */
    val status: String = js.native
    
    /**
      * A short, human-readable string to provide additional details about the current status of the compute environment.
      */
    val statusReason: String = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * The type of the compute environment (for example, `MANAGED` or `UNMANAGED`).
      */
    val `type`: String = js.native
  }
  object GetComputeEnvironmentResult {
    
    @scala.inline
    def apply(
      arn: String,
      computeEnvironmentName: String,
      ecsClusterArn: String,
      id: String,
      serviceRole: String,
      state: String,
      status: String,
      statusReason: String,
      tags: StringDictionary[String],
      `type`: String
    ): GetComputeEnvironmentResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any], ecsClusterArn = ecsClusterArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusReason = statusReason.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetComputeEnvironmentResult]
    }
    
    @scala.inline
    implicit class GetComputeEnvironmentResultMutableBuilder[Self <: GetComputeEnvironmentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeEnvironmentName(value: String): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcsClusterArn(value: String): Self = StObject.set(x, "ecsClusterArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceRole(value: String): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
