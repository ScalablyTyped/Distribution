package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var key: Input[String]
  /**
    * Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists,
    * DoesNotExist. Gt, and Lt.
    */
  var operator: Input[String]
  /**
    * An array of string values. If the operator is In or NotIn, the values array must be
    * non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If
    * the operator is Gt or Lt, the values array must have a single element, which will be
    * interpreted as an integer. This array is replaced during a strategic merge patch.
    */
  var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object NodeSelectorRequirement {
  @scala.inline
  def apply(key: Input[String], operator: Input[String], values: Input[js.Array[Input[String]]] = null): NodeSelectorRequirement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSelectorRequirement]
  }
}

