package typings.ractive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Optional extends js.Object {
  var optional: js.UndefOr[js.Array[String]] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
}

object Optional {
  @scala.inline
  def apply(): Optional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optional]
  }
  @scala.inline
  implicit class OptionalOps[Self <: Optional] (val x: Self) extends AnyVal {
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
    def setOptionalVarargs(value: String*): Self = this.set("optional", js.Array(value :_*))
    @scala.inline
    def setOptional(value: js.Array[String]): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

