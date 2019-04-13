package typings
package reactDashSparklinesLib.reactDashSparklinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesSpotsProps extends js.Object {
  var size: js.UndefOr[scala.Double] = js.undefined
  var spotColors: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object SparklinesSpotsProps {
  @scala.inline
  def apply(
    size: scala.Int | scala.Double = null,
    spotColors: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): SparklinesSpotsProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spotColors != null) __obj.updateDynamic("spotColors")(spotColors)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SparklinesSpotsProps]
  }
}

