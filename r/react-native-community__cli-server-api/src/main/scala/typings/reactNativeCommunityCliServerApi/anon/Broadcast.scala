package typings.reactNativeCommunityCliServerApi.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Broadcast extends js.Object {
  
  def broadcast(method: String): Unit = js.native
  def broadcast(method: String, params: Record[String, _]): Unit = js.native
}
