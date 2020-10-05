package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEventInit extends EventInit {
  var animationName: js.UndefOr[java.lang.String] = js.native
  var elapsedTime: js.UndefOr[Double] = js.native
  var pseudoElement: js.UndefOr[java.lang.String] = js.native
}

object AnimationEventInit {
  @scala.inline
  def apply(): AnimationEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationEventInit]
  }
  @scala.inline
  implicit class AnimationEventInitOps[Self <: AnimationEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationName(value: java.lang.String): Self = this.set("animationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationName: Self = this.set("animationName", js.undefined)
    @scala.inline
    def setElapsedTime(value: Double): Self = this.set("elapsedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElapsedTime: Self = this.set("elapsedTime", js.undefined)
    @scala.inline
    def setPseudoElement(value: java.lang.String): Self = this.set("pseudoElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudoElement: Self = this.set("pseudoElement", js.undefined)
  }
  
}

