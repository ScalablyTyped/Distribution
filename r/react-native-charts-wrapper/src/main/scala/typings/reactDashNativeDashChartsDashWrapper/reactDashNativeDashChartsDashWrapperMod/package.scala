package typings.reactDashNativeDashChartsDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashChartsDashWrapperMod {
  import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
  import typings.reactDashNativeDashChartsDashWrapper.Anon_Action
  import typings.reactDashNativeDashChartsDashWrapper.Anon_XY

  type ChartChangeEvent = NativeSyntheticEvent[Anon_Action]
  type ChartSelectEvent = NativeSyntheticEvent[Anon_XY | Null]
  type Color = Double
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.largeValue
    - typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.percent
    - typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.date
    - java.lang.String
    - js.Array[java.lang.String]
  */
  type ValueFormatter = _ValueFormatter | js.Array[String] | String
}
