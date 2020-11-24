package typings.sailthruClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sailthru-client", "createSailthruClient")
@js.native
object createSailthruClient extends js.Object {
  
  def apply(apiKey: String, apiSecret: String): SailthruClient = js.native
  def apply(apiKey: String, apiSecret: String, apiUrl: String): SailthruClient = js.native
}
