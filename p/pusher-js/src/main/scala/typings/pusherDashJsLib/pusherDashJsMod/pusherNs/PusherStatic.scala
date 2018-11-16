package typings
package pusherDashJsLib.pusherDashJsMod.pusherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PusherStatic
  extends ScalablyTyped.runtime.Instantiable1[/* apiKey */ java.lang.String, Pusher]
     with ScalablyTyped.runtime.Instantiable2[/* apiKey */ java.lang.String, /* config */ Config, Pusher] {
  var logToConsole: scala.Boolean = js.native
  def log(msg: java.lang.String): scala.Unit = js.native
}

