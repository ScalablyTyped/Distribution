package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var kubeletConfigKey: Input[String]
  /**
    * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
    */
  var name: Input[String]
  /**
    * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in
    * all cases.
    */
  var namespace: Input[String]
  /**
    * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is
    * forbidden in Node.Spec, and required in Node.Status.
    */
  var resourceVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec,
    * and required in Node.Status.
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
}

object ConfigMapNodeConfigSource {
  @scala.inline
  def apply(
    kubeletConfigKey: Input[String],
    name: Input[String],
    namespace: Input[String],
    resourceVersion: Input[String] = null,
    uid: Input[String] = null
  ): ConfigMapNodeConfigSource = {
    val __obj = js.Dynamic.literal(kubeletConfigKey = kubeletConfigKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    if (resourceVersion != null) __obj.updateDynamic("resourceVersion")(resourceVersion.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMapNodeConfigSource]
  }
}

