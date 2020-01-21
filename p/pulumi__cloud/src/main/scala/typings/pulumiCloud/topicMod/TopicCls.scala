package typings.pulumiCloud.topicMod

import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/topic", "Topic")
@js.native
class TopicCls[T] protected () extends Topic[T] {
  /**
    * Allocate a new Topic with a given name.
    *
    * @param name The unique name of the Topic.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String) = this()
  def this(name: String, opts: ResourceOptions) = this()
  /**
    * Publish an item to this Topic.
    *
    * @param item The item to publish.
    */
  /* CompleteClass */
  override def publish(item: T): js.Promise[Unit] = js.native
  /**
    * Subscribe to items published to this stream.
    *
    * Each subscription receives all items published to the stream. If a
    * subscription handler returns a failed promise, the subscription handler
    * may be retried some number of times.  If no retry is successful, the item
    * will be sent to the global error handler.  Note that as a result,
    * subscription handlers must ensure they can safely be retried.
    *
    * @param name The name of the subscription.
    * @param handler A callback to handle each item published to the stream.
    */
  /* CompleteClass */
  override def subscribe(name: String, handler: js.Function1[T, js.Promise[Unit]]): Unit = js.native
}

