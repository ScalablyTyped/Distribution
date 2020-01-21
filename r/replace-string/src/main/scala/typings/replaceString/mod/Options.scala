package typings.replaceString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Index at which to start replacing.
  		@default 0
  		*/
  val fromIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(fromIndex: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fromIndex != null) __obj.updateDynamic("fromIndex")(fromIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

