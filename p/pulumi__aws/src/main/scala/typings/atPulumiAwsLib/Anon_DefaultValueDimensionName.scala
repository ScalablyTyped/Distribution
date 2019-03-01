package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueDimensionName extends js.Object {
  var defaultValue: java.lang.String
  var dimensionName: java.lang.String
  var valueSource: java.lang.String
}

object Anon_DefaultValueDimensionName {
  @scala.inline
  def apply(defaultValue: java.lang.String, dimensionName: java.lang.String, valueSource: java.lang.String): Anon_DefaultValueDimensionName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("dimensionName")(dimensionName)
    __obj.updateDynamic("valueSource")(valueSource)
    __obj.asInstanceOf[Anon_DefaultValueDimensionName]
  }
}

