package typings
package atReachWindowDashSizeLib.atReachWindowDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSizeProps extends js.Object {
  def children(size: atReachWindowDashSizeLib.Anon_Height): reactLib.reactMod.ReactNode
}

object WindowSizeProps {
  @scala.inline
  def apply(children: atReachWindowDashSizeLib.Anon_Height => reactLib.reactMod.ReactNode): WindowSizeProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[WindowSizeProps]
  }
}

