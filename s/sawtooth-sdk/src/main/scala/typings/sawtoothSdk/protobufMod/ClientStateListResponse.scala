package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientStateListResponse.IEntry
import typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse")
@js.native
/**
  * Constructs a new ClientStateListResponse.
  * @param [properties] Properties to set
  */
class ClientStateListResponse () extends IClientStateListResponse {
  def this(properties: IClientStateListResponse) = this()
  
  /** ClientStateListResponse entries. */
  @JSName("entries")
  var entries_ClientStateListResponse: js.Array[IEntry] = js.native
  
  /** ClientStateListResponse stateRoot. */
  @JSName("stateRoot")
  var stateRoot_ClientStateListResponse: String = js.native
  
  /** ClientStateListResponse status. */
  @JSName("status")
  var status_ClientStateListResponse: Status = js.native
  
  /**
    * Converts this ClientStateListResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientStateListResponse {
  
  /** Represents an Entry. */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry")
  @js.native
  /**
    * Constructs a new Entry.
    * @param [properties] Properties to set
    */
  class Entry () extends IEntry {
    def this(properties: IEntry) = this()
    
    /** Entry address. */
    @JSName("address")
    var address_Entry: String = js.native
    
    /** Entry data. */
    @JSName("data")
    var data_Entry: Uint8Array = js.native
    
    /**
      * Converts this Entry to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Entry {
    
    /**
      * Creates a new Entry instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Entry instance
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.create")
    @js.native
    def create(): Entry = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.create")
    @js.native
    def create(properties: IEntry): Entry = js.native
    
    /**
      * Decodes an Entry message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.decode")
    @js.native
    def decode(reader: Reader): Entry = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.decode")
    @js.native
    def decode(reader: Reader, length: Double): Entry = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.decode")
    @js.native
    def decode(reader: Uint8Array): Entry = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Entry = js.native
    
    /**
      * Decodes an Entry message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Entry = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Entry = js.native
    
    /**
      * Encodes the specified Entry message. Does not implicitly {@link ClientStateListResponse.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.encode")
    @js.native
    def encode(message: IEntry): Writer = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.encode")
    @js.native
    def encode(message: IEntry, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Entry message, length delimited. Does not implicitly {@link ClientStateListResponse.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEntry): Writer = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEntry, writer: Writer): Writer = js.native
    
    /**
      * Creates an Entry message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Entry
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Entry = js.native
    
    /**
      * Creates a plain object from an Entry message. Also converts values to other types if specified.
      * @param message Entry
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.toObject")
    @js.native
    def toObject(message: Entry): StringDictionary[js.Any] = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.toObject")
    @js.native
    def toObject(message: Entry, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Entry message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    /* 2 */ val INTERNAL_ERROR: typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INTERNAL_ERROR with Double = js.native
    
    @js.native
    sealed trait INVALID_ADDRESS extends Status
    /* 8 */ val INVALID_ADDRESS: typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_ADDRESS with Double = js.native
    
    @js.native
    sealed trait INVALID_PAGING extends Status
    /* 6 */ val INVALID_PAGING: typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_PAGING with Double = js.native
    
    @js.native
    sealed trait INVALID_ROOT extends Status
    /* 9 */ val INVALID_ROOT: typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_ROOT with Double = js.native
    
    @js.native
    sealed trait INVALID_SORT extends Status
    /* 7 */ val INVALID_SORT: typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_SORT with Double = js.native
    
    @js.native
    sealed trait NOT_READY extends Status
    /* 3 */ val NOT_READY: typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status.NOT_READY with Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    /* 5 */ val NO_RESOURCE: typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status.NO_RESOURCE with Double = js.native
    
    @js.native
    sealed trait NO_ROOT extends Status
    /* 4 */ val NO_ROOT: typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status.NO_ROOT with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 1 */ val OK: typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status.OK with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status.STATUS_UNSET with Double = js.native
  }
  
  /**
    * Creates a new ClientStateListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateListResponse instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.create")
  @js.native
  def create(): ClientStateListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.create")
  @js.native
  def create(properties: IClientStateListResponse): ClientStateListResponse = js.native
  
  /**
    * Decodes a ClientStateListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.decode")
  @js.native
  def decode(reader: Reader): ClientStateListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientStateListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.decode")
  @js.native
  def decode(reader: Uint8Array): ClientStateListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientStateListResponse = js.native
  
  /**
    * Decodes a ClientStateListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientStateListResponse = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientStateListResponse = js.native
  
  /**
    * Encodes the specified ClientStateListResponse message. Does not implicitly {@link ClientStateListResponse.verify|verify} messages.
    * @param message ClientStateListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.encode")
  @js.native
  def encode(message: IClientStateListResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.encode")
  @js.native
  def encode(message: IClientStateListResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientStateListResponse message, length delimited. Does not implicitly {@link ClientStateListResponse.verify|verify} messages.
    * @param message ClientStateListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStateListResponse): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientStateListResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientStateListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateListResponse
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientStateListResponse = js.native
  
  /**
    * Creates a plain object from a ClientStateListResponse message. Also converts values to other types if specified.
    * @param message ClientStateListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.toObject")
  @js.native
  def toObject(message: ClientStateListResponse): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.toObject")
  @js.native
  def toObject(message: ClientStateListResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientStateListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of an Entry. */
  @js.native
  trait IEntry extends StObject {
    
    /** Entry address */
    var address: js.UndefOr[String | Null] = js.native
    
    /** Entry data */
    var data: js.UndefOr[Uint8Array | Null] = js.native
  }
  object IEntry {
    
    @scala.inline
    def apply(): IEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEntry]
    }
    
    @scala.inline
    implicit class IEntryMutableBuilder[Self <: IEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressNull: Self = StObject.set(x, "address", null)
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
}
