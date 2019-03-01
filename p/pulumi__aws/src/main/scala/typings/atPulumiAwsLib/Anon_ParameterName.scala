package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParameterName extends js.Object {
  var parameterName: java.lang.String
  var parameterValue: java.lang.String
}

object Anon_ParameterName {
  @scala.inline
  def apply(parameterName: java.lang.String, parameterValue: java.lang.String): Anon_ParameterName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parameterName")(parameterName)
    __obj.updateDynamic("parameterValue")(parameterValue)
    __obj.asInstanceOf[Anon_ParameterName]
  }
}

