package typings
package sdkDashBaseLib.sdkDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base
  extends nodeLib.eventsMod.EventEmitter {
  var isReady: scala.Boolean = js.native
  var options: BaseOptions = js.native
  def await(args: js.Any*): js.Promise[_] = js.native
  def awaitFirst(args: js.Any*): js.Promise[_] = js.native
  def ready(): js.Promise[_] = js.native
  def ready(err: stdLib.Error): scala.Unit = js.native
  def ready(readyCallback: js.Function): scala.Unit = js.native
  def ready(ready: scala.Boolean): scala.Unit = js.native
}

