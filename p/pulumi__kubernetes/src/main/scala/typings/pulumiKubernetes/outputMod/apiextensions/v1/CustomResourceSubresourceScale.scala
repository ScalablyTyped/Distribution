package typings.pulumiKubernetes.outputMod.apiextensions.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.
  */
trait CustomResourceSubresourceScale extends StObject {
  
  /**
    * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
    */
  var labelSelectorPath: String
  
  /**
    * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
    */
  var specReplicasPath: String
  
  /**
    * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
    */
  var statusReplicasPath: String
}
object CustomResourceSubresourceScale {
  
  @scala.inline
  def apply(labelSelectorPath: String, specReplicasPath: String, statusReplicasPath: String): CustomResourceSubresourceScale = {
    val __obj = js.Dynamic.literal(labelSelectorPath = labelSelectorPath.asInstanceOf[js.Any], specReplicasPath = specReplicasPath.asInstanceOf[js.Any], statusReplicasPath = statusReplicasPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceSubresourceScale]
  }
  
  @scala.inline
  implicit class CustomResourceSubresourceScaleMutableBuilder[Self <: CustomResourceSubresourceScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelSelectorPath(value: String): Self = StObject.set(x, "labelSelectorPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecReplicasPath(value: String): Self = StObject.set(x, "specReplicasPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReplicasPath(value: String): Self = StObject.set(x, "statusReplicasPath", value.asInstanceOf[js.Any])
  }
}
