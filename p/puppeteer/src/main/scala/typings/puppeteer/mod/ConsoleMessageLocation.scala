package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleMessageLocation extends js.Object {
  /**
    * Column number in the resource if known.
    */
  var columnNumber: js.UndefOr[Double] = js.undefined
  /**
    * Line number in the resource if known
    */
  var lineNumber: js.UndefOr[Double] = js.undefined
  /**
    * URL of the resource if known.
    */
  var url: js.UndefOr[String] = js.undefined
}

object ConsoleMessageLocation {
  @scala.inline
  def apply(
    columnNumber: js.UndefOr[Double] = js.undefined,
    lineNumber: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): ConsoleMessageLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnNumber)) __obj.updateDynamic("columnNumber")(columnNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumber)) __obj.updateDynamic("lineNumber")(lineNumber.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleMessageLocation]
  }
}

