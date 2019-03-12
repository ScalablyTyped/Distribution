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
  def apply(toComponent: () => reactLib.reactMod.Component[_, js.Object, _], toString: () => java.lang.String): HelmetDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[HelmetDatum]
  }
}

