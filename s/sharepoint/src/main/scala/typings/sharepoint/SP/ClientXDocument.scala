package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientXDocument extends js.Object {
  def get_root(): XElement
  def set_root(value: XElement): Unit
}

object ClientXDocument {
  @scala.inline
  def apply(get_root: () => XElement, set_root: XElement => Unit): ClientXDocument = {
    val __obj = js.Dynamic.literal(get_root = js.Any.fromFunction0(get_root), set_root = js.Any.fromFunction1(set_root))
    __obj.asInstanceOf[ClientXDocument]
  }
}

