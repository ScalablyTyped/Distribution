package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding
  * metadata) must be non-nil.
  */
trait NodeConfigSource extends js.Object {
  /**
    * ConfigMap is a reference to a Node's ConfigMap
    */
  var configMap: js.UndefOr[Input[ConfigMapNodeConfigSource]] = js.undefined
}

object NodeConfigSource {
  @scala.inline
  def apply(configMap: Input[ConfigMapNodeConfigSource] = null): NodeConfigSource = {
    val __obj = js.Dynamic.literal()
    if (configMap != null) __obj.updateDynamic("configMap")(configMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfigSource]
  }
}

