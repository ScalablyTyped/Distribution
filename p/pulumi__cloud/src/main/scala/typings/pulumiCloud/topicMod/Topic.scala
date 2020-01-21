package typings.pulumiCloud.topicMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topic[T] extends Stream[T] {
  /**
    * Publish an item to this Topic.
    *
    * @param item The item to publish.
    */
  def publish(item: T): js.Promise[Unit]
}

@JSImport("@pulumi/cloud/topic", "Topic")
@js.native
object Topic extends TopLevel[TopicConstructor]

