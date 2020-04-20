package typings.reactHelmet.mod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLHtmlElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetHTMLElementDatum extends js.Object {
  def toComponent(): HTMLAttributes[HTMLHtmlElement]
}

object HelmetHTMLElementDatum {
  @scala.inline
  def apply(toComponent: () => HTMLAttributes[HTMLHtmlElement]): HelmetHTMLElementDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
    __obj.asInstanceOf[HelmetHTMLElementDatum]
  }
}

