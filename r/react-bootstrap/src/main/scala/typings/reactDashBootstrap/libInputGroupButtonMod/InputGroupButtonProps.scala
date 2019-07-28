package typings.reactDashBootstrap.libInputGroupButtonMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupButtonProps extends HTMLProps[InputGroupButton] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object InputGroupButtonProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[InputGroupButton] = null, bsClass: String = null): InputGroupButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[InputGroupButtonProps]
  }
}

