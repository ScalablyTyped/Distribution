package typings.reactMdUtils

import typings.reactMdUtils.utilsMod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object caseInsensitiveFilterMod {
  
  @JSImport("@react-md/utils/types/search/caseInsensitiveFilter", "caseInsensitiveFilter")
  @js.native
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = js.native
  @JSImport("@react-md/utils/types/search/caseInsensitiveFilter", "caseInsensitiveFilter")
  @js.native
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T], options: CaseInsensitiveOptions[T]): js.Array[T] = js.native
  
  @js.native
  trait CaseInsensitiveOptions[T] extends SearchOptions[T] {
    
    /**
      * Boolean if the filter should also exclude all items that do not start with
      * the query string. The default behavior is to return all matches that
      * contain the query string anywhere.
      */
    var startsWith: js.UndefOr[Boolean] = js.native
  }
  object CaseInsensitiveOptions {
    
    @scala.inline
    def apply[T](): CaseInsensitiveOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaseInsensitiveOptions[T]]
    }
    
    @scala.inline
    implicit class CaseInsensitiveOptionsMutableBuilder[Self <: CaseInsensitiveOptions[_], T] (val x: Self with CaseInsensitiveOptions[T]) extends AnyVal {
      
      @scala.inline
      def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
    }
  }
}
