package typings.reactFinalFormListeners.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBlurProps extends js.Object {
  var name: String
  def children(): Unit
}

object OnBlurProps {
  @scala.inline
  def apply(children: () => Unit, name: String): OnBlurProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction0(children), name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnBlurProps]
  }
}

