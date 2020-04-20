package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollOptions extends js.Object {
  var shouldPublishImmediately: Boolean
}

object ScrollOptions {
  @scala.inline
  def apply(shouldPublishImmediately: Boolean): ScrollOptions = {
    val __obj = js.Dynamic.literal(shouldPublishImmediately = shouldPublishImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOptions]
  }
}

