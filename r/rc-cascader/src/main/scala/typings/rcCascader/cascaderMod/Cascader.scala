package typings.rcCascader.cascaderMod

import typings.rcCascader.anon.Visible
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader
  extends Component[CascaderProps, CascaderState, js.Any] {
  var defaultFieldNames: js.Object = js.native
  var trigger: js.Any = js.native
  def getActiveOptions(activeValue: CascaderValueType): js.Array[CascaderOption] = js.native
  def getCurrentLevelOptions(): js.Array[CascaderOption] = js.native
  def getFieldName(name: String): String = js.native
  def getFieldNames(): CascaderFieldNames = js.native
  def getPopupDOMNode(): js.Any = js.native
  def handleChange(options: js.Array[CascaderOption], hasVisible: Visible, e: KeyboardEvent[HTMLElement]): Unit = js.native
  def handleItemDoubleClick(): Unit = js.native
  def handleKeyDown(e: KeyboardEvent[HTMLElement]): Unit = js.native
  def handleMenuSelect(targetOption: CascaderOption, menuIndex: Double, e: KeyboardEvent[HTMLElement]): Unit = js.native
  def handlePopupVisibleChange(popupVisible: Boolean): Unit = js.native
  def saveTrigger(node: js.Any): Unit = js.native
  def setPopupVisible(popupVisible: Boolean): Unit = js.native
}

