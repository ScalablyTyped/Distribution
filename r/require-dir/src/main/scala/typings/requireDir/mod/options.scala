package typings.requireDir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait options extends js.Object {
  var duplicates: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var filter: js.UndefOr[js.Any] = js.native
  var mapKey: js.UndefOr[js.Any] = js.native
  var mapValue: js.UndefOr[js.Any] = js.native
  var recurse: js.UndefOr[Boolean] = js.native
}

object options {
  @scala.inline
  def apply(): options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[options]
  }
  @scala.inline
  implicit class optionsOps[Self <: options] (val x: Self) extends AnyVal {
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
    def setDuplicates(value: Boolean): Self = this.set("duplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicates: Self = this.set("duplicates", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMapKey(value: js.Any): Self = this.set("mapKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapKey: Self = this.set("mapKey", js.undefined)
    @scala.inline
    def setMapValue(value: js.Any): Self = this.set("mapValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapValue: Self = this.set("mapValue", js.undefined)
    @scala.inline
    def setRecurse(value: Boolean): Self = this.set("recurse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurse: Self = this.set("recurse", js.undefined)
  }
  
}

