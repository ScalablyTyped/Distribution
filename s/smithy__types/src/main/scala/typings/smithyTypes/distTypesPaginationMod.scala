package typings.smithyTypes

import typings.smithyTypes.distTypesClientMod.Client
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationMod {
  
  trait PaginationConfiguration extends StObject {
    
    var client: Client[Any, Any, Any]
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var startingToken: js.UndefOr[Any] = js.undefined
    
    /**
      * For some APIs, such as CloudWatchLogs events, the next page token will always
      * be present.
      *
      * When true, this config field will have the paginator stop when the token doesn't change
      * instead of when it is not present.
      */
    var stopOnSameToken: js.UndefOr[Boolean] = js.undefined
  }
  object PaginationConfiguration {
    
    inline def apply(client: Client[Any, Any, Any]): PaginationConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationConfiguration] (val x: Self) extends AnyVal {
      
      inline def setClient(value: Client[Any, Any, Any]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStartingToken(value: Any): Self = StObject.set(x, "startingToken", value.asInstanceOf[js.Any])
      
      inline def setStartingTokenUndefined: Self = StObject.set(x, "startingToken", js.undefined)
      
      inline def setStopOnSameToken(value: Boolean): Self = StObject.set(x, "stopOnSameToken", value.asInstanceOf[js.Any])
      
      inline def setStopOnSameTokenUndefined: Self = StObject.set(x, "stopOnSameToken", js.undefined)
    }
  }
  
  type Paginator[T] = AsyncGenerator[T, T, Any]
}
