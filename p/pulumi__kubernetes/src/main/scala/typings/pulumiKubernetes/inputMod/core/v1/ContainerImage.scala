package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describe a container image
  */
trait ContainerImage extends StObject {
  
  /**
    * Names by which this image is known. e.g. ["k8s.gcr.io/hyperkube:v1.0.7", "dockerhub.io/google_containers/hyperkube:v1.0.7"]
    */
  var names: Input[js.Array[Input[String]]]
  
  /**
    * The size of the image in bytes.
    */
  var sizeBytes: js.UndefOr[Input[Double]] = js.undefined
}
object ContainerImage {
  
  inline def apply(names: Input[js.Array[Input[String]]]): ContainerImage = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerImage]
  }
  
  extension [Self <: ContainerImage](x: Self) {
    
    inline def setNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: Input[String]*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    inline def setSizeBytes(value: Input[Double]): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
