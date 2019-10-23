package typings.reactDashHelmet.reactDashHelmetMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLHtmlElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetHTMLElementDatum extends js.Object {
  def toComponent(): HTMLAttributes[HTMLHtmlElement]
}

object HelmetHTMLElementDatum {
  @scala.inline
  def apply(toComponent: () => HTMLAttributes[HTMLHtmlElement], toString: () => String): HelmetHTMLElementDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[HelmetHTMLElementDatum]
  }
}

