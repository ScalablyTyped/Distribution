package typings.sentryBrowser.anon

import typings.sentryTypes.requestMod.SentryRequestType
import typings.sentryTypes.responseMod.Response
import typings.std.Record
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Headers extends js.Object {
  
  var headers: Record[String, String | Null] = js.native
  
  def reject(): Unit = js.native
  def reject(reason: js.Any): Unit = js.native
  
  var requestType: SentryRequestType = js.native
  
  def resolve(): Unit = js.native
  def resolve(value: js.Thenable[Response]): Unit = js.native
  def resolve(value: Response): Unit = js.native
  
  var response: typings.std.Response | XMLHttpRequest = js.native
}
