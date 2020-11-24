package typings.sawtoothSdk.protobufMod.Message

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends js.Object
/** MessageType enum. */
@JSImport("sawtooth-sdk/protobuf", "Message.MessageType")
@js.native
object MessageType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
  
  @js.native
  sealed trait AUTHORIZATION_CHALLENGE_REQUEST extends MessageType
  /* 604 */ @js.native
  object AUTHORIZATION_CHALLENGE_REQUEST extends TopLevel[AUTHORIZATION_CHALLENGE_REQUEST with Double]
  
  @js.native
  sealed trait AUTHORIZATION_CHALLENGE_RESPONSE extends MessageType
  /* 605 */ @js.native
  object AUTHORIZATION_CHALLENGE_RESPONSE extends TopLevel[AUTHORIZATION_CHALLENGE_RESPONSE with Double]
  
  @js.native
  sealed trait AUTHORIZATION_CHALLENGE_RESULT extends MessageType
  /* 607 */ @js.native
  object AUTHORIZATION_CHALLENGE_RESULT extends TopLevel[AUTHORIZATION_CHALLENGE_RESULT with Double]
  
  @js.native
  sealed trait AUTHORIZATION_CHALLENGE_SUBMIT extends MessageType
  /* 606 */ @js.native
  object AUTHORIZATION_CHALLENGE_SUBMIT extends TopLevel[AUTHORIZATION_CHALLENGE_SUBMIT with Double]
  
  @js.native
  sealed trait AUTHORIZATION_CONNECTION_RESPONSE extends MessageType
  /* 600 */ @js.native
  object AUTHORIZATION_CONNECTION_RESPONSE extends TopLevel[AUTHORIZATION_CONNECTION_RESPONSE with Double]
  
  @js.native
  sealed trait AUTHORIZATION_TRUST_REQUEST extends MessageType
  /* 602 */ @js.native
  object AUTHORIZATION_TRUST_REQUEST extends TopLevel[AUTHORIZATION_TRUST_REQUEST with Double]
  
  @js.native
  sealed trait AUTHORIZATION_TRUST_RESPONSE extends MessageType
  /* 603 */ @js.native
  object AUTHORIZATION_TRUST_RESPONSE extends TopLevel[AUTHORIZATION_TRUST_RESPONSE with Double]
  
  @js.native
  sealed trait AUTHORIZATION_VIOLATION extends MessageType
  /* 601 */ @js.native
  object AUTHORIZATION_VIOLATION extends TopLevel[AUTHORIZATION_VIOLATION with Double]
  
  @js.native
  sealed trait CLIENT_BATCH_GET_REQUEST extends MessageType
  /* 108 */ @js.native
  object CLIENT_BATCH_GET_REQUEST extends TopLevel[CLIENT_BATCH_GET_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_BATCH_GET_RESPONSE extends MessageType
  /* 109 */ @js.native
  object CLIENT_BATCH_GET_RESPONSE extends TopLevel[CLIENT_BATCH_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_BATCH_LIST_REQUEST extends MessageType
  /* 106 */ @js.native
  object CLIENT_BATCH_LIST_REQUEST extends TopLevel[CLIENT_BATCH_LIST_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_BATCH_LIST_RESPONSE extends MessageType
  /* 107 */ @js.native
  object CLIENT_BATCH_LIST_RESPONSE extends TopLevel[CLIENT_BATCH_LIST_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_BATCH_STATUS_REQUEST extends MessageType
  /* 120 */ @js.native
  object CLIENT_BATCH_STATUS_REQUEST extends TopLevel[CLIENT_BATCH_STATUS_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_BATCH_STATUS_RESPONSE extends MessageType
  /* 121 */ @js.native
  object CLIENT_BATCH_STATUS_RESPONSE extends TopLevel[CLIENT_BATCH_STATUS_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_BATCH_SUBMIT_REQUEST extends MessageType
  /* 100 */ @js.native
  object CLIENT_BATCH_SUBMIT_REQUEST extends TopLevel[CLIENT_BATCH_SUBMIT_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_BATCH_SUBMIT_RESPONSE extends MessageType
  /* 101 */ @js.native
  object CLIENT_BATCH_SUBMIT_RESPONSE extends TopLevel[CLIENT_BATCH_SUBMIT_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST extends MessageType
  /* 128 */ @js.native
  object CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST extends TopLevel[CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_BLOCK_GET_BY_ID_REQUEST extends MessageType
  /* 104 */ @js.native
  object CLIENT_BLOCK_GET_BY_ID_REQUEST extends TopLevel[CLIENT_BLOCK_GET_BY_ID_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_BLOCK_GET_BY_NUM_REQUEST extends MessageType
  /* 124 */ @js.native
  object CLIENT_BLOCK_GET_BY_NUM_REQUEST extends TopLevel[CLIENT_BLOCK_GET_BY_NUM_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST extends MessageType
  /* 127 */ @js.native
  object CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST extends TopLevel[CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_BLOCK_GET_RESPONSE extends MessageType
  /* 105 */ @js.native
  object CLIENT_BLOCK_GET_RESPONSE extends TopLevel[CLIENT_BLOCK_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_BLOCK_LIST_REQUEST extends MessageType
  /* 102 */ @js.native
  object CLIENT_BLOCK_LIST_REQUEST extends TopLevel[CLIENT_BLOCK_LIST_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_BLOCK_LIST_RESPONSE extends MessageType
  /* 103 */ @js.native
  object CLIENT_BLOCK_LIST_RESPONSE extends TopLevel[CLIENT_BLOCK_LIST_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_EVENTS extends MessageType
  /* 504 */ @js.native
  object CLIENT_EVENTS extends TopLevel[CLIENT_EVENTS with Double]
  
  @js.native
  sealed trait CLIENT_EVENTS_GET_REQUEST extends MessageType
  /* 505 */ @js.native
  object CLIENT_EVENTS_GET_REQUEST extends TopLevel[CLIENT_EVENTS_GET_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_EVENTS_GET_RESPONSE extends MessageType
  /* 506 */ @js.native
  object CLIENT_EVENTS_GET_RESPONSE extends TopLevel[CLIENT_EVENTS_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_EVENTS_SUBSCRIBE_REQUEST extends MessageType
  /* 500 */ @js.native
  object CLIENT_EVENTS_SUBSCRIBE_REQUEST extends TopLevel[CLIENT_EVENTS_SUBSCRIBE_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_EVENTS_SUBSCRIBE_RESPONSE extends MessageType
  /* 501 */ @js.native
  object CLIENT_EVENTS_SUBSCRIBE_RESPONSE extends TopLevel[CLIENT_EVENTS_SUBSCRIBE_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_EVENTS_UNSUBSCRIBE_REQUEST extends MessageType
  /* 502 */ @js.native
  object CLIENT_EVENTS_UNSUBSCRIBE_REQUEST extends TopLevel[CLIENT_EVENTS_UNSUBSCRIBE_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE extends MessageType
  /* 503 */ @js.native
  object CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE extends TopLevel[CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_PEERS_GET_REQUEST extends MessageType
  /* 125 */ @js.native
  object CLIENT_PEERS_GET_REQUEST extends TopLevel[CLIENT_PEERS_GET_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_PEERS_GET_RESPONSE extends MessageType
  /* 126 */ @js.native
  object CLIENT_PEERS_GET_RESPONSE extends TopLevel[CLIENT_PEERS_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_RECEIPT_GET_REQUEST extends MessageType
  /* 122 */ @js.native
  object CLIENT_RECEIPT_GET_REQUEST extends TopLevel[CLIENT_RECEIPT_GET_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_RECEIPT_GET_RESPONSE extends MessageType
  /* 123 */ @js.native
  object CLIENT_RECEIPT_GET_RESPONSE extends TopLevel[CLIENT_RECEIPT_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_STATE_CURRENT_REQUEST extends MessageType
  /* 114 */ @js.native
  object CLIENT_STATE_CURRENT_REQUEST extends TopLevel[CLIENT_STATE_CURRENT_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_STATE_CURRENT_RESPONSE extends MessageType
  /* 115 */ @js.native
  object CLIENT_STATE_CURRENT_RESPONSE extends TopLevel[CLIENT_STATE_CURRENT_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_STATE_GET_REQUEST extends MessageType
  /* 118 */ @js.native
  object CLIENT_STATE_GET_REQUEST extends TopLevel[CLIENT_STATE_GET_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_STATE_GET_RESPONSE extends MessageType
  /* 119 */ @js.native
  object CLIENT_STATE_GET_RESPONSE extends TopLevel[CLIENT_STATE_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_STATE_LIST_REQUEST extends MessageType
  /* 116 */ @js.native
  object CLIENT_STATE_LIST_REQUEST extends TopLevel[CLIENT_STATE_LIST_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_STATE_LIST_RESPONSE extends MessageType
  /* 117 */ @js.native
  object CLIENT_STATE_LIST_RESPONSE extends TopLevel[CLIENT_STATE_LIST_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_STATUS_GET_REQUEST extends MessageType
  /* 129 */ @js.native
  object CLIENT_STATUS_GET_REQUEST extends TopLevel[CLIENT_STATUS_GET_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_STATUS_GET_RESPONSE extends MessageType
  /* 130 */ @js.native
  object CLIENT_STATUS_GET_RESPONSE extends TopLevel[CLIENT_STATUS_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_TRANSACTION_GET_REQUEST extends MessageType
  /* 112 */ @js.native
  object CLIENT_TRANSACTION_GET_REQUEST extends TopLevel[CLIENT_TRANSACTION_GET_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_TRANSACTION_GET_RESPONSE extends MessageType
  /* 113 */ @js.native
  object CLIENT_TRANSACTION_GET_RESPONSE extends TopLevel[CLIENT_TRANSACTION_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CLIENT_TRANSACTION_LIST_REQUEST extends MessageType
  /* 110 */ @js.native
  object CLIENT_TRANSACTION_LIST_REQUEST extends TopLevel[CLIENT_TRANSACTION_LIST_REQUEST with Double]
  
  @js.native
  sealed trait CLIENT_TRANSACTION_LIST_RESPONSE extends MessageType
  /* 111 */ @js.native
  object CLIENT_TRANSACTION_LIST_RESPONSE extends TopLevel[CLIENT_TRANSACTION_LIST_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_BLOCKS_GET_REQUEST extends MessageType
  /* 824 */ @js.native
  object CONSENSUS_BLOCKS_GET_REQUEST extends TopLevel[CONSENSUS_BLOCKS_GET_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_BLOCKS_GET_RESPONSE extends MessageType
  /* 825 */ @js.native
  object CONSENSUS_BLOCKS_GET_RESPONSE extends TopLevel[CONSENSUS_BLOCKS_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_BROADCAST_REQUEST extends MessageType
  /* 804 */ @js.native
  object CONSENSUS_BROADCAST_REQUEST extends TopLevel[CONSENSUS_BROADCAST_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_BROADCAST_RESPONSE extends MessageType
  /* 805 */ @js.native
  object CONSENSUS_BROADCAST_RESPONSE extends TopLevel[CONSENSUS_BROADCAST_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_CANCEL_BLOCK_REQUEST extends MessageType
  /* 810 */ @js.native
  object CONSENSUS_CANCEL_BLOCK_REQUEST extends TopLevel[CONSENSUS_CANCEL_BLOCK_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_CANCEL_BLOCK_RESPONSE extends MessageType
  /* 811 */ @js.native
  object CONSENSUS_CANCEL_BLOCK_RESPONSE extends TopLevel[CONSENSUS_CANCEL_BLOCK_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_CHAIN_HEAD_GET_REQUEST extends MessageType
  /* 826 */ @js.native
  object CONSENSUS_CHAIN_HEAD_GET_REQUEST extends TopLevel[CONSENSUS_CHAIN_HEAD_GET_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_CHAIN_HEAD_GET_RESPONSE extends MessageType
  /* 827 */ @js.native
  object CONSENSUS_CHAIN_HEAD_GET_RESPONSE extends TopLevel[CONSENSUS_CHAIN_HEAD_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_CHECK_BLOCKS_REQUEST extends MessageType
  /* 812 */ @js.native
  object CONSENSUS_CHECK_BLOCKS_REQUEST extends TopLevel[CONSENSUS_CHECK_BLOCKS_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_CHECK_BLOCKS_RESPONSE extends MessageType
  /* 813 */ @js.native
  object CONSENSUS_CHECK_BLOCKS_RESPONSE extends TopLevel[CONSENSUS_CHECK_BLOCKS_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_COMMIT_BLOCK_REQUEST extends MessageType
  /* 814 */ @js.native
  object CONSENSUS_COMMIT_BLOCK_REQUEST extends TopLevel[CONSENSUS_COMMIT_BLOCK_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_COMMIT_BLOCK_RESPONSE extends MessageType
  /* 815 */ @js.native
  object CONSENSUS_COMMIT_BLOCK_RESPONSE extends TopLevel[CONSENSUS_COMMIT_BLOCK_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_FAIL_BLOCK_REQUEST extends MessageType
  /* 818 */ @js.native
  object CONSENSUS_FAIL_BLOCK_REQUEST extends TopLevel[CONSENSUS_FAIL_BLOCK_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_FAIL_BLOCK_RESPONSE extends MessageType
  /* 819 */ @js.native
  object CONSENSUS_FAIL_BLOCK_RESPONSE extends TopLevel[CONSENSUS_FAIL_BLOCK_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_FINALIZE_BLOCK_REQUEST extends MessageType
  /* 808 */ @js.native
  object CONSENSUS_FINALIZE_BLOCK_REQUEST extends TopLevel[CONSENSUS_FINALIZE_BLOCK_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_FINALIZE_BLOCK_RESPONSE extends MessageType
  /* 809 */ @js.native
  object CONSENSUS_FINALIZE_BLOCK_RESPONSE extends TopLevel[CONSENSUS_FINALIZE_BLOCK_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_IGNORE_BLOCK_REQUEST extends MessageType
  /* 816 */ @js.native
  object CONSENSUS_IGNORE_BLOCK_REQUEST extends TopLevel[CONSENSUS_IGNORE_BLOCK_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_IGNORE_BLOCK_RESPONSE extends MessageType
  /* 817 */ @js.native
  object CONSENSUS_IGNORE_BLOCK_RESPONSE extends TopLevel[CONSENSUS_IGNORE_BLOCK_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_INITIALIZE_BLOCK_REQUEST extends MessageType
  /* 806 */ @js.native
  object CONSENSUS_INITIALIZE_BLOCK_REQUEST extends TopLevel[CONSENSUS_INITIALIZE_BLOCK_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_INITIALIZE_BLOCK_RESPONSE extends MessageType
  /* 807 */ @js.native
  object CONSENSUS_INITIALIZE_BLOCK_RESPONSE extends TopLevel[CONSENSUS_INITIALIZE_BLOCK_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_ACK extends MessageType
  /* 999 */ @js.native
  object CONSENSUS_NOTIFY_ACK extends TopLevel[CONSENSUS_NOTIFY_ACK with Double]
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_BLOCK_COMMIT extends MessageType
  /* 906 */ @js.native
  object CONSENSUS_NOTIFY_BLOCK_COMMIT extends TopLevel[CONSENSUS_NOTIFY_BLOCK_COMMIT with Double]
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_BLOCK_INVALID extends MessageType
  /* 905 */ @js.native
  object CONSENSUS_NOTIFY_BLOCK_INVALID extends TopLevel[CONSENSUS_NOTIFY_BLOCK_INVALID with Double]
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_BLOCK_NEW extends MessageType
  /* 903 */ @js.native
  object CONSENSUS_NOTIFY_BLOCK_NEW extends TopLevel[CONSENSUS_NOTIFY_BLOCK_NEW with Double]
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_BLOCK_VALID extends MessageType
  /* 904 */ @js.native
  object CONSENSUS_NOTIFY_BLOCK_VALID extends TopLevel[CONSENSUS_NOTIFY_BLOCK_VALID with Double]
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_PEER_CONNECTED extends MessageType
  /* 900 */ @js.native
  object CONSENSUS_NOTIFY_PEER_CONNECTED extends TopLevel[CONSENSUS_NOTIFY_PEER_CONNECTED with Double]
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_PEER_DISCONNECTED extends MessageType
  /* 901 */ @js.native
  object CONSENSUS_NOTIFY_PEER_DISCONNECTED extends TopLevel[CONSENSUS_NOTIFY_PEER_DISCONNECTED with Double]
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_PEER_MESSAGE extends MessageType
  /* 902 */ @js.native
  object CONSENSUS_NOTIFY_PEER_MESSAGE extends TopLevel[CONSENSUS_NOTIFY_PEER_MESSAGE with Double]
  
  @js.native
  sealed trait CONSENSUS_REGISTER_REQUEST extends MessageType
  /* 800 */ @js.native
  object CONSENSUS_REGISTER_REQUEST extends TopLevel[CONSENSUS_REGISTER_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_REGISTER_RESPONSE extends MessageType
  /* 801 */ @js.native
  object CONSENSUS_REGISTER_RESPONSE extends TopLevel[CONSENSUS_REGISTER_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_SEND_TO_REQUEST extends MessageType
  /* 802 */ @js.native
  object CONSENSUS_SEND_TO_REQUEST extends TopLevel[CONSENSUS_SEND_TO_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_SEND_TO_RESPONSE extends MessageType
  /* 803 */ @js.native
  object CONSENSUS_SEND_TO_RESPONSE extends TopLevel[CONSENSUS_SEND_TO_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_SETTINGS_GET_REQUEST extends MessageType
  /* 820 */ @js.native
  object CONSENSUS_SETTINGS_GET_REQUEST extends TopLevel[CONSENSUS_SETTINGS_GET_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_SETTINGS_GET_RESPONSE extends MessageType
  /* 821 */ @js.native
  object CONSENSUS_SETTINGS_GET_RESPONSE extends TopLevel[CONSENSUS_SETTINGS_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_STATE_GET_REQUEST extends MessageType
  /* 822 */ @js.native
  object CONSENSUS_STATE_GET_REQUEST extends TopLevel[CONSENSUS_STATE_GET_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_STATE_GET_RESPONSE extends MessageType
  /* 823 */ @js.native
  object CONSENSUS_STATE_GET_RESPONSE extends TopLevel[CONSENSUS_STATE_GET_RESPONSE with Double]
  
  @js.native
  sealed trait CONSENSUS_SUMMARIZE_BLOCK_REQUEST extends MessageType
  /* 828 */ @js.native
  object CONSENSUS_SUMMARIZE_BLOCK_REQUEST extends TopLevel[CONSENSUS_SUMMARIZE_BLOCK_REQUEST with Double]
  
  @js.native
  sealed trait CONSENSUS_SUMMARIZE_BLOCK_RESPONSE extends MessageType
  /* 829 */ @js.native
  object CONSENSUS_SUMMARIZE_BLOCK_RESPONSE extends TopLevel[CONSENSUS_SUMMARIZE_BLOCK_RESPONSE with Double]
  
  @js.native
  sealed trait DEFAULT extends MessageType
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  @js.native
  sealed trait GOSSIP_BATCH_BY_BATCH_ID_REQUEST extends MessageType
  /* 207 */ @js.native
  object GOSSIP_BATCH_BY_BATCH_ID_REQUEST extends TopLevel[GOSSIP_BATCH_BY_BATCH_ID_REQUEST with Double]
  
  @js.native
  sealed trait GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST extends MessageType
  /* 208 */ @js.native
  object GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST extends TopLevel[GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST with Double]
  
  @js.native
  sealed trait GOSSIP_BATCH_RESPONSE extends MessageType
  /* 209 */ @js.native
  object GOSSIP_BATCH_RESPONSE extends TopLevel[GOSSIP_BATCH_RESPONSE with Double]
  
  @js.native
  sealed trait GOSSIP_BLOCK_REQUEST extends MessageType
  /* 205 */ @js.native
  object GOSSIP_BLOCK_REQUEST extends TopLevel[GOSSIP_BLOCK_REQUEST with Double]
  
  @js.native
  sealed trait GOSSIP_BLOCK_RESPONSE extends MessageType
  /* 206 */ @js.native
  object GOSSIP_BLOCK_RESPONSE extends TopLevel[GOSSIP_BLOCK_RESPONSE with Double]
  
  @js.native
  sealed trait GOSSIP_CONSENSUS_MESSAGE extends MessageType
  /* 212 */ @js.native
  object GOSSIP_CONSENSUS_MESSAGE extends TopLevel[GOSSIP_CONSENSUS_MESSAGE with Double]
  
  @js.native
  sealed trait GOSSIP_GET_PEERS_REQUEST extends MessageType
  /* 210 */ @js.native
  object GOSSIP_GET_PEERS_REQUEST extends TopLevel[GOSSIP_GET_PEERS_REQUEST with Double]
  
  @js.native
  sealed trait GOSSIP_GET_PEERS_RESPONSE extends MessageType
  /* 211 */ @js.native
  object GOSSIP_GET_PEERS_RESPONSE extends TopLevel[GOSSIP_GET_PEERS_RESPONSE with Double]
  
  @js.native
  sealed trait GOSSIP_MESSAGE extends MessageType
  /* 200 */ @js.native
  object GOSSIP_MESSAGE extends TopLevel[GOSSIP_MESSAGE with Double]
  
  @js.native
  sealed trait GOSSIP_REGISTER extends MessageType
  /* 201 */ @js.native
  object GOSSIP_REGISTER extends TopLevel[GOSSIP_REGISTER with Double]
  
  @js.native
  sealed trait GOSSIP_UNREGISTER extends MessageType
  /* 202 */ @js.native
  object GOSSIP_UNREGISTER extends TopLevel[GOSSIP_UNREGISTER with Double]
  
  @js.native
  sealed trait NETWORK_ACK extends MessageType
  /* 300 */ @js.native
  object NETWORK_ACK extends TopLevel[NETWORK_ACK with Double]
  
  @js.native
  sealed trait NETWORK_CONNECT extends MessageType
  /* 301 */ @js.native
  object NETWORK_CONNECT extends TopLevel[NETWORK_CONNECT with Double]
  
  @js.native
  sealed trait NETWORK_DISCONNECT extends MessageType
  /* 302 */ @js.native
  object NETWORK_DISCONNECT extends TopLevel[NETWORK_DISCONNECT with Double]
  
  @js.native
  sealed trait PING_REQUEST extends MessageType
  /* 700 */ @js.native
  object PING_REQUEST extends TopLevel[PING_REQUEST with Double]
  
  @js.native
  sealed trait PING_RESPONSE extends MessageType
  /* 701 */ @js.native
  object PING_RESPONSE extends TopLevel[PING_RESPONSE with Double]
  
  @js.native
  sealed trait TP_EVENT_ADD_REQUEST extends MessageType
  /* 15 */ @js.native
  object TP_EVENT_ADD_REQUEST extends TopLevel[TP_EVENT_ADD_REQUEST with Double]
  
  @js.native
  sealed trait TP_EVENT_ADD_RESPONSE extends MessageType
  /* 16 */ @js.native
  object TP_EVENT_ADD_RESPONSE extends TopLevel[TP_EVENT_ADD_RESPONSE with Double]
  
  @js.native
  sealed trait TP_PROCESS_REQUEST extends MessageType
  /* 5 */ @js.native
  object TP_PROCESS_REQUEST extends TopLevel[TP_PROCESS_REQUEST with Double]
  
  @js.native
  sealed trait TP_PROCESS_RESPONSE extends MessageType
  /* 6 */ @js.native
  object TP_PROCESS_RESPONSE extends TopLevel[TP_PROCESS_RESPONSE with Double]
  
  @js.native
  sealed trait TP_RECEIPT_ADD_DATA_REQUEST extends MessageType
  /* 13 */ @js.native
  object TP_RECEIPT_ADD_DATA_REQUEST extends TopLevel[TP_RECEIPT_ADD_DATA_REQUEST with Double]
  
  @js.native
  sealed trait TP_RECEIPT_ADD_DATA_RESPONSE extends MessageType
  /* 14 */ @js.native
  object TP_RECEIPT_ADD_DATA_RESPONSE extends TopLevel[TP_RECEIPT_ADD_DATA_RESPONSE with Double]
  
  @js.native
  sealed trait TP_REGISTER_REQUEST extends MessageType
  /* 1 */ @js.native
  object TP_REGISTER_REQUEST extends TopLevel[TP_REGISTER_REQUEST with Double]
  
  @js.native
  sealed trait TP_REGISTER_RESPONSE extends MessageType
  /* 2 */ @js.native
  object TP_REGISTER_RESPONSE extends TopLevel[TP_REGISTER_RESPONSE with Double]
  
  @js.native
  sealed trait TP_STATE_DELETE_REQUEST extends MessageType
  /* 11 */ @js.native
  object TP_STATE_DELETE_REQUEST extends TopLevel[TP_STATE_DELETE_REQUEST with Double]
  
  @js.native
  sealed trait TP_STATE_DELETE_RESPONSE extends MessageType
  /* 12 */ @js.native
  object TP_STATE_DELETE_RESPONSE extends TopLevel[TP_STATE_DELETE_RESPONSE with Double]
  
  @js.native
  sealed trait TP_STATE_GET_REQUEST extends MessageType
  /* 7 */ @js.native
  object TP_STATE_GET_REQUEST extends TopLevel[TP_STATE_GET_REQUEST with Double]
  
  @js.native
  sealed trait TP_STATE_GET_RESPONSE extends MessageType
  /* 8 */ @js.native
  object TP_STATE_GET_RESPONSE extends TopLevel[TP_STATE_GET_RESPONSE with Double]
  
  @js.native
  sealed trait TP_STATE_SET_REQUEST extends MessageType
  /* 9 */ @js.native
  object TP_STATE_SET_REQUEST extends TopLevel[TP_STATE_SET_REQUEST with Double]
  
  @js.native
  sealed trait TP_STATE_SET_RESPONSE extends MessageType
  /* 10 */ @js.native
  object TP_STATE_SET_RESPONSE extends TopLevel[TP_STATE_SET_RESPONSE with Double]
  
  @js.native
  sealed trait TP_UNREGISTER_REQUEST extends MessageType
  /* 3 */ @js.native
  object TP_UNREGISTER_REQUEST extends TopLevel[TP_UNREGISTER_REQUEST with Double]
  
  @js.native
  sealed trait TP_UNREGISTER_RESPONSE extends MessageType
  /* 4 */ @js.native
  object TP_UNREGISTER_RESPONSE extends TopLevel[TP_UNREGISTER_RESPONSE with Double]
}
