package typings.reactMdUtils

import typings.reactMdUtils.utilsMod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/search/fuzzyFilter", JSImport.Namespace)
@js.native
object fuzzyFilterMod extends js.Object {
  def default[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  def default[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = js.native
}

