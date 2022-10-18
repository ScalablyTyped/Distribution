package typings.rmcCalendar

import typings.react.mod.global.JSX.Element
import typings.rmcCalendar.anon.OnFinish
import typings.rmcCalendar.libDateDataTypesMod.Models.MonthData
import typings.std.CSSStyleDeclaration
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerMod {
  
  @JSImport("rmc-calendar/lib/DatePicker", JSImport.Default)
  @js.native
  open class default () extends DatePicker
  
  @js.native
  trait DatePicker
    extends typings.rmcCalendar.libDatePickerDotbaseMod.default {
    
    def computeHeight(data: MonthData): Unit = js.native
    def computeHeight(data: MonthData, singleMonth: typings.rmcCalendar.libDateSingleMonthMod.default): Unit = js.native
    
    def genMonthComponent(): js.UndefOr[Element] = js.native
    
    var panel: HTMLDivElement = js.native
    
    def setLayout(dom: HTMLDivElement): Unit = js.native
    
    def setPanel(dom: HTMLDivElement): Unit = js.native
    
    def setTransform(nodeStyle: CSSStyleDeclaration, value: Any): Unit = js.native
    
    def setTransition(nodeStyle: CSSStyleDeclaration, value: Any): Unit = js.native
    
    var touchHandler: OnFinish = js.native
    
    var transform: String = js.native
  }
}
