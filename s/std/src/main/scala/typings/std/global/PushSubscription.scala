package typings.std.global

import typings.std.PushEncryptionKeyName
import typings.std.PushSubscriptionJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PushSubscription")
@js.native
class PushSubscription ()
  extends StObject
     with typings.std.PushSubscription {
  
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  
  /* CompleteClass */
  override val expirationTime: Double | Null = js.native
  
  /* CompleteClass */
  override def getKey(name: PushEncryptionKeyName): typings.std.ArrayBuffer | Null = js.native
  
  /* CompleteClass */
  override val options: typings.std.PushSubscriptionOptions = js.native
  
  /* CompleteClass */
  override def toJSON(): PushSubscriptionJSON = js.native
  
  /* CompleteClass */
  override def unsubscribe(): js.Promise[scala.Boolean] = js.native
}
