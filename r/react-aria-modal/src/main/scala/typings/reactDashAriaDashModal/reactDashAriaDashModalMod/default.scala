package typings.reactDashAriaDashModal.reactDashAriaDashModalMod

import typings.react.reactMod.Component
import typings.react.reactMod.ReactType
import typings.reactDashAriaDashModal.reactDashAriaDashModalStrings.titleId
import typings.reactDashAriaDashModal.reactDashAriaDashModalStrings.titleText
import typings.std.HTMLElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-aria-modal", JSImport.Default)
@js.native
class default ()
  extends Component[
      AriaModalProps with (RequiredAriaTypes[Pick[AriaModalProps, titleId], Pick[AriaModalProps, titleText]]), 
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

