package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcegroups {
  
  @js.native
  trait GroupResourceQuery extends StObject {
    
    /**
      * The resource query as a JSON string.
      */
    var query: String = js.native
    
    /**
      * The type of the resource query. Defaults to `TAG_FILTERS_1_0`.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object GroupResourceQuery {
    
    @scala.inline
    def apply(query: String): GroupResourceQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupResourceQuery]
    }
    
    @scala.inline
    implicit class GroupResourceQueryMutableBuilder[Self <: GroupResourceQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
