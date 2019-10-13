package typings.reactDashBootstrap.libFormMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps
  extends AllHTMLAttributes[Form]
     with ClassAttributes[Form] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Form] = null,
    ClassAttributes: ClassAttributes[Form] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[FormProps]
  }
}

