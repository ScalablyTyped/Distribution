package typings.reactAriaLive

import typings.react.mod.Component
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-aria-live", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class LiveAnnouncer ()
    extends Component[js.Object, js.Object, js.Any] {
    def announceAssertive(message: String): Unit = js.native
    def announceAssertive(message: String, id: String): Unit = js.native
    def announcePolite(message: String): Unit = js.native
    def announcePolite(message: String, id: String): Unit = js.native
  }
  
  val LiveMessage: StatelessComponent[AnonArialive] = js.native
  val LiveMessenger: StatelessComponent[AnonChildren] = js.native
}

