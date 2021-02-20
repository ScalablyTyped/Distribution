package typings.rmcCalendar

import typings.react.mod.global.JSX.Element
import typings.rmcCalendar.anon.OnFinish
import typings.rmcCalendar.dataTypesMod.Models.MonthData
import typings.std.CSSStyleDeclaration
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("rmc-calendar/lib/DatePicker", JSImport.Default)
  @js.native
  class default () extends DatePicker
  
  @js.native
  trait DatePicker
    extends typings.rmcCalendar.datePickerBaseMod.default {
    
    def computeHeight(data: MonthData): Unit = js.native
    def computeHeight(data: MonthData, singleMonth: typings.rmcCalendar.singleMonthMod.default): Unit = js.native
    
    def genMonthComponent(): js.UndefOr[Element] = js.native
    
    var panel: HTMLDivElement = js.native
    
    def setLayout(dom: HTMLDivElement): Unit = js.native
    
    def setPanel(dom: HTMLDivElement): Unit = js.native
    
    def setTransform(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
    
    def setTransition(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
    
    var touchHandler: OnFinish = js.native
    
    var transform: String = js.native
  }
}
