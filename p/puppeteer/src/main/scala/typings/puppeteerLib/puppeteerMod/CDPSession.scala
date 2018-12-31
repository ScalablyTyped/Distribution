package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CDPSession
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Detaches session from target. Once detached, session won't emit any events and can't be used
    * to send messages.
    */
  def detach(): js.Promise[scala.Unit] = js.native
  /**
    * @param method Protocol method name
    */
  def send(method: java.lang.String): js.Promise[js.Object] = js.native
  def send(method: java.lang.String, params: js.Object): js.Promise[js.Object] = js.native
}

