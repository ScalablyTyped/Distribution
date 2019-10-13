package typings.reactDashBootstrap.libRowMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps
  extends AllHTMLAttributes[Row]
     with ClassAttributes[Row] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Row] = null,
    ClassAttributes: ClassAttributes[Row] = null,
    componentClass: ReactType[_] = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

