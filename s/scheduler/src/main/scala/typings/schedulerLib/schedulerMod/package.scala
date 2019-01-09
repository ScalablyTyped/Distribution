package typings
package schedulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schedulerMod {
  type FrameCallbackType = js.Function1[
    /* deadline */ Deadline, 
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | scala.Unit
  ]
}
