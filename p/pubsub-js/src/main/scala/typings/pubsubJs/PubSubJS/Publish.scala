package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Publish extends js.Object {
  def publish(message: String, data: js.Any): Boolean
  def publishSync(message: String, data: js.Any): Boolean
}

object Publish {
  @scala.inline
  def apply(publish: (String, js.Any) => Boolean, publishSync: (String, js.Any) => Boolean): Publish = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction2(publish), publishSync = js.Any.fromFunction2(publishSync))
    __obj.asInstanceOf[Publish]
  }
}

