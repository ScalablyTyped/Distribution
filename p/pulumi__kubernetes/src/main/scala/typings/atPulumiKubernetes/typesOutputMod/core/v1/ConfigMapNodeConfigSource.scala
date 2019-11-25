package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config
  * source for the Node.
  */
trait ConfigMapNodeConfigSource extends js.Object {
  /**
    * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the
    * KubeletConfiguration structure This field is required in all cases.
    */
  val kubeletConfigKey: String
  /**
    * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
    */
  val name: String
  /**
    * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in
    * all cases.
    */
  val namespace: String
  /**
    * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is
    * forbidden in Node.Spec, and required in Node.Status.
    */
  val resourceVersion: String
  /**
    * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec,
    * and required in Node.Status.
    */
  val uid: String
}

object ConfigMapNodeConfigSource {
  @scala.inline
  def apply(kubeletConfigKey: String, name: String, namespace: String, resourceVersion: String, uid: String): ConfigMapNodeConfigSource = {
    val __obj = js.Dynamic.literal(kubeletConfigKey = kubeletConfigKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigMapNodeConfigSource]
  }
}

