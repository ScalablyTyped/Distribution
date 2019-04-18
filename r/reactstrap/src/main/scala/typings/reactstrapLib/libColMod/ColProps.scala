package typings
package reactstrapLib.libColMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var lg: js.UndefOr[ColumnProps] = js.undefined
  var md: js.UndefOr[ColumnProps] = js.undefined
  var sm: js.UndefOr[ColumnProps] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  // custom widths
  var widths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var xl: js.UndefOr[ColumnProps] = js.undefined
  var xs: js.UndefOr[ColumnProps] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    lg: ColumnProps = null,
    md: ColumnProps = null,
    sm: ColumnProps = null,
    tag: reactLib.reactMod.ReactType[_] = null,
    widths: js.Array[java.lang.String] = null,
    xl: ColumnProps = null,
    xs: ColumnProps = null
  ): ColProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths)
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColProps]
  }
}

