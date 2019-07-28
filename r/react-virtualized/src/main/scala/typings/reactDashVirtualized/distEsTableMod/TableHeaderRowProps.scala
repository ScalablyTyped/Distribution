package typings.reactDashVirtualized.distEsTableMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderRowProps extends js.Object {
  var className: String
  var columns: js.Array[ReactNode]
  var height: Double
  var scrollbarWidth: Double
  var style: CSSProperties
  var width: Double
}

object TableHeaderRowProps {
  @scala.inline
  def apply(
    className: String,
    columns: js.Array[ReactNode],
    height: Double,
    scrollbarWidth: Double,
    style: CSSProperties,
    width: Double
  ): TableHeaderRowProps = {
    val __obj = js.Dynamic.literal(className = className, columns = columns, height = height, scrollbarWidth = scrollbarWidth, style = style, width = width)
  
    __obj.asInstanceOf[TableHeaderRowProps]
  }
}

