package typings.sharedb.agentMod

import typings.sharedb.DuplexisServerboolean
import typings.sharedb.sharedbMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class ^ () extends Agent {
  /* CompleteClass */
  override var backend: typings.sharedb.mod.^ = js.native
  /**
    * Object for custom use in middleware to store app-specific state for a
    * given client session. It is in memory only as long as the session is
    * active, and it is passed to each middleware call.
    */
  /* CompleteClass */
  override var custom: Custom = js.native
  /* CompleteClass */
  override var stream: DuplexisServerboolean = js.native
  /**
    * Sends a JSON-compatible message to the client for this agent.
    *
    * @param message
    */
  /* CompleteClass */
  override def send(message: JSONObject): Unit = js.native
}

