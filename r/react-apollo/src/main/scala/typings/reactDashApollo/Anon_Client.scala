package typings.reactDashApollo

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: Validator[js.Object]
  var operations: Requireable[js.Object]
}

object Anon_Client {
  @scala.inline
  def apply(client: Validator[js.Object], operations: Requireable[js.Object]): Anon_Client = {
    val __obj = js.Dynamic.literal(client = client, operations = operations)
  
    __obj.asInstanceOf[Anon_Client]
  }
}

