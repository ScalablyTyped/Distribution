package typings.sawtoothSdk.protobufMod.Message

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageType extends js.Object

/** MessageType enum. */
@JSImport("sawtooth-sdk/protobuf", "Message.MessageType")
@js.native
object MessageType extends js.Object {
  @js.native
  sealed trait AUTHORIZATION_CHALLENGE_REQUEST extends MessageType
  
  @js.native
  sealed trait AUTHORIZATION_CHALLENGE_RESPONSE extends MessageType
  
  @js.native
  sealed trait AUTHORIZATION_CHALLENGE_RESULT extends MessageType
  
  @js.native
  sealed trait AUTHORIZATION_CHALLENGE_SUBMIT extends MessageType
  
  @js.native
  sealed trait AUTHORIZATION_CONNECTION_RESPONSE extends MessageType
  
  @js.native
  sealed trait AUTHORIZATION_TRUST_REQUEST extends MessageType
  
  @js.native
  sealed trait AUTHORIZATION_TRUST_RESPONSE extends MessageType
  
  @js.native
  sealed trait AUTHORIZATION_VIOLATION extends MessageType
  
  @js.native
  sealed trait CLIENT_BATCH_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_BATCH_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_BATCH_LIST_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_BATCH_LIST_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_BATCH_STATUS_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_BATCH_STATUS_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_BATCH_SUBMIT_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_BATCH_SUBMIT_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_BLOCK_GET_BY_ID_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_BLOCK_GET_BY_NUM_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_BLOCK_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_BLOCK_LIST_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_BLOCK_LIST_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_EVENTS extends MessageType
  
  @js.native
  sealed trait CLIENT_EVENTS_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_EVENTS_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_EVENTS_SUBSCRIBE_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_EVENTS_SUBSCRIBE_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_EVENTS_UNSUBSCRIBE_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_PEERS_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_PEERS_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_RECEIPT_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_RECEIPT_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_STATE_CURRENT_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_STATE_CURRENT_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_STATE_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_STATE_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_STATE_LIST_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_STATE_LIST_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_STATUS_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_STATUS_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_TRANSACTION_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_TRANSACTION_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CLIENT_TRANSACTION_LIST_REQUEST extends MessageType
  
  @js.native
  sealed trait CLIENT_TRANSACTION_LIST_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_BLOCKS_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_BLOCKS_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_BROADCAST_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_BROADCAST_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_CANCEL_BLOCK_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_CANCEL_BLOCK_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_CHAIN_HEAD_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_CHAIN_HEAD_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_CHECK_BLOCKS_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_CHECK_BLOCKS_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_COMMIT_BLOCK_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_COMMIT_BLOCK_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_FAIL_BLOCK_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_FAIL_BLOCK_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_FINALIZE_BLOCK_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_FINALIZE_BLOCK_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_IGNORE_BLOCK_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_IGNORE_BLOCK_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_INITIALIZE_BLOCK_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_INITIALIZE_BLOCK_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_ACK extends MessageType
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_BLOCK_COMMIT extends MessageType
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_BLOCK_INVALID extends MessageType
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_BLOCK_NEW extends MessageType
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_BLOCK_VALID extends MessageType
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_PEER_CONNECTED extends MessageType
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_PEER_DISCONNECTED extends MessageType
  
  @js.native
  sealed trait CONSENSUS_NOTIFY_PEER_MESSAGE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_REGISTER_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_REGISTER_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_SEND_TO_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_SEND_TO_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_SETTINGS_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_SETTINGS_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_STATE_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_STATE_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait CONSENSUS_SUMMARIZE_BLOCK_REQUEST extends MessageType
  
  @js.native
  sealed trait CONSENSUS_SUMMARIZE_BLOCK_RESPONSE extends MessageType
  
  @js.native
  sealed trait DEFAULT extends MessageType
  
  @js.native
  sealed trait GOSSIP_BATCH_BY_BATCH_ID_REQUEST extends MessageType
  
  @js.native
  sealed trait GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST extends MessageType
  
  @js.native
  sealed trait GOSSIP_BATCH_RESPONSE extends MessageType
  
  @js.native
  sealed trait GOSSIP_BLOCK_REQUEST extends MessageType
  
  @js.native
  sealed trait GOSSIP_BLOCK_RESPONSE extends MessageType
  
  @js.native
  sealed trait GOSSIP_CONSENSUS_MESSAGE extends MessageType
  
  @js.native
  sealed trait GOSSIP_GET_PEERS_REQUEST extends MessageType
  
  @js.native
  sealed trait GOSSIP_GET_PEERS_RESPONSE extends MessageType
  
  @js.native
  sealed trait GOSSIP_MESSAGE extends MessageType
  
  @js.native
  sealed trait GOSSIP_REGISTER extends MessageType
  
  @js.native
  sealed trait GOSSIP_UNREGISTER extends MessageType
  
  @js.native
  sealed trait NETWORK_ACK extends MessageType
  
  @js.native
  sealed trait NETWORK_CONNECT extends MessageType
  
  @js.native
  sealed trait NETWORK_DISCONNECT extends MessageType
  
  @js.native
  sealed trait PING_REQUEST extends MessageType
  
  @js.native
  sealed trait PING_RESPONSE extends MessageType
  
  @js.native
  sealed trait TP_EVENT_ADD_REQUEST extends MessageType
  
  @js.native
  sealed trait TP_EVENT_ADD_RESPONSE extends MessageType
  
  @js.native
  sealed trait TP_PROCESS_REQUEST extends MessageType
  
  @js.native
  sealed trait TP_PROCESS_RESPONSE extends MessageType
  
  @js.native
  sealed trait TP_RECEIPT_ADD_DATA_REQUEST extends MessageType
  
  @js.native
  sealed trait TP_RECEIPT_ADD_DATA_RESPONSE extends MessageType
  
  @js.native
  sealed trait TP_REGISTER_REQUEST extends MessageType
  
  @js.native
  sealed trait TP_REGISTER_RESPONSE extends MessageType
  
  @js.native
  sealed trait TP_STATE_DELETE_REQUEST extends MessageType
  
  @js.native
  sealed trait TP_STATE_DELETE_RESPONSE extends MessageType
  
  @js.native
  sealed trait TP_STATE_GET_REQUEST extends MessageType
  
  @js.native
  sealed trait TP_STATE_GET_RESPONSE extends MessageType
  
  @js.native
  sealed trait TP_STATE_SET_REQUEST extends MessageType
  
  @js.native
  sealed trait TP_STATE_SET_RESPONSE extends MessageType
  
  @js.native
  sealed trait TP_UNREGISTER_REQUEST extends MessageType
  
  @js.native
  sealed trait TP_UNREGISTER_RESPONSE extends MessageType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
  /* 604 */ @js.native
  object AUTHORIZATION_CHALLENGE_REQUEST extends TopLevel[AUTHORIZATION_CHALLENGE_REQUEST with Double]
  
  /* 605 */ @js.native
  object AUTHORIZATION_CHALLENGE_RESPONSE extends TopLevel[AUTHORIZATION_CHALLENGE_RESPONSE with Double]
  
  /* 607 */ @js.native
  object AUTHORIZATION_CHALLENGE_RESULT extends TopLevel[AUTHORIZATION_CHALLENGE_RESULT with Double]
  
  /* 606 */ @js.native
  object AUTHORIZATION_CHALLENGE_SUBMIT extends TopLevel[AUTHORIZATION_CHALLENGE_SUBMIT with Double]
  
  /* 600 */ @js.native
  object AUTHORIZATION_CONNECTION_RESPONSE extends TopLevel[AUTHORIZATION_CONNECTION_RESPONSE with Double]
  
  /* 602 */ @js.native
  object AUTHORIZATION_TRUST_REQUEST extends TopLevel[AUTHORIZATION_TRUST_REQUEST with Double]
  
  /* 603 */ @js.native
  object AUTHORIZATION_TRUST_RESPONSE extends TopLevel[AUTHORIZATION_TRUST_RESPONSE with Double]
  
  /* 601 */ @js.native
  object AUTHORIZATION_VIOLATION extends TopLevel[AUTHORIZATION_VIOLATION with Double]
  
  /* 108 */ @js.native
  object CLIENT_BATCH_GET_REQUEST extends TopLevel[CLIENT_BATCH_GET_REQUEST with Double]
  
  /* 109 */ @js.native
  object CLIENT_BATCH_GET_RESPONSE extends TopLevel[CLIENT_BATCH_GET_RESPONSE with Double]
  
  /* 106 */ @js.native
  object CLIENT_BATCH_LIST_REQUEST extends TopLevel[CLIENT_BATCH_LIST_REQUEST with Double]
  
  /* 107 */ @js.native
  object CLIENT_BATCH_LIST_RESPONSE extends TopLevel[CLIENT_BATCH_LIST_RESPONSE with Double]
  
  /* 120 */ @js.native
  object CLIENT_BATCH_STATUS_REQUEST extends TopLevel[CLIENT_BATCH_STATUS_REQUEST with Double]
  
  /* 121 */ @js.native
  object CLIENT_BATCH_STATUS_RESPONSE extends TopLevel[CLIENT_BATCH_STATUS_RESPONSE with Double]
  
  /* 100 */ @js.native
  object CLIENT_BATCH_SUBMIT_REQUEST extends TopLevel[CLIENT_BATCH_SUBMIT_REQUEST with Double]
  
  /* 101 */ @js.native
  object CLIENT_BATCH_SUBMIT_RESPONSE extends TopLevel[CLIENT_BATCH_SUBMIT_RESPONSE with Double]
  
  /* 128 */ @js.native
  object CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST extends TopLevel[CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST with Double]
  
  /* 104 */ @js.native
  object CLIENT_BLOCK_GET_BY_ID_REQUEST extends TopLevel[CLIENT_BLOCK_GET_BY_ID_REQUEST with Double]
  
  /* 124 */ @js.native
  object CLIENT_BLOCK_GET_BY_NUM_REQUEST extends TopLevel[CLIENT_BLOCK_GET_BY_NUM_REQUEST with Double]
  
  /* 127 */ @js.native
  object CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST extends TopLevel[CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST with Double]
  
  /* 105 */ @js.native
  object CLIENT_BLOCK_GET_RESPONSE extends TopLevel[CLIENT_BLOCK_GET_RESPONSE with Double]
  
  /* 102 */ @js.native
  object CLIENT_BLOCK_LIST_REQUEST extends TopLevel[CLIENT_BLOCK_LIST_REQUEST with Double]
  
  /* 103 */ @js.native
  object CLIENT_BLOCK_LIST_RESPONSE extends TopLevel[CLIENT_BLOCK_LIST_RESPONSE with Double]
  
  /* 504 */ @js.native
  object CLIENT_EVENTS extends TopLevel[CLIENT_EVENTS with Double]
  
  /* 505 */ @js.native
  object CLIENT_EVENTS_GET_REQUEST extends TopLevel[CLIENT_EVENTS_GET_REQUEST with Double]
  
  /* 506 */ @js.native
  object CLIENT_EVENTS_GET_RESPONSE extends TopLevel[CLIENT_EVENTS_GET_RESPONSE with Double]
  
  /* 500 */ @js.native
  object CLIENT_EVENTS_SUBSCRIBE_REQUEST extends TopLevel[CLIENT_EVENTS_SUBSCRIBE_REQUEST with Double]
  
  /* 501 */ @js.native
  object CLIENT_EVENTS_SUBSCRIBE_RESPONSE extends TopLevel[CLIENT_EVENTS_SUBSCRIBE_RESPONSE with Double]
  
  /* 502 */ @js.native
  object CLIENT_EVENTS_UNSUBSCRIBE_REQUEST extends TopLevel[CLIENT_EVENTS_UNSUBSCRIBE_REQUEST with Double]
  
  /* 503 */ @js.native
  object CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE extends TopLevel[CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE with Double]
  
  /* 125 */ @js.native
  object CLIENT_PEERS_GET_REQUEST extends TopLevel[CLIENT_PEERS_GET_REQUEST with Double]
  
  /* 126 */ @js.native
  object CLIENT_PEERS_GET_RESPONSE extends TopLevel[CLIENT_PEERS_GET_RESPONSE with Double]
  
  /* 122 */ @js.native
  object CLIENT_RECEIPT_GET_REQUEST extends TopLevel[CLIENT_RECEIPT_GET_REQUEST with Double]
  
  /* 123 */ @js.native
  object CLIENT_RECEIPT_GET_RESPONSE extends TopLevel[CLIENT_RECEIPT_GET_RESPONSE with Double]
  
  /* 114 */ @js.native
  object CLIENT_STATE_CURRENT_REQUEST extends TopLevel[CLIENT_STATE_CURRENT_REQUEST with Double]
  
  /* 115 */ @js.native
  object CLIENT_STATE_CURRENT_RESPONSE extends TopLevel[CLIENT_STATE_CURRENT_RESPONSE with Double]
  
  /* 118 */ @js.native
  object CLIENT_STATE_GET_REQUEST extends TopLevel[CLIENT_STATE_GET_REQUEST with Double]
  
  /* 119 */ @js.native
  object CLIENT_STATE_GET_RESPONSE extends TopLevel[CLIENT_STATE_GET_RESPONSE with Double]
  
  /* 116 */ @js.native
  object CLIENT_STATE_LIST_REQUEST extends TopLevel[CLIENT_STATE_LIST_REQUEST with Double]
  
  /* 117 */ @js.native
  object CLIENT_STATE_LIST_RESPONSE extends TopLevel[CLIENT_STATE_LIST_RESPONSE with Double]
  
  /* 129 */ @js.native
  object CLIENT_STATUS_GET_REQUEST extends TopLevel[CLIENT_STATUS_GET_REQUEST with Double]
  
  /* 130 */ @js.native
  object CLIENT_STATUS_GET_RESPONSE extends TopLevel[CLIENT_STATUS_GET_RESPONSE with Double]
  
  /* 112 */ @js.native
  object CLIENT_TRANSACTION_GET_REQUEST extends TopLevel[CLIENT_TRANSACTION_GET_REQUEST with Double]
  
  /* 113 */ @js.native
  object CLIENT_TRANSACTION_GET_RESPONSE extends TopLevel[CLIENT_TRANSACTION_GET_RESPONSE with Double]
  
  /* 110 */ @js.native
  object CLIENT_TRANSACTION_LIST_REQUEST extends TopLevel[CLIENT_TRANSACTION_LIST_REQUEST with Double]
  
  /* 111 */ @js.native
  object CLIENT_TRANSACTION_LIST_RESPONSE extends TopLevel[CLIENT_TRANSACTION_LIST_RESPONSE with Double]
  
  /* 824 */ @js.native
  object CONSENSUS_BLOCKS_GET_REQUEST extends TopLevel[CONSENSUS_BLOCKS_GET_REQUEST with Double]
  
  /* 825 */ @js.native
  object CONSENSUS_BLOCKS_GET_RESPONSE extends TopLevel[CONSENSUS_BLOCKS_GET_RESPONSE with Double]
  
  /* 804 */ @js.native
  object CONSENSUS_BROADCAST_REQUEST extends TopLevel[CONSENSUS_BROADCAST_REQUEST with Double]
  
  /* 805 */ @js.native
  object CONSENSUS_BROADCAST_RESPONSE extends TopLevel[CONSENSUS_BROADCAST_RESPONSE with Double]
  
  /* 810 */ @js.native
  object CONSENSUS_CANCEL_BLOCK_REQUEST extends TopLevel[CONSENSUS_CANCEL_BLOCK_REQUEST with Double]
  
  /* 811 */ @js.native
  object CONSENSUS_CANCEL_BLOCK_RESPONSE extends TopLevel[CONSENSUS_CANCEL_BLOCK_RESPONSE with Double]
  
  /* 826 */ @js.native
  object CONSENSUS_CHAIN_HEAD_GET_REQUEST extends TopLevel[CONSENSUS_CHAIN_HEAD_GET_REQUEST with Double]
  
  /* 827 */ @js.native
  object CONSENSUS_CHAIN_HEAD_GET_RESPONSE extends TopLevel[CONSENSUS_CHAIN_HEAD_GET_RESPONSE with Double]
  
  /* 812 */ @js.native
  object CONSENSUS_CHECK_BLOCKS_REQUEST extends TopLevel[CONSENSUS_CHECK_BLOCKS_REQUEST with Double]
  
  /* 813 */ @js.native
  object CONSENSUS_CHECK_BLOCKS_RESPONSE extends TopLevel[CONSENSUS_CHECK_BLOCKS_RESPONSE with Double]
  
  /* 814 */ @js.native
  object CONSENSUS_COMMIT_BLOCK_REQUEST extends TopLevel[CONSENSUS_COMMIT_BLOCK_REQUEST with Double]
  
  /* 815 */ @js.native
  object CONSENSUS_COMMIT_BLOCK_RESPONSE extends TopLevel[CONSENSUS_COMMIT_BLOCK_RESPONSE with Double]
  
  /* 818 */ @js.native
  object CONSENSUS_FAIL_BLOCK_REQUEST extends TopLevel[CONSENSUS_FAIL_BLOCK_REQUEST with Double]
  
  /* 819 */ @js.native
  object CONSENSUS_FAIL_BLOCK_RESPONSE extends TopLevel[CONSENSUS_FAIL_BLOCK_RESPONSE with Double]
  
  /* 808 */ @js.native
  object CONSENSUS_FINALIZE_BLOCK_REQUEST extends TopLevel[CONSENSUS_FINALIZE_BLOCK_REQUEST with Double]
  
  /* 809 */ @js.native
  object CONSENSUS_FINALIZE_BLOCK_RESPONSE extends TopLevel[CONSENSUS_FINALIZE_BLOCK_RESPONSE with Double]
  
  /* 816 */ @js.native
  object CONSENSUS_IGNORE_BLOCK_REQUEST extends TopLevel[CONSENSUS_IGNORE_BLOCK_REQUEST with Double]
  
  /* 817 */ @js.native
  object CONSENSUS_IGNORE_BLOCK_RESPONSE extends TopLevel[CONSENSUS_IGNORE_BLOCK_RESPONSE with Double]
  
  /* 806 */ @js.native
  object CONSENSUS_INITIALIZE_BLOCK_REQUEST extends TopLevel[CONSENSUS_INITIALIZE_BLOCK_REQUEST with Double]
  
  /* 807 */ @js.native
  object CONSENSUS_INITIALIZE_BLOCK_RESPONSE extends TopLevel[CONSENSUS_INITIALIZE_BLOCK_RESPONSE with Double]
  
  /* 999 */ @js.native
  object CONSENSUS_NOTIFY_ACK extends TopLevel[CONSENSUS_NOTIFY_ACK with Double]
  
  /* 906 */ @js.native
  object CONSENSUS_NOTIFY_BLOCK_COMMIT extends TopLevel[CONSENSUS_NOTIFY_BLOCK_COMMIT with Double]
  
  /* 905 */ @js.native
  object CONSENSUS_NOTIFY_BLOCK_INVALID extends TopLevel[CONSENSUS_NOTIFY_BLOCK_INVALID with Double]
  
  /* 903 */ @js.native
  object CONSENSUS_NOTIFY_BLOCK_NEW extends TopLevel[CONSENSUS_NOTIFY_BLOCK_NEW with Double]
  
  /* 904 */ @js.native
  object CONSENSUS_NOTIFY_BLOCK_VALID extends TopLevel[CONSENSUS_NOTIFY_BLOCK_VALID with Double]
  
  /* 900 */ @js.native
  object CONSENSUS_NOTIFY_PEER_CONNECTED extends TopLevel[CONSENSUS_NOTIFY_PEER_CONNECTED with Double]
  
  /* 901 */ @js.native
  object CONSENSUS_NOTIFY_PEER_DISCONNECTED extends TopLevel[CONSENSUS_NOTIFY_PEER_DISCONNECTED with Double]
  
  /* 902 */ @js.native
  object CONSENSUS_NOTIFY_PEER_MESSAGE extends TopLevel[CONSENSUS_NOTIFY_PEER_MESSAGE with Double]
  
  /* 800 */ @js.native
  object CONSENSUS_REGISTER_REQUEST extends TopLevel[CONSENSUS_REGISTER_REQUEST with Double]
  
  /* 801 */ @js.native
  object CONSENSUS_REGISTER_RESPONSE extends TopLevel[CONSENSUS_REGISTER_RESPONSE with Double]
  
  /* 802 */ @js.native
  object CONSENSUS_SEND_TO_REQUEST extends TopLevel[CONSENSUS_SEND_TO_REQUEST with Double]
  
  /* 803 */ @js.native
  object CONSENSUS_SEND_TO_RESPONSE extends TopLevel[CONSENSUS_SEND_TO_RESPONSE with Double]
  
  /* 820 */ @js.native
  object CONSENSUS_SETTINGS_GET_REQUEST extends TopLevel[CONSENSUS_SETTINGS_GET_REQUEST with Double]
  
  /* 821 */ @js.native
  object CONSENSUS_SETTINGS_GET_RESPONSE extends TopLevel[CONSENSUS_SETTINGS_GET_RESPONSE with Double]
  
  /* 822 */ @js.native
  object CONSENSUS_STATE_GET_REQUEST extends TopLevel[CONSENSUS_STATE_GET_REQUEST with Double]
  
  /* 823 */ @js.native
  object CONSENSUS_STATE_GET_RESPONSE extends TopLevel[CONSENSUS_STATE_GET_RESPONSE with Double]
  
  /* 828 */ @js.native
  object CONSENSUS_SUMMARIZE_BLOCK_REQUEST extends TopLevel[CONSENSUS_SUMMARIZE_BLOCK_REQUEST with Double]
  
  /* 829 */ @js.native
  object CONSENSUS_SUMMARIZE_BLOCK_RESPONSE extends TopLevel[CONSENSUS_SUMMARIZE_BLOCK_RESPONSE with Double]
  
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 207 */ @js.native
  object GOSSIP_BATCH_BY_BATCH_ID_REQUEST extends TopLevel[GOSSIP_BATCH_BY_BATCH_ID_REQUEST with Double]
  
  /* 208 */ @js.native
  object GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST extends TopLevel[GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST with Double]
  
  /* 209 */ @js.native
  object GOSSIP_BATCH_RESPONSE extends TopLevel[GOSSIP_BATCH_RESPONSE with Double]
  
  /* 205 */ @js.native
  object GOSSIP_BLOCK_REQUEST extends TopLevel[GOSSIP_BLOCK_REQUEST with Double]
  
  /* 206 */ @js.native
  object GOSSIP_BLOCK_RESPONSE extends TopLevel[GOSSIP_BLOCK_RESPONSE with Double]
  
  /* 212 */ @js.native
  object GOSSIP_CONSENSUS_MESSAGE extends TopLevel[GOSSIP_CONSENSUS_MESSAGE with Double]
  
  /* 210 */ @js.native
  object GOSSIP_GET_PEERS_REQUEST extends TopLevel[GOSSIP_GET_PEERS_REQUEST with Double]
  
  /* 211 */ @js.native
  object GOSSIP_GET_PEERS_RESPONSE extends TopLevel[GOSSIP_GET_PEERS_RESPONSE with Double]
  
  /* 200 */ @js.native
  object GOSSIP_MESSAGE extends TopLevel[GOSSIP_MESSAGE with Double]
  
  /* 201 */ @js.native
  object GOSSIP_REGISTER extends TopLevel[GOSSIP_REGISTER with Double]
  
  /* 202 */ @js.native
  object GOSSIP_UNREGISTER extends TopLevel[GOSSIP_UNREGISTER with Double]
  
  /* 300 */ @js.native
  object NETWORK_ACK extends TopLevel[NETWORK_ACK with Double]
  
  /* 301 */ @js.native
  object NETWORK_CONNECT extends TopLevel[NETWORK_CONNECT with Double]
  
  /* 302 */ @js.native
  object NETWORK_DISCONNECT extends TopLevel[NETWORK_DISCONNECT with Double]
  
  /* 700 */ @js.native
  object PING_REQUEST extends TopLevel[PING_REQUEST with Double]
  
  /* 701 */ @js.native
  object PING_RESPONSE extends TopLevel[PING_RESPONSE with Double]
  
  /* 15 */ @js.native
  object TP_EVENT_ADD_REQUEST extends TopLevel[TP_EVENT_ADD_REQUEST with Double]
  
  /* 16 */ @js.native
  object TP_EVENT_ADD_RESPONSE extends TopLevel[TP_EVENT_ADD_RESPONSE with Double]
  
  /* 5 */ @js.native
  object TP_PROCESS_REQUEST extends TopLevel[TP_PROCESS_REQUEST with Double]
  
  /* 6 */ @js.native
  object TP_PROCESS_RESPONSE extends TopLevel[TP_PROCESS_RESPONSE with Double]
  
  /* 13 */ @js.native
  object TP_RECEIPT_ADD_DATA_REQUEST extends TopLevel[TP_RECEIPT_ADD_DATA_REQUEST with Double]
  
  /* 14 */ @js.native
  object TP_RECEIPT_ADD_DATA_RESPONSE extends TopLevel[TP_RECEIPT_ADD_DATA_RESPONSE with Double]
  
  /* 1 */ @js.native
  object TP_REGISTER_REQUEST extends TopLevel[TP_REGISTER_REQUEST with Double]
  
  /* 2 */ @js.native
  object TP_REGISTER_RESPONSE extends TopLevel[TP_REGISTER_RESPONSE with Double]
  
  /* 11 */ @js.native
  object TP_STATE_DELETE_REQUEST extends TopLevel[TP_STATE_DELETE_REQUEST with Double]
  
  /* 12 */ @js.native
  object TP_STATE_DELETE_RESPONSE extends TopLevel[TP_STATE_DELETE_RESPONSE with Double]
  
  /* 7 */ @js.native
  object TP_STATE_GET_REQUEST extends TopLevel[TP_STATE_GET_REQUEST with Double]
  
  /* 8 */ @js.native
  object TP_STATE_GET_RESPONSE extends TopLevel[TP_STATE_GET_RESPONSE with Double]
  
  /* 9 */ @js.native
  object TP_STATE_SET_REQUEST extends TopLevel[TP_STATE_SET_REQUEST with Double]
  
  /* 10 */ @js.native
  object TP_STATE_SET_RESPONSE extends TopLevel[TP_STATE_SET_RESPONSE with Double]
  
  /* 3 */ @js.native
  object TP_UNREGISTER_REQUEST extends TopLevel[TP_UNREGISTER_REQUEST with Double]
  
  /* 4 */ @js.native
  object TP_UNREGISTER_RESPONSE extends TopLevel[TP_UNREGISTER_RESPONSE with Double]
  
}

