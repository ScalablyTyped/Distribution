package typings.searchParams.mod

import typings.searchParams.encodeMod.IOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("search-params", "build")
@js.native
object build extends js.Object {
  def apply[T /* <: Record[String, _] */](params: T): String = js.native
  def apply[T /* <: Record[String, _] */](params: T, opts: IOptions): String = js.native
}

