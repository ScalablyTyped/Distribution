package typings
package atPulumiCloudLib.topicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topic[T] extends Stream[T] {
  /**
    * Publish an item to this Topic.
    *
    * @param item The item to publish.
    */
  def publish(item: T): js.Promise[scala.Unit]
}

object Topic {
  @scala.inline
  def apply[T](
    publish: js.Function1[T, js.Promise[scala.Unit]],
    subscribe: js.Function2[java.lang.String, js.Function1[/* item */ T, js.Promise[scala.Unit]], scala.Unit]
  ): Topic[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("publish")(publish)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[Topic[T]]
  }
}

