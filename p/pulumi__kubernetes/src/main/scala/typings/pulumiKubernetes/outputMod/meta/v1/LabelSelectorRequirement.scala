package typings.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
  */
@js.native
trait LabelSelectorRequirement extends js.Object {
  /**
    * key is the label key that the selector applies to.
    */
  var key: String = js.native
  /**
    * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
    */
  var operator: String = js.native
  /**
    * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
    */
  var values: js.Array[String] = js.native
}

object LabelSelectorRequirement {
  @scala.inline
  def apply(key: String, operator: String, values: js.Array[String]): LabelSelectorRequirement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSelectorRequirement]
  }
  @scala.inline
  implicit class LabelSelectorRequirementOps[Self <: LabelSelectorRequirement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

