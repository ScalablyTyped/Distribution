package typings.reactDashBootstrap.libInputGroupAddonMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupAddonProps extends HTMLProps[InputGroupAddon] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object InputGroupAddonProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[InputGroupAddon] = null, bsClass: String = null): InputGroupAddonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[InputGroupAddonProps]
  }
}

