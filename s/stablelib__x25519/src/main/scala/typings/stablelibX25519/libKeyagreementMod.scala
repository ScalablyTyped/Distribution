package typings.stablelibX25519

import typings.stablelibKeyagreement.mod.KeyAgreement
import typings.stablelibRandom.libSourceMod.RandomSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKeyagreementMod {
  
  @JSImport("@stablelib/x25519/lib/keyagreement", "ACCEPT_MESSAGE_LENGTH")
  @js.native
  val ACCEPT_MESSAGE_LENGTH: /* 32 */ Double = js.native
  
  @JSImport("@stablelib/x25519/lib/keyagreement", "OFFER_MESSAGE_LENGTH")
  @js.native
  val OFFER_MESSAGE_LENGTH: /* 32 */ Double = js.native
  
  @JSImport("@stablelib/x25519/lib/keyagreement", "SAVED_STATE_LENGTH")
  @js.native
  val SAVED_STATE_LENGTH: /* 32 */ Double = js.native
  
  @JSImport("@stablelib/x25519/lib/keyagreement", "SECRET_SEED_LENGTH")
  @js.native
  val SECRET_SEED_LENGTH: /* 32 */ Double = js.native
  
  @JSImport("@stablelib/x25519/lib/keyagreement", "X25519KeyAgreement")
  @js.native
  open class X25519KeyAgreement ()
    extends StObject
       with KeyAgreement {
    def this(secretSeed: js.typedarray.Uint8Array) = this()
    def this(secretSeed: js.typedarray.Uint8Array, prng: RandomSource) = this()
    def this(secretSeed: Unit, prng: RandomSource) = this()
    
    /* private */ var _offered: Any = js.native
    
    /* private */ var _secretKey: Any = js.native
    
    /* private */ var _sharedKey: Any = js.native
    
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
