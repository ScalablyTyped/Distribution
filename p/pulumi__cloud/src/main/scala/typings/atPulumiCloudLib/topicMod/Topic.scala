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
    publish: T => js.Promise[scala.Unit],
    subscribe: (java.lang.String, js.Function1[/* item */ T, js.Promise[scala.Unit]]) => scala.Unit
  ): Topic[T] = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction1(publish), subscribe = js.Any.fromFunction2(subscribe))
  
    __obj.asInstanceOf[Topic[T]]
  }
}

