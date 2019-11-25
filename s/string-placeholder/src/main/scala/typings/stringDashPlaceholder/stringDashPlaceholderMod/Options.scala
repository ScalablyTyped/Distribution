package typings.stringDashPlaceholder.stringDashPlaceholderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[String] = js.undefined
  var clean: js.UndefOr[Boolean] = js.undefined
  var escape: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    after: String = null,
    before: String = null,
    clean: js.UndefOr[Boolean] = js.undefined,
    escape: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

