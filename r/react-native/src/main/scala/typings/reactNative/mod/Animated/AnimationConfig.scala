package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationConfig extends js.Object {
  var isInteraction: js.UndefOr[Boolean] = js.native
  var useNativeDriver: Boolean = js.native
}

object AnimationConfig {
  @scala.inline
  def apply(useNativeDriver: Boolean): AnimationConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationConfig]
  }
  @scala.inline
  implicit class AnimationConfigOps[Self <: AnimationConfig] (val x: Self) extends AnyVal {
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
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInteraction(value: Boolean): Self = this.set("isInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteraction: Self = this.set("isInteraction", js.undefined)
  }
  
}

