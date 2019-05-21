package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLiveLib {
  // React Element Props
  type DivProps = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any
  // Helper types
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type PreProps = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLProps<HTMLPreElement> */ js.Any
}
