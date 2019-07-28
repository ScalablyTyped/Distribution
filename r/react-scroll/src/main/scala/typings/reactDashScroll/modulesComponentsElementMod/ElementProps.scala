package typings.reactDashScroll.modulesComponentsElementMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementProps extends HTMLProps[HTMLDivElement] {
  @JSName("name")
  var name_ElementProps: String
}

object ElementProps {
  @scala.inline
  def apply(name: String, HTMLProps: HTMLProps[HTMLDivElement] = null, id: String = null): ElementProps = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ElementProps]
  }
}

