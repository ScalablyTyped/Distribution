package typings.reactSpringAnimated.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object containing `Animated` nodes */
@JSImport("@react-spring/animated", "AnimatedObject")
@js.native
class AnimatedObject ()
  extends Animated[js.Any] {
  def this(source: Source) = this()
  
  /** Add to a payload set. */
  /* protected */ def _addToPayload(source: js.Any): Unit = js.native
  
  /** Create a payload set. */
  /* protected */ def _makePayload(source: Source): js.UndefOr[js.Array[AnimatedValue[_]]] = js.native
  
  /** Replace the raw object data */
  def setValue(source: Source): Unit = js.native
  
  var source: Source = js.native
}
