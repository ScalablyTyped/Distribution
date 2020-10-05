package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionComplete extends js.Object {
  var interactionComplete: String = js.native
  var interactionStart: String = js.native
}

object InteractionComplete {
  @scala.inline
  def apply(interactionComplete: String, interactionStart: String): InteractionComplete = {
    val __obj = js.Dynamic.literal(interactionComplete = interactionComplete.asInstanceOf[js.Any], interactionStart = interactionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionComplete]
  }
  @scala.inline
  implicit class InteractionCompleteOps[Self <: InteractionComplete] (val x: Self) extends AnyVal {
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
    def setInteractionComplete(value: String): Self = this.set("interactionComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setInteractionStart(value: String): Self = this.set("interactionStart", value.asInstanceOf[js.Any])
  }
  
}

