package typings.atPulumiAws.typesOutputMod.daxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupParameter extends js.Object {
  /**
    * The name of the parameter group.
    */
  var name: String
  var value: String
}

object ParameterGroupParameter {
  @scala.inline
  def apply(name: String, value: String): ParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[ParameterGroupParameter]
  }
}

