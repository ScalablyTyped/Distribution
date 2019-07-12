package typings
package reactDashDropzoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDropzoneMod {
  type DropEvent = reactLib.reactMod.DragEvent[stdLib.HTMLElement] | reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement] | stdLib.DragEvent | stdLib.Event
  type DropzoneOptions = (stdLib.Pick[reactLib.reactMod.HTMLProps[stdLib.HTMLElement], PropTypes]) with reactDashDropzoneLib.Anon_Accept
  type DropzoneState = DropzoneRef with reactDashDropzoneLib.Anon_AcceptedFiles
}
