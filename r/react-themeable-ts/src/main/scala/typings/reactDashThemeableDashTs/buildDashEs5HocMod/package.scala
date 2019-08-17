package typings.reactDashThemeableDashTs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildDashEs5HocMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.SFC

  type TDecComponent[P] = SFC[P] | (ComponentClass[P, ComponentState])
}
