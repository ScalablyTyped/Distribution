package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pubnub extends js.Object {
  def addListener(params: ListenerParameters): Unit = js.native
  def decrypt(data: String): js.Any = js.native
  def decrypt(data: String, customCipherKey: String): js.Any = js.native
  def decrypt(data: String, customCipherKey: String, options: CryptoParameters): js.Any = js.native
  def decrypt(data: js.Object): js.Any = js.native
  def decrypt(data: js.Object, customCipherKey: String): js.Any = js.native
  def decrypt(data: js.Object, customCipherKey: String, options: CryptoParameters): js.Any = js.native
  def encrypt(data: String): js.Any = js.native
  def encrypt(data: String, customCipherKey: String): js.Any = js.native
  def encrypt(data: String, customCipherKey: String, options: CryptoParameters): js.Any = js.native
  def fire(params: FireParameters): js.Promise[PublishResponse] = js.native
  def fire(
    params: FireParameters,
    callback: js.Function2[/* status */ PublishStatus, /* response */ PublishResponse, Unit]
  ): Unit = js.native
  def getFilterExpression(): String = js.native
  def getState(params: GetStateParameters): js.Promise[GetStateResponse] = js.native
  def getState(
    params: GetStateParameters,
    callback: js.Function2[/* status */ GetStateStatus, /* state */ GetStateResponse, Unit]
  ): Unit = js.native
  def getUUID(): String = js.native
  def grant(params: GrantParameters): js.Promise[js.Object] = js.native
  def grant(
    params: GrantParameters,
    callback: js.Function2[/* status */ GrantStatus, /* response */ js.Object, Unit]
  ): Unit = js.native
  def hereNow(params: HereNowParameters): js.Promise[HereNowResponse] = js.native
  def hereNow(
    params: HereNowParameters,
    callback: js.Function2[/* status */ HereNowStatus, /* response */ HereNowResponse, Unit]
  ): Unit = js.native
  def history(
    params: HistoryParameters,
    callback: js.Function2[/* status */ HistoryStatus, /* response */ HistoryResponse, Unit]
  ): Unit = js.native
  def publish(params: PublishParameters): js.Promise[PublishResponse] = js.native
  def publish(
    params: PublishParameters,
    callback: js.Function2[/* status */ PublishStatus, /* response */ PublishResponse, Unit]
  ): Unit = js.native
  def removeListener(params: ListenerParameters): Unit = js.native
  def setAuthKey(authKey: String): Unit = js.native
  def setFilterExpression(filterExpression: String): Unit = js.native
  def setState(params: SetStateParameters): js.Promise[SetStateResponse] = js.native
  def setState(
    params: SetStateParameters,
    callback: js.Function2[/* status */ SetStateStatus, /* state */ SetStateResponse, Unit]
  ): Unit = js.native
  def setUUID(uuid: String): Unit = js.native
  def stop(): Unit = js.native
  def subscribe(params: SubscribeParameters): Unit = js.native
  def unsubscribe(params: UnsubscribeParameters): Unit = js.native
  def unsubscribeAll(): Unit = js.native
  def whereNow(params: WhereNowParameters): js.Promise[WhereNowResponse] = js.native
  def whereNow(
    params: WhereNowParameters,
    callback: js.Function2[/* status */ WhereNowStatus, /* response */ WhereNowResponse, Unit]
  ): Unit = js.native
}

