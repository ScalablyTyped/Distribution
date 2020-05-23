package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsHighlighted extends js.Object {
  var isHighlighted: Boolean
  var value: String
}

object IsHighlighted {
  @scala.inline
  def apply(isHighlighted: Boolean, value: String): IsHighlighted = {
    val __obj = js.Dynamic.literal(isHighlighted = isHighlighted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHighlighted]
  }
}

