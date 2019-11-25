package typings.reactDashVirtualizedDashSelect.reactDashVirtualizedDashSelectMod

import typings.reactDashVirtualized.distEsListMod.ListProps
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualizedOptionRenderOptions[T] extends js.Object {
  var focusedOption: T
  var focusedOptionIndex: Double
  var key: String
  var labelKey: String
  var listProps: ListProps
  var option: T
  var options: js.Array[T]
  var style: Record[String, String]
  var valueArray: js.Array[T]
  def focusOption(option: T): Unit
  def selectValue(option: T): Unit
}

object VirtualizedOptionRenderOptions {
  @scala.inline
  def apply[T](
    focusOption: T => Unit,
    focusedOption: T,
    focusedOptionIndex: Double,
    key: String,
    labelKey: String,
    listProps: ListProps,
    option: T,
    options: js.Array[T],
    selectValue: T => Unit,
    style: Record[String, String],
    valueArray: js.Array[T]
  ): VirtualizedOptionRenderOptions[T] = {
    val __obj = js.Dynamic.literal(focusOption = js.Any.fromFunction1(focusOption), focusedOption = focusedOption.asInstanceOf[js.Any], focusedOptionIndex = focusedOptionIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], listProps = listProps.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectValue = js.Any.fromFunction1(selectValue), style = style.asInstanceOf[js.Any], valueArray = valueArray.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualizedOptionRenderOptions[T]]
  }
}

