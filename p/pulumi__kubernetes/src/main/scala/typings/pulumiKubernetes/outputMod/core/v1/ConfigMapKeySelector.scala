package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Selects a key from a ConfigMap.
  */
trait ConfigMapKeySelector extends js.Object {
  /**
    * The key to select.
    */
  val key: String
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: String
  /**
    * Specify whether the ConfigMap or its key must be defined
    */
  val optional: Boolean
}

object ConfigMapKeySelector {
  @scala.inline
  def apply(key: String, name: String, optional: Boolean): ConfigMapKeySelector = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigMapKeySelector]
  }
}

