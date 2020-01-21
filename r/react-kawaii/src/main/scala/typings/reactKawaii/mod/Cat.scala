package typings.reactKawaii.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-kawaii", "Cat")
@js.native
class Cat protected ()
  extends Component[KawaiiProps, ComponentState, js.Any] {
  def this(props: KawaiiProps) = this()
  def this(props: KawaiiProps, context: js.Any) = this()
}

@JSImport("react-kawaii", "Cat")
@js.native
object Cat extends TopLevel[ComponentType[KawaiiProps]]

