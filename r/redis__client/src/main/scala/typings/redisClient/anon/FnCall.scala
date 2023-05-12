package typings.redisClient.anon

import typings.redisClient.distLibClientPubSubMod.PubSubListener
import typings.redisClient.distLibClientPubSubMod.PubSubType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T]): js.UndefOr[Args] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T], returnBuffers: T): js.UndefOr[Args] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T]): js.UndefOr[Args] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T], returnBuffers: T): js.UndefOr[Args] = js.native
}
