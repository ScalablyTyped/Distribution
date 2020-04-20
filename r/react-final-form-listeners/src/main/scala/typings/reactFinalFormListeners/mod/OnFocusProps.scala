package typings.reactFinalFormListeners.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFocusProps extends js.Object {
  var name: String
  def children(): Unit
}

object OnFocusProps {
  @scala.inline
  def apply(children: () => Unit, name: String): OnFocusProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction0(children), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFocusProps]
  }
}

