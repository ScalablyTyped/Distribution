package typings.publicIp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CancelablePromise[T] = js.Promise[T] with typings.publicIp.AnonCancel
}
