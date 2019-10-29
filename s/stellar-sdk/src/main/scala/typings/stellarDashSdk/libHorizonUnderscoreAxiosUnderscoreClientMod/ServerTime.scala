package typings.stellarDashSdk.libHorizonUnderscoreAxiosUnderscoreClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerTime extends js.Object {
  var localTimeRecorded: Double
  var serverTime: Double
}

object ServerTime {
  @scala.inline
  def apply(localTimeRecorded: Double, serverTime: Double): ServerTime = {
    val __obj = js.Dynamic.literal(localTimeRecorded = localTimeRecorded, serverTime = serverTime)
  
    __obj.asInstanceOf[ServerTime]
  }
}

