package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val names: js.Array[java.lang.String]
  /**
    * The size of the image in bytes.
    */
  val sizeBytes: scala.Double
}

object ContainerImage {
  @scala.inline
  def apply(names: js.Array[java.lang.String], sizeBytes: scala.Double): ContainerImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("names")(names)
    __obj.updateDynamic("sizeBytes")(sizeBytes)
    __obj.asInstanceOf[ContainerImage]
  }
}

