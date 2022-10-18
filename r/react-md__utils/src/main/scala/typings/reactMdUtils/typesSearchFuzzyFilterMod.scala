package typings.reactMdUtils

import typings.reactMdUtils.typesSearchUtilsMod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSearchFuzzyFilterMod {
  
  @JSImport("@react-md/utils/types/search/fuzzyFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fuzzyFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def fuzzyFilter[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
