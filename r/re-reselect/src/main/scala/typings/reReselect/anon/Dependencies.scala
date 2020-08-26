package typings.reReselect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dependencies[C, D] extends js.Object {
  var dependencies: D = js.native
  var resultFunc: C = js.native
  def recomputations(): Double = js.native
  def resetRecomputations(): Double = js.native
}

object Dependencies {
  @scala.inline
  def apply[C, D](dependencies: D, recomputations: () => Double, resetRecomputations: () => Double, resultFunc: C): Dependencies[C, D] = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependencies[C, D]]
  }
  @scala.inline
  implicit class DependenciesOps[Self <: Dependencies[_, _], C, D] (val x: Self with (Dependencies[C, D])) extends AnyVal {
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
    def setDependencies(value: D): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecomputations(value: () => Double): Self = this.set("recomputations", js.Any.fromFunction0(value))
    @scala.inline
    def setResetRecomputations(value: () => Double): Self = this.set("resetRecomputations", js.Any.fromFunction0(value))
    @scala.inline
    def setResultFunc(value: C): Self = this.set("resultFunc", value.asInstanceOf[js.Any])
  }
  
}

