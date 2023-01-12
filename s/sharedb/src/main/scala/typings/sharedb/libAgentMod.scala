package typings.sharedb

import typings.node.streamMod.Duplex
import typings.sharedb.anon.IsServer
import typings.sharedb.libSharedbMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAgentMod {
  
  /**
    * An `Agent` is the representation of a client's `Connection` state on the
    * server. If the `Connection` was created through `backend.connect` (i.e. the
    * client is running in the same Node process as the server), then the `Agent`
    * associated with a `Connection` can be accessed through `connection.agent`.
    *
    * The `Agent` will be made available in all middleware requests. The
    * `agent.custom` field is an object that can be used for storing arbitrary
    * information for use in middleware.
    *
    * @see https://github.com/share/sharedb#class-sharedbagent
    */
  @JSImport("sharedb/lib/agent", JSImport.Namespace)
  @js.native
  open class ^[TCustom] ()
    extends StObject
       with Agent[TCustom] {
    
    /* CompleteClass */
    var backend: typings.sharedb.mod.^ = js.native
    
    /**
      * Object for custom use in middleware to store app-specific state for a
      * given client session. It is in memory only as long as the session is
      * active, and it is passed to each middleware call.
      */
    /* CompleteClass */
    var custom: TCustom = js.native
    
    /**
      * Sends a JSON-compatible message to the client for this agent.
      *
      * @param message
      */
    /* CompleteClass */
    override def send(message: JSONObject): Unit = js.native
    
    /* CompleteClass */
    var stream: Duplex & IsServer = js.native
  }
  
  /**
    * An `Agent` is the representation of a client's `Connection` state on the
    * server. If the `Connection` was created through `backend.connect` (i.e. the
    * client is running in the same Node process as the server), then the `Agent`
    * associated with a `Connection` can be accessed through `connection.agent`.
    *
    * The `Agent` will be made available in all middleware requests. The
    * `agent.custom` field is an object that can be used for storing arbitrary
    * information for use in middleware.
    *
    * @see https://github.com/share/sharedb#class-sharedbagent
    */
  trait Agent[TCustom] extends StObject {
    
    var backend: typings.sharedb.mod.^
    
    /**
      * Object for custom use in middleware to store app-specific state for a
      * given client session. It is in memory only as long as the session is
      * active, and it is passed to each middleware call.
      */
    var custom: TCustom
    
    /**
      * Sends a JSON-compatible message to the client for this agent.
      *
      * @param message
      */
    def send(message: JSONObject): Unit
    
    var stream: Duplex & IsServer
  }
  object Agent {
    
    inline def apply[TCustom](
      backend: typings.sharedb.mod.^,
      custom: TCustom,
      send: JSONObject => Unit,
      stream: Duplex & IsServer
    ): Agent[TCustom] = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], send = js.Any.fromFunction1(send), stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Agent[TCustom]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Agent[?], TCustom] (val x: Self & Agent[TCustom]) extends AnyVal {
      
      inline def setBackend(value: typings.sharedb.mod.^): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setCustom(value: TCustom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setSend(value: JSONObject => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setStream(value: Duplex & IsServer): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
