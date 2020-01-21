package typings.rmcCalendar

import typings.react.mod._Global_.JSX.Element
import typings.rmcCalendar.dataTypesMod.Models.MonthData
import typings.std.CSSStyleDeclaration
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/DatePicker", JSImport.Namespace)
@js.native
object datePickerMod extends js.Object {
  @js.native
  trait DatePicker
    extends typings.rmcCalendar.datePickerBaseMod.default {
    var panel: HTMLDivElement = js.native
    var touchHandler: AnonEvt = js.native
    var transform: String = js.native
    def computeHeight(data: MonthData): Unit = js.native
    def computeHeight(data: MonthData, singleMonth: typings.rmcCalendar.singleMonthMod.default): Unit = js.native
    def genMonthComponent(): js.UndefOr[Element] = js.native
    def setLayout(dom: HTMLDivElement): Unit = js.native
    def setPanel(dom: HTMLDivElement): Unit = js.native
    def setTransform(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
    def setTransition(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends DatePicker
  
}

