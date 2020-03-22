package typings.stringPlaceholder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<string-placeholder.string-placeholder.Options> */
trait ReadonlyOptions extends js.Object {
  val after: js.UndefOr[String] = js.undefined
  val before: js.UndefOr[String] = js.undefined
  val clean: js.UndefOr[Boolean] = js.undefined
  val escape: js.UndefOr[String] = js.undefined
}

object ReadonlyOptions {
  @scala.inline
  def apply(
    after: String = null,
    before: String = null,
    clean: js.UndefOr[Boolean] = js.undefined,
    escape: String = null
  ): ReadonlyOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyOptions]
  }
}

