package typings.reactMdUtils

import typings.reactMdUtils.utilsMod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findIgnoreCaseMod {
  
  @JSImport("@react-md/utils/types/search/findIgnoreCase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findIgnoreCase[T](query: String, searchable: js.Array[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIgnoreCase")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  @scala.inline
  def findIgnoreCase[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIgnoreCase")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T | Null]
}
