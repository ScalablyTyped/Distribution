package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pubnub extends js.Object {
  def addListener(params: ListenerParameters): scala.Unit = js.native
  def decrypt(data: java.lang.String): js.Any = js.native
  def decrypt(data: java.lang.String, customCipherKey: java.lang.String): js.Any = js.native
  def decrypt(data: java.lang.String, customCipherKey: java.lang.String, options: CryptoParameters): js.Any = js.native
  def decrypt(data: js.Object): js.Any = js.native
  def decrypt(data: js.Object, customCipherKey: java.lang.String): js.Any = js.native
  def decrypt(data: js.Object, customCipherKey: java.lang.String, options: CryptoParameters): js.Any = js.native
  def encrypt(data: java.lang.String): js.Any = js.native
  def encrypt(data: java.lang.String, customCipherKey: java.lang.String): js.Any = js.native
  def encrypt(data: java.lang.String, customCipherKey: java.lang.String, options: CryptoParameters): js.Any = js.native
  def fire(params: FireParameters): js.Promise[PublishResponse] = js.native
  def fire(
    params: FireParameters,
    callback: js.Function2[/* status */ PublishStatus, /* response */ PublishResponse, scala.Unit]
  ): scala.Unit = js.native
  def getFilterExpression(): java.lang.String = js.native
  def getState(params: GetStateParameters): js.Promise[GetStateResponse] = js.native
  def getState(
    params: GetStateParameters,
    callback: js.Function2[/* status */ GetStateStatus, /* state */ GetStateResponse, scala.Unit]
  ): scala.Unit = js.native
  def getUUID(): java.lang.String = js.native
  def grant(params: GrantParameters): js.Promise[js.Object] = js.native
  def grant(
    params: GrantParameters,
    callback: js.Function2[/* status */ GrantStatus, /* response */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def hereNow(params: HereNowParameters): js.Promise[HereNowResponse] = js.native
  def hereNow(
    params: HereNowParameters,
    callback: js.Function2[/* status */ HereNowStatus, /* response */ HereNowResponse, scala.Unit]
  ): scala.Unit = js.native
  def history(
    params: HistoryParameters,
    callback: js.Function2[/* status */ HistoryStatus, /* response */ HistoryResponse, scala.Unit]
  ): scala.Unit = js.native
  def publish(params: PublishParameters): js.Promise[PublishResponse] = js.native
  def publish(
    params: PublishParameters,
    callback: js.Function2[/* status */ PublishStatus, /* response */ PublishResponse, scala.Unit]
  ): scala.Unit = js.native
  def removeListener(params: ListenerParameters): scala.Unit = js.native
  def setAuthKey(authKey: java.lang.String): scala.Unit = js.native
  def setFilterExpression(filterExpression: java.lang.String): scala.Unit = js.native
  def setState(params: SetStateParameters): js.Promise[SetStateResponse] = js.native
  def setState(
    params: SetStateParameters,
    callback: js.Function2[/* status */ SetStateStatus, /* state */ SetStateResponse, scala.Unit]
  ): scala.Unit = js.native
  def setUUID(uuid: java.lang.String): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def subscribe(params: SubscribeParameters): scala.Unit = js.native
  def unsubscribe(params: UnsubscribeParameters): scala.Unit = js.native
  def unsubscribeAll(): scala.Unit = js.native
  def whereNow(params: WhereNowParameters): js.Promise[WhereNowResponse] = js.native
  def whereNow(
    params: WhereNowParameters,
    callback: js.Function2[/* status */ WhereNowStatus, /* response */ WhereNowResponse, scala.Unit]
  ): scala.Unit = js.native
}

