package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscription extends js.Object {
  val endpoint: java.lang.String
  val expirationTime: scala.Double | scala.Null
  val options: PushSubscriptionOptions
  def getKey(name: PushEncryptionKeyName): ArrayBuffer | scala.Null
  def toJSON(): PushSubscriptionJSON
  def unsubscribe(): Promise[scala.Boolean]
}

@JSGlobal("PushSubscription")
@js.native
object PushSubscription
  extends org.scalablytyped.runtime.Instantiable0[PushSubscription]

