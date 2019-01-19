package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stellarDashSdkLib {
  type Diff[T /* <: Key */, U /* <: Key */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type Key = java.lang.String | scala.Double | js.Symbol
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, Diff[java.lang.String, K]]
}
