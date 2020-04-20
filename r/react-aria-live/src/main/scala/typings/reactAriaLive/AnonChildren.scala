package typings.reactAriaLive

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  def children(contextProps: AnonAnnounceAssertive): ReactNode
}

object AnonChildren {
  @scala.inline
  def apply(children: AnonAnnounceAssertive => ReactNode): AnonChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[AnonChildren]
  }
}

