package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/utils/timeUtil", JSImport.Namespace)
@js.native
object timeUtilMod extends js.Object {
  
  def getLastDay[DateType](generateConfig: GenerateConfig[DateType], date: DateType): String = js.native
  
  def getLowerBoundTime(
    hour: Double,
    minute: Double,
    second: Double,
    hourStep: Double,
    minuteStep: Double,
    secondStep: Double
  ): js.Tuple3[Double, Double, Double] = js.native
  
  def setTime[DateType](
    generateConfig: GenerateConfig[DateType],
    date: DateType,
    hour: Double,
    minute: Double,
    second: Double
  ): DateType = js.native
}
