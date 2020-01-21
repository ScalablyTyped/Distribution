package typings.storybookAddonInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultValue extends js.Object {
  var defaultValue: js.Any
  var description: String
  var propType: js.Object | String
  var property: String
   // TODO: info about what this object is...
  var required: Boolean
}

object AnonDefaultValue {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    description: String,
    propType: js.Object | String,
    property: String,
    required: Boolean
  ): AnonDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultValue]
  }
}

