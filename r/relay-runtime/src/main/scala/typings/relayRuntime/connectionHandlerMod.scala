package typings.relayRuntime

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.HandleFieldPayload
import typings.relayRuntime.relayStoreTypesMod.ReadOnlyRecordProxy
import typings.relayRuntime.relayStoreTypesMod.RecordProxy
import typings.relayRuntime.relayStoreTypesMod.RecordSourceProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionHandlerMod {
  
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "buildConnectionEdge")
  @js.native
  def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "buildConnectionEdge")
  @js.native
  def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy[js.Object], edge: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "createEdge")
  @js.native
  def createEdge(
    store: RecordSourceProxy,
    record: RecordProxy[js.Object],
    node: RecordProxy[js.Object],
    edgeType: String
  ): RecordProxy[js.Object] = js.native
  
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "deleteNode")
  @js.native
  def deleteNode(record: RecordProxy[js.Object], nodeID: DataID): Unit = js.native
  
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "getConnection")
  @js.native
  def getConnection(record: ReadOnlyRecordProxy, key: String): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "getConnection")
  @js.native
  def getConnection(record: ReadOnlyRecordProxy, key: String, filters: Variables): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "insertEdgeAfter")
  @js.native
  def insertEdgeAfter(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = js.native
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "insertEdgeAfter")
  @js.native
  def insertEdgeAfter(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = js.native
  
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "insertEdgeBefore")
  @js.native
  def insertEdgeBefore(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = js.native
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "insertEdgeBefore")
  @js.native
  def insertEdgeBefore(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = js.native
  
  @JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "update")
  @js.native
  def update(store: RecordSourceProxy, payload: HandleFieldPayload): Unit = js.native
  
  @js.native
  trait ConnectionMetadata extends StObject {
    
    var count: js.UndefOr[String | Null] = js.native
    
    // 'forward' | 'backward' | 'bidirectional' | null | undefined;
    var cursor: js.UndefOr[String | Null] = js.native
    
    var direction: js.UndefOr[String | Null] = js.native
    
    var path: js.UndefOr[js.Array[String] | Null] = js.native
    
    var stream: js.UndefOr[Boolean | Null] = js.native
  }
  object ConnectionMetadata {
    
    @scala.inline
    def apply(): ConnectionMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionMetadata]
    }
    
    @scala.inline
    implicit class ConnectionMetadataMutableBuilder[Self <: ConnectionMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountNull: Self = StObject.set(x, "count", null)
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorNull: Self = StObject.set(x, "cursor", null)
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionNull: Self = StObject.set(x, "direction", null)
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamNull: Self = StObject.set(x, "stream", null)
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
