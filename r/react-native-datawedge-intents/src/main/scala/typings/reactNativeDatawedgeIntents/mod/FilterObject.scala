package typings.reactNativeDatawedgeIntents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterObject extends js.Object {
  var filterActions: js.Array[String] = js.native
  var filterCategories: js.Array[String] = js.native
}

object FilterObject {
  @scala.inline
  def apply(filterActions: js.Array[String], filterCategories: js.Array[String]): FilterObject = {
    val __obj = js.Dynamic.literal(filterActions = filterActions.asInstanceOf[js.Any], filterCategories = filterCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterObject]
  }
  @scala.inline
  implicit class FilterObjectOps[Self <: FilterObject] (val x: Self) extends AnyVal {
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
    def setFilterActionsVarargs(value: String*): Self = this.set("filterActions", js.Array(value :_*))
    @scala.inline
    def setFilterActions(value: js.Array[String]): Self = this.set("filterActions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterCategoriesVarargs(value: String*): Self = this.set("filterCategories", js.Array(value :_*))
    @scala.inline
    def setFilterCategories(value: js.Array[String]): Self = this.set("filterCategories", value.asInstanceOf[js.Any])
  }
  
}

