package typings.reactSlick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentConstructor[TProps] = (typings.react.mod.ComponentClass[TProps, typings.react.mod.ComponentState]) | typings.react.mod.StatelessComponent[TProps]
  /* Rewritten from type alias, can be one of: 
    - typings.reactSlick.reactSlickStrings.left
    - typings.reactSlick.reactSlickStrings.down
    - typings.reactSlick.reactSlickStrings.right
    - typings.reactSlick.reactSlickStrings.up
    - java.lang.String
  */
  type SwipeDirection = typings.reactSlick.mod._SwipeDirection | java.lang.String
}
