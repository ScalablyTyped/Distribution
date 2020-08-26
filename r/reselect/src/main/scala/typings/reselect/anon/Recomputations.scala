package typings.reselect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recomputations[C] extends js.Object {
  var resultFunc: C = js.native
  def recomputations(): Double = js.native
  def resetRecomputations(): Double = js.native
}

object Recomputations {
  @scala.inline
  def apply[C](recomputations: () => Double, resetRecomputations: () => Double, resultFunc: C): Recomputations[C] = {
    val __obj = js.Dynamic.literal(recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recomputations[C]]
  }
  @scala.inline
  implicit class RecomputationsOps[Self <: Recomputations[_], C] (val x: Self with Recomputations[C]) extends AnyVal {
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
    def setRecomputations(value: () => Double): Self = this.set("recomputations", js.Any.fromFunction0(value))
    @scala.inline
    def setResetRecomputations(value: () => Double): Self = this.set("resetRecomputations", js.Any.fromFunction0(value))
    @scala.inline
    def setResultFunc(value: C): Self = this.set("resultFunc", value.asInstanceOf[js.Any])
  }
  
}

