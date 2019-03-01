package typings
package reactDashJsonDashViewLib.reactDashJsonDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCopyProps extends js.Object {
  /**
    * The last key in the namespace array.
    */
  var name: java.lang.String | scala.Null
  /**
    * List of keys.
    */
  var namespace: js.Array[java.lang.String | scala.Null]
  /**
    * The JSON tree source object
    */
  var src: js.Object
}

object OnCopyProps {
  @scala.inline
  def apply(namespace: js.Array[java.lang.String | scala.Null], src: js.Object, name: java.lang.String = null): OnCopyProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("src")(src)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OnCopyProps]
  }
}

