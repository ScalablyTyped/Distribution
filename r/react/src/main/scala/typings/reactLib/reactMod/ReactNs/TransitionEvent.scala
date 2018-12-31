package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeTransitionEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var elapsedTime: scala.Double
  var propertyName: java.lang.String
  var pseudoElement: java.lang.String
}

