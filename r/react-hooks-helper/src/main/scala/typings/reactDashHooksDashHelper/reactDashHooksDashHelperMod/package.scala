package typings.reactDashHooksDashHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHooksDashHelperMod {
  import typings.react.Event
  import typings.react.reactMod.ChangeEvent
  import typings.react.reactMod.SyntheticEvent
  import typings.std.HTMLInputElement

  type SetForm = js.Function1[
    /* event */ (SyntheticEvent[HTMLInputElement, Event]) | ChangeEvent[HTMLInputElement] | FormTarget, 
    Unit
  ]
}
