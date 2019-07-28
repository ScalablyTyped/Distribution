package typings.scopedDashRegex.scopedDashRegexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Only match an exact string. By default, it matches any scoped package names in a string. Useful with `RegExp#test()` to check if a string is a scoped package name.
  		@default false
  		*/
  val exact: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(exact: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    __obj.asInstanceOf[Options]
  }
}

