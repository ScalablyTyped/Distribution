package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxMod {
  import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod.RSAAAction
  import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod.RSAAFailureAction
  import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod.RSAASuccessAction

  /*
    * Overload to add api middleware support to Redux's dispatch() function.
    * Useful for react-redux or any other library which could use this type.
    * `Promise<undefined> is returned in case of RSAA validation errors or user bails out
    */
  type Dispatch = js.Function1[
    /* action */ RSAAAction[js.Any, js.Any, js.Any], 
    js.Promise[
      js.UndefOr[(RSAASuccessAction[js.Any, js.Any]) | (RSAAFailureAction[js.Any, js.Any])]
    ]
  ]
}
