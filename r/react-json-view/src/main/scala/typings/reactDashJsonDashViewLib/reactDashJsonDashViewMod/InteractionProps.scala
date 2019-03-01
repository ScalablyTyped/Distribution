package typings
package reactDashJsonDashViewLib.reactDashJsonDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionProps extends js.Object {
  /**
    * The existing subtree of the JSON tree.
    */
  var existing_src: js.Object
  /**
    * The original value of the entry that is interacted with.
    */
  var existing_value: js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null
  /**
    * The key of the entry that is interacted with.
    */
  var name: java.lang.String | scala.Null
  /**
    * List of keys.
    */
  var namespace: js.Array[java.lang.String | scala.Null]
  /**
    * The updated value of the entry that is interacted with.
    */
  var new_value: js.UndefOr[js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null] = js.undefined
  /**
    * The updated subtree of the JSON tree.
    */
  var updated_src: js.Object
}

object InteractionProps {
  @scala.inline
  def apply(
    existing_src: js.Object,
    namespace: js.Array[java.lang.String | scala.Null],
    updated_src: js.Object,
    existing_value: js.Object | java.lang.String | scala.Double | scala.Boolean = null,
    name: java.lang.String = null,
    new_value: js.Object | java.lang.String | scala.Double | scala.Boolean = null
  ): InteractionProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("existing_src")(existing_src)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("updated_src")(updated_src)
    if (existing_value != null) __obj.updateDynamic("existing_value")(existing_value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (new_value != null) __obj.updateDynamic("new_value")(new_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionProps]
  }
}

