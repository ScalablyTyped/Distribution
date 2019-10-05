package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PushSubscription")
@js.native
class PushSubscriptionCls () extends PushSubscription {
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  /* CompleteClass */
  override val expirationTime: Double | Null = js.native
  /* CompleteClass */
  override val options: PushSubscriptionOptions = js.native
  /* CompleteClass */
  override def getKey(name: PushEncryptionKeyName): ArrayBuffer | Null = js.native
  /* CompleteClass */
  override def toJSON(): PushSubscriptionJSON = js.native
  /* CompleteClass */
  override def unsubscribe(): js.Promise[scala.Boolean] = js.native
}

