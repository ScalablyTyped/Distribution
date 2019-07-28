package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// naked 'any' type in a conditional type will short circuit and union both the then/else branches
// so boolean is only resolved for T = any
/* Rewritten from type alias, can be one of: 
  - typings.react.reactNumbers.`false`
  - typings.react.reactNumbers.`true`
*/
trait IsExactlyAny[T] extends js.Object

