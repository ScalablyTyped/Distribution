package typings.reactMdAlert.useMessageQueueMod

import typings.reactMdAlert.messageQueueContextMod.DuplicateBehavior
import typings.reactMdAlert.messageQueueContextMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageQueueOptions[M /* <: Message */] extends js.Object {
  var defaultQueue: js.UndefOr[js.Array[M]] = js.native
  var duplicates: js.UndefOr[DuplicateBehavior] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object MessageQueueOptions {
  @scala.inline
  def apply[/* <: typings.reactMdAlert.messageQueueContextMod.Message */ M](): MessageQueueOptions[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageQueueOptions[M]]
  }
  @scala.inline
  implicit class MessageQueueOptionsOps[Self <: MessageQueueOptions[_], /* <: typings.reactMdAlert.messageQueueContextMod.Message */ M] (val x: Self with MessageQueueOptions[M]) extends AnyVal {
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
    def setDefaultQueueVarargs(value: M*): Self = this.set("defaultQueue", js.Array(value :_*))
    @scala.inline
    def setDefaultQueue(value: js.Array[M]): Self = this.set("defaultQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultQueue: Self = this.set("defaultQueue", js.undefined)
    @scala.inline
    def setDuplicates(value: DuplicateBehavior): Self = this.set("duplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicates: Self = this.set("duplicates", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

