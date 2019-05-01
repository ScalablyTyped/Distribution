package typings
package reactDashRteLib.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportOptions extends js.Object {
  var customBlockFn: js.UndefOr[CustomBlockFn] = js.undefined
  var customInlineFn: js.UndefOr[CustomInlineFn] = js.undefined
  var elementStyles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* html */ java.lang.String, stdLib.HTMLBodyElement]] = js.undefined
}

object ImportOptions {
  @scala.inline
  def apply(
    customBlockFn: CustomBlockFn = null,
    customInlineFn: CustomInlineFn = null,
    elementStyles: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    parser: /* html */ java.lang.String => stdLib.HTMLBodyElement = null
  ): ImportOptions = {
    val __obj = js.Dynamic.literal()
    if (customBlockFn != null) __obj.updateDynamic("customBlockFn")(customBlockFn)
    if (customInlineFn != null) __obj.updateDynamic("customInlineFn")(customInlineFn)
    if (elementStyles != null) __obj.updateDynamic("elementStyles")(elementStyles)
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    __obj.asInstanceOf[ImportOptions]
  }
}

