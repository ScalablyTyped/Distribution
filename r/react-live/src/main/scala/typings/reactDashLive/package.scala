package typings

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLive {
  // React Element Props
  type DivProps = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any
  // Helper types
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PreProps = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLProps<HTMLPreElement> */ js.Any
}
