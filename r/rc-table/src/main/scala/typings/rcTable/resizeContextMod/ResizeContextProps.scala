package typings.rcTable.resizeContextMod

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeContextProps extends js.Object {
  def onColumnResize(columnKey: Key, width: Double): Unit
}

object ResizeContextProps {
  @scala.inline
  def apply(onColumnResize: (Key, Double) => Unit): ResizeContextProps = {
    val __obj = js.Dynamic.literal(onColumnResize = js.Any.fromFunction2(onColumnResize))
  
    __obj.asInstanceOf[ResizeContextProps]
  }
}

