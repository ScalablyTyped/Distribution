package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectIdAndType extends js.Object {
  /**
    * The object ID, this can be a URL or a Facebook ID.
    */
  var objectId: String = js.native
  /**
    * Encapsulates the valid values for the facebook:object_type
    * attribute for a LikeView
    */
  var objectType: ObjectIdActionType = js.native
}

object ObjectIdAndType {
  @scala.inline
  def apply(objectId: String, objectType: ObjectIdActionType): ObjectIdAndType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdAndType]
  }
  @scala.inline
  implicit class ObjectIdAndTypeOps[Self <: ObjectIdAndType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectType(value: ObjectIdActionType): Self = this.set("objectType", value.asInstanceOf[js.Any])
  }
  
}

