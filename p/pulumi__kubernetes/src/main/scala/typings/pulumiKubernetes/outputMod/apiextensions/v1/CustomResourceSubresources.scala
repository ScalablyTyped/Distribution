package typings.pulumiKubernetes.outputMod.apiextensions.v1

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
  var scale: CustomResourceSubresourceScale
  
  /**
    * status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
    */
  var status: js.Any
}
object CustomResourceSubresources {
  
  @scala.inline
  def apply(scale: CustomResourceSubresourceScale, status: js.Any): CustomResourceSubresources = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceSubresources]
  }
  
  @scala.inline
  implicit class CustomResourceSubresourcesMutableBuilder[Self <: CustomResourceSubresources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: CustomResourceSubresourceScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
