package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events providing information related to animations. */
@js.native
trait AnimationEvent extends Event {
  val animationName: java.lang.String = js.native
  val elapsedTime: Double = js.native
  val pseudoElement: java.lang.String = js.native
}

