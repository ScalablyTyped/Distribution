package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lg extends js.Object {
  var lg: js.UndefOr[reactstrapLib.libColMod.ColumnProps] = js.undefined
  var md: js.UndefOr[reactstrapLib.libColMod.ColumnProps] = js.undefined
  var sm: js.UndefOr[reactstrapLib.libColMod.ColumnProps] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  // custom widths
  var widths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var xl: js.UndefOr[reactstrapLib.libColMod.ColumnProps] = js.undefined
  var xs: js.UndefOr[reactstrapLib.libColMod.ColumnProps] = js.undefined
}

object Anon_Lg {
  @scala.inline
  def apply(
    lg: reactstrapLib.libColMod.ColumnProps = null,
    md: reactstrapLib.libColMod.ColumnProps = null,
    sm: reactstrapLib.libColMod.ColumnProps = null,
    tag: reactLib.reactMod.ReactType[_] = null,
    widths: js.Array[java.lang.String] = null,
    xl: reactstrapLib.libColMod.ColumnProps = null,
    xs: reactstrapLib.libColMod.ColumnProps = null
  ): Anon_Lg = {
    val __obj = js.Dynamic.literal()
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths)
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Lg]
  }
}

