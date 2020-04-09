package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.sawtoothSdk.protobufMod.ClientStateListResponse.IEntry
import typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse")
@js.native
/**
  * Constructs a new ClientStateListResponse.
  * @param [properties] Properties to set
  */
class ClientStateListResponse_ () extends IClientStateListResponse {
  def this(properties: IClientStateListResponse) = this()
  /** ClientStateListResponse entries. */
  @JSName("entries")
  var entries_ClientStateListResponse_ : js.Array[IEntry] = js.native
  /** ClientStateListResponse stateRoot. */
  @JSName("stateRoot")
  var stateRoot_ClientStateListResponse_ : String = js.native
  /** ClientStateListResponse status. */
  @JSName("status")
  var status_ClientStateListResponse_ : Status = js.native
  /**
    * Converts this ClientStateListResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

