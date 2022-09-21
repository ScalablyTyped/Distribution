package typings.stablelibKeyagreement

import typings.stablelibKeyagreement.mod.KeyAgreement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  @JSImport("@stablelib/keyagreement/lib/concat", "ConcatKeyAgreement")
  @js.native
  open class ConcatKeyAgreement protected ()
    extends StObject
       with KeyAgreement {
    def this(agreements: js.Array[KeyAgreement]) = this()
    
    /**
      * Accept offer message and return new accept message, which should be sent
      * back to the offering party.
      *
      * Also derives shared key, so the accepting party can call getSharedKey()
      * right after calling accept.
      */
    /* CompleteClass */
    override def accept(offerMsg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    /** Accept message length in bytes */
    /* CompleteClass */
    override val acceptMessageLength: Double = js.native
    
    var agreements: js.Array[KeyAgreement] = js.native
    
    /**
      * Cleans the temporary instance data.
      */
    /* CompleteClass */
    override def clean(): Unit = js.native
    
    /**
      * Offering party finishes key agreement by receiving accept message and
      * passing it to finish(). After calling finish(), offering party can call
      * sharedKey() to get shared key.
      */
    /* CompleteClass */
    override def finish(acceptMsg: js.typedarray.Uint8Array): this.type = js.native
    
    /**
      * Returns the agreed shared key.
      * - Offering party should call this after finish().
      * - Accepting party should call this after accept().
      */
    /* CompleteClass */
    override def getSharedKey(): js.typedarray.Uint8Array = js.native
    
    /**
      * Offer returns a new offer message, which should be send to the accepting
      * party.
      */
    /* CompleteClass */
    override def offer(): js.typedarray.Uint8Array = js.native
    
    /** Offer message length in bytes */
    /* CompleteClass */
    override val offerMessageLength: Double = js.native
    
    /**
      * Restores offering party's state.
      */
    /* CompleteClass */
    override def restoreState(serializedState: js.typedarray.Uint8Array): this.type = js.native
    
    /**
      * Serializes secret offering party state into byte array.
      *
      * This function should be called after offer() if the offering party
      * cannot keep KeyAgreement instance in memory. When it receives accept
      * message, it can create a new instance and call restoreState() on it with
      * the serialized state to recover to continue the agreement.
      */
    /* CompleteClass */
    override def saveState(): js.typedarray.Uint8Array = js.native
    
    /** Saved state length in bytes **/
    /* CompleteClass */
    override val savedStateLength: Double = js.native
    
    /** Shared key length in bytes **/
    /* CompleteClass */
    override val sharedKeyLength: Double = js.native
  }
}
