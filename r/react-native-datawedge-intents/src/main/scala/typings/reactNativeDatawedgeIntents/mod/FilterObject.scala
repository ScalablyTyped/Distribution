package typings.reactNativeDatawedgeIntents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterObject extends js.Object {
  var filterActions: js.Array[String]
  var filterCategories: js.Array[String]
}

object FilterObject {
  @scala.inline
  def apply(filterActions: js.Array[String], filterCategories: js.Array[String]): FilterObject = {
    val __obj = js.Dynamic.literal(filterActions = filterActions.asInstanceOf[js.Any], filterCategories = filterCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterObject]
  }
}

