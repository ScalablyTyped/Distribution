package typings
package reactDashHelmetLib.reactDashHelmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetHTMLElementDatum extends js.Object {
  def toComponent(): reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
}

object HelmetHTMLElementDatum {
  @scala.inline
  def apply(
    toComponent: () => reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement],
    toString: () => java.lang.String
  ): HelmetHTMLElementDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[HelmetHTMLElementDatum]
  }
}

