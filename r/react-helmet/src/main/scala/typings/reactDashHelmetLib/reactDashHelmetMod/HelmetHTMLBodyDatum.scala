package typings
package reactDashHelmetLib.reactDashHelmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetHTMLBodyDatum extends js.Object {
  def toComponent(): reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLBodyElement]
}

object HelmetHTMLBodyDatum {
  @scala.inline
  def apply(
    toComponent: js.Function0[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLBodyElement]],
    toString: js.Function0[java.lang.String]
  ): HelmetHTMLBodyDatum = {
    val __obj = js.Dynamic.literal(toComponent = toComponent, toString = toString)
  
    __obj.asInstanceOf[HelmetHTMLBodyDatum]
  }
}

