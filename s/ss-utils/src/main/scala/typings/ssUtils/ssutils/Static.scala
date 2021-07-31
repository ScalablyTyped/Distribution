package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends StObject {
  
  def clearAdjacentError(): Unit = js.native
  
  def combinePaths(paths: String*): String = js.native
  
  def createPath(route: String, args: js.Any): String = js.native
  
  def createUrl(route: String, args: js.Any): String = js.native
  
  def dfmt(d: Date): String = js.native
  
  def dfmthm(d: Date): String = js.native
  
  def disposeServerEvents(): Unit = js.native
  def disposeServerEvents(cb: js.Function): Unit = js.native
  
  var eventChannels: js.Array[String] = js.native
  
  var eventReceivers: js.Any = js.native
  
  var eventSourceUrl: String = js.native
  
  def getSelection(): String = js.native
  
  var handlers: StringDictionary[js.Function] = js.native
  
  def humanize(s: String): String = js.native
  
  var listenOn: String = js.native
  
  def normalize(dto: js.Any): js.Any = js.native
  def normalize(dto: js.Any, deep: Boolean): js.Any = js.native
  
  def normalizeKey(key: String): String = js.native
  
  var onSubmitDisable: String = js.native
  
  def parseResponseStatus(json: String): js.Any = js.native
  def parseResponseStatus(json: String, defaultMsg: String): js.Any = js.native
  
  def postJSON(url: String, data: String): js.Any = js.native
  def postJSON(url: String, data: String, success: js.Function): js.Any = js.native
  def postJSON(url: String, data: String, success: js.Function, error: js.Function): js.Any = js.native
  def postJSON(url: String, data: String, success: Unit, error: js.Function): js.Any = js.native
  def postJSON(url: String, data: js.Object): js.Any = js.native
  def postJSON(url: String, data: js.Object, success: js.Function): js.Any = js.native
  def postJSON(url: String, data: js.Object, success: js.Function, error: js.Function): js.Any = js.native
  def postJSON(url: String, data: js.Object, success: Unit, error: js.Function): js.Any = js.native
  
  def queryString(url: String): StringDictionary[String] = js.native
  
  def reconnectServerEvents(opt: ReconnectServerEventsOptions): js.Any = js.native
  
  def splitOnFirst(s: String, delimiter: String): js.Array[String] = js.native
  
  def splitOnLast(s: String, delimiter: String): js.Array[String] = js.native
  
  def subscribeToChannels(channels: js.Array[String]): js.Any = js.native
  def subscribeToChannels(channels: js.Array[String], cb: js.Function1[/* user */ SSEUpdate, Unit]): js.Any = js.native
  def subscribeToChannels(channels: js.Array[String], cb: js.Function1[/* user */ SSEUpdate, Unit], cbError: js.Function): js.Any = js.native
  def subscribeToChannels(channels: js.Array[String], cb: Unit, cbError: js.Function): js.Any = js.native
  
  def tfmt12(d: Date): String = js.native
  
  def todate(s: String): Date = js.native
  
  def todfmt(s: String): String = js.native
  
  def unsubscribeFromChannels(channels: js.Array[String]): js.Any = js.native
  def unsubscribeFromChannels(channels: js.Array[String], cb: js.Function1[/* user */ SSEUpdate, Unit]): js.Any = js.native
  def unsubscribeFromChannels(channels: js.Array[String], cb: js.Function1[/* user */ SSEUpdate, Unit], cbError: js.Function): js.Any = js.native
  def unsubscribeFromChannels(channels: js.Array[String], cb: Unit, cbError: js.Function): js.Any = js.native
  
  def updateChannels(channels: js.Array[String]): Unit = js.native
  
  def updateSubscriber(data: UpdateSubscriberOptions): js.Any = js.native
  def updateSubscriber(data: UpdateSubscriberOptions, cb: js.Function1[/* user */ SSEUpdate, Unit]): js.Any = js.native
  def updateSubscriber(data: UpdateSubscriberOptions, cb: js.Function1[/* user */ SSEUpdate, Unit], cbError: js.Function): js.Any = js.native
  def updateSubscriber(data: UpdateSubscriberOptions, cb: Unit, cbError: js.Function): js.Any = js.native
  
  var updateSubscriberUrl: String = js.native
  
  var validation: Validation = js.native
}
