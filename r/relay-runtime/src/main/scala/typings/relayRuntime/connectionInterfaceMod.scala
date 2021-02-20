package typings.relayRuntime

import typings.relayRuntime.anon.CLIENTMUTATIONID
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionInterfaceMod {
  
  object default {
    
    @JSImport("relay-runtime/lib/handlers/connection/ConnectionInterface", "default.get")
    @js.native
    def get(): CLIENTMUTATIONID = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ @js.native
  trait EdgeRecord extends StObject {
    
    var cursor: js.Any = js.native
    
    var node: Record[DataID, _] = js.native
  }
  object EdgeRecord {
    
    @scala.inline
    def apply(cursor: js.Any, node: Record[DataID, _]): EdgeRecord = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeRecord]
    }
    
    @scala.inline
    implicit class EdgeRecordMutableBuilder[Self <: EdgeRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCursor(value: js.Any): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Record[DataID, _]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageInfo extends StObject {
    
    var endCursor: js.UndefOr[String | Null] = js.native
    
    var hasNextPage: Boolean = js.native
    
    var hasPreviousPage: Boolean = js.native
    
    var startCursor: js.UndefOr[String | Null] = js.native
  }
  object PageInfo {
    
    @scala.inline
    def apply(hasNextPage: Boolean, hasPreviousPage: Boolean): PageInfo = {
      val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInfo]
    }
    
    @scala.inline
    implicit class PageInfoMutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndCursor(value: String): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndCursorNull: Self = StObject.set(x, "endCursor", null)
      
      @scala.inline
      def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
      
      @scala.inline
      def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPreviousPage(value: Boolean): Self = StObject.set(x, "hasPreviousPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartCursor(value: String): Self = StObject.set(x, "startCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartCursorNull: Self = StObject.set(x, "startCursor", null)
      
      @scala.inline
      def setStartCursorUndefined: Self = StObject.set(x, "startCursor", js.undefined)
    }
  }
}
