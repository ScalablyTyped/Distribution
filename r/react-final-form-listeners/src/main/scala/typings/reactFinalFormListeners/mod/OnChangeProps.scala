package typings.reactFinalFormListeners.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChangeProps extends js.Object {
  var name: String
  def children(value: js.Any, previous: js.Any): Unit
}

object OnChangeProps {
  @scala.inline
  def apply(children: (js.Any, js.Any) => Unit, name: String): OnChangeProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnChangeProps]
  }
}

