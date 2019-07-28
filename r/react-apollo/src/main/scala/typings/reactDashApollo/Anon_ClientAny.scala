package typings.reactDashApollo

import typings.apolloDashClient.apolloDashClientMod.ApolloClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientAny extends js.Object {
  var client: ApolloClient[_]
}

object Anon_ClientAny {
  @scala.inline
  def apply(client: ApolloClient[_]): Anon_ClientAny = {
    val __obj = js.Dynamic.literal(client = client)
  
    __obj.asInstanceOf[Anon_ClientAny]
  }
}

