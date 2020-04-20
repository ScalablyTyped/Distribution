package typings.reactFinalFormListeners.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternallyChangedProps extends js.Object {
  var name: String
  def children(externallyChanged: Boolean): ReactNode
}

object ExternallyChangedProps {
  @scala.inline
  def apply(children: Boolean => ReactNode, name: String): ExternallyChangedProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternallyChangedProps]
  }
}

