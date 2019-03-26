package typings
package reactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// naked 'any' type in a conditional type will short circuit and union both the then/else branches
// so boolean is only resolved for T = any
/* Rewritten from type alias, can be one of: 
  - reactLib.reactLibNumbers.`false`
  - reactLib.reactLibNumbers.`true`
*/
trait IsExactlyAny[T] extends js.Object

