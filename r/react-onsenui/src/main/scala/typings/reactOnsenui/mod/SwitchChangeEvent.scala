package typings.reactOnsenui.mod

import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchChangeEvent extends Event_ {
  var isInteractive: Boolean = js.native
  var switch: HTMLElement = js.native
  var value: Boolean = js.native
}

