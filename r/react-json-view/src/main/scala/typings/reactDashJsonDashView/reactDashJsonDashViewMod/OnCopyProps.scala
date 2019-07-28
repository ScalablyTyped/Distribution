package typings.reactDashJsonDashView.reactDashJsonDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCopyProps extends js.Object {
  /**
    * The last key in the namespace array.
    */
  var name: String | Null
  /**
    * List of keys.
    */
  var namespace: js.Array[String | Null]
  /**
    * The JSON tree source object
    */
  var src: js.Object
}

object OnCopyProps {
  @scala.inline
  def apply(namespace: js.Array[String | Null], src: js.Object, name: String = null): OnCopyProps = {
    val __obj = js.Dynamic.literal(namespace = namespace, src = src)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OnCopyProps]
  }
}

