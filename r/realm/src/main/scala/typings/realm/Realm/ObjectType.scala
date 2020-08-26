package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectType
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectType }
  */
@js.native
trait ObjectType extends js.Object {
  var `type`: ObjectClass = js.native
}

object ObjectType {
  @scala.inline
  def apply(`type`: ObjectClass): ObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectType]
  }
  @scala.inline
  implicit class ObjectTypeOps[Self <: ObjectType] (val x: Self) extends AnyVal {
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
    def setType(value: ObjectClass): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

