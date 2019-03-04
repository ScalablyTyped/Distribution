package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val key: java.lang.String
  /**
    * An array of string values. One value must match the label to be selected. Each entry in
    * Values is ORed.
    */
  val values: js.Array[java.lang.String]
}

object TopologySelectorLabelRequirement {
  @scala.inline
  def apply(key: java.lang.String, values: js.Array[java.lang.String]): TopologySelectorLabelRequirement = {
    val __obj = js.Dynamic.literal(key = key, values = values)
  
    __obj.asInstanceOf[TopologySelectorLabelRequirement]
  }
}

