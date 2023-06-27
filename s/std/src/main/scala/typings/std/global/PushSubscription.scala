package typings.std.global

import typings.std.EpochTimeStamp
import typings.std.PushEncryptionKeyName
import typings.std.PushSubscriptionJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PushSubscription")
@js.native
/* standard dom */
open class PushSubscription ()
  extends StObject
     with typings.std.PushSubscription {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/endpoint) */
  /* standard dom */
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/expirationTime) */
  /* standard dom */
  /* CompleteClass */
  override val expirationTime: EpochTimeStamp | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/getKey) */
  /* standard dom */
  /* CompleteClass */
  override def getKey(name: PushEncryptionKeyName): js.typedarray.ArrayBuffer | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/options) */
  /* standard dom */
  /* CompleteClass */
  override val options: typings.std.PushSubscriptionOptions = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/toJSON) */
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): PushSubscriptionJSON = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/unsubscribe) */
  /* standard dom */
  /* CompleteClass */
  override def unsubscribe(): js.Promise[scala.Boolean] = js.native
}
