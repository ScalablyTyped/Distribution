package typings.reactCoinhive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authedmine extends js.Object {
  var authedmine: String
  var coinhive: String
}

object Authedmine {
  @scala.inline
  def apply(authedmine: String, coinhive: String): Authedmine = {
    val __obj = js.Dynamic.literal(authedmine = authedmine.asInstanceOf[js.Any], coinhive = coinhive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authedmine]
  }
}

