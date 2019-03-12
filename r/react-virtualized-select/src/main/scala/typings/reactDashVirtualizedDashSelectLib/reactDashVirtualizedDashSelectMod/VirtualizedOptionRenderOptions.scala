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

object VirtualizedOptionRenderOptions {
  @scala.inline
  def apply[T](
    focusOption: T => scala.Unit,
    focusedOption: T,
    focusedOptionIndex: scala.Double,
    key: java.lang.String,
    labelKey: java.lang.String,
    listProps: reactDashVirtualizedLib.distEsListMod.ListProps,
    option: T,
    options: js.Array[T],
    selectValue: T => scala.Unit,
    style: stdLib.Record[java.lang.String, java.lang.String],
    valueArray: js.Array[T]
  ): VirtualizedOptionRenderOptions[T] = {
    val __obj = js.Dynamic.literal(focusOption = js.Any.fromFunction1(focusOption), focusedOption = focusedOption.asInstanceOf[js.Any], focusedOptionIndex = focusedOptionIndex, key = key, labelKey = labelKey, listProps = listProps, option = option.asInstanceOf[js.Any], options = options, selectValue = js.Any.fromFunction1(selectValue), style = style, valueArray = valueArray)
  
    __obj.asInstanceOf[VirtualizedOptionRenderOptions[T]]
  }
}

