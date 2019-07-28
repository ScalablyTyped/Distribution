package typings.reactDashTether

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppendChild extends js.Object {
  def appendChild(element: HTMLElement): Unit
}

object Anon_AppendChild {
  @scala.inline
  def apply(appendChild: HTMLElement => Unit): Anon_AppendChild = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild))
  
    __obj.asInstanceOf[Anon_AppendChild]
  }
}

