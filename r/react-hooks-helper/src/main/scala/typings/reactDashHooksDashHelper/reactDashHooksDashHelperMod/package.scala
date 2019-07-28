package typings.reactDashHooksDashHelper

import typings.react.Event
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.SyntheticEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHooksDashHelperMod {
  type SetForm = js.Function1[
    /* event */ (SyntheticEvent[HTMLInputElement, Event]) | ChangeEvent[HTMLInputElement] | FormTarget, 
    Unit
  ]
}
