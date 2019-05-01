package typings
package reactDashSlickLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSlickMod {
  type ComponentConstructor[TProps] = (reactLib.reactMod.ComponentClass[TProps, reactLib.reactMod.ComponentState]) | reactLib.reactMod.StatelessComponent[TProps]
  /* Rewritten from type alias, can be one of: 
    - reactDashSlickLib.reactDashSlickLibStrings.left
    - reactDashSlickLib.reactDashSlickLibStrings.down
    - reactDashSlickLib.reactDashSlickLibStrings.right
    - reactDashSlickLib.reactDashSlickLibStrings.up
    - java.lang.String
  */
  type SwipeDirection = _SwipeDirection | java.lang.String
}
