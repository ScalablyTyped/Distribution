package typings.reactDashHelmet.reactDashHelmetMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLBodyElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetHTMLBodyDatum extends js.Object {
  def toComponent(): HTMLAttributes[HTMLBodyElement]
}

object HelmetHTMLBodyDatum {
  @scala.inline
  def apply(toComponent: () => HTMLAttributes[HTMLBodyElement]): HelmetHTMLBodyDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
  
    __obj.asInstanceOf[HelmetHTMLBodyDatum]
  }
}

