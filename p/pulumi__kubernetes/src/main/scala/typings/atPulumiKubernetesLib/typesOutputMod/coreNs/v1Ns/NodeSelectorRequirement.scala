package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A node selector requirement is a selector that contains values, a key, and an operator that
  * relates the key and values.
  */
trait NodeSelectorRequirement extends js.Object {
  /**
    * The label key that the selector applies to.
    */
  val key: java.lang.String
  /**
    * Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists,
    * DoesNotExist. Gt, and Lt.
    */
  val operator: java.lang.String
  /**
    * An array of string values. If the operator is In or NotIn, the values array must be
    * non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If
    * the operator is Gt or Lt, the values array must have a single element, which will be
    * interpreted as an integer. This array is replaced during a strategic merge patch.
    */
  val values: js.Array[java.lang.String]
}

object NodeSelectorRequirement {
  @scala.inline
  def apply(key: java.lang.String, operator: java.lang.String, values: js.Array[java.lang.String]): NodeSelectorRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[NodeSelectorRequirement]
  }
}

