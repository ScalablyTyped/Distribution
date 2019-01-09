package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeUploadProgress extends js.Object {
  var eventListeners: sinonLib.Anon_Abort
  def addEventListener(event: java.lang.String, listener: js.Function1[/* e */ sinonLib.sinonMod.Event, _]): scala.Unit
  def dispatchEvent(event: sinonLib.sinonMod.Event): scala.Unit
  def removeEventListener(event: java.lang.String, listener: js.Function1[/* e */ sinonLib.sinonMod.Event, _]): scala.Unit
}

