package typings
package atReachRouterLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick) */ 
trait LinkProps[TState] extends js.Object {
  var getProps: js.UndefOr[js.Function1[/* props */ LinkGetProps, js.Object]] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var state: js.UndefOr[TState] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

