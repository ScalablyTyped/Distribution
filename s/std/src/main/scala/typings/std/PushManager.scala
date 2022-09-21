package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Push API interface provides a way to receive notifications from third-party servers as well as request URLs for push notifications.
  * Available only in secure contexts.
  */
@js.native
trait PushManager extends StObject {
  
  /* standard dom */
  def getSubscription(): js.Promise[PushSubscription | Null] = js.native
  
  /* standard dom */
  def permissionState(): js.Promise[PermissionState] = js.native
  def permissionState(options: PushSubscriptionOptionsInit): js.Promise[PermissionState] = js.native
  
  /* standard dom */
  def subscribe(): js.Promise[PushSubscription] = js.native
  def subscribe(options: PushSubscriptionOptionsInit): js.Promise[PushSubscription] = js.native
}
