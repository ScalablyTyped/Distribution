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

