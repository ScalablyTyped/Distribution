package typings.sawtoothSdk

import typings.sawtoothSdk.handlerMod.TransactionHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/processor", JSImport.Namespace)
@js.native
object processorMod extends js.Object {
  @js.native
  class TransactionProcessor protected () extends js.Object {
    /** Constructs a new TransactionProcessor */
    def this(url: String) = this()
    /* private */ def _handleShutdown(): Unit = js.native
    /**
      * addHandler adds the given handler to the transaction processor so
      * it can receive transaction processing requests. All handlers must
      * be added prior to starting the processor.
      *
      * @param handler - a handler to be added
      */
    def addHandler(handler: TransactionHandler): Unit = js.native
    /**
      * start connects the transaction processor to a validator and
      * starts listening for requests and routing them to an appropriate
      * handler.
      */
    def start(): Unit = js.native
  }
  
}

