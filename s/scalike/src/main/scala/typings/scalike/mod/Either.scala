package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Either[A, B] extends js.Object {
  var isLeft: Boolean = js.native
  var isRight: Boolean = js.native
  var value: A | B = js.native
  def fold[X](fa: js.Function1[/* a */ A, X], fb: js.Function1[/* b */ B, X]): X = js.native
  def left(): LeftProjection[A, B] = js.native
  def right(): RightProjection[A, B] = js.native
  def swap(): Either[B, A] = js.native
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
    val __obj = js.Dynamic.literal(fold = js.Any.fromFunction2(fold), isLeft = isLeft.asInstanceOf[js.Any], isRight = isRight.asInstanceOf[js.Any], left = js.Any.fromFunction0(left), right = js.Any.fromFunction0(right), swap = js.Any.fromFunction0(swap), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Either[A, B]]
  }
  @scala.inline
  implicit class EitherOps[Self <: Either[_, _], A, B] (val x: Self with (Either[A, B])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFold(value: (js.Function1[/* a */ A, js.Any], js.Function1[/* b */ B, js.Any]) => js.Any): Self = this.set("fold", js.Any.fromFunction2(value))
    @scala.inline
    def setIsLeft(value: Boolean): Self = this.set("isLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRight(value: Boolean): Self = this.set("isRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: () => LeftProjection[A, B]): Self = this.set("left", js.Any.fromFunction0(value))
    @scala.inline
    def setRight(value: () => RightProjection[A, B]): Self = this.set("right", js.Any.fromFunction0(value))
    @scala.inline
    def setSwap(value: () => Either[B, A]): Self = this.set("swap", js.Any.fromFunction0(value))
    @scala.inline
    def setValue(value: A | B): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

