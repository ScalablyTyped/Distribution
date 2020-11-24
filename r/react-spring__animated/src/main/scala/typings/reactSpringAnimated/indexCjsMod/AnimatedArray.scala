package typings.reactSpringAnimated.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of animated nodes */
@JSImport("@react-spring/animated/index.cjs", "AnimatedArray")
@js.native
class AnimatedArray[T /* <: js.Array[Value1] */] protected () extends AnimatedObject {
  def this(from: T) = this()
  def this(from: T, to: T) = this()
  
  /** Convert the `from` and `to` values to an array of `Animated` nodes */
  /* protected */ def _makeAnimated(): js.Array[AnimatedValue[String | Double]] = js.native
  /* protected */ def _makeAnimated(from: T): js.Array[AnimatedValue[String | Double]] = js.native
  /* protected */ def _makeAnimated(from: T, to: T): js.Array[AnimatedValue[String | Double]] = js.native
  /* protected */ def _makeAnimated(from: Null, to: T): js.Array[AnimatedValue[String | Double]] = js.native
  
  def setValue(): Unit = js.native
  def setValue(newValue: T): Unit = js.native
  
  @JSName("source")
  var source_AnimatedArray: Source1 = js.native
}
/* static members */
@JSImport("@react-spring/animated/index.cjs", "AnimatedArray")
@js.native
object AnimatedArray extends js.Object {
  
  def create[T /* <: js.Array[Value1] */](from: T): AnimatedArray[T] = js.native
  def create[T /* <: js.Array[Value1] */](from: T, to: T): AnimatedArray[T] = js.native
}
