package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLiveLib {
  // React Element Props
  type DivProps = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Diff<keyof T, K> */ js.Any
  ]
  type PreProps = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLProps<HTMLPreElement> */ js.Any
}
