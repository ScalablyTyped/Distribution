package typings
package qLib.qMod.QNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var promise: Promise[T] = js.native
  /**
  		 * Returns a function suitable for passing to a Node.js API. That is, it has a signature (err, result) and will
  		 * reject deferred.promise with err if err is given, or fulfill it with result if that is given.
  		 */
  def makeNodeResolver(): js.Function2[/* reason */ js.Any, /* value */ T, scala.Unit] = js.native
  /**
  		 * Calling notify with a value causes promise to be notified of progress with that value. That is, any onProgress
  		 * handlers registered with promise or promises derived from promise will be called with the progress value.
  		 */
  def notify(value: js.Any): scala.Unit = js.native
  /**
  		 * Calling reject with a reason causes promise to be rejected with that reason.
  		 */
  def reject(): scala.Unit = js.native
  /**
  		 * Calling reject with a reason causes promise to be rejected with that reason.
  		 */
  def reject(reason: js.Any): scala.Unit = js.native
  /**
  		 * Calling resolve with a pending promise causes promise to wait on the passed promise, becoming fulfilled with its
  		 * fulfillment value or rejected with its rejection reason (or staying pending forever, if the passed promise does).
  		 * Calling resolve with a rejected promise causes promise to be rejected with the passed promise's rejection reason.
  		 * Calling resolve with a fulfilled promise causes promise to be fulfilled with the passed promise's fulfillment value.
  		 * Calling resolve with a non-promise value causes promise to be fulfilled with that value.
  		 */
  def resolve(): scala.Unit = js.native
  /**
  		 * Calling resolve with a pending promise causes promise to wait on the passed promise, becoming fulfilled with its
  		 * fulfillment value or rejected with its rejection reason (or staying pending forever, if the passed promise does).
  		 * Calling resolve with a rejected promise causes promise to be rejected with the passed promise's rejection reason.
  		 * Calling resolve with a fulfilled promise causes promise to be fulfilled with the passed promise's fulfillment value.
  		 * Calling resolve with a non-promise value causes promise to be fulfilled with that value.
  		 */
  def resolve(value: IWhenable[T]): scala.Unit = js.native
}

