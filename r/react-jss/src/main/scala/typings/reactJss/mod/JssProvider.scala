package typings.reactJss.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactJss.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "JssProvider")
@js.native
class JssProvider protected ()
  extends Component[AnonChildren, ComponentState, js.Any] {
  def this(props: AnonChildren) = this()
  def this(props: AnonChildren, context: js.Any) = this()
}

@JSImport("react-jss", "JssProvider")
@js.native
object JssProvider extends TopLevel[ComponentType[AnonChildren]]

