package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeUtilMod {
  
  @JSImport("rc-picker/es/utils/timeUtil", "getLastDay")
  @js.native
  def getLastDay[DateType](generateConfig: GenerateConfig[DateType], date: DateType): String = js.native
  
  @JSImport("rc-picker/es/utils/timeUtil", "getLowerBoundTime")
  @js.native
  def getLowerBoundTime(
    hour: Double,
    minute: Double,
    second: Double,
    hourStep: Double,
    minuteStep: Double,
    secondStep: Double
  ): js.Tuple3[Double, Double, Double] = js.native
  
  @JSImport("rc-picker/es/utils/timeUtil", "setTime")
  @js.native
  def setTime[DateType](
    generateConfig: GenerateConfig[DateType],
    date: DateType,
    hour: Double,
    minute: Double,
    second: Double
  ): DateType = js.native
}
