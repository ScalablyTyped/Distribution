package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type Diff[T /* <: java.lang.String | scala.Double | js.Symbol */, U /* <: java.lang.String | scala.Double | js.Symbol */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type Overwrite[T, U] = (stdLib.Pick[T, Diff[java.lang.String, java.lang.String]]) with U
}
