package typings.pulumiKubernetes.outputMod.core.v1

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
  var names: js.Array[String]
  
  /**
    * The size of the image in bytes.
    */
  var sizeBytes: Double
}
object ContainerImage {
  
  inline def apply(names: js.Array[String], sizeBytes: Double): ContainerImage = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], sizeBytes = sizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerImage]
  }
  
  extension [Self <: ContainerImage](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    inline def setSizeBytes(value: Double): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
  }
}
