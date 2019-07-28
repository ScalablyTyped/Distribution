package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogTitleProps
  extends HTMLProps[js.Any]
     with CustomRenderedComponent

object DialogTitleProps {
  @scala.inline
  def apply(CustomRenderedComponent: CustomRenderedComponent = null, HTMLProps: HTMLProps[js.Any] = null): DialogTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    __obj.asInstanceOf[DialogTitleProps]
  }
}

