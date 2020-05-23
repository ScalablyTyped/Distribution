package typings.reactJsonView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSelectProps extends js.Object {
  /**
    * The name of the currently selected entry.
    */
  var name: String | Null
  /**
    * List of keys representing the scopes above the selected entry.
    */
  var namespace: js.Array[String | Null]
  /**
    * The type of the value. For "number" type, it will be replaced with the more
    * accurate types: "float", "integer", or "nan".
    */
  var `type`: String
  /**
    * The value of the currently selected entry.
    */
  var value: js.Object | String | Double | Boolean | Null
}

object OnSelectProps {
  @scala.inline
  def apply(
    namespace: js.Array[String | Null],
    `type`: String,
    name: String = null,
    value: js.Object | String | Double | Boolean = null
  ): OnSelectProps = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSelectProps]
  }
}

