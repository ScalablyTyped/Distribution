package typings.reactSpringAnimated.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-spring/animated/index.cjs", "Animated")
@js.native
abstract class Animated[T] () extends js.Object {
  
  /** Get every `AnimatedValue` used by this node. */
  def getPayload(): Payload = js.native
  
  /** Get the current value. Pass `true` for only animated values. */
  def getValue(): T = js.native
  def getValue(animated: Boolean): T = js.native
  
  /** The cache of animated values */
  var payload: js.UndefOr[Payload] = js.native
  
  /** Reset any animation state. */
  def reset(): Unit = js.native
  def reset(goal: T): Unit = js.native
  
  /** Set the current value. */
  def setValue(value: T): Unit = js.native
}
