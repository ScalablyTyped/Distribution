package typings.reactDashRte.reactDashRteMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLBodyElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportOptions extends js.Object {
  var customBlockFn: js.UndefOr[CustomBlockFn] = js.undefined
  var customInlineFn: js.UndefOr[CustomInlineFn] = js.undefined
  var elementStyles: js.UndefOr[StringDictionary[String]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* html */ String, HTMLBodyElement]] = js.undefined
}

object ImportOptions {
  @scala.inline
  def apply(
    customBlockFn: CustomBlockFn = null,
    customInlineFn: CustomInlineFn = null,
    elementStyles: StringDictionary[String] = null,
    parser: /* html */ String => HTMLBodyElement = null
  ): ImportOptions = {
    val __obj = js.Dynamic.literal()
    if (customBlockFn != null) __obj.updateDynamic("customBlockFn")(customBlockFn)
    if (customInlineFn != null) __obj.updateDynamic("customInlineFn")(customInlineFn)
    if (elementStyles != null) __obj.updateDynamic("elementStyles")(elementStyles)
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    __obj.asInstanceOf[ImportOptions]
  }
}

