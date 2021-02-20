package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node.
  */
@js.native
trait ConfigMapNodeConfigSource extends StObject {
  
  /**
    * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
    */
  var kubeletConfigKey: String = js.native
  
  /**
    * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
    */
  var name: String = js.native
  
  /**
    * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
    */
  var namespace: String = js.native
  
  /**
    * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
    */
  var resourceVersion: String = js.native
  
  /**
    * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
    */
  var uid: String = js.native
}
object ConfigMapNodeConfigSource {
  
  @scala.inline
  def apply(kubeletConfigKey: String, name: String, namespace: String, resourceVersion: String, uid: String): ConfigMapNodeConfigSource = {
    val __obj = js.Dynamic.literal(kubeletConfigKey = kubeletConfigKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMapNodeConfigSource]
  }
  
  @scala.inline
  implicit class ConfigMapNodeConfigSourceMutableBuilder[Self <: ConfigMapNodeConfigSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKubeletConfigKey(value: String): Self = StObject.set(x, "kubeletConfigKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
