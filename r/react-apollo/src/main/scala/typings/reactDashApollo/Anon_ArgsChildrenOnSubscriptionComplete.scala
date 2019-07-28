package typings.reactDashApollo

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsChildrenOnSubscriptionComplete extends js.Object {
  var children: Requireable[js.Function1[/* repeated */ _, _]]
  var onSubscriptionComplete: Requireable[js.Function1[/* repeated */ _, _]]
  var onSubscriptionData: Requireable[js.Function1[/* repeated */ _, _]]
  var shouldResubscribe: Requireable[Boolean | (js.Function1[/* repeated */ _, _])]
  var subscription: Validator[js.Object]
  var variables: Requireable[js.Object]
}

object Anon_ArgsChildrenOnSubscriptionComplete {
  @scala.inline
  def apply(
    children: Requireable[js.Function1[/* repeated */ _, _]],
    onSubscriptionComplete: Requireable[js.Function1[/* repeated */ _, _]],
    onSubscriptionData: Requireable[js.Function1[/* repeated */ _, _]],
    shouldResubscribe: Requireable[Boolean | (js.Function1[/* repeated */ _, _])],
    subscription: Validator[js.Object],
    variables: Requireable[js.Object]
  ): Anon_ArgsChildrenOnSubscriptionComplete = {
    val __obj = js.Dynamic.literal(children = children, onSubscriptionComplete = onSubscriptionComplete, onSubscriptionData = onSubscriptionData, shouldResubscribe = shouldResubscribe, subscription = subscription, variables = variables)
  
    __obj.asInstanceOf[Anon_ArgsChildrenOnSubscriptionComplete]
  }
}

