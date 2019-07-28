package typings.scalike.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Either[A, B] extends js.Object {
  var isLeft: Boolean
  var isRight: Boolean
  var value: A | B
  def fold[X](fa: js.Function1[/* a */ A, X], fb: js.Function1[/* b */ B, X]): X
  def left(): LeftProjection[A, B]
  def right(): RightProjection[A, B]
  def swap(): Either[B, A]
}

object Either {
  @scala.inline
  def apply[A, B](
    fold: (js.Function1[/* a */ A, js.Any], js.Function1[/* b */ B, js.Any]) => js.Any,
    isLeft: Boolean,
    isRight: Boolean,
    left: () => LeftProjection[A, B],
    right: () => RightProjection[A, B],
    swap: () => Either[B, A],
    value: A | B
  ): Either[A, B] = {
    val __obj = js.Dynamic.literal(fold = js.Any.fromFunction2(fold), isLeft = isLeft, isRight = isRight, left = js.Any.fromFunction0(left), right = js.Any.fromFunction0(right), swap = js.Any.fromFunction0(swap), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Either[A, B]]
  }
}

