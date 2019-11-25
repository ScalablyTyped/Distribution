package typings.puppeteer.puppeteerMod

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
  def apply(columnNumber: Int | Double = null, lineNumber: Int | Double = null, url: String = null): ConsoleMessageLocation = {
    val __obj = js.Dynamic.literal()
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleMessageLocation]
  }
}

