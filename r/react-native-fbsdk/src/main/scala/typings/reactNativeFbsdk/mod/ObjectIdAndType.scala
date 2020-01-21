package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectIdAndType extends js.Object {
  /**
    * The object ID, this can be a URL or a Facebook ID.
    */
  var objectId: String
  /**
    * Encapsulates the valid values for the facebook:object_type
    * attribute for a LikeView
    */
  var objectType: ObjectIdActionType
}

object ObjectIdAndType {
  @scala.inline
  def apply(objectId: String, objectType: ObjectIdActionType): ObjectIdAndType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectIdAndType]
  }
}

