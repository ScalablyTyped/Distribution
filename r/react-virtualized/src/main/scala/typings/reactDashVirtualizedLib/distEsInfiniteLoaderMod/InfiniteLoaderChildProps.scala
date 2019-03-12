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
    onRowsRendered: reactDashVirtualizedLib.Anon_StartIndex => scala.Unit,
    registerChild: js.Any => scala.Unit
  ): InfiniteLoaderChildProps = {
    val __obj = js.Dynamic.literal(onRowsRendered = js.Any.fromFunction1(onRowsRendered), registerChild = js.Any.fromFunction1(registerChild))
  
    __obj.asInstanceOf[InfiniteLoaderChildProps]
  }
}

