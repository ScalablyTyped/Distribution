package typings.reactMdUtils

import typings.reactMdUtils.utilsMod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/search/findIgnoreCase", JSImport.Namespace)
@js.native
object findIgnoreCaseMod extends js.Object {
  
  def findIgnoreCase[T](query: String, searchable: js.Array[T]): T | Null = js.native
  def findIgnoreCase[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): T | Null = js.native
}
