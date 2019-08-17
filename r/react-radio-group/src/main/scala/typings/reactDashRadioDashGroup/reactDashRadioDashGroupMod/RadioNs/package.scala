package typings.reactDashRadioDashGroup.reactDashRadioDashGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RadioNs {
  import typings.react.reactMod.InputHTMLAttributes
  import typings.reactDashRadioDashGroup.Anon_Value
  import typings.reactDashRadioDashGroup.reactDashRadioDashGroupMod.Omit
  import typings.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.`aria-checked`
  import typings.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.`type`
  import typings.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.name
  import typings.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.role
  import typings.reactDashRadioDashGroup.reactDashRadioDashGroupStrings.value
  import typings.std.HTMLInputElement

  type RadioProps = (Omit[
    InputHTMLAttributes[HTMLInputElement], 
    value | name | role | `type` | `aria-checked`
  ]) with Anon_Value
}
