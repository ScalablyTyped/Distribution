package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describe a container image
  */
@js.native
trait ContainerImage extends StObject {
  
  /**
    * Names by which this image is known. e.g. ["k8s.gcr.io/hyperkube:v1.0.7", "dockerhub.io/google_containers/hyperkube:v1.0.7"]
    */
  var names: js.Array[String] = js.native
  
  /**
    * The size of the image in bytes.
    */
  var sizeBytes: Double = js.native
}
object ContainerImage {
  
  @scala.inline
  def apply(names: js.Array[String], sizeBytes: Double): ContainerImage = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], sizeBytes = sizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerImage]
  }
  
  @scala.inline
  implicit class ContainerImageMutableBuilder[Self <: ContainerImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setSizeBytes(value: Double): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
  }
}
