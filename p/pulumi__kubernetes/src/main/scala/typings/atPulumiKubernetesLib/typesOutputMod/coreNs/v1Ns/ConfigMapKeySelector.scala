package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val key: java.lang.String
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: java.lang.String
  /**
    * Specify whether the ConfigMap or its key must be defined
    */
  val optional: scala.Boolean
}

object ConfigMapKeySelector {
  @scala.inline
  def apply(key: java.lang.String, name: java.lang.String, optional: scala.Boolean): ConfigMapKeySelector = {
    val __obj = js.Dynamic.literal(key = key, name = name, optional = optional)
  
    __obj.asInstanceOf[ConfigMapKeySelector]
  }
}

