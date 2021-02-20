package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
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
    var query: Input[String] = js.native
    
    /**
      * The type of the resource query. Defaults to `TAG_FILTERS_1_0`.
      */
    var `type`: js.UndefOr[Input[String]] = js.native
  }
  object GroupResourceQuery {
    
    @scala.inline
    def apply(query: Input[String]): GroupResourceQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupResourceQuery]
    }
    
    @scala.inline
    implicit class GroupResourceQueryMutableBuilder[Self <: GroupResourceQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: Input[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
