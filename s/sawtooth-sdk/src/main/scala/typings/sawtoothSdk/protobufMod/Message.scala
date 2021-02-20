package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.Message.MessageType
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Message")
@js.native
/**
  * Constructs a new Message.
  * @param [properties] Properties to set
  */
class Message () extends IMessage {
  def this(properties: IMessage) = this()
  
  /** Message content. */
  @JSName("content")
  var content_Message: Uint8Array = js.native
  
  /** Message correlationId. */
  @JSName("correlationId")
  var correlationId_Message: String = js.native
  
  /** Message messageType. */
  @JSName("messageType")
  var messageType_Message: MessageType = js.native
  
  /**
    * Converts this Message to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Message {
  
  @js.native
  sealed trait MessageType extends StObject
  /** MessageType enum. */
  @JSImport("sawtooth-sdk/protobuf", "Message.MessageType")
  @js.native
  object MessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
    
    @js.native
    sealed trait AUTHORIZATION_CHALLENGE_REQUEST extends MessageType
    /* 604 */ val AUTHORIZATION_CHALLENGE_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_CHALLENGE_REQUEST with Double = js.native
    
    @js.native
    sealed trait AUTHORIZATION_CHALLENGE_RESPONSE extends MessageType
    /* 605 */ val AUTHORIZATION_CHALLENGE_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_CHALLENGE_RESPONSE with Double = js.native
    
    @js.native
    sealed trait AUTHORIZATION_CHALLENGE_RESULT extends MessageType
    /* 607 */ val AUTHORIZATION_CHALLENGE_RESULT: typings.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_CHALLENGE_RESULT with Double = js.native
    
    @js.native
    sealed trait AUTHORIZATION_CHALLENGE_SUBMIT extends MessageType
    /* 606 */ val AUTHORIZATION_CHALLENGE_SUBMIT: typings.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_CHALLENGE_SUBMIT with Double = js.native
    
    @js.native
    sealed trait AUTHORIZATION_CONNECTION_RESPONSE extends MessageType
    /* 600 */ val AUTHORIZATION_CONNECTION_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_CONNECTION_RESPONSE with Double = js.native
    
    @js.native
    sealed trait AUTHORIZATION_TRUST_REQUEST extends MessageType
    /* 602 */ val AUTHORIZATION_TRUST_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_TRUST_REQUEST with Double = js.native
    
    @js.native
    sealed trait AUTHORIZATION_TRUST_RESPONSE extends MessageType
    /* 603 */ val AUTHORIZATION_TRUST_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_TRUST_RESPONSE with Double = js.native
    
    @js.native
    sealed trait AUTHORIZATION_VIOLATION extends MessageType
    /* 601 */ val AUTHORIZATION_VIOLATION: typings.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_VIOLATION with Double = js.native
    
    @js.native
    sealed trait CLIENT_BATCH_GET_REQUEST extends MessageType
    /* 108 */ val CLIENT_BATCH_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_BATCH_GET_RESPONSE extends MessageType
    /* 109 */ val CLIENT_BATCH_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_BATCH_LIST_REQUEST extends MessageType
    /* 106 */ val CLIENT_BATCH_LIST_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_LIST_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_BATCH_LIST_RESPONSE extends MessageType
    /* 107 */ val CLIENT_BATCH_LIST_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_LIST_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_BATCH_STATUS_REQUEST extends MessageType
    /* 120 */ val CLIENT_BATCH_STATUS_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_STATUS_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_BATCH_STATUS_RESPONSE extends MessageType
    /* 121 */ val CLIENT_BATCH_STATUS_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_STATUS_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_BATCH_SUBMIT_REQUEST extends MessageType
    /* 100 */ val CLIENT_BATCH_SUBMIT_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_SUBMIT_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_BATCH_SUBMIT_RESPONSE extends MessageType
    /* 101 */ val CLIENT_BATCH_SUBMIT_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_SUBMIT_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST extends MessageType
    /* 128 */ val CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_BLOCK_GET_BY_ID_REQUEST extends MessageType
    /* 104 */ val CLIENT_BLOCK_GET_BY_ID_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_GET_BY_ID_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_BLOCK_GET_BY_NUM_REQUEST extends MessageType
    /* 124 */ val CLIENT_BLOCK_GET_BY_NUM_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_GET_BY_NUM_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST extends MessageType
    /* 127 */ val CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_BLOCK_GET_RESPONSE extends MessageType
    /* 105 */ val CLIENT_BLOCK_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_BLOCK_LIST_REQUEST extends MessageType
    /* 102 */ val CLIENT_BLOCK_LIST_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_LIST_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_BLOCK_LIST_RESPONSE extends MessageType
    /* 103 */ val CLIENT_BLOCK_LIST_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_LIST_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_EVENTS extends MessageType
    /* 504 */ val CLIENT_EVENTS: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS with Double = js.native
    
    @js.native
    sealed trait CLIENT_EVENTS_GET_REQUEST extends MessageType
    /* 505 */ val CLIENT_EVENTS_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_EVENTS_GET_RESPONSE extends MessageType
    /* 506 */ val CLIENT_EVENTS_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_EVENTS_SUBSCRIBE_REQUEST extends MessageType
    /* 500 */ val CLIENT_EVENTS_SUBSCRIBE_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_SUBSCRIBE_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_EVENTS_SUBSCRIBE_RESPONSE extends MessageType
    /* 501 */ val CLIENT_EVENTS_SUBSCRIBE_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_SUBSCRIBE_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_EVENTS_UNSUBSCRIBE_REQUEST extends MessageType
    /* 502 */ val CLIENT_EVENTS_UNSUBSCRIBE_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_UNSUBSCRIBE_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE extends MessageType
    /* 503 */ val CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_PEERS_GET_REQUEST extends MessageType
    /* 125 */ val CLIENT_PEERS_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_PEERS_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_PEERS_GET_RESPONSE extends MessageType
    /* 126 */ val CLIENT_PEERS_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_PEERS_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_RECEIPT_GET_REQUEST extends MessageType
    /* 122 */ val CLIENT_RECEIPT_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_RECEIPT_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_RECEIPT_GET_RESPONSE extends MessageType
    /* 123 */ val CLIENT_RECEIPT_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_RECEIPT_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_STATE_CURRENT_REQUEST extends MessageType
    /* 114 */ val CLIENT_STATE_CURRENT_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_CURRENT_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_STATE_CURRENT_RESPONSE extends MessageType
    /* 115 */ val CLIENT_STATE_CURRENT_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_CURRENT_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_STATE_GET_REQUEST extends MessageType
    /* 118 */ val CLIENT_STATE_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_STATE_GET_RESPONSE extends MessageType
    /* 119 */ val CLIENT_STATE_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_STATE_LIST_REQUEST extends MessageType
    /* 116 */ val CLIENT_STATE_LIST_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_LIST_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_STATE_LIST_RESPONSE extends MessageType
    /* 117 */ val CLIENT_STATE_LIST_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_LIST_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_STATUS_GET_REQUEST extends MessageType
    /* 129 */ val CLIENT_STATUS_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATUS_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_STATUS_GET_RESPONSE extends MessageType
    /* 130 */ val CLIENT_STATUS_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATUS_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_TRANSACTION_GET_REQUEST extends MessageType
    /* 112 */ val CLIENT_TRANSACTION_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_TRANSACTION_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_TRANSACTION_GET_RESPONSE extends MessageType
    /* 113 */ val CLIENT_TRANSACTION_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_TRANSACTION_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CLIENT_TRANSACTION_LIST_REQUEST extends MessageType
    /* 110 */ val CLIENT_TRANSACTION_LIST_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_TRANSACTION_LIST_REQUEST with Double = js.native
    
    @js.native
    sealed trait CLIENT_TRANSACTION_LIST_RESPONSE extends MessageType
    /* 111 */ val CLIENT_TRANSACTION_LIST_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_TRANSACTION_LIST_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_BLOCKS_GET_REQUEST extends MessageType
    /* 824 */ val CONSENSUS_BLOCKS_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_BLOCKS_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_BLOCKS_GET_RESPONSE extends MessageType
    /* 825 */ val CONSENSUS_BLOCKS_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_BLOCKS_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_BROADCAST_REQUEST extends MessageType
    /* 804 */ val CONSENSUS_BROADCAST_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_BROADCAST_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_BROADCAST_RESPONSE extends MessageType
    /* 805 */ val CONSENSUS_BROADCAST_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_BROADCAST_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_CANCEL_BLOCK_REQUEST extends MessageType
    /* 810 */ val CONSENSUS_CANCEL_BLOCK_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CANCEL_BLOCK_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_CANCEL_BLOCK_RESPONSE extends MessageType
    /* 811 */ val CONSENSUS_CANCEL_BLOCK_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CANCEL_BLOCK_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_CHAIN_HEAD_GET_REQUEST extends MessageType
    /* 826 */ val CONSENSUS_CHAIN_HEAD_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CHAIN_HEAD_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_CHAIN_HEAD_GET_RESPONSE extends MessageType
    /* 827 */ val CONSENSUS_CHAIN_HEAD_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CHAIN_HEAD_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_CHECK_BLOCKS_REQUEST extends MessageType
    /* 812 */ val CONSENSUS_CHECK_BLOCKS_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CHECK_BLOCKS_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_CHECK_BLOCKS_RESPONSE extends MessageType
    /* 813 */ val CONSENSUS_CHECK_BLOCKS_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CHECK_BLOCKS_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_COMMIT_BLOCK_REQUEST extends MessageType
    /* 814 */ val CONSENSUS_COMMIT_BLOCK_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_COMMIT_BLOCK_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_COMMIT_BLOCK_RESPONSE extends MessageType
    /* 815 */ val CONSENSUS_COMMIT_BLOCK_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_COMMIT_BLOCK_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_FAIL_BLOCK_REQUEST extends MessageType
    /* 818 */ val CONSENSUS_FAIL_BLOCK_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_FAIL_BLOCK_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_FAIL_BLOCK_RESPONSE extends MessageType
    /* 819 */ val CONSENSUS_FAIL_BLOCK_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_FAIL_BLOCK_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_FINALIZE_BLOCK_REQUEST extends MessageType
    /* 808 */ val CONSENSUS_FINALIZE_BLOCK_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_FINALIZE_BLOCK_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_FINALIZE_BLOCK_RESPONSE extends MessageType
    /* 809 */ val CONSENSUS_FINALIZE_BLOCK_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_FINALIZE_BLOCK_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_IGNORE_BLOCK_REQUEST extends MessageType
    /* 816 */ val CONSENSUS_IGNORE_BLOCK_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_IGNORE_BLOCK_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_IGNORE_BLOCK_RESPONSE extends MessageType
    /* 817 */ val CONSENSUS_IGNORE_BLOCK_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_IGNORE_BLOCK_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_INITIALIZE_BLOCK_REQUEST extends MessageType
    /* 806 */ val CONSENSUS_INITIALIZE_BLOCK_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_INITIALIZE_BLOCK_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_INITIALIZE_BLOCK_RESPONSE extends MessageType
    /* 807 */ val CONSENSUS_INITIALIZE_BLOCK_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_INITIALIZE_BLOCK_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_NOTIFY_ACK extends MessageType
    /* 999 */ val CONSENSUS_NOTIFY_ACK: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_ACK with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_NOTIFY_BLOCK_COMMIT extends MessageType
    /* 906 */ val CONSENSUS_NOTIFY_BLOCK_COMMIT: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_BLOCK_COMMIT with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_NOTIFY_BLOCK_INVALID extends MessageType
    /* 905 */ val CONSENSUS_NOTIFY_BLOCK_INVALID: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_BLOCK_INVALID with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_NOTIFY_BLOCK_NEW extends MessageType
    /* 903 */ val CONSENSUS_NOTIFY_BLOCK_NEW: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_BLOCK_NEW with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_NOTIFY_BLOCK_VALID extends MessageType
    /* 904 */ val CONSENSUS_NOTIFY_BLOCK_VALID: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_BLOCK_VALID with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_NOTIFY_PEER_CONNECTED extends MessageType
    /* 900 */ val CONSENSUS_NOTIFY_PEER_CONNECTED: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_PEER_CONNECTED with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_NOTIFY_PEER_DISCONNECTED extends MessageType
    /* 901 */ val CONSENSUS_NOTIFY_PEER_DISCONNECTED: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_PEER_DISCONNECTED with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_NOTIFY_PEER_MESSAGE extends MessageType
    /* 902 */ val CONSENSUS_NOTIFY_PEER_MESSAGE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_PEER_MESSAGE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_REGISTER_REQUEST extends MessageType
    /* 800 */ val CONSENSUS_REGISTER_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_REGISTER_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_REGISTER_RESPONSE extends MessageType
    /* 801 */ val CONSENSUS_REGISTER_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_REGISTER_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_SEND_TO_REQUEST extends MessageType
    /* 802 */ val CONSENSUS_SEND_TO_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SEND_TO_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_SEND_TO_RESPONSE extends MessageType
    /* 803 */ val CONSENSUS_SEND_TO_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SEND_TO_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_SETTINGS_GET_REQUEST extends MessageType
    /* 820 */ val CONSENSUS_SETTINGS_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SETTINGS_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_SETTINGS_GET_RESPONSE extends MessageType
    /* 821 */ val CONSENSUS_SETTINGS_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SETTINGS_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_STATE_GET_REQUEST extends MessageType
    /* 822 */ val CONSENSUS_STATE_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_STATE_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_STATE_GET_RESPONSE extends MessageType
    /* 823 */ val CONSENSUS_STATE_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_STATE_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_SUMMARIZE_BLOCK_REQUEST extends MessageType
    /* 828 */ val CONSENSUS_SUMMARIZE_BLOCK_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SUMMARIZE_BLOCK_REQUEST with Double = js.native
    
    @js.native
    sealed trait CONSENSUS_SUMMARIZE_BLOCK_RESPONSE extends MessageType
    /* 829 */ val CONSENSUS_SUMMARIZE_BLOCK_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SUMMARIZE_BLOCK_RESPONSE with Double = js.native
    
    @js.native
    sealed trait DEFAULT extends MessageType
    /* 0 */ val DEFAULT: typings.sawtoothSdk.protobufMod.Message.MessageType.DEFAULT with Double = js.native
    
    @js.native
    sealed trait GOSSIP_BATCH_BY_BATCH_ID_REQUEST extends MessageType
    /* 207 */ val GOSSIP_BATCH_BY_BATCH_ID_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_BATCH_BY_BATCH_ID_REQUEST with Double = js.native
    
    @js.native
    sealed trait GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST extends MessageType
    /* 208 */ val GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST with Double = js.native
    
    @js.native
    sealed trait GOSSIP_BATCH_RESPONSE extends MessageType
    /* 209 */ val GOSSIP_BATCH_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_BATCH_RESPONSE with Double = js.native
    
    @js.native
    sealed trait GOSSIP_BLOCK_REQUEST extends MessageType
    /* 205 */ val GOSSIP_BLOCK_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_BLOCK_REQUEST with Double = js.native
    
    @js.native
    sealed trait GOSSIP_BLOCK_RESPONSE extends MessageType
    /* 206 */ val GOSSIP_BLOCK_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_BLOCK_RESPONSE with Double = js.native
    
    @js.native
    sealed trait GOSSIP_CONSENSUS_MESSAGE extends MessageType
    /* 212 */ val GOSSIP_CONSENSUS_MESSAGE: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_CONSENSUS_MESSAGE with Double = js.native
    
    @js.native
    sealed trait GOSSIP_GET_PEERS_REQUEST extends MessageType
    /* 210 */ val GOSSIP_GET_PEERS_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_GET_PEERS_REQUEST with Double = js.native
    
    @js.native
    sealed trait GOSSIP_GET_PEERS_RESPONSE extends MessageType
    /* 211 */ val GOSSIP_GET_PEERS_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_GET_PEERS_RESPONSE with Double = js.native
    
    @js.native
    sealed trait GOSSIP_MESSAGE extends MessageType
    /* 200 */ val GOSSIP_MESSAGE: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_MESSAGE with Double = js.native
    
    @js.native
    sealed trait GOSSIP_REGISTER extends MessageType
    /* 201 */ val GOSSIP_REGISTER: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_REGISTER with Double = js.native
    
    @js.native
    sealed trait GOSSIP_UNREGISTER extends MessageType
    /* 202 */ val GOSSIP_UNREGISTER: typings.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_UNREGISTER with Double = js.native
    
    @js.native
    sealed trait NETWORK_ACK extends MessageType
    /* 300 */ val NETWORK_ACK: typings.sawtoothSdk.protobufMod.Message.MessageType.NETWORK_ACK with Double = js.native
    
    @js.native
    sealed trait NETWORK_CONNECT extends MessageType
    /* 301 */ val NETWORK_CONNECT: typings.sawtoothSdk.protobufMod.Message.MessageType.NETWORK_CONNECT with Double = js.native
    
    @js.native
    sealed trait NETWORK_DISCONNECT extends MessageType
    /* 302 */ val NETWORK_DISCONNECT: typings.sawtoothSdk.protobufMod.Message.MessageType.NETWORK_DISCONNECT with Double = js.native
    
    @js.native
    sealed trait PING_REQUEST extends MessageType
    /* 700 */ val PING_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.PING_REQUEST with Double = js.native
    
    @js.native
    sealed trait PING_RESPONSE extends MessageType
    /* 701 */ val PING_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.PING_RESPONSE with Double = js.native
    
    @js.native
    sealed trait TP_EVENT_ADD_REQUEST extends MessageType
    /* 15 */ val TP_EVENT_ADD_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_EVENT_ADD_REQUEST with Double = js.native
    
    @js.native
    sealed trait TP_EVENT_ADD_RESPONSE extends MessageType
    /* 16 */ val TP_EVENT_ADD_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_EVENT_ADD_RESPONSE with Double = js.native
    
    @js.native
    sealed trait TP_PROCESS_REQUEST extends MessageType
    /* 5 */ val TP_PROCESS_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_PROCESS_REQUEST with Double = js.native
    
    @js.native
    sealed trait TP_PROCESS_RESPONSE extends MessageType
    /* 6 */ val TP_PROCESS_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_PROCESS_RESPONSE with Double = js.native
    
    @js.native
    sealed trait TP_RECEIPT_ADD_DATA_REQUEST extends MessageType
    /* 13 */ val TP_RECEIPT_ADD_DATA_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_RECEIPT_ADD_DATA_REQUEST with Double = js.native
    
    @js.native
    sealed trait TP_RECEIPT_ADD_DATA_RESPONSE extends MessageType
    /* 14 */ val TP_RECEIPT_ADD_DATA_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_RECEIPT_ADD_DATA_RESPONSE with Double = js.native
    
    @js.native
    sealed trait TP_REGISTER_REQUEST extends MessageType
    /* 1 */ val TP_REGISTER_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_REGISTER_REQUEST with Double = js.native
    
    @js.native
    sealed trait TP_REGISTER_RESPONSE extends MessageType
    /* 2 */ val TP_REGISTER_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_REGISTER_RESPONSE with Double = js.native
    
    @js.native
    sealed trait TP_STATE_DELETE_REQUEST extends MessageType
    /* 11 */ val TP_STATE_DELETE_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_DELETE_REQUEST with Double = js.native
    
    @js.native
    sealed trait TP_STATE_DELETE_RESPONSE extends MessageType
    /* 12 */ val TP_STATE_DELETE_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_DELETE_RESPONSE with Double = js.native
    
    @js.native
    sealed trait TP_STATE_GET_REQUEST extends MessageType
    /* 7 */ val TP_STATE_GET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_GET_REQUEST with Double = js.native
    
    @js.native
    sealed trait TP_STATE_GET_RESPONSE extends MessageType
    /* 8 */ val TP_STATE_GET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_GET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait TP_STATE_SET_REQUEST extends MessageType
    /* 9 */ val TP_STATE_SET_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_SET_REQUEST with Double = js.native
    
    @js.native
    sealed trait TP_STATE_SET_RESPONSE extends MessageType
    /* 10 */ val TP_STATE_SET_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_SET_RESPONSE with Double = js.native
    
    @js.native
    sealed trait TP_UNREGISTER_REQUEST extends MessageType
    /* 3 */ val TP_UNREGISTER_REQUEST: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_UNREGISTER_REQUEST with Double = js.native
    
    @js.native
    sealed trait TP_UNREGISTER_RESPONSE extends MessageType
    /* 4 */ val TP_UNREGISTER_RESPONSE: typings.sawtoothSdk.protobufMod.Message.MessageType.TP_UNREGISTER_RESPONSE with Double = js.native
  }
  
  /**
    * Creates a new Message instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  @JSImport("sawtooth-sdk/protobuf", "Message.create")
  @js.native
  def create(): Message = js.native
  @JSImport("sawtooth-sdk/protobuf", "Message.create")
  @js.native
  def create(properties: IMessage): Message = js.native
  
  /**
    * Decodes a Message message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "Message.decode")
  @js.native
  def decode(reader: Reader): Message = js.native
  @JSImport("sawtooth-sdk/protobuf", "Message.decode")
  @js.native
  def decode(reader: Reader, length: Double): Message = js.native
  @JSImport("sawtooth-sdk/protobuf", "Message.decode")
  @js.native
  def decode(reader: Uint8Array): Message = js.native
  @JSImport("sawtooth-sdk/protobuf", "Message.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Message = js.native
  
  /**
    * Decodes a Message message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk/protobuf", "Message.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Message = js.native
  @JSImport("sawtooth-sdk/protobuf", "Message.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Message = js.native
  
  /**
    * Encodes the specified Message message. Does not implicitly {@link Message.verify|verify} messages.
    * @param message Message message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "Message.encode")
  @js.native
  def encode(message: IMessage): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "Message.encode")
  @js.native
  def encode(message: IMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Message message, length delimited. Does not implicitly {@link Message.verify|verify} messages.
    * @param message Message message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk/protobuf", "Message.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMessage): Writer = js.native
  @JSImport("sawtooth-sdk/protobuf", "Message.encodeDelimited")
  @js.native
  def encodeDelimited(message: IMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a Message message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message
    */
  @JSImport("sawtooth-sdk/protobuf", "Message.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Message = js.native
  
  /**
    * Creates a plain object from a Message message. Also converts values to other types if specified.
    * @param message Message
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk/protobuf", "Message.toObject")
  @js.native
  def toObject(message: Message): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk/protobuf", "Message.toObject")
  @js.native
  def toObject(message: Message, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Message message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk/protobuf", "Message.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
