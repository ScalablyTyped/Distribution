package typings.squirrelly.squirrellyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeHelper extends js.Object {
  var blocks: js.UndefOr[Blocks] = js.undefined
  var helperEnd: js.UndefOr[js.Function0[String]] = js.undefined
  var helperStart: js.UndefOr[
    js.Function2[/* param */ js.UndefOr[String], /* id */ js.UndefOr[String], String]
  ] = js.undefined
  var selfClosing: js.UndefOr[js.Function1[/* param */ js.UndefOr[String], String]] = js.undefined
}

object NativeHelper {
  @scala.inline
  def apply(
    blocks: Blocks = null,
    helperEnd: () => String = null,
    helperStart: (/* param */ js.UndefOr[String], /* id */ js.UndefOr[String]) => String = null,
    selfClosing: /* param */ js.UndefOr[String] => String = null
  ): NativeHelper = {
    val __obj = js.Dynamic.literal()
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (helperEnd != null) __obj.updateDynamic("helperEnd")(js.Any.fromFunction0(helperEnd))
    if (helperStart != null) __obj.updateDynamic("helperStart")(js.Any.fromFunction2(helperStart))
    if (selfClosing != null) __obj.updateDynamic("selfClosing")(js.Any.fromFunction1(selfClosing))
    __obj.asInstanceOf[NativeHelper]
  }
}

