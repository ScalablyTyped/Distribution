package typings.stellarDashSdk.libServerMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timebounds extends js.Object {
  var maxTime: Double
  var minTime: Double
}

object Timebounds {
  @scala.inline
  def apply(maxTime: Double, minTime: Double): Timebounds = {
    val __obj = js.Dynamic.literal(maxTime = maxTime, minTime = minTime)
  
    __obj.asInstanceOf[Timebounds]
  }
}

