package typings.reactDashBootstrap.libGridMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends HTMLProps[Grid] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var fluid: js.UndefOr[Boolean] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[Grid] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    fluid: js.UndefOr[Boolean] = js.undefined
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    __obj.asInstanceOf[GridProps]
  }
}

