package typings
package reactDashBootstrapLib.libDropdownToggleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownToggleProps
  extends reactLib.reactMod.HTMLProps[DropdownToggle] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var bsRole: js.UndefOr[java.lang.String] = js.undefined
  var bsSize: js.UndefOr[java.lang.String] = js.undefined
   // Added since v0.30.0
  var bsStyle: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var noCaret: js.UndefOr[scala.Boolean] = js.undefined
  var useAnchor: js.UndefOr[scala.Boolean] = js.undefined
}

object DropdownToggleProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[DropdownToggle] = null,
    bsClass: java.lang.String = null,
    bsRole: java.lang.String = null,
    bsSize: java.lang.String = null,
    bsStyle: java.lang.String = null,
    noCaret: js.UndefOr[scala.Boolean] = js.undefined,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    useAnchor: js.UndefOr[scala.Boolean] = js.undefined
  ): DropdownToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsRole != null) __obj.updateDynamic("bsRole")(bsRole)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (!js.isUndefined(noCaret)) __obj.updateDynamic("noCaret")(noCaret)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(useAnchor)) __obj.updateDynamic("useAnchor")(useAnchor)
    __obj.asInstanceOf[DropdownToggleProps]
  }
}

