package typings.reactLive.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-live", "LiveEditor")
@js.native
class LiveEditor protected ()
  extends Component[LiveEditorProps, ComponentState, js.Any] {
  def this(props: LiveEditorProps) = this()
  def this(props: LiveEditorProps, context: js.Any) = this()
}

@JSImport("react-live", "LiveEditor")
@js.native
object LiveEditor extends TopLevel[ComponentClass[LiveEditorProps, ComponentState]]

