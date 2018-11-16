package typings
package reactDashVirtualizedDashSelectLib.reactDashVirtualizedDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VirtualizedOptionRenderOptions[T] extends js.Object {
  var focusedOption: T
  var focusedOptionIndex: scala.Double
  var key: java.lang.String
  var labelKey: java.lang.String
  var listProps: reactDashVirtualizedLib.distEsListMod.ListProps
  var option: T
  var options: js.Array[T]
  var style: stdLib.Record[java.lang.String, java.lang.String]
  var valueArray: js.Array[T]
  def focusOption(option: T): scala.Unit
  def selectValue(option: T): scala.Unit
}

