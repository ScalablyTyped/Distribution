package typings.reactJsonView.mod

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
    new_value: js.UndefOr[Null | js.Object | String | Double | Boolean] = js.undefined
  ): InteractionProps = {
    val __obj = js.Dynamic.literal(existing_src = existing_src.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], updated_src = updated_src.asInstanceOf[js.Any], existing_value = existing_value.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(new_value)) __obj.updateDynamic("new_value")(new_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionProps]
  }
}

