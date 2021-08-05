package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTaskDefinitionMod {
  
  @JSImport("@pulumi/aws/ecs/getTaskDefinition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTaskDefinition(args: GetTaskDefinitionArgs): js.Promise[GetTaskDefinitionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTaskDefinition")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetTaskDefinitionResult]]
  inline def getTaskDefinition(args: GetTaskDefinitionArgs, opts: InvokeOptions): js.Promise[GetTaskDefinitionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTaskDefinition")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTaskDefinitionResult]]
  
  trait GetTaskDefinitionArgs extends StObject {
    
    /**
      * The family for the latest ACTIVE revision, family and revision (family:revision) for a specific revision in the family, the ARN of the task definition to access to.
      */
    val taskDefinition: String
  }
  object GetTaskDefinitionArgs {
    
    inline def apply(taskDefinition: String): GetTaskDefinitionArgs = {
      val __obj = js.Dynamic.literal(taskDefinition = taskDefinition.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTaskDefinitionArgs]
    }
    
    extension [Self <: GetTaskDefinitionArgs](x: Self) {
      
      inline def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTaskDefinitionResult extends StObject {
    
    /**
      * The family of this task definition
      */
    val family: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The Docker networking mode to use for the containers in this task.
      */
    val networkMode: String
    
    /**
      * The revision of this task definition
      */
    val revision: Double
    
    /**
      * The status of this task definition
      */
    val status: String
    
    val taskDefinition: String
    
    /**
      * The ARN of the IAM role that containers in this task can assume
      */
    val taskRoleArn: String
  }
  object GetTaskDefinitionResult {
    
    inline def apply(
      family: String,
      id: String,
      networkMode: String,
      revision: Double,
      status: String,
      taskDefinition: String,
      taskRoleArn: String
    ): GetTaskDefinitionResult = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkMode = networkMode.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any], taskRoleArn = taskRoleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTaskDefinitionResult]
    }
    
    extension [Self <: GetTaskDefinitionResult](x: Self) {
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNetworkMode(value: String): Self = StObject.set(x, "networkMode", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
      
      inline def setTaskRoleArn(value: String): Self = StObject.set(x, "taskRoleArn", value.asInstanceOf[js.Any])
    }
  }
}
