package typings.simpleTimeInputEngine

import typings.simpleTimeInputEngine.anon.ClockMode
import typings.simpleTimeInputEngine.anon.NewValue
import typings.simpleTimeInputEngine.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-time-input-engine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatTimeForDisplay(hasTimeClockMode: ClockMode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeForDisplay")(hasTimeClockMode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseInputChange(hasNewValuePreviousTimeClockMode: NewValue): Time = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInputChange")(hasNewValuePreviousTimeClockMode.asInstanceOf[js.Any]).asInstanceOf[Time]
}
