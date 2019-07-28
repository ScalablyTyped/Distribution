package typings.reactDashApollo

import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientOperationsObject extends js.Object {
  var client: Requireable[js.Object]
  var operations: Requireable[js.Object]
}

object Anon_ClientOperationsObject {
  @scala.inline
  def apply(client: Requireable[js.Object], operations: Requireable[js.Object]): Anon_ClientOperationsObject = {
    val __obj = js.Dynamic.literal(client = client, operations = operations)
  
    __obj.asInstanceOf[Anon_ClientOperationsObject]
  }
}

