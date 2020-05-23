package typings.reactNativeRssParser.anon

import typings.reactNativeRssParser.mod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubCategories extends js.Object {
  var name: String
  var subCategories: js.Array[Maybe[Name]]
}

object SubCategories {
  @scala.inline
  def apply(name: String, subCategories: js.Array[Maybe[Name]]): SubCategories = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subCategories = subCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubCategories]
  }
}

