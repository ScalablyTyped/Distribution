package typings.stripJsonComments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Replace comments with whitespace instead of stripping them entirely.
  		@default true
  		*/
  val whitespace: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(whitespace: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(whitespace)) __obj.updateDynamic("whitespace")(whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

