package typings.pubnub.mod

import typings.pubnub.anon.DataMessageAction
import typings.pubnub.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pubnub extends js.Object {
  var channelGroups: ChannelGroups = js.native
  var push: Push = js.native
  def addListener(params: ListenerParameters): Unit = js.native
  def addMembers(params: MembersInputParameters): js.Promise[GetMembersResponse] = js.native
  def addMembers(
    params: MembersInputParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetMembersResponse, Unit]
  ): Unit = js.native
  def addMessageAction(params: AddMessageActionParameters): js.Promise[DataMessageAction] = js.native
  def addMessageAction(
    params: AddMessageActionParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ DataMessageAction, Unit]
  ): Unit = js.native
  def createSpace(params: SpaceInputParameters): js.Promise[GetSpaceResponse] = js.native
  def createSpace(
    params: SpaceInputParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetSpaceResponse, Unit]
  ): Unit = js.native
  def createUser(params: UserInputParameters): js.Promise[GetUserResponse] = js.native
  def createUser(
    params: UserInputParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetUserResponse, Unit]
  ): Unit = js.native
  def decrypt(data: String): js.Any = js.native
  def decrypt(data: String, customCipherKey: String): js.Any = js.native
  def decrypt(data: String, customCipherKey: String, options: CryptoParameters): js.Any = js.native
  def decrypt(data: js.Object): js.Any = js.native
  def decrypt(data: js.Object, customCipherKey: String): js.Any = js.native
  def decrypt(data: js.Object, customCipherKey: String, options: CryptoParameters): js.Any = js.native
  def deleteMessages(params: DeleteMessagesParameters): js.Promise[Unit] = js.native
  def deleteMessages(params: DeleteMessagesParameters, callback: js.Function1[/* status */ PubnubStatus, Unit]): Unit = js.native
  def deleteSpace(spaceId: String): js.Promise[DeleteSpaceResponse] = js.native
  def deleteSpace(
    spaceId: String,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ DeleteSpaceResponse, Unit]
  ): Unit = js.native
  def deleteUser(userId: String): js.Promise[DeleteUserResponse] = js.native
  def deleteUser(
    userId: String,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ DeleteUserResponse, Unit]
  ): Unit = js.native
  def encrypt(data: String): String = js.native
  def encrypt(data: String, customCipherKey: String): String = js.native
  def encrypt(data: String, customCipherKey: String, options: CryptoParameters): String = js.native
  def fetchMessages(params: FetchMessagesParameters): js.Promise[FetchMessagesResponse] = js.native
  def fetchMessages(
    params: FetchMessagesParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ FetchMessagesResponse, Unit]
  ): Unit = js.native
  def fire(params: FireParameters): js.Promise[PublishResponse] = js.native
  def fire(
    params: FireParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ PublishResponse, Unit]
  ): Unit = js.native
  def getFilterExpression(): String = js.native
  def getMembers(params: GetMembersParameters): js.Promise[GetMembersResponse] = js.native
  def getMembers(
    params: GetMembersParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetMembersResponse, Unit]
  ): Unit = js.native
  def getMemberships(params: GetMembershipsParameters): js.Promise[GetMembershipsResponse] = js.native
  def getMemberships(
    params: GetMembershipsParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetMembershipsResponse, Unit]
  ): Unit = js.native
  def getMessageActions(params: GetMessageActionsParameters): js.Promise[GetMessageActionsResponse] = js.native
  def getMessageActions(
    params: GetMessageActionsParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetMessageActionsResponse, Unit]
  ): Unit = js.native
  def getSpace(params: GetSpaceParameters): js.Promise[GetSpaceResponse] = js.native
  def getSpace(
    params: GetSpaceParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetSpaceResponse, Unit]
  ): Unit = js.native
  def getSpaces(params: GetObjectsParameters): js.Promise[GetSpacesResponse] = js.native
  def getSpaces(
    params: GetObjectsParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetSpacesResponse, Unit]
  ): Unit = js.native
  def getState(params: GetStateParameters): js.Promise[GetStateResponse] = js.native
  def getState(
    params: GetStateParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* state */ GetStateResponse, Unit]
  ): Unit = js.native
  def getUUID(): String = js.native
  def getUser(params: GetUserParameters): js.Promise[GetUserResponse] = js.native
  def getUser(
    params: GetUserParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetUserResponse, Unit]
  ): Unit = js.native
  def getUsers(params: GetObjectsParameters): js.Promise[GetUsersResponse] = js.native
  def getUsers(
    params: GetObjectsParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetUsersResponse, Unit]
  ): Unit = js.native
  def grant(params: GrantParameters): js.Promise[js.Object] = js.native
  def grant(
    params: GrantParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ js.Object, Unit]
  ): Unit = js.native
  def hereNow(params: HereNowParameters): js.Promise[HereNowResponse] = js.native
  def hereNow(
    params: HereNowParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ HereNowResponse, Unit]
  ): Unit = js.native
  def history(params: HistoryParameters): js.Promise[HistoryResponse] = js.native
  def history(
    params: HistoryParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ HistoryResponse, Unit]
  ): Unit = js.native
  def joinSpaces(params: MembershipsInputParameters): js.Promise[GetMembershipsResponse] = js.native
  def joinSpaces(
    params: MembershipsInputParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetMembershipsResponse, Unit]
  ): Unit = js.native
  def leaveSpaces(params: LeaveSpacesParameters): js.Promise[GetMembershipsResponse] = js.native
  def leaveSpaces(
    params: LeaveSpacesParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetMembershipsResponse, Unit]
  ): Unit = js.native
  def messageCounts(params: MessageCountsParameters): js.Promise[MessageCountsResponse] = js.native
  def messageCounts(
    params: MessageCountsParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ MessageCountsResponse, Unit]
  ): Unit = js.native
  def publish(params: PublishParameters): js.Promise[PublishResponse] = js.native
  def publish(
    params: PublishParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ PublishResponse, Unit]
  ): Unit = js.native
  def reconnect(): Unit = js.native
  def removeListener(params: ListenerParameters): Unit = js.native
  def removeMembers(params: RemoveMembersParameters): js.Promise[GetMembersResponse] = js.native
  def removeMembers(
    params: RemoveMembersParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetMembersResponse, Unit]
  ): Unit = js.native
  def removeMessageAction(params: RemoveMessageActionParameters): js.Promise[`0`] = js.native
  def removeMessageAction(
    params: RemoveMessageActionParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ `0`, Unit]
  ): Unit = js.native
  def setAuthKey(authKey: String): Unit = js.native
  def setFilterExpression(filterExpression: String): Unit = js.native
  def setState(params: SetStateParameters): js.Promise[SetStateResponse] = js.native
  def setState(
    params: SetStateParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* state */ SetStateResponse, Unit]
  ): Unit = js.native
  def setUUID(uuid: String): Unit = js.native
  def signal(params: SignalParameters): js.Promise[SignalResponse] = js.native
  def signal(
    params: SignalParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ SignalResponse, Unit]
  ): Unit = js.native
  def stop(): Unit = js.native
  def subscribe(params: SubscribeParameters): Unit = js.native
  def time(): js.Promise[FetchTimeResponse] = js.native
  def time(callback: js.Function2[/* status */ PubnubStatus, /* response */ FetchTimeResponse, Unit]): Unit = js.native
  def unsubscribe(params: UnsubscribeParameters): Unit = js.native
  def unsubscribeAll(): Unit = js.native
  def updateMembers(params: MembersInputParameters): js.Promise[GetMembersResponse] = js.native
  def updateMembers(
    params: MembersInputParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetMembersResponse, Unit]
  ): Unit = js.native
  def updateMemberships(params: MembershipsInputParameters): js.Promise[GetMembershipsResponse] = js.native
  def updateMemberships(
    params: MembershipsInputParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetMembershipsResponse, Unit]
  ): Unit = js.native
  def updateSpace(params: SpaceInputParameters): js.Promise[GetSpaceResponse] = js.native
  def updateSpace(
    params: SpaceInputParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetSpaceResponse, Unit]
  ): Unit = js.native
  def updateUser(params: UserInputParameters): js.Promise[GetUserResponse] = js.native
  def updateUser(
    params: UserInputParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ GetUserResponse, Unit]
  ): Unit = js.native
  def whereNow(params: WhereNowParameters): js.Promise[WhereNowResponse] = js.native
  def whereNow(
    params: WhereNowParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ WhereNowResponse, Unit]
  ): Unit = js.native
}

