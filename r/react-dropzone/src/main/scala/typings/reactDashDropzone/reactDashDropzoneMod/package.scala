package typings.reactDashDropzone

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.DragEvent
import typings.react.reactMod.HTMLProps
import typings.reactDashDropzone.Anon_Accept
import typings.reactDashDropzone.Anon_AcceptedFiles
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDropzoneMod {
  type DropEvent = DragEvent[HTMLElement] | ChangeEvent[HTMLInputElement] | typings.std.DragEvent | Event
  type DropzoneOptions = (Pick[HTMLProps[HTMLElement], PropTypes]) with Anon_Accept
  type DropzoneState = DropzoneRef with Anon_AcceptedFiles
}
