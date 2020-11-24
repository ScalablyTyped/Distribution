package typings.sailthruClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sailthru-client", "createClient")
@js.native
object createClient extends js.Object {
  
  def apply(apiKey: String, apiSecret: String): SailthruClient = js.native
  def apply(apiKey: String, apiSecret: String, apiUrl: String): SailthruClient = js.native
}
