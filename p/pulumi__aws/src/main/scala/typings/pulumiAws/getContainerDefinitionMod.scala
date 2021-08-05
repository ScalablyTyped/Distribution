package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getContainerDefinitionMod {
  
  @JSImport("@pulumi/aws/ecs/getContainerDefinition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContainerDefinition(args: GetContainerDefinitionArgs): js.Promise[GetContainerDefinitionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainerDefinition")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetContainerDefinitionResult]]
  inline def getContainerDefinition(args: GetContainerDefinitionArgs, opts: InvokeOptions): js.Promise[GetContainerDefinitionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getContainerDefinition")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetContainerDefinitionResult]]
  
  trait GetContainerDefinitionArgs extends StObject {
    
    /**
      * The name of the container definition
      */
    val containerName: String
    
    /**
      * The ARN of the task definition which contains the container
      */
    val taskDefinition: String
  }
  object GetContainerDefinitionArgs {
    
    inline def apply(containerName: String, taskDefinition: String): GetContainerDefinitionArgs = {
      val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetContainerDefinitionArgs]
    }
    
    extension [Self <: GetContainerDefinitionArgs](x: Self) {
      
      inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
      
      inline def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetContainerDefinitionResult extends StObject {
    
    val containerName: String
    
    /**
      * The CPU limit for this container definition
      */
    val cpu: Double
    
    /**
      * Indicator if networking is disabled
      */
    val disableNetworking: Boolean
    
    /**
      * Set docker labels
      */
    val dockerLabels: StringDictionary[String]
    
    /**
      * The environment in use
      */
    val environment: StringDictionary[String]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The docker image in use, including the digest
      */
    val image: String
    
    /**
      * The digest of the docker image in use
      */
    val imageDigest: String
    
    /**
      * The memory limit for this container definition
      */
    val memory: Double
    
    /**
      * The soft limit (in MiB) of memory to reserve for the container. When system memory is under contention, Docker attempts to keep the container memory to this soft limit
      */
    val memoryReservation: Double
    
    val taskDefinition: String
  }
  object GetContainerDefinitionResult {
    
    inline def apply(
      containerName: String,
      cpu: Double,
      disableNetworking: Boolean,
      dockerLabels: StringDictionary[String],
      environment: StringDictionary[String],
      id: String,
      image: String,
      imageDigest: String,
      memory: Double,
      memoryReservation: Double,
      taskDefinition: String
    ): GetContainerDefinitionResult = {
      val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], disableNetworking = disableNetworking.asInstanceOf[js.Any], dockerLabels = dockerLabels.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageDigest = imageDigest.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryReservation = memoryReservation.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetContainerDefinitionResult]
    }
    
    extension [Self <: GetContainerDefinitionResult](x: Self) {
      
      inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
      
      inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setDisableNetworking(value: Boolean): Self = StObject.set(x, "disableNetworking", value.asInstanceOf[js.Any])
      
      inline def setDockerLabels(value: StringDictionary[String]): Self = StObject.set(x, "dockerLabels", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryReservation(value: Double): Self = StObject.set(x, "memoryReservation", value.asInstanceOf[js.Any])
      
      inline def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    }
  }
}
