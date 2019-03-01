package typings
package reactDashRteLib.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportOptions extends js.Object {
  var customBlockFn: js.UndefOr[reactDashRteLib.CustomBlockFn] = js.undefined
  var customInlineFn: js.UndefOr[reactDashRteLib.CustomInlineFn] = js.undefined
  var elementStyles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* html */ java.lang.String, reactLib.HTMLBodyElement]] = js.undefined
}

object ImportOptions {
  @scala.inline
  def apply(
    customBlockFn: reactDashRteLib.CustomBlockFn = null,
    customInlineFn: reactDashRteLib.CustomInlineFn = null,
    elementStyles: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    parser: js.Function1[/* html */ java.lang.String, reactLib.HTMLBodyElement] = null
  ): ImportOptions = {
    val __obj = js.Dynamic.literal()
    if (customBlockFn != null) __obj.updateDynamic("customBlockFn")(customBlockFn)
    if (customInlineFn != null) __obj.updateDynamic("customInlineFn")(customInlineFn)
    if (elementStyles != null) __obj.updateDynamic("elementStyles")(elementStyles)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    __obj.asInstanceOf[ImportOptions]
  }
}

