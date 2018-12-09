package typings
package reduxDashPromiseDashMiddlewareLib.reduxDashPromiseDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxMod {
  type Dispatch[S] = js.Function1[
    /* action */ PromiseAction[js.Any], 
    js.Promise[reduxDashPromiseDashMiddlewareLib.Anon_Type[PromiseAction[js.Any]]]
  ]
  type PayloadType[PA] = js.Any
}
