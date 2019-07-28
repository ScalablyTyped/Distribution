package typings.rmcDashCalendar.libDatePickerMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.rmcDashCalendar.Anon_Evt
import typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.MonthData
import typings.std.CSSStyleDeclaration
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker
  extends typings.rmcDashCalendar.libDatePickerDotBaseMod.default {
  var panel: HTMLDivElement = js.native
  var touchHandler: Anon_Evt = js.native
  var transform: String = js.native
  def computeHeight(data: MonthData): Unit = js.native
  def computeHeight(data: MonthData, singleMonth: typings.rmcDashCalendar.libDateSingleMonthMod.default): Unit = js.native
  def genMonthComponent(): js.UndefOr[Element] = js.native
  def setLayout(dom: HTMLDivElement): Unit = js.native
  def setPanel(dom: HTMLDivElement): Unit = js.native
  def setTransform(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
  def setTransition(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
}

