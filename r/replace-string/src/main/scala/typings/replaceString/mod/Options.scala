package typings.replaceString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Whether or not substring matching should be case-insensitive.
  		@default false
  		*/
  val caseInsensitive: js.UndefOr[Boolean] = js.undefined
  /**
  		Index at which to start replacing.
  		@default 0
  		*/
  val fromIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(caseInsensitive: js.UndefOr[Boolean] = js.undefined, fromIndex: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fromIndex)) __obj.updateDynamic("fromIndex")(fromIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

