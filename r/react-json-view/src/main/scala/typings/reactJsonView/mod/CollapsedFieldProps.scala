package typings.reactJsonView.mod

import typings.reactJsonView.reactJsonViewStrings.`object`
import typings.reactJsonView.reactJsonViewStrings.array
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
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsedFieldProps]
  }
}

