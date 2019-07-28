package typings.reactDashBootstrap.libHelpBlockMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelpBlockProps extends HTMLProps[HelpBlock] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object HelpBlockProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[HelpBlock] = null, bsClass: String = null): HelpBlockProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[HelpBlockProps]
  }
}

