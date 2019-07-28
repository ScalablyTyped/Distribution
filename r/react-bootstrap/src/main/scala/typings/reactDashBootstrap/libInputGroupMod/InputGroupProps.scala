package typings.reactDashBootstrap.libInputGroupMod

import typings.react.reactMod.HTMLProps
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupProps extends HTMLProps[InputGroup] {
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
}

object InputGroupProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[InputGroup] = null, bsClass: String = null, bsSize: Sizes = null): InputGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    __obj.asInstanceOf[InputGroupProps]
  }
}

