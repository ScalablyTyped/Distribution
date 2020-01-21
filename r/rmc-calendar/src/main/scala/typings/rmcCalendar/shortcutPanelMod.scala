package typings.rmcCalendar

import typings.react.mod.Component
import typings.rmcCalendar.dataTypesMod.Models.Locale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/calendar/ShortcutPanel", JSImport.Namespace)
@js.native
object shortcutPanelMod extends js.Object {
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

