package typings.reactCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ClickWeekNumberCallback = js.Function2[/* weekNumber */ scala.Double, /* date */ typings.std.Date, scala.Unit]
  
  type DateCallback = js.Function1[/* date */ typings.std.Date, scala.Unit]
  
  type FormatterCallback = js.Function2[/* locale */ java.lang.String, /* date */ typings.std.Date, java.lang.String]
  
  type OnChangeDateCallback = js.Function1[/* date */ typings.std.Date | js.Array[typings.std.Date], scala.Unit]
  
  type ViewCallback = js.Function1[/* props */ typings.reactCalendar.mod.ViewCallbackProperties, scala.Unit]
}
