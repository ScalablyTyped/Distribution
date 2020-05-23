package typings.reactHooksHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SetForm = js.Function1[
    /* event */ (typings.react.mod.SyntheticEvent[typings.std.HTMLInputElement, typings.std.Event]) | typings.react.mod.ChangeEvent[typings.std.HTMLInputElement] | typings.reactHooksHelper.mod.FormTarget, 
    scala.Unit
  ]
}
