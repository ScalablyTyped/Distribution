package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.sawtoothSdk.protobufMod.ClientBatchStatus.IInvalidTransaction
import typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus")
@js.native
/**
  * Constructs a new ClientBatchStatus.
  * @param [properties] Properties to set
  */
class ClientBatchStatus_ () extends IClientBatchStatus {
  def this(properties: IClientBatchStatus) = this()
  
  /** ClientBatchStatus batchId. */
  @JSName("batchId")
  var batchId_ClientBatchStatus_ : String = js.native
  
  /** ClientBatchStatus invalidTransactions. */
  @JSName("invalidTransactions")
  var invalidTransactions_ClientBatchStatus_ : js.Array[IInvalidTransaction] = js.native
  
  /** ClientBatchStatus status. */
  @JSName("status")
  var status_ClientBatchStatus_ : Status = js.native
  
  /**
    * Converts this ClientBatchStatus to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
