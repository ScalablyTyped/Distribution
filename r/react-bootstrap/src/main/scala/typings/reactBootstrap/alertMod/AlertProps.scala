package typings.reactBootstrap.alertMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps
  extends AllHTMLAttributes[Alert]
     with ClassAttributes[Alert] {
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var closeLabel: js.UndefOr[String] = js.undefined
  /** @deprecated since v0.29.0 */ var dismissAfter: js.UndefOr[Double] = js.undefined
  // TODO: Add more specific type
  var onDismiss: js.UndefOr[js.Function] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Alert] = null,
    ClassAttributes: ClassAttributes[Alert] = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    closeLabel: String = null,
    dismissAfter: Int | Double = null,
    onDismiss: js.Function = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (closeLabel != null) __obj.updateDynamic("closeLabel")(closeLabel.asInstanceOf[js.Any])
    if (dismissAfter != null) __obj.updateDynamic("dismissAfter")(dismissAfter.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
}

