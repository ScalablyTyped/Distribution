package typings
package atRebassGridLib.atRebassGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps
  extends reactLib.reactMod.Props[js.Any] {
  var as: js.UndefOr[reactLib.reactMod.ElementType[_]] = js.undefined
  var css: js.UndefOr[styledDashComponentsLib.styledDashComponentsMod.Interpolation[_]] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(
    as: reactLib.reactMod.ElementType[_] = null,
    children: reactLib.reactMod.ReactNode = null,
    css: styledDashComponentsLib.styledDashComponentsMod.Interpolation[_] = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[js.Any] = null
  ): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

