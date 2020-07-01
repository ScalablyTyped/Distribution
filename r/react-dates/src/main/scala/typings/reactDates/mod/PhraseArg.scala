package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// PHRASES
trait PhraseArg extends js.Object {
  var date: String
}

object PhraseArg {
  @scala.inline
  def apply(date: String): PhraseArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhraseArg]
  }
}

