package typings.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceSubresources defines the status and scale subresources for CustomResources.
  */
trait CustomResourceSubresources extends StObject {
  
  /**
    * scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
    */
  var scale: js.UndefOr[Input[CustomResourceSubresourceScale]] = js.undefined
  
  /**
    * status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
    */
  var status: js.UndefOr[js.Any] = js.undefined
}
object CustomResourceSubresources {
  
  inline def apply(): CustomResourceSubresources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceSubresources]
  }
  
  extension [Self <: CustomResourceSubresources](x: Self) {
    
    inline def setScale(value: Input[CustomResourceSubresourceScale]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
