package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var namespace: java.lang.String
  var value: java.lang.String
}

object Anon_DefaultValue {
  @scala.inline
  def apply(
    name: java.lang.String,
    namespace: java.lang.String,
    value: java.lang.String,
    defaultValue: java.lang.String = null
  ): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("value")(value)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

