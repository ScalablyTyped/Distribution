package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val configMap: ConfigMapNodeConfigSource
}

object NodeConfigSource {
  @scala.inline
  def apply(configMap: ConfigMapNodeConfigSource): NodeConfigSource = {
    val __obj = js.Dynamic.literal(configMap = configMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeConfigSource]
  }
}

