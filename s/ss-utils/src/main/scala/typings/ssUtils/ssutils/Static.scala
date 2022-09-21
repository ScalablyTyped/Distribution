package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends StObject {
  
  def clearAdjacentError(): Unit = js.native
  
  def combinePaths(paths: String*): String = js.native
  
  def createPath(route: String, args: Any): String = js.native
  
  def createUrl(route: String, args: Any): String = js.native
  
  def dfmt(d: js.Date): String = js.native
  
  def dfmthm(d: js.Date): String = js.native
  
  def disposeServerEvents(): Unit = js.native
  def disposeServerEvents(cb: js.Function): Unit = js.native
  
  var eventChannels: js.Array[String] = js.native
  
  var eventReceivers: Any = js.native
  
  var eventSourceUrl: String = js.native
  
  def getSelection(): String = js.native
  
  var handlers: StringDictionary[js.Function] = js.native
  
  def humanize(s: String): String = js.native
  
  var listenOn: String = js.native
  
  def normalize(dto: Any): Any = js.native
  def normalize(dto: Any, deep: Boolean): Any = js.native
  
  def normalizeKey(key: String): String = js.native
  
  var onSubmitDisable: String = js.native
  
  def parseResponseStatus(json: String): Any = js.native
  def parseResponseStatus(json: String, defaultMsg: String): Any = js.native
  
  def postJSON(url: String, data: String): Any = js.native
  def postJSON(url: String, data: String, success: js.Function): Any = js.native
  def postJSON(url: String, data: String, success: js.Function, error: js.Function): Any = js.native
  def postJSON(url: String, data: String, success: Unit, error: js.Function): Any = js.native
  def postJSON(url: String, data: js.Object): Any = js.native
  def postJSON(url: String, data: js.Object, success: js.Function): Any = js.native
  def postJSON(url: String, data: js.Object, success: js.Function, error: js.Function): Any = js.native
  def postJSON(url: String, data: js.Object, success: Unit, error: js.Function): Any = js.native
  
  def queryString(url: String): StringDictionary[String] = js.native
  
  def reconnectServerEvents(opt: ReconnectServerEventsOptions): Any = js.native
  
  def splitOnFirst(s: String, delimiter: String): js.Array[String] = js.native
  
  def splitOnLast(s: String, delimiter: String): js.Array[String] = js.native
  
  def subscribeToChannels(channels: js.Array[String]): Any = js.native
  def subscribeToChannels(channels: js.Array[String], cb: js.Function1[/* user */ SSEUpdate, Unit]): Any = js.native
  def subscribeToChannels(channels: js.Array[String], cb: js.Function1[/* user */ SSEUpdate, Unit], cbError: js.Function): Any = js.native
  def subscribeToChannels(channels: js.Array[String], cb: Unit, cbError: js.Function): Any = js.native
  
  def tfmt12(d: js.Date): String = js.native
  
  def todate(s: String): js.Date = js.native
  
  def todfmt(s: String): String = js.native
  
  def unsubscribeFromChannels(channels: js.Array[String]): Any = js.native
  def unsubscribeFromChannels(channels: js.Array[String], cb: js.Function1[/* user */ SSEUpdate, Unit]): Any = js.native
  def unsubscribeFromChannels(channels: js.Array[String], cb: js.Function1[/* user */ SSEUpdate, Unit], cbError: js.Function): Any = js.native
  def unsubscribeFromChannels(channels: js.Array[String], cb: Unit, cbError: js.Function): Any = js.native
  
  def updateChannels(channels: js.Array[String]): Unit = js.native
  
  def updateSubscriber(data: UpdateSubscriberOptions): Any = js.native
  def updateSubscriber(data: UpdateSubscriberOptions, cb: js.Function1[/* user */ SSEUpdate, Unit]): Any = js.native
  def updateSubscriber(data: UpdateSubscriberOptions, cb: js.Function1[/* user */ SSEUpdate, Unit], cbError: js.Function): Any = js.native
  def updateSubscriber(data: UpdateSubscriberOptions, cb: Unit, cbError: js.Function): Any = js.native
  
  var updateSubscriberUrl: String = js.native
  
  var validation: Validation = js.native
}
