package typings.atPulumiAws.ecsGetContainerDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContainerDefinitionResult extends js.Object {
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
    * id is the provider-assigned unique ID for this managed resource.
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
    val __obj = js.Dynamic.literal(containerName = containerName, cpu = cpu, disableNetworking = disableNetworking, dockerLabels = dockerLabels, environment = environment, id = id, image = image, imageDigest = imageDigest, memory = memory, memoryReservation = memoryReservation, taskDefinition = taskDefinition)
  
    __obj.asInstanceOf[GetContainerDefinitionResult]
  }
}

