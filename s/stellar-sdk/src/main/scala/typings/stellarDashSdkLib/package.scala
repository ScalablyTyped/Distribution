package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stellarDashSdkLib {
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Diff<keyof T, K> */ js.Any
  ]
}
