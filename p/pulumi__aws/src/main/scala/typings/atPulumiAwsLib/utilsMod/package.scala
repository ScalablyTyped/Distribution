package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type Diff[T /* <: java.lang.String | scala.Double | js.Symbol */, U /* <: java.lang.String | scala.Double | js.Symbol */] = /* import warning: ImportType.apply Failed type conversion: @pulumi/aws.Anon_X<T, U>[T] */ js.Any
  type Overwrite[T, U] = (stdLib.Pick[T, Diff[java.lang.String, java.lang.String]]) with U
}
