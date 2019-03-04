package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientAny extends js.Object {
  var client: apolloDashClientLib.apolloDashClientMod.ApolloClient[_]
}

object Anon_ClientAny {
  @scala.inline
  def apply(client: apolloDashClientLib.apolloDashClientMod.ApolloClient[_]): Anon_ClientAny = {
    val __obj = js.Dynamic.literal(client = client)
  
    __obj.asInstanceOf[Anon_ClientAny]
  }
}

