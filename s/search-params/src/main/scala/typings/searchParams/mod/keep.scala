package typings.searchParams.mod

import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("search-params", "keep")
@js.native
object keep extends js.Object {
  def apply(path: String, paramsToKeep: js.Array[String]): IKeepResponse = js.native
  def apply(path: String, paramsToKeep: js.Array[String], opts: IOptions): IKeepResponse = js.native
}

