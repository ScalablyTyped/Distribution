package typings
package reactDashAriaDashModalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAriaDashModalMod {
  type AriaModal = reactLib.reactMod.PureComponent[
    AriaModalProps with (RequiredAriaTypes[
      stdLib.Pick[AriaModalProps, reactDashAriaDashModalLib.reactDashAriaDashModalLibStrings.titleId], 
      stdLib.Pick[
        AriaModalProps, 
        reactDashAriaDashModalLib.reactDashAriaDashModalLibStrings.titleText
      ]
    ]), 
    js.Object, 
    js.Any
  ]
  type RequiredAriaTypes[T, U] = reactDashAriaDashModalLib.reactDashAriaDashModalLibStrings.RequiredAriaTypes with T with js.Any with U
}
