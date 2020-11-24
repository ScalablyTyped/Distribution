package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.IPeer
import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse")
@js.native
/**
  * Constructs a new ClientStatusGetResponse.
  * @param [properties] Properties to set
  */
class ClientStatusGetResponse_ () extends IClientStatusGetResponse {
  def this(properties: IClientStatusGetResponse) = this()
  
  /** ClientStatusGetResponse endpoint. */
  @JSName("endpoint")
  var endpoint_ClientStatusGetResponse_ : String = js.native
  
  /** ClientStatusGetResponse peers. */
  @JSName("peers")
  var peers_ClientStatusGetResponse_ : js.Array[IPeer] = js.native
  
  /** ClientStatusGetResponse status. */
  @JSName("status")
  var status_ClientStatusGetResponse_ : Status = js.native
  
  /**
    * Converts this ClientStatusGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
