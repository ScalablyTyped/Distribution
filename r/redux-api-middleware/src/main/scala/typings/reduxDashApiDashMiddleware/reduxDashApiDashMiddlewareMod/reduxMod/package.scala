package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxMod {
  import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod.RSAAAction

  /*
    * Overload to add api middleware support to Redux's dispatch() function.
    * Useful for react-redux or any other library which could use this type.
    */
  type Dispatch = js.Function1[/* action */ RSAAAction[js.Any, js.Any, js.Any], js.Promise[js.Any]]
}
