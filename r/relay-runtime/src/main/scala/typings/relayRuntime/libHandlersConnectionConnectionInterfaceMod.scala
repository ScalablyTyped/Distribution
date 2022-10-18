package typings.relayRuntime

import typings.relayRuntime.anon.CLIENTMUTATIONID
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandlersConnectionConnectionInterfaceMod {
  
  object default {
    
    @JSImport("relay-runtime/lib/handlers/connection/ConnectionInterface", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): CLIENTMUTATIONID = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[CLIENTMUTATIONID]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait EdgeRecord extends StObject {
    
    var cursor: Any
    
    var node: Record[DataID, Any]
  }
  object EdgeRecord {
    
    inline def apply(cursor: Any, node: Record[DataID, Any]): EdgeRecord = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeRecord]
    }
    
    extension [Self <: EdgeRecord](x: Self) {
      
      inline def setCursor(value: Any): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Record[DataID, Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageInfo extends StObject {
    
    var endCursor: js.UndefOr[String | Null] = js.undefined
    
    var hasNextPage: Boolean
    
    var hasPreviousPage: Boolean
    
    var startCursor: js.UndefOr[String | Null] = js.undefined
  }
  object PageInfo {
    
    inline def apply(hasNextPage: Boolean, hasPreviousPage: Boolean): PageInfo = {
      val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInfo]
    }
    
    extension [Self <: PageInfo](x: Self) {
      
      inline def setEndCursor(value: String): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
      
      inline def setEndCursorNull: Self = StObject.set(x, "endCursor", null)
      
      inline def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
      
      inline def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
      
      inline def setHasPreviousPage(value: Boolean): Self = StObject.set(x, "hasPreviousPage", value.asInstanceOf[js.Any])
      
      inline def setStartCursor(value: String): Self = StObject.set(x, "startCursor", value.asInstanceOf[js.Any])
      
      inline def setStartCursorNull: Self = StObject.set(x, "startCursor", null)
      
      inline def setStartCursorUndefined: Self = StObject.set(x, "startCursor", js.undefined)
    }
  }
}
