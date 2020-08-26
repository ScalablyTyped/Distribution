package typings.shopifyPrime.optionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldOptions extends js.Object {
  /**
    * A comma-separated list of fields that will be returned instead of the whole object.
    */
  var fields: js.UndefOr[String] = js.native
}

object FieldOptions {
  @scala.inline
  def apply(): FieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldOptions]
  }
  @scala.inline
  implicit class FieldOptionsOps[Self <: FieldOptions] (val x: Self) extends AnyVal {
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

