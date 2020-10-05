package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanResponderInstance extends js.Object {
  var panHandlers: GestureResponderHandlers = js.native
}

object PanResponderInstance {
  @scala.inline
  def apply(panHandlers: GestureResponderHandlers): PanResponderInstance = {
    val __obj = js.Dynamic.literal(panHandlers = panHandlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanResponderInstance]
  }
  @scala.inline
  implicit class PanResponderInstanceOps[Self <: PanResponderInstance] (val x: Self) extends AnyVal {
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
    def setPanHandlers(value: GestureResponderHandlers): Self = this.set("panHandlers", value.asInstanceOf[js.Any])
  }
  
}

