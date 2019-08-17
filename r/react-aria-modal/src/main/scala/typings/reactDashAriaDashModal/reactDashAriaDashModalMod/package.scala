package typings.reactDashAriaDashModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAriaDashModalMod {
  import typings.react.reactMod.PureComponent
  import typings.reactDashAriaDashModal.reactDashAriaDashModalStrings.titleId
  import typings.reactDashAriaDashModal.reactDashAriaDashModalStrings.titleText
  import typings.std.Pick

  type AriaModal = PureComponent[
    AriaModalProps with (RequiredAriaTypes[Pick[AriaModalProps, titleId], Pick[AriaModalProps, titleText]]), 
    js.Object, 
    js.Any
  ]
  type RequiredAriaTypes[T, U] = (typings.reactDashAriaDashModal.reactDashAriaDashModalStrings.RequiredAriaTypes with T with js.Any) | (typings.reactDashAriaDashModal.reactDashAriaDashModalStrings.RequiredAriaTypes with js.Any with U)
}
