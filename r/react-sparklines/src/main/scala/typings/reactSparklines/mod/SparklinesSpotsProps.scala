package typings.reactSparklines.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesSpotsProps extends js.Object {
  var size: js.UndefOr[Double] = js.undefined
  var spotColors: js.UndefOr[StringDictionary[String]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SparklinesSpotsProps {
  @scala.inline
  def apply(
    size: js.UndefOr[Double] = js.undefined,
    spotColors: StringDictionary[String] = null,
    style: CSSProperties = null
  ): SparklinesSpotsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (spotColors != null) __obj.updateDynamic("spotColors")(spotColors.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesSpotsProps]
  }
}

