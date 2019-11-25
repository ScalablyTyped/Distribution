package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe a container image
  */
trait ContainerImage extends js.Object {
  /**
    * Names by which this image is known. e.g. ["k8s.gcr.io/hyperkube:v1.0.7",
    * "dockerhub.io/google_containers/hyperkube:v1.0.7"]
    */
  val names: js.Array[String]
  /**
    * The size of the image in bytes.
    */
  val sizeBytes: Double
}

object ContainerImage {
  @scala.inline
  def apply(names: js.Array[String], sizeBytes: Double): ContainerImage = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], sizeBytes = sizeBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerImage]
  }
}

