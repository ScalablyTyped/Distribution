package typings.rmcCalendar

import typings.react.mod.PureComponent
import typings.rmcCalendar.libDateDataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateWeekPanelMod {
  
  @JSImport("rmc-calendar/lib/date/WeekPanel", JSImport.Default)
  @js.native
  open class default protected () extends WeekPanel {
    def this(props: PropsType) = this()
  }
  
  trait PropsType extends StObject {
    
    var locale: Locale
  }
  object PropsType {
    
    inline def apply(locale: Locale): PropsType = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WeekPanel
    extends PureComponent[PropsType, js.Object, Any]
}
