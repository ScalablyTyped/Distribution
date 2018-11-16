package typings
package reduxDashPromiseLib.reduxDashPromiseMod.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dispatch[S] extends js.Object {
  def apply[R](asyncAction: PromiseAction[S]): R = js.native
}

