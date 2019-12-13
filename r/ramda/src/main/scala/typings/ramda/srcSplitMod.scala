package typings.ramda

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/split", JSImport.Namespace)
@js.native
object srcSplitMod extends js.Object {
  def default(sep: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  def default(sep: String, str: String): js.Array[String] = js.native
  def default(sep: RegExp): js.Function1[/* str */ String, js.Array[String]] = js.native
  def default(sep: RegExp, str: String): js.Array[String] = js.native
}

