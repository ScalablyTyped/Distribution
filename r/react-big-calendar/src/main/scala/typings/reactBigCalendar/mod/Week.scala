package typings.reactBigCalendar.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-big-calendar", "Week")
@js.native
open class Week protected ()
  extends Component[WeekProps, js.Object, Any] {
  def this(props: WeekProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: WeekProps, context: Any) = this()
}
/* static members */
object Week {
  
  @JSImport("react-big-calendar", "Week")
  @js.native
  val ^ : js.Any = js.native
  
  inline def navigate(date: js.Date, action: NavigateAction): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(date.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def range(date: js.Date): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  
  inline def title(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("title")(date.asInstanceOf[js.Any]).asInstanceOf[String]
}
