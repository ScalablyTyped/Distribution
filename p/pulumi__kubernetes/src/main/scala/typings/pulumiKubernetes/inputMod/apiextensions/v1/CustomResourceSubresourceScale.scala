package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
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
  var labelSelectorPath: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
    */
  var specReplicasPath: Input[String]
  
  /**
    * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
    */
  var statusReplicasPath: Input[String]
}
object CustomResourceSubresourceScale {
  
  inline def apply(specReplicasPath: Input[String], statusReplicasPath: Input[String]): CustomResourceSubresourceScale = {
    val __obj = js.Dynamic.literal(specReplicasPath = specReplicasPath.asInstanceOf[js.Any], statusReplicasPath = statusReplicasPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceSubresourceScale]
  }
  
  extension [Self <: CustomResourceSubresourceScale](x: Self) {
    
    inline def setLabelSelectorPath(value: Input[String]): Self = StObject.set(x, "labelSelectorPath", value.asInstanceOf[js.Any])
    
    inline def setLabelSelectorPathUndefined: Self = StObject.set(x, "labelSelectorPath", js.undefined)
    
    inline def setSpecReplicasPath(value: Input[String]): Self = StObject.set(x, "specReplicasPath", value.asInstanceOf[js.Any])
    
    inline def setStatusReplicasPath(value: Input[String]): Self = StObject.set(x, "statusReplicasPath", value.asInstanceOf[js.Any])
  }
}
