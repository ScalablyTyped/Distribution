package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Either[A, B] extends js.Object {
  var isLeft: scala.Boolean
  var isRight: scala.Boolean
  var value: A | B
  def fold[X](fa: js.Function1[/* a */ A, X], fb: js.Function1[/* b */ B, X]): X
  def left(): LeftProjection[A, B]
  def right(): RightProjection[A, B]
  def swap(): Either[B, A]
}

object Either {
  @scala.inline
  def apply[A, B](
    fold: js.Function2[js.Function1[/* a */ A, js.Any], js.Function1[/* b */ B, js.Any], js.Any],
    isLeft: scala.Boolean,
    isRight: scala.Boolean,
    left: js.Function0[LeftProjection[A, B]],
    right: js.Function0[RightProjection[A, B]],
    swap: js.Function0[Either[B, A]],
    value: A | B
  ): Either[A, B] = {
    val __obj = js.Dynamic.literal(fold = fold, isLeft = isLeft, isRight = isRight, left = left, right = right, swap = swap, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Either[A, B]]
  }
}

