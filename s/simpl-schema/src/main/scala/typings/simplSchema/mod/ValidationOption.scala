package typings.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOption extends js.Object {
  var clean: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
  var modifier: js.UndefOr[Boolean] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
  var upsertextendedCustomContext: js.UndefOr[Boolean] = js.native
}

object ValidationOption {
  @scala.inline
  def apply(): ValidationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOption]
  }
  @scala.inline
  implicit class ValidationOptionOps[Self <: ValidationOption] (val x: Self) extends AnyVal {
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
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setModifier(value: Boolean): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
    @scala.inline
    def setUpsertextendedCustomContext(value: Boolean): Self = this.set("upsertextendedCustomContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsertextendedCustomContext: Self = this.set("upsertextendedCustomContext", js.undefined)
  }
  
}

