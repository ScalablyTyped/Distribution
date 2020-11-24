package typings.reactSpringAnimated.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-spring/animated", "AnimatedString")
@js.native
class AnimatedString protected () extends AnimatedValue[Value] {
  def this(from: String, to: String) = this()
  
  var _string: String | Null = js.native
  
  /* protected */ def _toString(input: Double): String = js.native
  
  @JSName("_value")
  var _value_AnimatedString: Double = js.native
  
  def reset(goal: String): Unit = js.native
}
/* static members */
@JSImport("@react-spring/animated", "AnimatedString")
@js.native
object AnimatedString extends js.Object {
  
  def create[T](from: T): AnimatedValue[T] = js.native
  def create[T](from: T, to: T): AnimatedValue[T] = js.native
}
