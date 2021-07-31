package typings.reactBigCalendar.mod

import typings.react.mod.Component
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-big-calendar", "Week")
@js.native
class Week protected ()
  extends Component[WeekProps, js.Object, js.Any] {
  def this(props: WeekProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: WeekProps, context: js.Any) = this()
}
/* static members */
object Week {
  
  @JSImport("react-big-calendar", "Week")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def navigate(date: Date, action: NavigateAction): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(date.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def range(date: Date): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  
  @scala.inline
  def title(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("title")(date.asInstanceOf[js.Any]).asInstanceOf[String]
}
