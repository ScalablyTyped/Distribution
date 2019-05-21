package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: propDashTypesLib.propDashTypesMod.Validator[js.Object]
  var operations: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
}

object Anon_Client {
  @scala.inline
  def apply(
    client: propDashTypesLib.propDashTypesMod.Validator[js.Object],
    operations: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  ): Anon_Client = {
    val __obj = js.Dynamic.literal(client = client, operations = operations)
  
    __obj.asInstanceOf[Anon_Client]
  }
}

