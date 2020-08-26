package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadarDatasetConfig
  extends CommonDatasetConfig
     with LineScatterCandleRadarConfig
     with LineRadarConfig

object RadarDatasetConfig {
  @scala.inline
  def apply(): RadarDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarDatasetConfig]
  }
}

