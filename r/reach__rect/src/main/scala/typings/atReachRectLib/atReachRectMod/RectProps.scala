package typings
package atReachRectLib.atReachRectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ atReachRectLib.Anon_Rect, reactLib.reactMod.ReactNode]] = js.undefined
  var observe: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* rect */ stdLib.DOMRect, scala.Unit]] = js.undefined
}

object RectProps {
  @scala.inline
  def apply(
    children: /* args */ atReachRectLib.Anon_Rect => reactLib.reactMod.ReactNode = null,
    observe: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* rect */ stdLib.DOMRect => scala.Unit = null
  ): RectProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (!js.isUndefined(observe)) __obj.updateDynamic("observe")(observe)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[RectProps]
  }
}

