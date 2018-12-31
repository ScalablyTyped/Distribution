package typings
package atPulumiAwsLib.ecsGetContainerDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContainerDefinitionResult extends js.Object {
  /**
    * The CPU limit for this container definition
    */
  val cpu: scala.Double
  /**
    * Indicator if networking is disabled
    */
  val disableNetworking: scala.Boolean
  /**
    * Set docker labels
    */
  val dockerLabels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The environment in use
    */
  val environment: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The docker image in use, including the digest
    */
  val image: java.lang.String
  /**
    * The digest of the docker image in use
    */
  val imageDigest: java.lang.String
  /**
    * The memory limit for this container definition
    */
  val memory: scala.Double
  /**
    * The soft limit (in MiB) of memory to reserve for the container. When system memory is under contention, Docker attempts to keep the container memory to this soft limit
    */
  val memoryReservation: scala.Double
}

