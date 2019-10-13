package typings.reactDashScroll.modulesComponentsElementMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  @JSName("name")
  var name_ElementProps: String
}

object ElementProps {
  @scala.inline
  def apply(
    name: String,
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    id: String = null
  ): ElementProps = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ElementProps]
  }
}

