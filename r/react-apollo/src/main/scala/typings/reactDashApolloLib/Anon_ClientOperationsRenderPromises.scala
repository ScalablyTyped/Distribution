package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientOperationsRenderPromises extends js.Object {
  var client: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var operations: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var renderPromises: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
}

object Anon_ClientOperationsRenderPromises {
  @scala.inline
  def apply(
    client: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    operations: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    renderPromises: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  ): Anon_ClientOperationsRenderPromises = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("operations")(operations)
    __obj.updateDynamic("renderPromises")(renderPromises)
    __obj.asInstanceOf[Anon_ClientOperationsRenderPromises]
  }
}

