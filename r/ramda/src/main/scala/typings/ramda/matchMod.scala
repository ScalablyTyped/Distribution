package typings.ramda

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/match", JSImport.Namespace)
@js.native
object matchMod extends js.Object {
  def default(regexp: RegExp): js.Function1[/* str */ String, js.Array[String]] = js.native
  def default(regexp: RegExp, str: String): js.Array[String] = js.native
}

