package typings.revalidator.Revalidator

import typings.revalidator.revalidatorStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchema[T] extends js.Object {
  var patternProperties: js.UndefOr[ISchemas[T]] = js.native
  var properties: js.UndefOr[ISchemas[T]] = js.native
  var `type`: js.UndefOr[`object`] = js.native
}

object JSONSchema {
  @scala.inline
  def apply[T](): JSONSchema[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchema[T]]
  }
  @scala.inline
  implicit class JSONSchemaOps[Self <: JSONSchema[_], T] (val x: Self with JSONSchema[T]) extends AnyVal {
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
    def setPatternProperties(value: ISchemas[T]): Self = this.set("patternProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternProperties: Self = this.set("patternProperties", js.undefined)
    @scala.inline
    def setProperties(value: ISchemas[T]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setType(value: `object`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

