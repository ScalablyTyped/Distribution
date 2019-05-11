package typings
package rmcDashCalendarLib.esDatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker
  extends rmcDashCalendarLib.esDatePickerDotBaseMod.default {
  var panel: stdLib.HTMLDivElement = js.native
  var touchHandler: rmcDashCalendarLib.Anon_Evt = js.native
  var transform: java.lang.String = js.native
  def computeHeight(data: rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData): scala.Unit = js.native
  def computeHeight(
    data: rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData,
    singleMonth: rmcDashCalendarLib.esDateSingleMonthMod.default
  ): scala.Unit = js.native
  def genMonthComponent(): js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.native
  def setLayout(dom: stdLib.HTMLDivElement): scala.Unit = js.native
  def setPanel(dom: stdLib.HTMLDivElement): scala.Unit = js.native
  def setTransform(nodeStyle: stdLib.CSSStyleDeclaration, value: js.Any): scala.Unit = js.native
  def setTransition(nodeStyle: stdLib.CSSStyleDeclaration, value: js.Any): scala.Unit = js.native
}

