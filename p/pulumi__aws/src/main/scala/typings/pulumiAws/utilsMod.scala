package typings.pulumiAws

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  type Diff[T /* <: String | Double | js.Symbol */, U /* <: String | Double | js.Symbol */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type Overwrite[T, U] = (Pick[T, Diff[String, String]]) with U
}

