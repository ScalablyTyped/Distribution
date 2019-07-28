package typings.reactDashApollo.apolloConsumerMod

import typings.apolloDashClient.apolloDashClientMod.default
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloConsumerProps extends js.Object {
  def children(client: default[_]): ReactElement | Null
}

object ApolloConsumerProps {
  @scala.inline
  def apply(children: default[_] => ReactElement | Null): ApolloConsumerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[ApolloConsumerProps]
  }
}

