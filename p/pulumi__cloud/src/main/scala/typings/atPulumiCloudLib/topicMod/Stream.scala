package typings
package atPulumiCloudLib.topicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Stream[T] extends js.Object {
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
  def subscribe(name: java.lang.String, handler: js.Function1[/* item */ T, stdLib.Promise[scala.Unit]]): scala.Unit
}

