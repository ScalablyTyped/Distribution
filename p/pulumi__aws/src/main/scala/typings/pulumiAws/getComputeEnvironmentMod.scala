package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getComputeEnvironmentMod {
  
  @JSImport("@pulumi/aws/batch/getComputeEnvironment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComputeEnvironment(args: GetComputeEnvironmentArgs): js.Promise[GetComputeEnvironmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputeEnvironment")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetComputeEnvironmentResult]]
  inline def getComputeEnvironment(args: GetComputeEnvironmentArgs, opts: InvokeOptions): js.Promise[GetComputeEnvironmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getComputeEnvironment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetComputeEnvironmentResult]]
  
  trait GetComputeEnvironmentArgs extends StObject {
    
    /**
      * The name of the Batch Compute Environment
      */
    val computeEnvironmentName: String
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetComputeEnvironmentArgs {
    
    inline def apply(computeEnvironmentName: String): GetComputeEnvironmentArgs = {
      val __obj = js.Dynamic.literal(computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetComputeEnvironmentArgs]
    }
    
    extension [Self <: GetComputeEnvironmentArgs](x: Self) {
      
      inline def setComputeEnvironmentName(value: String): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetComputeEnvironmentResult extends StObject {
    
    /**
      * The ARN of the compute environment.
      */
    val arn: String
    
    val computeEnvironmentName: String
    
    /**
      * The ARN of the underlying Amazon ECS cluster used by the compute environment.
      */
    val ecsClusterArn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The ARN of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
      */
    val serviceRole: String
    
    /**
      * The state of the compute environment (for example, `ENABLED` or `DISABLED`). If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues.
      */
    val state: String
    
    /**
      * The current status of the compute environment (for example, `CREATING` or `VALID`).
      */
    val status: String
    
    /**
      * A short, human-readable string to provide additional details about the current status of the compute environment.
      */
    val statusReason: String
    
    /**
      * Key-value map of resource tags
      */
    val tags: StringDictionary[String]
    
    /**
      * The type of the compute environment (for example, `MANAGED` or `UNMANAGED`).
      */
    val `type`: String
  }
  object GetComputeEnvironmentResult {
    
    inline def apply(
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
    
    extension [Self <: GetComputeEnvironmentResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setComputeEnvironmentName(value: String): Self = StObject.set(x, "computeEnvironmentName", value.asInstanceOf[js.Any])
      
      inline def setEcsClusterArn(value: String): Self = StObject.set(x, "ecsClusterArn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setServiceRole(value: String): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
