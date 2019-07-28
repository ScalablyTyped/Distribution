package typings.reactDashJsonDashView.reactDashJsonDashViewMod

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
  var existing_value: js.Object | String | Double | Boolean | Null
  /**
    * The key of the entry that is interacted with.
    */
  var name: String | Null
  /**
    * List of keys.
    */
  var namespace: js.Array[String | Null]
  /**
    * The updated value of the entry that is interacted with.
    */
  var new_value: js.UndefOr[js.Object | String | Double | Boolean | Null] = js.undefined
  /**
    * The updated subtree of the JSON tree.
    */
  var updated_src: js.Object
}

object InteractionProps {
  @scala.inline
  def apply(
    existing_src: js.Object,
    namespace: js.Array[String | Null],
    updated_src: js.Object,
    existing_value: js.Object | String | Double | Boolean = null,
    name: String = null,
    new_value: js.Object | String | Double | Boolean = null
  ): InteractionProps = {
    val __obj = js.Dynamic.literal(existing_src = existing_src, namespace = namespace, updated_src = updated_src)
    if (existing_value != null) __obj.updateDynamic("existing_value")(existing_value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (new_value != null) __obj.updateDynamic("new_value")(new_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionProps]
  }
}

