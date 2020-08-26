package typings.reactMdPortal.conditionalPortalMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/portal/types/ConditionalPortal", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * This is a very simple component that is used in other places within react-md
    * to conditionally render the children within a portal or not based on general
    * portal config props.
    */
  def apply(hasPortalPortalIntoPortalIntoIdChildren: ConditionalPortalProps): ReactElement | Null = js.native
  @js.native
  object propTypes extends js.Object {
    var children: js.Any = js.native
    var portal: js.Any = js.native
    var portalInto: js.Any = js.native
    var portalIntoId: js.Any = js.native
  }
  
}

