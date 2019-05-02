package typings
package squirrellyLib.squirrellyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeHelper extends js.Object {
  var blocks: js.UndefOr[Blocks] = js.undefined
  var helperEnd: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var helperStart: js.UndefOr[
    js.Function2[
      /* param */ js.UndefOr[java.lang.String], 
      /* id */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  var selfClosing: js.UndefOr[js.Function1[/* param */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
}

object NativeHelper {
  @scala.inline
  def apply(
    blocks: Blocks = null,
    helperEnd: () => java.lang.String = null,
    helperStart: (/* param */ js.UndefOr[java.lang.String], /* id */ js.UndefOr[java.lang.String]) => java.lang.String = null,
    selfClosing: /* param */ js.UndefOr[java.lang.String] => java.lang.String = null
  ): NativeHelper = {
    val __obj = js.Dynamic.literal()
    if (blocks != null) __obj.updateDynamic("blocks")(blocks)
    if (helperEnd != null) __obj.updateDynamic("helperEnd")(js.Any.fromFunction0(helperEnd))
    if (helperStart != null) __obj.updateDynamic("helperStart")(js.Any.fromFunction2(helperStart))
    if (selfClosing != null) __obj.updateDynamic("selfClosing")(js.Any.fromFunction1(selfClosing))
    __obj.asInstanceOf[NativeHelper]
  }
}

