package typings.reactNativeRssParser.anon

import typings.reactNativeRssParser.mod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubCategories extends js.Object {
  var name: String = js.native
  var subCategories: js.Array[Maybe[Name]] = js.native
}

object SubCategories {
  @scala.inline
  def apply(name: String, subCategories: js.Array[Maybe[Name]]): SubCategories = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subCategories = subCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubCategories]
  }
  @scala.inline
  implicit class SubCategoriesOps[Self <: SubCategories] (val x: Self) extends AnyVal {
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
    def setSubCategoriesVarargs(value: Maybe[Name]*): Self = this.set("subCategories", js.Array(value :_*))
    @scala.inline
    def setSubCategories(value: js.Array[Maybe[Name]]): Self = this.set("subCategories", value.asInstanceOf[js.Any])
  }
  
}

