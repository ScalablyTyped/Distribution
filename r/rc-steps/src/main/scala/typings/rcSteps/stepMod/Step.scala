package typings.rcSteps.stepMod

import typings.react.mod.Component
import typings.react.mod.MouseEventHandler
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step
  extends Component[StepProps, js.Object, js.Any] {
  
  var onClick: MouseEventHandler[HTMLDivElement] = js.native
  
  def renderIconNode(): js.Any = js.native
}
