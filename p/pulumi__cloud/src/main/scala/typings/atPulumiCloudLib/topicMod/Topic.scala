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

@JSImport("@pulumi/cloud/topic", "Topic")
@js.native
class TopicCls[T] protected () extends Topic[T] {
  /**
    * Allocate a new Topic with a given name.
    *
    * @param name The unique name of the Topic.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
  /**
    * Publish an item to this Topic.
    *
    * @param item The item to publish.
    */
  /* CompleteClass */
  override def publish(item: T): js.Promise[scala.Unit] = js.native
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
  override def subscribe(name: java.lang.String, handler: js.Function1[T, js.Promise[scala.Unit]]): scala.Unit = js.native
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

