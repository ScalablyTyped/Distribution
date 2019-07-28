package typings

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stellarDashSdk {
  type Omit[T, K /* <: String */] = Pick[
    T, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Diff<keyof T, K> */ js.Any
  ]
}
