package typings.slugify.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lower extends js.Object {
  var lower: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[RegExp] = js.undefined
  var replacement: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Lower {
  @scala.inline
  def apply(
    lower: js.UndefOr[Boolean] = js.undefined,
    remove: RegExp = null,
    replacement: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Lower = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lower)) __obj.updateDynamic("lower")(lower.get.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lower]
  }
}

