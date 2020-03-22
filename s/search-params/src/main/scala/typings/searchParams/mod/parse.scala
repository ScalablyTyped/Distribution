package typings.searchParams.mod

import typings.searchParams.encodeMod.IOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("search-params", "parse")
@js.native
object parse extends js.Object {
  def apply[T /* <: Record[String, _] */](path: String): T = js.native
  def apply[T /* <: Record[String, _] */](path: String, opts: IOptions): T = js.native
}

