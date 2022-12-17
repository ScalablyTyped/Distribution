package typings.pubnub.mod

import typings.pubnub.anon.DataMessageAction
import typings.pubnub.anon.GetAllChannelMetadata
import typings.pubnub.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pubnub extends StObject {
  
  def addListener(params: ListenerParameters): Unit = js.native
  
  def addMessageAction(params: AddMessageActionParameters): js.Promise[DataMessageAction] = js.native
  // message actions
  def addMessageAction(params: AddMessageActionParameters, callback: Callback[DataMessageAction]): Unit = js.native
  
  var channelGroups: ChannelGroups = js.native
  
  def decrypt(data: String): Any = js.native
  def decrypt(data: String, customCipherKey: String): Any = js.native
  def decrypt(data: String, customCipherKey: String, options: CryptoParameters): Any = js.native
  def decrypt(data: String, customCipherKey: Unit, options: CryptoParameters): Any = js.native
  def decrypt(data: js.Object): Any = js.native
  def decrypt(data: js.Object, customCipherKey: String): Any = js.native
  def decrypt(data: js.Object, customCipherKey: String, options: CryptoParameters): Any = js.native
  def decrypt(data: js.Object, customCipherKey: Unit, options: CryptoParameters): Any = js.native
  
  def deleteFile(params: FileInputParameters): js.Promise[DeleteFileResponse] = js.native
  def deleteFile(params: FileInputParameters, callback: StatusCallback): Unit = js.native
  
  def deleteMessages(params: DeleteMessagesParameters): js.Promise[Unit] = js.native
  def deleteMessages(params: DeleteMessagesParameters, callback: StatusCallback): Unit = js.native
  
  def downloadFile(params: DownloadFileParameters): js.Promise[Any] = js.native
  def downloadFile(params: DownloadFileParameters, callback: Callback[Any]): Unit = js.native
  
  // utilities
  def encrypt(data: String): String = js.native
  def encrypt(data: String, customCipherKey: String): String = js.native
  def encrypt(data: String, customCipherKey: String, options: CryptoParameters): String = js.native
  def encrypt(data: String, customCipherKey: Unit, options: CryptoParameters): String = js.native
  
  def fetchMessages(params: FetchMessagesParameters): js.Promise[FetchMessagesResponse] = js.native
  def fetchMessages(params: FetchMessagesParameters, callback: Callback[FetchMessagesResponse]): Unit = js.native
  
  def fire(params: FireParameters): js.Promise[PublishResponse] = js.native
  def fire(params: FireParameters, callback: Callback[PublishResponse]): Unit = js.native
  
  def getFileUrl(params: FileInputParameters): String = js.native
  
  def getFilterExpression(): String = js.native
  
  def getMessageActions(params: GetMessageActionsParameters): js.Promise[GetMessageActionsResponse] = js.native
  def getMessageActions(params: GetMessageActionsParameters, callback: Callback[GetMessageActionsResponse]): Unit = js.native
  
  def getState(params: GetStateParameters): js.Promise[GetStateResponse] = js.native
  def getState(params: GetStateParameters, callback: Callback[GetStateResponse]): Unit = js.native
  
  def getSubscribedChannelGroups(): js.Array[String] = js.native
  
  def getSubscribedChannels(): js.Array[String] = js.native
  
  def getUUID(): String = js.native
  
  def grant(params: GrantParameters): js.Promise[Unit] = js.native
  // access manager
  def grant(params: GrantParameters, callback: StatusCallback): Unit = js.native
  
  def grantToken(params: GrantTokenParameters): js.Promise[String] = js.native
  def grantToken(params: GrantTokenParameters, callback: Callback[String]): Unit = js.native
  
  def hereNow(params: HereNowParameters): js.Promise[HereNowResponse] = js.native
  // presence
  def hereNow(params: HereNowParameters, callback: Callback[HereNowResponse]): Unit = js.native
  
  def history(params: HistoryParameters): js.Promise[HistoryResponse] = js.native
  // history
  def history(params: HistoryParameters, callback: Callback[HistoryResponse]): Unit = js.native
  
  def listFiles(params: ListFilesParameters): js.Promise[ListFilesResponse] = js.native
  // files
  def listFiles(params: ListFilesParameters, callback: Callback[ListFilesResponse]): Unit = js.native
  
  def messageCounts(params: MessageCountsParameters): js.Promise[MessageCountsResponse] = js.native
  def messageCounts(params: MessageCountsParameters, callback: Callback[MessageCountsResponse]): Unit = js.native
  
  // objects v2
  var objects: GetAllChannelMetadata = js.native
  
  def parseToken(params: String): ParsedGrantToken = js.native
  
  def publish(params: PublishParameters): js.Promise[PublishResponse] = js.native
  // publish
  def publish(params: PublishParameters, callback: Callback[PublishResponse]): Unit = js.native
  
  def publishFile(params: PublishFileParameters): js.Promise[PublishFileResponse] = js.native
  def publishFile(params: PublishFileParameters, callback: Callback[PublishFileResponse]): Unit = js.native
  
  var push: Push = js.native
  
  def reconnect(): Unit = js.native
  
  def removeListener(params: ListenerParameters): Unit = js.native
  
  def removeMessageAction(params: RemoveMessageActionParameters): js.Promise[`0`] = js.native
  def removeMessageAction(params: RemoveMessageActionParameters, callback: Callback[`0`]): Unit = js.native
  
  def revokeToken(params: String): js.Promise[RevokeTokenResponse] = js.native
  def revokeToken(params: String, callback: Callback[RevokeTokenResponse]): Unit = js.native
  
  def sendFile(params: SendFileParameters): js.Promise[SendFileResponse] = js.native
  def sendFile(params: SendFileParameters, callback: Callback[SendFileResponse]): Unit = js.native
  
  def setAuthKey(authKey: String): Unit = js.native
  
  def setFilterExpression(filterExpression: String): Unit = js.native
  
  def setState(params: SetStateParameters): js.Promise[SetStateResponse] = js.native
  def setState(params: SetStateParameters, callback: Callback[SetStateResponse]): Unit = js.native
  
  def setToken(params: String): Unit = js.native
  
  def setUUID(uuid: String): Unit = js.native
  
  def signal(params: SignalParameters): js.Promise[SignalResponse] = js.native
  def signal(params: SignalParameters, callback: Callback[SignalResponse]): Unit = js.native
  
  def stop(): Unit = js.native
  
  // subscriptions
  def subscribe(params: SubscribeParameters): Unit = js.native
  
  def time(): js.Promise[FetchTimeResponse] = js.native
  def time(callback: Callback[FetchTimeResponse]): Unit = js.native
  
  def unsubscribe(params: UnsubscribeParameters): Unit = js.native
  
  def unsubscribeAll(): Unit = js.native
  
  def whereNow(params: WhereNowParameters): js.Promise[WhereNowResponse] = js.native
  def whereNow(params: WhereNowParameters, callback: Callback[WhereNowResponse]): Unit = js.native
}
