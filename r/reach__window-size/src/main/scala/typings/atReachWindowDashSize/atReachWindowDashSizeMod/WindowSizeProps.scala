package typings.atReachWindowDashSize.atReachWindowDashSizeMod

import typings.atReachWindowDashSize.Anon_Height
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeProps extends js.Object {
  def children(size: Anon_Height): ReactNode
}

object WindowSizeProps {
  @scala.inline
  def apply(children: Anon_Height => ReactNode): WindowSizeProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[WindowSizeProps]
  }
}

