package typings.reactDashBootstrap.libFormMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends HTMLProps[Form] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[Form] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[FormProps]
  }
}

