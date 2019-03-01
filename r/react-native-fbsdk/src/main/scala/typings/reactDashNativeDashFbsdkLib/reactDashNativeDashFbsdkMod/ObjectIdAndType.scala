package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectIdAndType extends js.Object {
  /**
    * The object ID, this can be a URL or a Facebook ID.
    */
  var objectId: java.lang.String
  /**
    * Encapsulates the valid values for the facebook:object_type
    * attribute for a LikeView
    */
  var objectType: ObjectIdActionType
}

object ObjectIdAndType {
  @scala.inline
  def apply(objectId: java.lang.String, objectType: ObjectIdActionType): ObjectIdAndType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objectId")(objectId)
    __obj.updateDynamic("objectType")(objectType)
    __obj.asInstanceOf[ObjectIdAndType]
  }
}

