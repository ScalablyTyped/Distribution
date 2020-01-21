package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A scoped-resource selector requirement is a selector that contains values, a scope name, and
  * an operator that relates the scope name and values.
  */
trait ScopedResourceSelectorRequirement extends js.Object {
  /**
    * Represents a scope's relationship to a set of values. Valid operators are In, NotIn,
    * Exists, DoesNotExist.
    */
  var operator: Input[String]
  /**
    * The name of the scope that the selector applies to.
    */
  var scopeName: Input[String]
  /**
    * An array of string values. If the operator is In or NotIn, the values array must be
    * non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This
    * array is replaced during a strategic merge patch.
    */
  var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ScopedResourceSelectorRequirement {
  @scala.inline
  def apply(operator: Input[String], scopeName: Input[String], values: Input[js.Array[Input[String]]] = null): ScopedResourceSelectorRequirement = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedResourceSelectorRequirement]
  }
}

