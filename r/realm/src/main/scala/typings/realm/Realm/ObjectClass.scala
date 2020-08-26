package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectClass
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectClass }
  */
@js.native
trait ObjectClass extends js.Object {
  var schema: ObjectSchema = js.native
}

object ObjectClass {
  @scala.inline
  def apply(schema: ObjectSchema): ObjectClass = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectClass]
  }
  @scala.inline
  implicit class ObjectClassOps[Self <: ObjectClass] (val x: Self) extends AnyVal {
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
    def setSchema(value: ObjectSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
  
}

