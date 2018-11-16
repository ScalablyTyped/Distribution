package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnderlyingSink extends js.Object {
  var abort: js.UndefOr[WritableStreamErrorCallback] = js.native
  var close: js.UndefOr[WritableStreamDefaultControllerCallback] = js.native
  @JSName("start")
  var start_Original: WritableStreamDefaultControllerCallback = js.native
  var write: js.UndefOr[WritableStreamChunkCallback] = js.native
  def start(controller: WritableStreamDefaultController): scala.Unit = js.native
}

