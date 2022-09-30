package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WeatherCondition extends StObject
/** Types of weather returned by UserContextSystem’s requestWeatherCondition() callback. Lens Studio v2.1+ */
@JSGlobal("WeatherCondition")
@js.native
object WeatherCondition extends StObject {
  
  @js.native
  sealed trait ClearNight
    extends StObject
       with WeatherCondition
  
  @js.native
  sealed trait Cloudy
    extends StObject
       with WeatherCondition
  
  @js.native
  sealed trait Hail
    extends StObject
       with WeatherCondition
  
  @js.native
  sealed trait Lightning
    extends StObject
       with WeatherCondition
  
  @js.native
  sealed trait LowVisibility
    extends StObject
       with WeatherCondition
  
  @js.native
  sealed trait PartlyCloudy
    extends StObject
       with WeatherCondition
  
  @js.native
  sealed trait Rainy
    extends StObject
       with WeatherCondition
  
  @js.native
  sealed trait Snow
    extends StObject
       with WeatherCondition
  
  @js.native
  sealed trait Sunny
    extends StObject
       with WeatherCondition
  
  /** Unknown or unsupported weather condition */
  @js.native
  sealed trait Unknown
    extends StObject
       with WeatherCondition
  
  @js.native
  sealed trait Windy
    extends StObject
       with WeatherCondition
}
