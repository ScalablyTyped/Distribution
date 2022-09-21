package typings.reactDates

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isSameDayMod {
  
  @JSImport("react-dates/esm/utils/isSameDay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: Moment, b: Moment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
