package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod.reduxMod

import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod.RSAAAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Overload to add api middleware support to Redux's dispatch() function.
  * Useful for react-redux or any other library which could use this type.
  */
@js.native
trait Dispatch extends js.Object {
  // `Promise<undefined> is returned in case of RSAA validation errors or user bails out
  def apply(action: RSAAAction[_, _, _]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
}

