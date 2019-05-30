package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the Streams API represents a controller allowing control of a WritableStream's state. When constructing a WritableStream, the underlying sink is given a corresponding WritableStreamDefaultController instance to manipulate. */
@js.native
trait WritableStreamDefaultController extends js.Object {
  def error(): scala.Unit = js.native
  def error(error: js.Any): scala.Unit = js.native
}

