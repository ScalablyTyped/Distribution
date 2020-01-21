package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var names: Input[js.Array[Input[String]]]
  /**
    * The size of the image in bytes.
    */
  var sizeBytes: js.UndefOr[Input[Double]] = js.undefined
}

object ContainerImage {
  @scala.inline
  def apply(names: Input[js.Array[Input[String]]], sizeBytes: Input[Double] = null): ContainerImage = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    if (sizeBytes != null) __obj.updateDynamic("sizeBytes")(sizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerImage]
  }
}

