package typings.reactDashRte.reactDashRteMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
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
    customBlockFn: /* element */ Element => js.UndefOr[Null | CustomBlockObject] = null,
    customInlineFn: (/* element */ Element, /* inlineCreators */ InlineCreators) => js.UndefOr[
      Null | Style | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
    ] = null,
    elementStyles: StringDictionary[String] = null,
    parser: /* html */ String => HTMLBodyElement = null
  ): ImportOptions = {
    val __obj = js.Dynamic.literal()
    if (customBlockFn != null) __obj.updateDynamic("customBlockFn")(js.Any.fromFunction1(customBlockFn))
    if (customInlineFn != null) __obj.updateDynamic("customInlineFn")(js.Any.fromFunction2(customInlineFn))
    if (elementStyles != null) __obj.updateDynamic("elementStyles")(elementStyles.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    __obj.asInstanceOf[ImportOptions]
  }
}

