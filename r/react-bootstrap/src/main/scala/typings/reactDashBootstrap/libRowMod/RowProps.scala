package typings.reactDashBootstrap.libRowMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends HTMLProps[Row] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[Row] = null, componentClass: ReactType[_] = null): RowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

