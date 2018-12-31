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

