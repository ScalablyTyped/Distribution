package typings
package reactDashJsonDashViewLib.reactDashJsonDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsedFieldProps extends js.Object {
  /**
    * The name of the entry.
    */
  var name: java.lang.String | scala.Null
  /**
    * The scopes above the current entry.
    */
  var namespace: js.Array[java.lang.String | scala.Null]
  /**
    * The corresponding JSON subtree.
    */
  var src: js.Object
  /**
    * The type of src. Can only be "array" or "object".
    */
  var `type`: reactDashJsonDashViewLib.reactDashJsonDashViewLibStrings.array | reactDashJsonDashViewLib.reactDashJsonDashViewLibStrings.`object`
}

object CollapsedFieldProps {
  @scala.inline
  def apply(
    namespace: js.Array[java.lang.String | scala.Null],
    src: js.Object,
    `type`: reactDashJsonDashViewLib.reactDashJsonDashViewLibStrings.array | reactDashJsonDashViewLib.reactDashJsonDashViewLibStrings.`object`,
    name: java.lang.String = null
  ): CollapsedFieldProps = {
    val __obj = js.Dynamic.literal(namespace = namespace, src = src)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CollapsedFieldProps]
  }
}

