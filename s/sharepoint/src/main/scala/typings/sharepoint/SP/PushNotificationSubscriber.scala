package typings.sharepoint.SP

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNotificationSubscriber
  extends StObject
     with ClientObject {
  
  def get_customArgs(): String = js.native
  
  def get_deviceAppInstanceId(): Guid = js.native
  
  def get_lastModifiedTimeStamp(): Date = js.native
  
  def get_registrationTimeStamp(): Date = js.native
  
  def get_serviceToken(): String = js.native
  
  def get_subscriberType(): String = js.native
  
  def get_user(): User = js.native
  
  def set_customArgs(value: String): Unit = js.native
  
  def set_serviceToken(value: String): Unit = js.native
  
  def set_subscriberType(value: String): Unit = js.native
  
  def update(): Unit = js.native
}
