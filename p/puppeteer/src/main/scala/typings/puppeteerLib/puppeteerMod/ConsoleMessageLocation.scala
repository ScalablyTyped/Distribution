package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleMessageLocation extends js.Object {
  /**
    * Column number in the resource if known.
    */
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  /**
    * Line number in the resource if known
    */
  var lineNumber: js.UndefOr[scala.Double] = js.undefined
  /**
    * URL of the resource if known.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ConsoleMessageLocation {
  @scala.inline
  def apply(
    columnNumber: scala.Int | scala.Double = null,
    lineNumber: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): ConsoleMessageLocation = {
    val __obj = js.Dynamic.literal()
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ConsoleMessageLocation]
  }
}

