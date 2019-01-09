package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsChildrenComponentName extends js.Object {
  var children: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onSubscriptionData: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var shouldResubscribe: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean | (js.Function1[/* repeated */ _, _])] = js.native
  @JSName("subscription")
  var subscription_Original: propDashTypesLib.propDashTypesMod.Validator[js.Object] = js.native
  var variables: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  def subscription(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

