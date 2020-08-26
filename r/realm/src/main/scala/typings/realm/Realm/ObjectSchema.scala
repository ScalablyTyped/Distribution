package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectSchema
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectSchema }
  */
@js.native
trait ObjectSchema extends js.Object {
  var name: String = js.native
  var primaryKey: js.UndefOr[String] = js.native
  var properties: PropertiesTypes = js.native
}

object ObjectSchema {
  @scala.inline
  def apply(name: String, properties: PropertiesTypes): ObjectSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSchema]
  }
  @scala.inline
  implicit class ObjectSchemaOps[Self <: ObjectSchema] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: PropertiesTypes): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
  }
  
}

