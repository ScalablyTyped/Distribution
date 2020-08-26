package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Publish extends js.Object {
  def publish(message: String, data: js.Any): Boolean = js.native
  def publishSync(message: String, data: js.Any): Boolean = js.native
}

object Publish {
  @scala.inline
  def apply(publish: (String, js.Any) => Boolean, publishSync: (String, js.Any) => Boolean): Publish = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction2(publish), publishSync = js.Any.fromFunction2(publishSync))
    __obj.asInstanceOf[Publish]
  }
  @scala.inline
  implicit class PublishOps[Self <: Publish] (val x: Self) extends AnyVal {
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
    def setPublish(value: (String, js.Any) => Boolean): Self = this.set("publish", js.Any.fromFunction2(value))
    @scala.inline
    def setPublishSync(value: (String, js.Any) => Boolean): Self = this.set("publishSync", js.Any.fromFunction2(value))
  }
  
}

