package typings.reactour

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactourMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentPropsWithRef
  import typings.reactour.reactourStrings.div
  import typings.reactour.reactourStrings.nav

  type ControlsProps = ComponentPropsWithRef[div]
  type NavigationProps = ComponentPropsWithRef[nav]
  type Tour = Component[ReactourProps, ReactourState, js.Any]
}
