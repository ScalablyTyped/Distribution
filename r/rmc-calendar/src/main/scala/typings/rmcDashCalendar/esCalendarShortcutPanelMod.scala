package typings.rmcDashCalendar

import typings.react.reactMod.Component
import typings.rmcDashCalendar.esCalendarShortcutPanelMod.PropsType
import typings.rmcDashCalendar.esCalendarShortcutPanelMod.ShortcutPanel
import typings.rmcDashCalendar.esDateDataTypesMod.Models.Locale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/es/calendar/ShortcutPanel", JSImport.Namespace)
@js.native
object esCalendarShortcutPanelMod extends js.Object {
  @js.native
  trait PropsType extends js.Object {
    var locale: Locale = js.native
    def onSelect(): Unit = js.native
    def onSelect(startDate: Date): Unit = js.native
    def onSelect(startDate: Date, endDate: Date): Unit = js.native
  }
  
  @js.native
  trait ShortcutPanel
    extends Component[PropsType, js.Object, js.Any] {
    def onClick(`type`: String): Unit = js.native
  }
  
  @js.native
  class default () extends ShortcutPanel
  
}

