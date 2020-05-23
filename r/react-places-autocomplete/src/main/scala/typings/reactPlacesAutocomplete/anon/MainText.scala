package typings.reactPlacesAutocomplete.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainText extends js.Object {
  var mainText: String
  var secondaryText: String
}

object MainText {
  @scala.inline
  def apply(mainText: String, secondaryText: String): MainText = {
    val __obj = js.Dynamic.literal(mainText = mainText.asInstanceOf[js.Any], secondaryText = secondaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainText]
  }
}

