package typings.reactMdUtils

import typings.reactMdUtils.utilsMod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object caseInsensitiveFilterMod {
  
  @JSImport("@react-md/utils/types/search/caseInsensitiveFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def caseInsensitiveFilter[T](query: String, searchable: js.Array[T], options: CaseInsensitiveOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  trait CaseInsensitiveOptions[T]
    extends StObject
       with SearchOptions[T] {
    
    /**
      * Boolean if the filter should also exclude all items that do not start with
      * the query string. The default behavior is to return all matches that
      * contain the query string anywhere.
      */
    var startsWith: js.UndefOr[Boolean] = js.undefined
  }
  object CaseInsensitiveOptions {
    
    @scala.inline
    def apply[T](): CaseInsensitiveOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaseInsensitiveOptions[T]]
    }
    
    @scala.inline
    implicit class CaseInsensitiveOptionsMutableBuilder[Self <: CaseInsensitiveOptions[?], T] (val x: Self & CaseInsensitiveOptions[T]) extends AnyVal {
      
      @scala.inline
      def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
    }
  }
}
