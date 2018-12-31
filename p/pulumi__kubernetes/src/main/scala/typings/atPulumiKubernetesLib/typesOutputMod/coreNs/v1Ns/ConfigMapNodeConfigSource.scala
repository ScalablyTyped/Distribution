package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val kubeletConfigKey: java.lang.String
  /**
    * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
    */
  val name: java.lang.String
  /**
    * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in
    * all cases.
    */
  val namespace: java.lang.String
  /**
    * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is
    * forbidden in Node.Spec, and required in Node.Status.
    */
  val resourceVersion: java.lang.String
  /**
    * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec,
    * and required in Node.Status.
    */
  val uid: java.lang.String
}

