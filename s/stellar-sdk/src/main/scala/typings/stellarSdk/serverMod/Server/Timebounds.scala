package typings.stellarSdk.serverMod.Server

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
    val __obj = js.Dynamic.literal(maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Timebounds]
  }
}

