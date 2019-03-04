package typings
package reactDashNativeDashVideoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentTime extends js.Object {
  var currentTime: scala.Double
  var playableDuration: scala.Double
  var seekableDuration: scala.Double
}

object Anon_CurrentTime {
  @scala.inline
  def apply(currentTime: scala.Double, playableDuration: scala.Double, seekableDuration: scala.Double): Anon_CurrentTime = {
    val __obj = js.Dynamic.literal(currentTime = currentTime, playableDuration = playableDuration, seekableDuration = seekableDuration)
  
    __obj.asInstanceOf[Anon_CurrentTime]
  }
}

