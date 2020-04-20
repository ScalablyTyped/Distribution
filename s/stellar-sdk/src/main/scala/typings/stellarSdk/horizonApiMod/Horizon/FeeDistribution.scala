package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeeDistribution extends js.Object {
  var max: String
  var min: String
  var mode: String
  var p10: String
  var p20: String
  var p30: String
  var p40: String
  var p50: String
  var p60: String
  var p70: String
  var p80: String
  var p90: String
  var p95: String
  var p99: String
}

object FeeDistribution {
  @scala.inline
  def apply(
    max: String,
    min: String,
    mode: String,
    p10: String,
    p20: String,
    p30: String,
    p40: String,
    p50: String,
    p60: String,
    p70: String,
    p80: String,
    p90: String,
    p95: String,
    p99: String
  ): FeeDistribution = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], p10 = p10.asInstanceOf[js.Any], p20 = p20.asInstanceOf[js.Any], p30 = p30.asInstanceOf[js.Any], p40 = p40.asInstanceOf[js.Any], p50 = p50.asInstanceOf[js.Any], p60 = p60.asInstanceOf[js.Any], p70 = p70.asInstanceOf[js.Any], p80 = p80.asInstanceOf[js.Any], p90 = p90.asInstanceOf[js.Any], p95 = p95.asInstanceOf[js.Any], p99 = p99.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeeDistribution]
  }
}

