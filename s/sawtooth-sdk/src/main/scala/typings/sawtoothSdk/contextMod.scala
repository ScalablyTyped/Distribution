package typings.sawtoothSdk

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("sawtooth-sdk/processor/context", "Context")
  @js.native
  class Context protected () extends StObject {
    def this(stream: js.Any, contextId: String) = this()
    
    /**
      * Add a new event to the execution result for this transaction.
      *
      * @param eventType - This is used to subscribe to events. It should
      * be globally unique and describe what, in general, has occurred
      * @param attributes - Additional information about the event that
      * is transparent to the validator.  Attributes can be used by subscribers to
      * filter the type of events they receive.
      * @param data - Additional information about the event that is
      * opaque to the validator.
      * @param [timeout] - an optional timeout
      */
    def addEvent(eventType: String, attributes: js.Array[js.Array[String]], data: Buffer): js.Promise[js.Any] = js.native
    def addEvent(eventType: String, attributes: js.Array[js.Array[String]], data: Buffer, timeout: Double): js.Promise[js.Any] = js.native
    
    /**
      * Add a blob to the execution result for this transaction.
      *
      * @param data - the data to add
      * @param [timeout] - an optional timeout
      */
    def addReceiptData(data: Buffer): js.Promise[js.Any] = js.native
    def addReceiptData(data: Buffer, timeout: Double): js.Promise[js.Any] = js.native
    
    /**
      * deleteState requests that each of the provided addresses be
      * unset in validator state. A list of successfully deleted
      * addresses is returned.
      *
      * @param addresses -  an array of addresses
      * @param [timeout] - an optional timeout
      * @throws {AuthorizationException}
      */
    def deleteState(addresses: js.Array[String]): js.Promise[js.Any] = js.native
    def deleteState(addresses: js.Array[String], timeout: Double): js.Promise[js.Any] = js.native
    
    /**
      * getState queries the validator state for data at each of the
      * addresses in the given list. The addresses that have been set are
      * returned in a list.
      *
      * @param addresses an array of addresses
      * @param [timeout] - an optional timeout
      * @throws {AuthorizationException}
      */
    def getState(addresses: js.Array[String]): js.Promise[js.Any] = js.native
    def getState(addresses: js.Array[String], timeout: Double): js.Promise[js.Any] = js.native
    
    /**
      * setState requests that each address in the provided dictionary
      * be set in validator state to its corresponding value. A list is
      * returned containing the successfully set addresses.
      *
      * @param addressValuePairs - a map of (address, buffer)
      * entries, where the buffer is the encoded value to be set at the
      * the given address.
      * @param [timeout] - an optional timeout
      * @throws {AuthorizationException}
      */
    def setState(addressValuePairs: js.Object): js.Promise[js.Any] = js.native
    def setState(addressValuePairs: js.Object, timeout: Double): js.Promise[js.Any] = js.native
  }
}
