package typings.reactJss.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactJss.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "JssProvider")
@js.native
class JssProvider protected ()
  extends Component[Children, ComponentState, js.Any] {
  def this(props: Children) = this()
  def this(props: Children, context: js.Any) = this()
}

@JSImport("react-jss", "JssProvider")
@js.native
object JssProvider extends TopLevel[ComponentType[Children]]

