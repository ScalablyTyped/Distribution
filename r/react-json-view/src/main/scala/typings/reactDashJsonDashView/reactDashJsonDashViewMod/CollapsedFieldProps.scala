package typings.reactDashJsonDashView.reactDashJsonDashViewMod

import typings.reactDashJsonDashView.reactDashJsonDashViewStrings.`object`
import typings.reactDashJsonDashView.reactDashJsonDashViewStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsedFieldProps extends js.Object {
  /**
    * The name of the entry.
    */
  var name: String | Null
  /**
    * The scopes above the current entry.
    */
  var namespace: js.Array[String | Null]
  /**
    * The corresponding JSON subtree.
    */
  var src: js.Object
  /**
    * The type of src. Can only be "array" or "object".
    */
  var `type`: array | `object`
}

object CollapsedFieldProps {
  @scala.inline
  def apply(namespace: js.Array[String | Null], src: js.Object, `type`: array | `object`, name: String = null): CollapsedFieldProps = {
    val __obj = js.Dynamic.literal(namespace = namespace, src = src)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CollapsedFieldProps]
  }
}

