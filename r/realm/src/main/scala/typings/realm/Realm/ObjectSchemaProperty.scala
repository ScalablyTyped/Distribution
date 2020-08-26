package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectSchemaProperty
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectSchemaProperty }
  */
@js.native
trait ObjectSchemaProperty extends js.Object {
  var default: js.UndefOr[js.Any] = js.native
  var indexed: js.UndefOr[Boolean] = js.native
  var mapTo: js.UndefOr[String] = js.native
  var objectType: js.UndefOr[String] = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var property: js.UndefOr[String] = js.native
  var `type`: PropertyType = js.native
}

object ObjectSchemaProperty {
  @scala.inline
  def apply(`type`: PropertyType): ObjectSchemaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSchemaProperty]
  }
  @scala.inline
  implicit class ObjectSchemaPropertyOps[Self <: ObjectSchemaProperty] (val x: Self) extends AnyVal {
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
    def setType(value: PropertyType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setIndexed(value: Boolean): Self = this.set("indexed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexed: Self = this.set("indexed", js.undefined)
    @scala.inline
    def setMapTo(value: String): Self = this.set("mapTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTo: Self = this.set("mapTo", js.undefined)
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
  }
  
}

