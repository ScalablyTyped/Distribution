package typings.reactDashSlick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSlickMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.StatelessComponent

  type ComponentConstructor[TProps] = (ComponentClass[TProps, ComponentState]) | StatelessComponent[TProps]
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashSlick.reactDashSlickStrings.left
    - typings.reactDashSlick.reactDashSlickStrings.down
    - typings.reactDashSlick.reactDashSlickStrings.right
    - typings.reactDashSlick.reactDashSlickStrings.up
    - java.lang.String
  */
  type SwipeDirection = _SwipeDirection | String
}
