package typings.reactstrap.libColMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps
  extends HTMLProps[HTMLDivElement]
     with /* key */ StringDictionary[js.Any] {
  var lg: js.UndefOr[ColumnProps] = js.undefined
  var md: js.UndefOr[ColumnProps] = js.undefined
  var sm: js.UndefOr[ColumnProps] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
  // custom widths
  var widths: js.UndefOr[js.Array[String]] = js.undefined
  var xl: js.UndefOr[ColumnProps] = js.undefined
  var xs: js.UndefOr[ColumnProps] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLDivElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    lg: ColumnProps = null,
    md: ColumnProps = null,
    sm: ColumnProps = null,
    tag: ReactType[_] = null,
    widths: js.Array[String] = null,
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

