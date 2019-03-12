package typings
package reactDashApolloLib.apolloProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloProviderProps[TCache] extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var client: apolloDashClientLib.apolloDashClientMod.default[TCache]
}

object ApolloProviderProps {
  @scala.inline
  def apply[TCache](
    children: reactLib.reactMod.ReactNs.ReactNode,
    client: apolloDashClientLib.apolloDashClientMod.default[TCache]
  ): ApolloProviderProps[TCache] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], client = client)
  
    __obj.asInstanceOf[ApolloProviderProps[TCache]]
  }
}

