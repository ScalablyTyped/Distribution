package typings
package reactDashScrollLib.modulesComponentsElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLDivElement] {
  @JSName("name")
  var name_ElementProps: java.lang.String
}

object ElementProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLDivElement] = null,
    id: java.lang.String = null
  ): ElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ElementProps]
  }
}

