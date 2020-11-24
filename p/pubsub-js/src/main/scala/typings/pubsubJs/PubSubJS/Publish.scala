package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Publish extends js.Object {
  
  def publish(message: String): Boolean = js.native
  def publish(message: String, data: js.Any): Boolean = js.native
  
  def publishSync(message: String): Boolean = js.native
  def publishSync(message: String, data: js.Any): Boolean = js.native
}
