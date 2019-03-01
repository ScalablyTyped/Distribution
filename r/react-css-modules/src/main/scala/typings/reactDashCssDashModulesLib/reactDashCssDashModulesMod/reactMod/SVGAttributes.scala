package typings
package reactDashCssDashModulesLib.reactDashCssDashModulesMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAttributes[T] extends js.Object {
  var styleName: js.UndefOr[java.lang.String] = js.undefined
}

object SVGAttributes {
  @scala.inline
  def apply[T](styleName: java.lang.String = null): SVGAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (styleName != null) __obj.updateDynamic("styleName")(styleName)
    __obj.asInstanceOf[SVGAttributes[T]]
  }
}

