package typings.reactEasyChart.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.reactEasyChart.AnonColorString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendProps extends js.Object {
  /** Override the color of the items */
  var config: js.UndefOr[js.Array[AnonColorString]] = js.undefined
  var data: js.Array[_]
  var dataId: String
  /** change list items to inline-block (default block) */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /** Override the css styles of individual components, see http://rma-consulting.github.io/react-easy-chart/legend/index.html */
  var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.undefined
}

object LegendProps {
  @scala.inline
  def apply(
    data: js.Array[_],
    dataId: String,
    config: js.Array[AnonColorString] = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    styles: StringDictionary[CSSProperties] = null
  ): LegendProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataId = dataId.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendProps]
  }
}

