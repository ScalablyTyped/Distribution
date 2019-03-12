package typings
package rmcDashCalendarLib.libDatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker
  extends rmcDashCalendarLib.libDatePickerDotBaseMod.default {
  var panel: stdLib.HTMLDivElement = js.native
  var touchHandler: rmcDashCalendarLib.Anon_Evt = js.native
  var transform: java.lang.String = js.native
  def computeHeight(data: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.MonthData): scala.Unit = js.native
  def computeHeight(
    data: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.MonthData,
    singleMonth: rmcDashCalendarLib.libDateSingleMonthMod.default
  ): scala.Unit = js.native
  def genMonthComponent(): js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.native
  def setLayout(dom: stdLib.HTMLDivElement): scala.Unit = js.native
  def setPanel(dom: stdLib.HTMLDivElement): scala.Unit = js.native
  def setTransform(nodeStyle: stdLib.CSSStyleDeclaration, value: js.Any): scala.Unit = js.native
  def setTransition(nodeStyle: stdLib.CSSStyleDeclaration, value: js.Any): scala.Unit = js.native
}

