package typings.prosemirrorCollab

import typings.prosemirrorCollab.anon.ClientID
import typings.prosemirrorCollab.anon.MapSelectionBackward
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTransform.mod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-collab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Creates a plugin that enables the collaborative editing framework
  for the editor.
  */
  inline def collab(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("collab")().asInstanceOf[Plugin[Any]]
  inline def collab(config: CollabConfig): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("collab")(config.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
  
  /**
  Get the version up to which the collab plugin has synced with the
  central authority.
  */
  inline def getVersion(state: EditorState): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
  Create a transaction that represents a set of new steps received from
  the authority. Applying this transaction moves the state forward to
  adjust to the authority's view of the document.
  */
  inline def receiveTransaction(state: EditorState, steps: js.Array[Step], clientIDs: js.Array[String | Double]): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveTransaction")(state.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], clientIDs.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def receiveTransaction(
    state: EditorState,
    steps: js.Array[Step],
    clientIDs: js.Array[String | Double],
    options: MapSelectionBackward
  ): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveTransaction")(state.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], clientIDs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  /**
  Provides data describing the editor's unconfirmed steps, which need
  to be sent to the central authority. Returns null when there is
  nothing to send.
  `origins` holds the _original_ transactions that produced each
  steps. This can be useful for looking up time stamps and other
  metadata for the steps, but note that the steps may have been
  rebased, whereas the origin transactions are still the old,
  unchanged objects.
  */
  inline def sendableSteps(state: EditorState): ClientID | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sendableSteps")(state.asInstanceOf[js.Any]).asInstanceOf[ClientID | Null]
  
  trait CollabConfig extends StObject {
    
    /**
      This client's ID, used to distinguish its changes from those of
      other clients. Defaults to a random 32-bit number.
      */
    var clientID: js.UndefOr[Double | String] = js.undefined
    
    /**
      The starting version number of the collaborative editing.
      Defaults to 0.
      */
    var version: js.UndefOr[Double] = js.undefined
  }
  object CollabConfig {
    
    inline def apply(): CollabConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollabConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollabConfig] (val x: Self) extends AnyVal {
      
      inline def setClientID(value: Double | String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
