package typings.reactBootstrap.dropdownToggleMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
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
    useAnchor: js.UndefOr[Boolean] = js.undefined
  ): DropdownToggleProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsRole != null) __obj.updateDynamic("bsRole")(bsRole.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(noCaret)) __obj.updateDynamic("noCaret")(noCaret.asInstanceOf[js.Any])
    if (!js.isUndefined(useAnchor)) __obj.updateDynamic("useAnchor")(useAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownToggleProps]
  }
}

