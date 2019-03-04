package typings
package reactDashHelmetLib.reactDashHelmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetHTMLElementDatum extends js.Object {
  def toComponent(): reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]
}

object HelmetHTMLElementDatum {
  @scala.inline
  def apply(
    toComponent: js.Function0[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]],
    toString: js.Function0[java.lang.String]
  ): HelmetHTMLElementDatum = {
    val __obj = js.Dynamic.literal(toComponent = toComponent, toString = toString)
  
    __obj.asInstanceOf[HelmetHTMLElementDatum]
  }
}

