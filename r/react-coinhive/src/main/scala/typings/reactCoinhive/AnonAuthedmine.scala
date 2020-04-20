package typings.reactCoinhive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthedmine extends js.Object {
  var authedmine: String
  var coinhive: String
}

object AnonAuthedmine {
  @scala.inline
  def apply(authedmine: String, coinhive: String): AnonAuthedmine = {
    val __obj = js.Dynamic.literal(authedmine = authedmine.asInstanceOf[js.Any], coinhive = coinhive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthedmine]
  }
}

