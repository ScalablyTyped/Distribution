package typings.rmcDashCalendar

import typings.react.reactMod.Global.JSX.Element
import typings.rmcDashCalendar.esDateDataTypesMod.Models.MonthData
import typings.rmcDashCalendar.esDatePickerMod.DatePicker
import typings.std.CSSStyleDeclaration
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/es/DatePicker", JSImport.Namespace)
@js.native
object esDatePickerMod extends js.Object {
  @js.native
  trait DatePicker
    extends typings.rmcDashCalendar.esDatePickerDotBaseMod.default {
    var panel: HTMLDivElement = js.native
    var touchHandler: Anon_Evt = js.native
    var transform: String = js.native
    def computeHeight(data: MonthData): Unit = js.native
    def computeHeight(data: MonthData, singleMonth: typings.rmcDashCalendar.esDateSingleMonthMod.default): Unit = js.native
    def genMonthComponent(): js.UndefOr[Element] = js.native
    def setLayout(dom: HTMLDivElement): Unit = js.native
    def setPanel(dom: HTMLDivElement): Unit = js.native
    def setTransform(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
    def setTransition(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends DatePicker
  
}

