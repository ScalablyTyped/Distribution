package typings.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A label selector requirement is a selector that contains values, a key, and an operator that
  * relates the key and values.
  */
trait LabelSelectorRequirement extends js.Object {
  /**
    * key is the label key that the selector applies to.
    */
  val key: String
  /**
    * operator represents a key's relationship to a set of values. Valid operators are In, NotIn,
    * Exists and DoesNotExist.
    */
  val operator: String
  /**
    * values is an array of string values. If the operator is In or NotIn, the values array must
    * be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty.
    * This array is replaced during a strategic merge patch.
    */
  val values: js.Array[String]
}

object LabelSelectorRequirement {
  @scala.inline
  def apply(key: String, operator: String, values: js.Array[String]): LabelSelectorRequirement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabelSelectorRequirement]
  }
}

