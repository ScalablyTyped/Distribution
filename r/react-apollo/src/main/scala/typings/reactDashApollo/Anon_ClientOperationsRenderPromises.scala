package typings.reactDashApollo

import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientOperationsRenderPromises extends js.Object {
  var client: Requireable[js.Object]
  var operations: Requireable[js.Object]
  var renderPromises: Requireable[js.Object]
}

object Anon_ClientOperationsRenderPromises {
  @scala.inline
  def apply(
    client: Requireable[js.Object],
    operations: Requireable[js.Object],
    renderPromises: Requireable[js.Object]
  ): Anon_ClientOperationsRenderPromises = {
    val __obj = js.Dynamic.literal(client = client, operations = operations, renderPromises = renderPromises)
  
    __obj.asInstanceOf[Anon_ClientOperationsRenderPromises]
  }
}

