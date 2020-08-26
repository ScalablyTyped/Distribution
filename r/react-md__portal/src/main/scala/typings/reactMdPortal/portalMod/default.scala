package typings.reactMdPortal.portalMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/portal/types/Portal", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * This component is a simple wrapper for the `createPortal` API from ReactDOM
    * that will just ensure that `null` is always returned for server side
    * rendering as well as a "nice" way to choose specific portal targets or just
    * falling back to the `document.body`.
    */
  def apply(hasIntoIntoIdChildren: PortalProps): ReactElement | Null = js.native
  @js.native
  object propTypes extends js.Object {
    var children: js.Any = js.native
    var into: js.Any = js.native
    var intoId: js.Any = js.native
  }
  
}

