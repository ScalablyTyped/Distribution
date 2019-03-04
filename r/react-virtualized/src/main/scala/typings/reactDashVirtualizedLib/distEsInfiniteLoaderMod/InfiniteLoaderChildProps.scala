package typings
package reactDashVirtualizedLib.distEsInfiniteLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteLoaderChildProps extends js.Object {
  def onRowsRendered(params: reactDashVirtualizedLib.Anon_StartIndex): scala.Unit
  def registerChild(registeredChild: js.Any): scala.Unit
}

object InfiniteLoaderChildProps {
  @scala.inline
  def apply(
    onRowsRendered: js.Function1[reactDashVirtualizedLib.Anon_StartIndex, scala.Unit],
    registerChild: js.Function1[js.Any, scala.Unit]
  ): InfiniteLoaderChildProps = {
    val __obj = js.Dynamic.literal(onRowsRendered = onRowsRendered, registerChild = registerChild)
  
    __obj.asInstanceOf[InfiniteLoaderChildProps]
  }
}

