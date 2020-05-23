package typings.reactAriaLive.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  def children(contextProps: AnnounceAssertive): ReactNode
}

object Children {
  @scala.inline
  def apply(children: AnnounceAssertive => ReactNode): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[Children]
  }
}

