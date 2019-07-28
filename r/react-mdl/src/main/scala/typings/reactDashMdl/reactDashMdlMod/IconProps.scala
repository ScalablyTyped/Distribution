package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps
  extends HTMLProps[js.Any] {
  @JSName("name")
  var name_IconProps: String
}

object IconProps {
  @scala.inline
  def apply(name: String, HTMLProps: HTMLProps[js.Any] = null): IconProps = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    __obj.asInstanceOf[IconProps]
  }
}

