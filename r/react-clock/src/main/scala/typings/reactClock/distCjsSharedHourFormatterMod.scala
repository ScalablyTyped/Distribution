package typings.reactClock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedHourFormatterMod {
  
  @JSImport("react-clock/dist/cjs/shared/hourFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatHour(locale: String, hour: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatHour")(locale.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatHour(locale: Unit, hour: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatHour")(locale.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[String]
}
