package typings.reactPortal.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-portal", "Portal")
@js.native
class Portal protected ()
  extends Component[PortalProps, ComponentState, js.Any] {
  def this(props: PortalProps) = this()
  def this(props: PortalProps, context: js.Any) = this()
}
@JSImport("react-portal", "Portal")
@js.native
object Portal extends TopLevel[ComponentClass[PortalProps, ComponentState]]
