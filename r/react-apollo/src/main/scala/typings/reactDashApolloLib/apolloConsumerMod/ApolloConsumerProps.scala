package typings
package reactDashApolloLib.apolloConsumerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloConsumerProps extends js.Object {
  def children(client: apolloDashClientLib.apolloDashClientMod.default[_]): reactLib.reactMod.ReactElement[_] | scala.Null
}

object ApolloConsumerProps {
  @scala.inline
  def apply(
    children: apolloDashClientLib.apolloDashClientMod.default[_] => reactLib.reactMod.ReactElement[_] | scala.Null
  ): ApolloConsumerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[ApolloConsumerProps]
  }
}

