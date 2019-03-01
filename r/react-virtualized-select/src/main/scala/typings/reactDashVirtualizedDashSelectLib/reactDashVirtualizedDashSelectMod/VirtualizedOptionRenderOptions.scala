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
    focusOption: js.Function1[T, scala.Unit],
    focusedOption: T,
    focusedOptionIndex: scala.Double,
    key: java.lang.String,
    labelKey: java.lang.String,
    listProps: reactDashVirtualizedLib.distEsListMod.ListProps,
    option: T,
    options: js.Array[T],
    selectValue: js.Function1[T, scala.Unit],
    style: stdLib.Record[java.lang.String, java.lang.String],
    valueArray: js.Array[T]
  ): VirtualizedOptionRenderOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focusOption")(focusOption)
    __obj.updateDynamic("focusedOption")(focusedOption.asInstanceOf[js.Any])
    __obj.updateDynamic("focusedOptionIndex")(focusedOptionIndex)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("labelKey")(labelKey)
    __obj.updateDynamic("listProps")(listProps)
    __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("selectValue")(selectValue)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("valueArray")(valueArray)
    __obj.asInstanceOf[VirtualizedOptionRenderOptions[T]]
  }
}

