package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientBatchStatus.IInvalidTransaction
import typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus")
@js.native
/**
  * Constructs a new ClientBatchStatus.
  * @param [properties] Properties to set
  */
class ClientBatchStatus () extends IClientBatchStatus {
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
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object ClientBatchStatus {
  
  /** Represents an InvalidTransaction. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction")
  @js.native
  /**
    * Constructs a new InvalidTransaction.
    * @param [properties] Properties to set
    */
  class InvalidTransaction () extends IInvalidTransaction {
    def this(properties: IInvalidTransaction) = this()
    
    /** InvalidTransaction extendedData. */
    @JSName("extendedData")
    var extendedData_InvalidTransaction: Uint8Array = js.native
    
    /** InvalidTransaction message. */
    @JSName("message")
    var message_InvalidTransaction: String = js.native
    
    /**
      * Converts this InvalidTransaction to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** InvalidTransaction transactionId. */
    @JSName("transactionId")
    var transactionId_InvalidTransaction: String = js.native
  }
  object InvalidTransaction {
    
    /**
      * Creates a new InvalidTransaction instance using the specified properties.
      * @param [properties] Properties to set
      * @returns InvalidTransaction instance
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.create")
    @js.native
    def create(): InvalidTransaction = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.create")
    @js.native
    def create(properties: IInvalidTransaction): InvalidTransaction = js.native
    
    /**
      * Decodes an InvalidTransaction message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns InvalidTransaction
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.decode")
    @js.native
    def decode(reader: Reader): InvalidTransaction = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.decode")
    @js.native
    def decode(reader: Reader, length: Double): InvalidTransaction = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.decode")
    @js.native
    def decode(reader: Uint8Array): InvalidTransaction = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): InvalidTransaction = js.native
    
    /**
      * Decodes an InvalidTransaction message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns InvalidTransaction
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): InvalidTransaction = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): InvalidTransaction = js.native
    
    /**
      * Encodes the specified InvalidTransaction message. Does not implicitly {@link ClientBatchStatus.InvalidTransaction.verify|verify} messages.
      * @param message InvalidTransaction message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.encode")
    @js.native
    def encode(message: IInvalidTransaction): Writer = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.encode")
    @js.native
    def encode(message: IInvalidTransaction, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified InvalidTransaction message, length delimited. Does not implicitly {@link ClientBatchStatus.InvalidTransaction.verify|verify} messages.
      * @param message InvalidTransaction message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.encodeDelimited")
    @js.native
    def encodeDelimited(message: IInvalidTransaction): Writer = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.encodeDelimited")
    @js.native
    def encodeDelimited(message: IInvalidTransaction, writer: Writer): Writer = js.native
    
    /**
      * Creates an InvalidTransaction message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns InvalidTransaction
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): InvalidTransaction = js.native
    
    /**
      * Creates a plain object from an InvalidTransaction message. Also converts values to other types if specified.
      * @param message InvalidTransaction
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.toObject")
    @js.native
    def toObject(message: InvalidTransaction): StringDictionary[js.Any] = js.native
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.toObject")
    @js.native
    def toObject(message: InvalidTransaction, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an InvalidTransaction message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.InvalidTransaction.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait COMMITTED extends Status
    /* 1 */ val COMMITTED: typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status.COMMITTED with Double = js.native
    
    @js.native
    sealed trait INVALID extends Status
    /* 2 */ val INVALID: typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status.INVALID with Double = js.native
    
    @js.native
    sealed trait PENDING extends Status
    /* 3 */ val PENDING: typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status.PENDING with Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    /* 0 */ val STATUS_UNSET: typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status.STATUS_UNSET with Double = js.native
    
    @js.native
    sealed trait UNKNOWN extends Status
    /* 4 */ val UNKNOWN: typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status.UNKNOWN with Double = js.native
  }
  
  /**
    * Creates a new ClientBatchStatus instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchStatus instance
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.create")
  @js.native
  def create(): ClientBatchStatus = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.create")
  @js.native
  def create(properties: IClientBatchStatus): ClientBatchStatus = js.native
  
  /**
    * Decodes a ClientBatchStatus message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchStatus
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.decode")
  @js.native
  def decode(reader: Reader): ClientBatchStatus = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.decode")
  @js.native
  def decode(reader: Reader, length: Double): ClientBatchStatus = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.decode")
  @js.native
  def decode(reader: Uint8Array): ClientBatchStatus = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ClientBatchStatus = js.native
  
  /**
    * Decodes a ClientBatchStatus message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchStatus
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ClientBatchStatus = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ClientBatchStatus = js.native
  
  /**
    * Encodes the specified ClientBatchStatus message. Does not implicitly {@link ClientBatchStatus.verify|verify} messages.
    * @param message ClientBatchStatus message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.encode")
  @js.native
  def encode(message: IClientBatchStatus): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.encode")
  @js.native
  def encode(message: IClientBatchStatus, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientBatchStatus message, length delimited. Does not implicitly {@link ClientBatchStatus.verify|verify} messages.
    * @param message ClientBatchStatus message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchStatus): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.encodeDelimited")
  @js.native
  def encodeDelimited(message: IClientBatchStatus, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientBatchStatus message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchStatus
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ClientBatchStatus = js.native
  
  /**
    * Creates a plain object from a ClientBatchStatus message. Also converts values to other types if specified.
    * @param message ClientBatchStatus
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.toObject")
  @js.native
  def toObject(message: ClientBatchStatus): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.toObject")
  @js.native
  def toObject(message: ClientBatchStatus, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientBatchStatus message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchStatus.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of an InvalidTransaction. */
  @js.native
  trait IInvalidTransaction extends StObject {
    
    /** InvalidTransaction extendedData */
    var extendedData: js.UndefOr[Uint8Array | Null] = js.native
    
    /** InvalidTransaction message */
    var message: js.UndefOr[String | Null] = js.native
    
    /** InvalidTransaction transactionId */
    var transactionId: js.UndefOr[String | Null] = js.native
  }
  object IInvalidTransaction {
    
    @scala.inline
    def apply(): IInvalidTransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInvalidTransaction]
    }
    
    @scala.inline
    implicit class IInvalidTransactionMutableBuilder[Self <: IInvalidTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtendedData(value: Uint8Array): Self = StObject.set(x, "extendedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedDataNull: Self = StObject.set(x, "extendedData", null)
      
      @scala.inline
      def setExtendedDataUndefined: Self = StObject.set(x, "extendedData", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageNull: Self = StObject.set(x, "message", null)
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
      
      @scala.inline
      def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    }
  }
}
