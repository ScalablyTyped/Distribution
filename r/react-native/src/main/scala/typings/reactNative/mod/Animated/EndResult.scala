package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndResult extends js.Object {
  var finished: Boolean = js.native
}

object EndResult {
  @scala.inline
  def apply(finished: Boolean): EndResult = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndResult]
  }
  @scala.inline
  implicit class EndResultOps[Self <: EndResult] (val x: Self) extends AnyVal {
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
    def setFinished(value: Boolean): Self = this.set("finished", value.asInstanceOf[js.Any])
  }
  
}

