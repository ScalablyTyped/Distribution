package typings.reactNativeRssParser

import typings.reactNativeRssParser.mod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubCategories extends js.Object {
  var name: String
  var subCategories: js.Array[Maybe[AnonName]]
}

object AnonSubCategories {
  @scala.inline
  def apply(name: String, subCategories: js.Array[Maybe[AnonName]]): AnonSubCategories = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subCategories = subCategories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSubCategories]
  }
}

