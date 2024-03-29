package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node.
  */
trait ConfigMapNodeConfigSource extends StObject {
  
  /**
    * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
    */
  var kubeletConfigKey: Input[String]
  
  /**
    * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
    */
  var name: Input[String]
  
  /**
    * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
    */
  var namespace: Input[String]
  
  /**
    * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
    */
  var resourceVersion: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
}
object ConfigMapNodeConfigSource {
  
  inline def apply(kubeletConfigKey: Input[String], name: Input[String], namespace: Input[String]): ConfigMapNodeConfigSource = {
    val __obj = js.Dynamic.literal(kubeletConfigKey = kubeletConfigKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMapNodeConfigSource]
  }
  
  extension [Self <: ConfigMapNodeConfigSource](x: Self) {
    
    inline def setKubeletConfigKey(value: Input[String]): Self = StObject.set(x, "kubeletConfigKey", value.asInstanceOf[js.Any])
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setResourceVersion(value: Input[String]): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    inline def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
    
    inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
