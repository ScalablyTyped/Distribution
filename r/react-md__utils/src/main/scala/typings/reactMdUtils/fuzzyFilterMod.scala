package typings.reactMdUtils

import typings.reactMdUtils.utilsMod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/search/fuzzyFilter", JSImport.Namespace)
@js.native
object fuzzyFilterMod extends js.Object {
  
  def fuzzyFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  def fuzzyFilter[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = js.native
}
