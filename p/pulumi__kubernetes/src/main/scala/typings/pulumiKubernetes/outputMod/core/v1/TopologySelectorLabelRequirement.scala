package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A topology selector requirement is a selector that matches given label. This is an alpha
  * feature and may change in the future.
  */
trait TopologySelectorLabelRequirement extends js.Object {
  /**
    * The label key that the selector applies to.
    */
  val key: String
  /**
    * An array of string values. One value must match the label to be selected. Each entry in
    * Values is ORed.
    */
  val values: js.Array[String]
}

object TopologySelectorLabelRequirement {
  @scala.inline
  def apply(key: String, values: js.Array[String]): TopologySelectorLabelRequirement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologySelectorLabelRequirement]
  }
}

