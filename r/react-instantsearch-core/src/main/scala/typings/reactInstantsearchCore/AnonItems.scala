package typings.reactInstantsearchCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var currentRefinement: js.Array[String]
  var items: js.Array[AnonLabel]
}

object AnonItems {
  @scala.inline
  def apply(currentRefinement: js.Array[String], items: js.Array[AnonLabel]): AnonItems = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
}

