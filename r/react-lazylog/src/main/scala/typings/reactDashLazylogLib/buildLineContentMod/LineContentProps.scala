package typings
package reactDashLazylogLib.buildLineContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineContentProps extends js.Object {
  var data: js.Array[reactDashLazylogLib.Anon_Text]
  var formatPart: js.UndefOr[js.Function1[/* text */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var number: scala.Double
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object LineContentProps {
  @scala.inline
  def apply(
    data: js.Array[reactDashLazylogLib.Anon_Text],
    number: scala.Double,
    formatPart: js.Function1[/* text */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): LineContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("number")(number)
    if (formatPart != null) __obj.updateDynamic("formatPart")(formatPart)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LineContentProps]
  }
}

