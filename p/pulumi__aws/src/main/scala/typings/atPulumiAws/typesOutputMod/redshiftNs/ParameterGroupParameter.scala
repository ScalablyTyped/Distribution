package typings.atPulumiAws.typesOutputMod.redshiftNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupParameter extends js.Object {
  /**
    * The name of the Redshift parameter.
    */
  var name: String
  /**
    * The value of the Redshift parameter.
    */
  var value: String
}

object ParameterGroupParameter {
  @scala.inline
  def apply(name: String, value: String): ParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[ParameterGroupParameter]
  }
}

