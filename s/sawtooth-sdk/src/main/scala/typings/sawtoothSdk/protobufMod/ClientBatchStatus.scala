package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientBatchStatus.IInvalidTransaction
import typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus")
@js.native
/**
  * Constructs a new ClientBatchStatus.
  * @param [properties] Properties to set
  */
open class ClientBatchStatus ()
  extends StObject
     with IClientBatchStatus {
  def this(properties: IClientBatchStatus) = this()
  
  /** ClientBatchStatus batchId. */
  @JSName("batchId")
  var batchId_ClientBatchStatus: String = js.native
  
  /** ClientBatchStatus invalidTransactions. */
  @JSName("invalidTransactions")
  var invalidTransactions_ClientBatchStatus: js.Array[IInvalidTransaction] = js.native
  
  /** ClientBatchStatus status. */
  @JSName("status")
  var status_ClientBatchStatus: Status = js.native
  
  /**
    * Converts this ClientBatchStatus to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientBatchStatus {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an InvalidTransaction. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction")
  @js.native
  /**
    * Constructs a new InvalidTransaction.
    * @param [properties] Properties to set
    */
  open class InvalidTransaction ()
    extends StObject
       with IInvalidTransaction {
    def this(properties: IInvalidTransaction) = this()
    
    /** InvalidTransaction extendedData. */
    @JSName("extendedData")
    var extendedData_InvalidTransaction: js.typedarray.Uint8Array = js.native
    
    /** InvalidTransaction message. */
    @JSName("message")
    var message_InvalidTransaction: String = js.native
    
    /**
      * Converts this InvalidTransaction to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** InvalidTransaction transactionId. */
    @JSName("transactionId")
    var transactionId_InvalidTransaction: String = js.native
  }
  object InvalidTransaction {
    
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new InvalidTransaction instance using the specified properties.
      * @param [properties] Properties to set
      * @returns InvalidTransaction instance
      */
    /* static member */
    inline def create(): InvalidTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[InvalidTransaction]
    inline def create(properties: IInvalidTransaction): InvalidTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[InvalidTransaction]
    
    inline def decode(reader: js.typedarray.Uint8Array): InvalidTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[InvalidTransaction]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): InvalidTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[InvalidTransaction]
    /**
      * Decodes an InvalidTransaction message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns InvalidTransaction
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): InvalidTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[InvalidTransaction]
    inline def decode(reader: Reader, length: Double): InvalidTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[InvalidTransaction]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): InvalidTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[InvalidTransaction]
    /**
      * Decodes an InvalidTransaction message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns InvalidTransaction
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): InvalidTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[InvalidTransaction]
    
    /**
      * Encodes the specified InvalidTransaction message. Does not implicitly {@link ClientBatchStatus.InvalidTransaction.verify|verify} messages.
      * @param message InvalidTransaction message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IInvalidTransaction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IInvalidTransaction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified InvalidTransaction message, length delimited. Does not implicitly {@link ClientBatchStatus.InvalidTransaction.verify|verify} messages.
      * @param message InvalidTransaction message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IInvalidTransaction): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IInvalidTransaction, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an InvalidTransaction message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns InvalidTransaction
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): InvalidTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[InvalidTransaction]
    
    /**
      * Creates a plain object from an InvalidTransaction message. Also converts values to other types if specified.
      * @param message InvalidTransaction
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: InvalidTransaction): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: InvalidTransaction, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an InvalidTransaction message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait COMMITTED
      extends StObject
         with Status
    /* 1 */ val COMMITTED: typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status.COMMITTED & Double = js.native
    
    @js.native
    sealed trait INVALID
      extends StObject
         with Status
    /* 2 */ val INVALID: typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status.INVALID & Double = js.native
    
    @js.native
    sealed trait PENDING
      extends StObject
         with Status
    /* 3 */ val PENDING: typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status.PENDING & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status.STATUS_UNSET & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with Status
    /* 4 */ val UNKNOWN: typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status.UNKNOWN & Double = js.native
  }
  
  /**
    * Creates a new ClientBatchStatus instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatus instance
    */
  inline def create(): ClientBatchStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBatchStatus]
  inline def create(properties: IClientBatchStatus): ClientBatchStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatus]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientBatchStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatus]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientBatchStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchStatus]
  /**
    * Decodes a ClientBatchStatus message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatus
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientBatchStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatus]
  inline def decode(reader: Reader, length: Double): ClientBatchStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchStatus]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientBatchStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatus]
  /**
    * Decodes a ClientBatchStatus message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatus
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientBatchStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatus]
  
  /**
    * Encodes the specified ClientBatchStatus message. Does not implicitly {@link ClientBatchStatus.verify|verify} messages.
    * @param message ClientBatchStatus message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientBatchStatus): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientBatchStatus, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBatchStatus message, length delimited. Does not implicitly {@link ClientBatchStatus.verify|verify} messages.
    * @param message ClientBatchStatus message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientBatchStatus): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientBatchStatus, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBatchStatus message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatus
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientBatchStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBatchStatus]
  
  /**
    * Creates a plain object from a ClientBatchStatus message. Also converts values to other types if specified.
    * @param message ClientBatchStatus
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientBatchStatus): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientBatchStatus, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientBatchStatus message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of an InvalidTransaction. */
  trait IInvalidTransaction extends StObject {
    
    /** InvalidTransaction extendedData */
    var extendedData: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
    
    /** InvalidTransaction message */
    var message: js.UndefOr[String | Null] = js.undefined
    
    /** InvalidTransaction transactionId */
    var transactionId: js.UndefOr[String | Null] = js.undefined
  }
  object IInvalidTransaction {
    
    inline def apply(): IInvalidTransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInvalidTransaction]
    }
    
    extension [Self <: IInvalidTransaction](x: Self) {
      
      inline def setExtendedData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "extendedData", value.asInstanceOf[js.Any])
      
      inline def setExtendedDataNull: Self = StObject.set(x, "extendedData", null)
      
      inline def setExtendedDataUndefined: Self = StObject.set(x, "extendedData", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
      
      inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
      
      inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    }
  }
}
