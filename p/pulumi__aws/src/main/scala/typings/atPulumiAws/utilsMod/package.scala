package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  import typings.std.Pick

  type Diff[T /* <: String | Double | js.Symbol */, U /* <: String | Double | js.Symbol */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type Overwrite[T, U] = (Pick[T, Diff[String, String]]) with U
}
