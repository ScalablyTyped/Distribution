package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientOperationsObject extends js.Object {
  var client: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var operations: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
}

object Anon_ClientOperationsObject {
  @scala.inline
  def apply(
    client: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    operations: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  ): Anon_ClientOperationsObject = {
    val __obj = js.Dynamic.literal(client = client, operations = operations)
  
    __obj.asInstanceOf[Anon_ClientOperationsObject]
  }
}

