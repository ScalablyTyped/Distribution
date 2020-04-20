package typings.reactVirtualized.esInfiniteLoaderMod

import typings.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteLoaderChildProps extends js.Object {
  def onRowsRendered(params: IndexRange): Unit
  def registerChild(registeredChild: js.Any): Unit
}

object InfiniteLoaderChildProps {
  @scala.inline
  def apply(onRowsRendered: IndexRange => Unit, registerChild: js.Any => Unit): InfiniteLoaderChildProps = {
    val __obj = js.Dynamic.literal(onRowsRendered = js.Any.fromFunction1(onRowsRendered), registerChild = js.Any.fromFunction1(registerChild))
    __obj.asInstanceOf[InfiniteLoaderChildProps]
  }
}

