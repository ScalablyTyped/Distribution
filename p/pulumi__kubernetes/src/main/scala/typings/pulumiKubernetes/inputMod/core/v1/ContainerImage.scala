package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describe a container image
  */
@js.native
trait ContainerImage extends js.Object {
  
  /**
    * Names by which this image is known. e.g. ["k8s.gcr.io/hyperkube:v1.0.7", "dockerhub.io/google_containers/hyperkube:v1.0.7"]
    */
  var names: Input[js.Array[Input[String]]] = js.native
  
  /**
    * The size of the image in bytes.
    */
  var sizeBytes: js.UndefOr[Input[Double]] = js.native
}
object ContainerImage {
  
  @scala.inline
  def apply(names: Input[js.Array[Input[String]]]): ContainerImage = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerImage]
  }
  
  @scala.inline
  implicit class ContainerImageOps[Self <: ContainerImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNamesVarargs(value: Input[String]*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: Input[js.Array[Input[String]]]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBytes(value: Input[Double]): Self = this.set("sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeBytes: Self = this.set("sizeBytes", js.undefined)
  }
}
