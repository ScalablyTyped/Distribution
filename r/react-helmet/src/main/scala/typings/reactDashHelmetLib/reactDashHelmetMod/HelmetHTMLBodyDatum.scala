package typings
package reactDashHelmetLib.reactDashHelmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetHTMLBodyDatum extends js.Object {
  def toComponent(): reactLib.reactMod.HTMLAttributes[stdLib.HTMLBodyElement]
}

object HelmetHTMLBodyDatum {
  @scala.inline
  def apply(
    toComponent: () => reactLib.reactMod.HTMLAttributes[stdLib.HTMLBodyElement],
    toString: () => java.lang.String
  ): HelmetHTMLBodyDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[HelmetHTMLBodyDatum]
  }
}

