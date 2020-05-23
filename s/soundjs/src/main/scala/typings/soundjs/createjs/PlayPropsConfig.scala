package typings.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayPropsConfig extends js.Object {
  var delay: Double
  var duration: Double
  var interrupt: String
  var loop: Double
  var offset: Double
  var pan: Double
  var startTime: Double
  var volume: Double
  def set(props: js.Any): PlayPropsConfig
}

object PlayPropsConfig {
  @scala.inline
  def apply(
    delay: Double,
    duration: Double,
    interrupt: String,
    loop: Double,
    offset: Double,
    pan: Double,
    set: js.Any => PlayPropsConfig,
    startTime: Double,
    volume: Double
  ): PlayPropsConfig = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), startTime = startTime.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayPropsConfig]
  }
}

