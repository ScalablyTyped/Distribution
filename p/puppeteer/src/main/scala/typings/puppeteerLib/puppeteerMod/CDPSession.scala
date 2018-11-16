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
  def detach(): stdLib.Promise[scala.Unit] = js.native
  /**
     * @param method Protocol method name
     */
  def send(method: java.lang.String): stdLib.Promise[js.Object] = js.native
  /**
     * @param method Protocol method name
     */
  def send(method: java.lang.String, params: js.Object): stdLib.Promise[js.Object] = js.native
}

