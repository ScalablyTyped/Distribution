package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

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
  val operator: String
  /**
    * The name of the scope that the selector applies to.
    */
  val scopeName: String
  /**
    * An array of string values. If the operator is In or NotIn, the values array must be
    * non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This
    * array is replaced during a strategic merge patch.
    */
  val values: js.Array[String]
}

object ScopedResourceSelectorRequirement {
  @scala.inline
  def apply(operator: String, scopeName: String, values: js.Array[String]): ScopedResourceSelectorRequirement = {
    val __obj = js.Dynamic.literal(operator = operator, scopeName = scopeName, values = values)
  
    __obj.asInstanceOf[ScopedResourceSelectorRequirement]
  }
}

