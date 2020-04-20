package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var key: Input[String]
  /**
    * An array of string values. One value must match the label to be selected. Each entry in
    * Values is ORed.
    */
  var values: Input[js.Array[Input[String]]]
}

object TopologySelectorLabelRequirement {
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): TopologySelectorLabelRequirement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologySelectorLabelRequirement]
  }
}

