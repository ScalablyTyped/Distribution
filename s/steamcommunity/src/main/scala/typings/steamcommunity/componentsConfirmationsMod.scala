package typings.steamcommunity

import typings.node.bufferMod.global.Buffer
import typings.steamcommunity.classesCconfirmationMod.^
import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.CallbackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsConfirmationsMod {
  
  @js.native
  trait Confirmations extends StObject {
    
    /**
      * Send a single request to Steam to accept all outstanding confirmations (after loading the list). If one fails, the
      * entire request will fail and there will be no way to know which failed without loading the list again.
      * @param time
      * @param confKey
      * @param allowKey
      * @param callback
      */
    def acceptAllConfirmations(time: Double, confKey: String, allowKey: String, callback: Callback): Any = js.native
    
    def acceptConfirmationForObject(identitySecret: String, objectID: Any, callback: Callback): Any = js.native
    def acceptConfirmationForObject(identitySecret: Null, objectID: Any, callback: Callback): Any = js.native
    /**
      * Accept a confirmation for a given object (trade offer or market listing) automatically.
      * @param identitySecret
      * @param objectID
      * @param callback
      */
    def acceptConfirmationForObject(identitySecret: Buffer, objectID: Any, callback: Callback): Any = js.native
    
    /**
      * Run the confirmation checker right now instead of waiting for the next poll.
      * Useful to call right after you send/accept an offer that needs confirmation.
      */
    def checkConfirmations(): Any = js.native
    
    /**
      * Get the trade offer ID associated with a particular confirmation
      * @param confID - The ID of the confirmation in question
      * @param time - The unix timestamp with which the following key was generated
      * @param key - The confirmation key that was generated using the preceeding time and the tag "details" (this key can be reused)
      * @param callback
      */
    def getConfirmationOfferID(confID: Double, time: Double, key: String, callback: Callback): Unit = js.native
    
    /**
      * Get a list of your account's currently outstanding confirmations.
      * @param time - The unix timestamp with which the following key was generated
      * @param key - The confirmation key that was generated using the preceeding time and the tag "conf" (this key can be reused)
      * @param callback - Called when the list of confirmations is received
      */
    def getConfirmations(
      time: Double,
      key: String,
      callback: js.Function2[/* err */ CallbackError, /* confirmations */ js.Array[^], Any]
    ): Unit = js.native
    
    def respondToConfirmation(
      confID: js.Array[Double],
      confKey: String,
      time: Double,
      key: String,
      accept: Boolean,
      callback: Callback
    ): Unit = js.native
    def respondToConfirmation(
      confID: js.Array[Double],
      confKey: js.Array[String],
      time: Double,
      key: String,
      accept: Boolean,
      callback: Callback
    ): Unit = js.native
    /**
      * Confirm or cancel a given confirmation.
      * @param confID - The ID of the confirmation in question, or an array of confirmation IDs
      * @param confKey - The confirmation key associated with the confirmation in question (or an array of them) (not a TOTP key, the `key` property of CConfirmation)
      * @param time - The unix timestamp with which the following key was generated
      * @param key - The confirmation key that was generated using the preceding time and the tag "allow" (if accepting) or "cancel" (if not accepting)
      * @param accept - true if you want to accept the confirmation, false if you want to cancel it
      * @param callback - Called when the request is complete
      */
    def respondToConfirmation(confID: Double, confKey: String, time: Double, key: String, accept: Boolean, callback: Callback): Unit = js.native
    def respondToConfirmation(
      confID: Double,
      confKey: js.Array[String],
      time: Double,
      key: String,
      accept: Boolean,
      callback: Callback
    ): Unit = js.native
    
    /**
      * Start automatically polling our confirmations for new ones. The `confKeyNeeded` event will be emitted when we need a confirmation key, or `newConfirmation` when we get a new confirmation
      * @param pollInterval - The interval, in milliseconds, at which we will poll for confirmations. This should probably be at least 10,000 to avoid rate-limits.
      * @param [identitySecret=null] - Your identity_secret. If passed, all confirmations will be automatically accepted and nothing will be emitted.
      */
    def startConfirmationChecker(pollInterval: Double): Unit = js.native
    def startConfirmationChecker(pollInterval: Double, identitySecret: String): Unit = js.native
    def startConfirmationChecker(pollInterval: Double, identitySecret: Buffer): Unit = js.native
    
    /**
      * Stop automatic polling. If you set your `identitySecret` previously, this will delete it.
      */
    def stopConfirmationChecker(): Unit = js.native
  }
}
