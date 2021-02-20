package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getContainerDefinitionMod {
  
  @JSImport("@pulumi/aws/ecs/getContainerDefinition", "getContainerDefinition")
  @js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs): js.Promise[GetContainerDefinitionResult] = js.native
  @JSImport("@pulumi/aws/ecs/getContainerDefinition", "getContainerDefinition")
  @js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs, opts: InvokeOptions): js.Promise[GetContainerDefinitionResult] = js.native
  
  @js.native
  trait GetContainerDefinitionArgs extends StObject {
    
    /**
      * The name of the container definition
      */
    val containerName: String = js.native
    
    /**
      * The ARN of the task definition which contains the container
      */
    val taskDefinition: String = js.native
  }
  object GetContainerDefinitionArgs {
    
    @scala.inline
    def apply(containerName: String, taskDefinition: String): GetContainerDefinitionArgs = {
      val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetContainerDefinitionArgs]
    }
    
    @scala.inline
    implicit class GetContainerDefinitionArgsMutableBuilder[Self <: GetContainerDefinitionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetContainerDefinitionResult extends StObject {
    
    val containerName: String = js.native
    
    /**
      * The CPU limit for this container definition
      */
    val cpu: Double = js.native
    
    /**
      * Indicator if networking is disabled
      */
    val disableNetworking: Boolean = js.native
    
    /**
      * Set docker labels
      */
    val dockerLabels: StringDictionary[String] = js.native
    
    /**
      * The environment in use
      */
    val environment: StringDictionary[String] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The docker image in use, including the digest
      */
    val image: String = js.native
    
    /**
      * The digest of the docker image in use
      */
    val imageDigest: String = js.native
    
    /**
      * The memory limit for this container definition
      */
    val memory: Double = js.native
    
    /**
      * The soft limit (in MiB) of memory to reserve for the container. When system memory is under contention, Docker attempts to keep the container memory to this soft limit
      */
    val memoryReservation: Double = js.native
    
    val taskDefinition: String = js.native
  }
  object GetContainerDefinitionResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetContainerDefinitionResultMutableBuilder[Self <: GetContainerDefinitionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableNetworking(value: Boolean): Self = StObject.set(x, "disableNetworking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockerLabels(value: StringDictionary[String]): Self = StObject.set(x, "dockerLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryReservation(value: Double): Self = StObject.set(x, "memoryReservation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    }
  }
}
