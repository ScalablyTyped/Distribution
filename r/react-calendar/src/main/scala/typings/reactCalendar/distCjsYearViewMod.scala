package typings.reactCalendar

import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.anon.TypeofMonths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsYearViewMod {
  
  @JSImport("react-calendar/dist/cjs/YearView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: YearViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type YearViewProps = ComponentProps[TypeofMonths]
}
