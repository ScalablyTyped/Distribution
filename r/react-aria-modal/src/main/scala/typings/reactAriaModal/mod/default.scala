package typings.reactAriaModal.mod

import typings.react.mod.Component
import typings.react.mod.ReactType
import typings.reactAriaModal.PickAriaModalPropstitleId
import typings.reactAriaModal.PickAriaModalPropstitleTe
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-aria-modal", JSImport.Default)
@js.native
class default ()
  extends Component[
      AriaModalProps with (RequiredAriaTypes[PickAriaModalPropstitleId, PickAriaModalPropstitleTe]), 
      js.Object, 
      js.Any
    ]

/* static members */
@JSImport("react-aria-modal", JSImport.Default)
@js.native
object default extends js.Object {
  def renderTo(node: String): ReactType[_] = js.native
  def renderTo(node: HTMLElement): ReactType[_] = js.native
}

