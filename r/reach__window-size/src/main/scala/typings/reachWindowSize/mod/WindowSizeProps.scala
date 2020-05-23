package typings.reachWindowSize.mod

import typings.reachWindowSize.anon.Height
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeProps extends js.Object {
  def children(size: Height): ReactNode
}

object WindowSizeProps {
  @scala.inline
  def apply(children: Height => ReactNode): WindowSizeProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[WindowSizeProps]
  }
}

