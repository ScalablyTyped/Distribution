package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.PushEncryptionKeyName
import typings.std.PushSubscriptionJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PushSubscription")
@js.native
class PushSubscription ()
  extends typings.std.PushSubscription {
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  /* CompleteClass */
  override val expirationTime: Double | Null = js.native
  /* CompleteClass */
  override val options: typings.std.PushSubscriptionOptions = js.native
  /* CompleteClass */
  override def getKey(name: PushEncryptionKeyName): typings.std.ArrayBuffer | Null = js.native
  /* CompleteClass */
  override def toJSON(): PushSubscriptionJSON = js.native
  /* CompleteClass */
  override def unsubscribe(): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("PushSubscription")
@js.native
object PushSubscription
  extends Instantiable0[typings.std.PushSubscription]

