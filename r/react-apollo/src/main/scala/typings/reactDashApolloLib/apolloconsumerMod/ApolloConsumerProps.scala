package typings
package reactDashApolloLib.apolloconsumerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloConsumerProps extends js.Object {
  def children(client: apolloDashClientLib.apolloDashClientMod.default[_]): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
}

object ApolloConsumerProps {
  @scala.inline
  def apply(
    children: js.Function1[
      apolloDashClientLib.apolloDashClientMod.default[_], 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ]
  ): ApolloConsumerProps = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[ApolloConsumerProps]
  }
}

