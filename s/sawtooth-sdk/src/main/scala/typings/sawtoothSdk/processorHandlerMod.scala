package typings.sawtoothSdk

import typings.sawtoothSdk.processorContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processorHandlerMod {
  
  @JSImport("sawtooth-sdk/processor/handler", "TransactionHandler")
  @js.native
  open class TransactionHandler protected () extends StObject {
    /**
      * @param transactionFamilyName - the name of the
      * transaction family that this handler can process, e.g. "intkey"
      * @param versions - the versions of the transaction
      * family that this handler can process, e.g. ["1.0", "1.5"]
      * @param namespaces - a list containing all of the
      * handler's namespaces, e.g. ["abcdef"]
      */
    def this(transactionFamilyName: String, versions: js.Array[String], namespaces: js.Array[String]) = this()
    
    /**
      * Apply is the single method where all the business logic for a
      * transaction family is defined. The method will be called by the
      * transaction processor upon receiving a TpProcessRequest that the
      * handler understands and will pass in the TpProcessRequest and an
      * initialized instance of the Context type.
      *
      * @param transactionProcessRequest - the
      * transaction to be processed, currently type any but should be
      * TpProcessRequest
      * @param context - the context the handler can use to
      * access state
      */
    @JSName("apply")
    def apply(transactionProcessRequest: Any, context: Context): Unit = js.native
  }
}
