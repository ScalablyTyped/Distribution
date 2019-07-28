package typings.reactDashApollo

import typings.apolloDashClient.apolloDashClientMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientOperations[TCache] extends js.Object {
  var client: default[TCache]
  var operations: js.Any
}

object Anon_ClientOperations {
  @scala.inline
  def apply[TCache](client: default[TCache], operations: js.Any): Anon_ClientOperations[TCache] = {
    val __obj = js.Dynamic.literal(client = client, operations = operations)
  
    __obj.asInstanceOf[Anon_ClientOperations[TCache]]
  }
}

