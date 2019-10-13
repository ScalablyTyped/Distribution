package typings.reactDashBootstrap.libDropdownToggleMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownToggleProps
  extends AllHTMLAttributes[DropdownToggle]
     with ClassAttributes[DropdownToggle] {
  var bsClass: js.UndefOr[String] = js.undefined
  var bsRole: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[String] = js.undefined
   // Added since v0.30.0
  var bsStyle: js.UndefOr[String | Null] = js.undefined
  var noCaret: js.UndefOr[Boolean] = js.undefined
  var useAnchor: js.UndefOr[Boolean] = js.undefined
}

object DropdownToggleProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[DropdownToggle] = null,
    ClassAttributes: ClassAttributes[DropdownToggle] = null,
    bsClass: String = null,
    bsRole: String = null,
    bsSize: String = null,
    bsStyle: String = null,
    noCaret: js.UndefOr[Boolean] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    useAnchor: js.UndefOr[Boolean] = js.undefined
  ): DropdownToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
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

