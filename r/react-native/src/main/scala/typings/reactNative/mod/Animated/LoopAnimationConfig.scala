package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoopAnimationConfig extends js.Object {
  var iterations: js.UndefOr[Double] = js.native
   // default -1 for infinite
  /**
    * Defaults to `true`
    */
  var resetBeforeIteration: js.UndefOr[Boolean] = js.native
}

object LoopAnimationConfig {
  @scala.inline
  def apply(): LoopAnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoopAnimationConfig]
  }
  @scala.inline
  implicit class LoopAnimationConfigOps[Self <: LoopAnimationConfig] (val x: Self) extends AnyVal {
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
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    @scala.inline
    def setResetBeforeIteration(value: Boolean): Self = this.set("resetBeforeIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetBeforeIteration: Self = this.set("resetBeforeIteration", js.undefined)
  }
  
}

