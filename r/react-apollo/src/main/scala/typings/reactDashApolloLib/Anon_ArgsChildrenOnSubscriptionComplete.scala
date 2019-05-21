package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsChildrenOnSubscriptionComplete extends js.Object {
  var children: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var onSubscriptionComplete: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var onSubscriptionData: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var shouldResubscribe: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean | (js.Function1[/* repeated */ _, _])]
  var subscription: propDashTypesLib.propDashTypesMod.Validator[js.Object]
  var variables: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
}

object Anon_ArgsChildrenOnSubscriptionComplete {
  @scala.inline
  def apply(
    children: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    onSubscriptionComplete: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    onSubscriptionData: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    shouldResubscribe: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean | (js.Function1[/* repeated */ _, _])],
    subscription: propDashTypesLib.propDashTypesMod.Validator[js.Object],
    variables: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  ): Anon_ArgsChildrenOnSubscriptionComplete = {
    val __obj = js.Dynamic.literal(children = children, onSubscriptionComplete = onSubscriptionComplete, onSubscriptionData = onSubscriptionData, shouldResubscribe = shouldResubscribe, subscription = subscription, variables = variables)
  
    __obj.asInstanceOf[Anon_ArgsChildrenOnSubscriptionComplete]
  }
}

