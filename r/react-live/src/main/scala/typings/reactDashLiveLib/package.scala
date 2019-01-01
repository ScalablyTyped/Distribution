package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLiveLib {
  // React union type
  type Component[P] = /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ComponentClass<P> */ js.Any
  type Diff[T /* <: KeyType */, U /* <: KeyType */] = /* import warning: ImportType.apply Failed type conversion: react-live.Anon_X<T, U>[T] */ js.Any
  // React Element Props
  type DivProps = /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any
  // Helper types
  type KeyType = java.lang.String | scala.Double | js.Symbol
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, Diff[java.lang.String, K]]
  type PreProps = /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify HTMLProps<HTMLPreElement> */ js.Any
}
