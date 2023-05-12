package typings.relayRuntime

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
    
    inline def get(): ConnectionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[ConnectionConfig]
    
    inline def inject(newConfig: ConnectionConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(newConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait ConnectionConfig extends StObject {
    
    var CURSOR: String
    
    var EDGES: String
    
    var END_CURSOR: String
    
    var HAS_NEXT_PAGE: String
    
    var HAS_PREV_PAGE: String
    
    var NODE: String
    
    var PAGE_INFO: String
    
    var PAGE_INFO_TYPE: String
    
    var START_CURSOR: String
  }
  object ConnectionConfig {
    
    inline def apply(
      CURSOR: String,
      EDGES: String,
      END_CURSOR: String,
      HAS_NEXT_PAGE: String,
      HAS_PREV_PAGE: String,
      NODE: String,
      PAGE_INFO: String,
      PAGE_INFO_TYPE: String,
      START_CURSOR: String
    ): ConnectionConfig = {
      val __obj = js.Dynamic.literal(CURSOR = CURSOR.asInstanceOf[js.Any], EDGES = EDGES.asInstanceOf[js.Any], END_CURSOR = END_CURSOR.asInstanceOf[js.Any], HAS_NEXT_PAGE = HAS_NEXT_PAGE.asInstanceOf[js.Any], HAS_PREV_PAGE = HAS_PREV_PAGE.asInstanceOf[js.Any], NODE = NODE.asInstanceOf[js.Any], PAGE_INFO = PAGE_INFO.asInstanceOf[js.Any], PAGE_INFO_TYPE = PAGE_INFO_TYPE.asInstanceOf[js.Any], START_CURSOR = START_CURSOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionConfig] (val x: Self) extends AnyVal {
      
      inline def setCURSOR(value: String): Self = StObject.set(x, "CURSOR", value.asInstanceOf[js.Any])
      
      inline def setEDGES(value: String): Self = StObject.set(x, "EDGES", value.asInstanceOf[js.Any])
      
      inline def setEND_CURSOR(value: String): Self = StObject.set(x, "END_CURSOR", value.asInstanceOf[js.Any])
      
      inline def setHAS_NEXT_PAGE(value: String): Self = StObject.set(x, "HAS_NEXT_PAGE", value.asInstanceOf[js.Any])
      
      inline def setHAS_PREV_PAGE(value: String): Self = StObject.set(x, "HAS_PREV_PAGE", value.asInstanceOf[js.Any])
      
      inline def setNODE(value: String): Self = StObject.set(x, "NODE", value.asInstanceOf[js.Any])
      
      inline def setPAGE_INFO(value: String): Self = StObject.set(x, "PAGE_INFO", value.asInstanceOf[js.Any])
      
      inline def setPAGE_INFO_TYPE(value: String): Self = StObject.set(x, "PAGE_INFO_TYPE", value.asInstanceOf[js.Any])
      
      inline def setSTART_CURSOR(value: String): Self = StObject.set(x, "START_CURSOR", value.asInstanceOf[js.Any])
    }
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EdgeRecord] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
      
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
