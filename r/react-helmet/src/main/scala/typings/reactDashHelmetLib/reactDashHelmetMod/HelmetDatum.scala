package typings
package reactDashHelmetLib.reactDashHelmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetDatum extends js.Object {
  def toComponent(): reactLib.reactMod.Component[_, js.Object, _]
}

object HelmetDatum {
  @scala.inline
  def apply(
    toComponent: js.Function0[reactLib.reactMod.Component[_, js.Object, _]],
    toString: js.Function0[java.lang.String]
  ): HelmetDatum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toComponent")(toComponent)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[HelmetDatum]
  }
}

