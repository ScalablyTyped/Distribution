package typings.reactDashApollo.apolloProviderMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloProviderProps[TCache] extends js.Object {
  var children: ReactNode
  var client: typings.apolloDashClient.apolloDashClientMod.default[TCache]
}

object ApolloProviderProps {
  @scala.inline
  def apply[TCache](children: ReactNode, client: typings.apolloDashClient.apolloDashClientMod.default[TCache]): ApolloProviderProps[TCache] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], client = client)
  
    __obj.asInstanceOf[ApolloProviderProps[TCache]]
  }
}

