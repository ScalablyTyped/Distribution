package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var eventChannels: js.Array[java.lang.String] = js.native
  var eventReceivers: js.Any = js.native
  var eventSourceUrl: java.lang.String = js.native
  var handlers: ScalablyTyped.runtime.StringDictionary[js.Function] = js.native
  var listenOn: java.lang.String = js.native
  var onSubmitDisable: java.lang.String = js.native
  var updateSubscriberUrl: java.lang.String = js.native
  var validation: Validation = js.native
  def clearAdjacentError(): scala.Unit = js.native
  def combinePaths(paths: java.lang.String*): java.lang.String = js.native
  def createPath(route: java.lang.String, args: js.Any): java.lang.String = js.native
  def createUrl(route: java.lang.String, args: js.Any): java.lang.String = js.native
  def dfmt(d: stdLib.Date): java.lang.String = js.native
  def dfmthm(d: stdLib.Date): java.lang.String = js.native
  def getSelection(): java.lang.String = js.native
  def humanize(s: java.lang.String): java.lang.String = js.native
  def normalize(dto: js.Any): js.Any = js.native
  def normalize(dto: js.Any, deep: scala.Boolean): js.Any = js.native
  def normalizeKey(key: java.lang.String): java.lang.String = js.native
  def parseResponseStatus(json: java.lang.String): js.Any = js.native
  def parseResponseStatus(json: java.lang.String, defaultMsg: java.lang.String): js.Any = js.native
  def postJSON(url: java.lang.String, data: java.lang.String): js.Any = js.native
  def postJSON(url: java.lang.String, data: java.lang.String, success: js.Function): js.Any = js.native
  def postJSON(url: java.lang.String, data: java.lang.String, success: js.Function, error: js.Function): js.Any = js.native
  def postJSON(url: java.lang.String, data: js.Object): js.Any = js.native
  def postJSON(url: java.lang.String, data: js.Object, success: js.Function): js.Any = js.native
  def postJSON(url: java.lang.String, data: js.Object, success: js.Function, error: js.Function): js.Any = js.native
  def queryString(url: java.lang.String): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def reconnectServerEvents(opt: ReconnectServerEventsOptions): js.Any = js.native
  def splitOnFirst(s: java.lang.String, delimiter: java.lang.String): js.Array[java.lang.String] = js.native
  def splitOnLast(s: java.lang.String, delimiter: java.lang.String): js.Array[java.lang.String] = js.native
  def subscribeToChannels(channels: js.Array[java.lang.String]): js.Any = js.native
  def subscribeToChannels(channels: js.Array[java.lang.String], cb: js.Function1[/* user */ SSEUpdate, scala.Unit]): js.Any = js.native
  def subscribeToChannels(
    channels: js.Array[java.lang.String],
    cb: js.Function1[/* user */ SSEUpdate, scala.Unit],
    cbError: js.Function
  ): js.Any = js.native
  def tfmt12(d: stdLib.Date): java.lang.String = js.native
  def todate(s: java.lang.String): stdLib.Date = js.native
  def todfmt(s: java.lang.String): java.lang.String = js.native
  def unsubscribeFromChannels(channels: js.Array[java.lang.String]): js.Any = js.native
  def unsubscribeFromChannels(channels: js.Array[java.lang.String], cb: js.Function1[/* user */ SSEUpdate, scala.Unit]): js.Any = js.native
  def unsubscribeFromChannels(
    channels: js.Array[java.lang.String],
    cb: js.Function1[/* user */ SSEUpdate, scala.Unit],
    cbError: js.Function
  ): js.Any = js.native
  def updateChannels(channels: js.Array[java.lang.String]): scala.Unit = js.native
  def updateSubscriber(data: UpdateSubscriberOptions): js.Any = js.native
  def updateSubscriber(data: UpdateSubscriberOptions, cb: js.Function1[/* user */ SSEUpdate, scala.Unit]): js.Any = js.native
  def updateSubscriber(
    data: UpdateSubscriberOptions,
    cb: js.Function1[/* user */ SSEUpdate, scala.Unit],
    cbError: js.Function
  ): js.Any = js.native
}

